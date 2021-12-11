

package reportcustomization;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

/**
 *
 * @author Administrator
 */
public class Footer  extends Control {
    private JCheckBox signing_checkBox = null; 
    private JCheckBox line_checkBox = null; 
    String authority[] = {"Authority 1", "Authority 2"}; 
    private JComboBox authority_comboBox = null;
    private JTextArea signed_by_textArea = null; 
    private final String text = "Attach Here";
    private JLabel attach_here_hyperLink = null;
    private JButton upload_button = null;
    private JScrollBar footer_scrollBar = null;
  
    
    
    public void Show(Boolean show) {    
        signing_checkBox.setVisible(show);
        line_checkBox.setVisible(show);
        authority_comboBox.setVisible(show);
        signed_by_textArea.setVisible(show);
        attach_here_hyperLink.setVisible(show);
        upload_button.setVisible(show);
        footer_scrollBar.setVisible(false);
        
    }
    
    public void Init(JPanel panel){
       
        //I am footer
        //panel_
        signing_checkBox = new JCheckBox("Signing");
        signing_checkBox.setBounds(0,100, 50,50);
        signing_checkBox.setVisible(false);
        signing_checkBox.setBackground(Color.green);
        panel.add(signing_checkBox);
        
        line_checkBox = new JCheckBox("Line");
        line_checkBox.setBounds(200,100, 50,50);
        line_checkBox.setVisible(false);
        line_checkBox.setBackground(Color.green);
        panel.add(line_checkBox);
        
        authority_comboBox = new JComboBox(authority);
        authority_comboBox.setBounds(100,100, 50,50);
        authority_comboBox.setVisible(false);
        panel.add(authority_comboBox);
        
        signed_by_textArea = new JTextArea("Signed by",1,0);
        signed_by_textArea.setBounds(50,1000,2000,30);
        signed_by_textArea.setVisible(false);
        signed_by_textArea.setBorder(BorderFactory.createEtchedBorder(0, Color.lightGray, Color.black));
        panel.add(signed_by_textArea);
        
        upload_button = new JButton("Upload");
        upload_button.setBounds(100,100,200,200);
        upload_button.setVisible(false);
        upload_button.setBorder(BorderFactory.createEtchedBorder(0, Color.lightGray, Color.black));
        panel.add(upload_button);
        
        footer_scrollBar = new JScrollBar();
        footer_scrollBar.setBounds(5000,5000, 5000,5000);
        footer_scrollBar.setVisible(false);
        panel.add(footer_scrollBar);
        
        attach_here_hyperLink = new JLabel(text);
        attach_here_hyperLink.setBounds(50,1000,2000,30);
        attach_here_hyperLink.setForeground(Color.BLUE.darker());
        attach_here_hyperLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        attach_here_hyperLink.addMouseListener(new MouseAdapter() {
 
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    //File file = null;
                    //file.getAbsoluteFile(C:/Users/Administrator/Desktop);
                    //Desktop.getDesktop().browseFileDirectory(file);
                    Desktop.getDesktop().browse(new URI("http://www.google.com"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
 
            @Override
            public void mouseExited(MouseEvent e) {
                attach_here_hyperLink.setText(text);
            }
 
            @Override
            public void mouseEntered(MouseEvent e) {
                attach_here_hyperLink.setText("<html><a href=''>" + text + "</a></html>");
            }
 
        });
        attach_here_hyperLink.setVisible(false);
        panel.add(attach_here_hyperLink);
    }
    
}
package reportcustomization;

import java.awt.Color;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Administrator
 */
public class Header extends Control {
    private JCheckBox logo_check = null;
    //private JFileChooser logo_upload = null;
    int returnvalue;
    private JCheckBox name_check = null;
    private JCheckBox address_check = null;
    private JCheckBox title_check = null;
    private JLabel lb_logo_ = null;
    private JButton up_arrow = null;
    private JButton down_arrow = null;
    private JButton left_arrow = null;
    private JButton right_arrow = null;
    private JTextArea name_input = null;
    private JButton upload_button = null;
    
    public void Show(Boolean show) {
       
        lb_logo_.setVisible(show);
        logo_check.setVisible(show);
        //logo_upload.setVisible(false);
        name_check.setVisible(show);
        address_check.setVisible(show);
        title_check.setVisible(show);
        up_arrow.setVisible(show);
        down_arrow.setVisible(show);
        left_arrow.setVisible(show);
        right_arrow.setVisible(show);
        name_input.setVisible(show);
        upload_button.setVisible(show);
    }
    
    @Override
    public void Init(JPanel panel) {
        //I am header
        //panel_
        lb_logo_ = new JLabel("Header");
        lb_logo_.setBounds(15, 80, 60, 40);
        lb_logo_.setVisible(false);
        
        logo_check = new JCheckBox("LOGO");
        logo_check.setBounds(5,15 ,70, 30);
        logo_check.setLayout(null);
        logo_check.setBackground(Color.green);
        logo_check.setVisible(false);
        
        //logo_upload = new JFileChooser(FileSystemView.getFileSystemView());
        //returnvalue = logo_upload.showOpenDialog(null);
        //if (returnvalue == JFileChooser.APPROVE_OPTION){
        //    File selected_logo_file = logo_upload.getSelectedFile();
        //    System.out.println(selected_logo_file.getAbsolutePath());
        //}
        //logo_upload.setBounds(50, 50, 30, 30);
        //logo_upload.setVisible(false);
        
        upload_button = new JButton("UPLOAD");
        upload_button.setBounds(50,40,30,100);
        upload_button.setVisible(false);
        
        name_check = new JCheckBox("NAME");
        name_check.setBounds(5,100 , 70, 30);
        name_check.setBackground(Color.blue);
        name_check.setVisible(false);
        name_check.setLayout(null);
        
        address_check = new JCheckBox("ADDRESS");
        address_check.setBounds(5, 185 , 80, 20);
        address_check.setBackground(Color.blue);
        address_check.setVisible(false);
        address_check.setLayout(null);
        
        title_check = new JCheckBox("TITLE");
        title_check.setBounds(5, 270 , 70, 30);
        title_check.setBackground(Color.green);
        title_check.setVisible(false);
        title_check.setLayout(null);
        
        up_arrow = new JButton("Up");
        up_arrow.setBounds(50,110,30,100);
        up_arrow.setVisible(false);
        down_arrow = new JButton("Down");
        down_arrow.setBounds(50,135,30,100);
        down_arrow.setVisible(false);
        left_arrow = new JButton("Left");
        left_arrow.setBounds(50,170,30,100);
        left_arrow.setVisible(false);
        right_arrow = new JButton("Right");
        right_arrow.setBounds(50,210,30,100);
        right_arrow.setVisible(false);
        
        name_input = new JTextArea("Enter Company name",1,0);
        name_input.setBounds(30, 40, 70, 100);
        name_input.setVisible(false);
        
        
        panel.setLayout(null);
        //panel.add(lb_logo_);
        panel.add(logo_check);
        //panel_.add(logo_upload);
        //panel.add(upload_button);
        panel.add(name_check);
        panel.add(address_check);
        panel.add(title_check);
        //panel.add(up_arrow);
        //panel.add(down_arrow);
        //panel.add(left_arrow);
        //panel.add(right_arrow);
        //panel.add(name_input);
    }
}

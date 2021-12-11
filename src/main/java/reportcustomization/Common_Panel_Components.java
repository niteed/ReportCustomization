

package reportcustomization;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Administrator
 */
public class Common_Panel_Components {
     private static JPanel panel_ = null;
     private JButton bold_button = null;
     private JButton italic_button = null;
     private JButton top_button = null;
     private JButton middle_button = null;
     private JButton bottom_button = null;
     private JButton left_button = null;
     private JButton centre_button = null;
     private JButton right_button = null;
     private JButton underline_button = null;
     String font_style_array[] = {"font 1", "font 2"};
     private JComboBox font_style = null;
     private JLabel font_style_label = null;
     String font_size_array[] = {"8", "9", "10","11","12","14","16","18","20","22","24","26","28","36","48","72"};
     private JComboBox font_size = null;
     private JLabel font_size_label = null;
     private  SpinnerNumberModel xpos_model = null;
     private JSpinner xpos = null;
     private  SpinnerNumberModel ypos_model = null;
     private JSpinner ypos = null;
     private JLabel xpos_label = null;
     private JLabel ypos_label = null;
     
    
     
     
    public void set_panel(JPanel panel) {
        panel_ = panel;
    }
      
    public void ShowMe(Boolean show) {
        bold_button.setVisible(show);
        italic_button.setVisible(show);
        underline_button.setVisible(show); 
        top_button.setVisible(show);
        middle_button.setVisible(show);
        bottom_button.setVisible(show);
        left_button.setVisible(show);
        centre_button.setVisible(show);
        right_button.setVisible(show);
        font_style.setVisible(show);
        font_size.setVisible(show);
        xpos.setVisible(show);
        ypos.setVisible(show);
        xpos_label.setVisible(show);
        ypos_label.setVisible(show);
    }
       
 public void Init() {
        //I am header
        //panel_
        bold_button = new JButton("Bold");
        bold_button.setBounds(10,10,20,20);
        bold_button.setBorder(BorderFactory.createEtchedBorder(0, Color.lightGray, Color.black));
        bold_button.setVisible(false);
        panel_.add(bold_button);
        
        italic_button = new JButton("Italic");
        italic_button.setBounds(10,30,20,20);
        italic_button.setVisible(false);
        italic_button.setBorder(BorderFactory.createEtchedBorder(0, Color.lightGray, Color.black));
        panel_.add(italic_button);
        
        underline_button = new JButton("Underline");
        underline_button.setBounds(10,50,20,20);        
        underline_button.setBorder(BorderFactory.createEtchedBorder(0, Color.lightGray, Color.black));
        underline_button.setVisible(false);
        panel_.add(underline_button);
        
        top_button = new JButton("Top");
        top_button.setBounds(10,10,20,20);
        top_button.setBorder(BorderFactory.createEtchedBorder(0, Color.lightGray, Color.black));
        top_button.setVisible(false);
        panel_.add(top_button);
        
        middle_button = new JButton("Middle");
        middle_button.setBounds(10,10,20,20);
        middle_button.setBorder(BorderFactory.createEtchedBorder(0, Color.lightGray, Color.black));
        middle_button.setVisible(false);
        panel_.add(middle_button);
        
        bottom_button = new JButton("Bottom");
        bottom_button.setBounds(10,10,20,20);
        bottom_button.setBorder(BorderFactory.createEtchedBorder(0, Color.lightGray, Color.black));
        bottom_button.setVisible(false);
        panel_.add(bottom_button);
        
        left_button = new JButton("Left");
        left_button.setBounds(10,10,20,20);
        left_button.setBorder(BorderFactory.createEtchedBorder(0, Color.lightGray, Color.black));
        left_button.setVisible(false);
        panel_.add(left_button);
        
        centre_button = new JButton("Centre");
        centre_button.setBounds(10,10,20,20);
        centre_button.setBorder(BorderFactory.createEtchedBorder(0, Color.lightGray, Color.black));
        centre_button.setVisible(false);
        panel_.add(centre_button);
        
        right_button = new JButton("Right");
        right_button.setBounds(10,10,20,20);
        right_button.setBorder(BorderFactory.createEtchedBorder(0, Color.lightGray, Color.black));
        right_button.setVisible(false);
        panel_.add(right_button);
       
        font_style = new JComboBox(font_style_array);
        font_style.setBounds(21, 6, 30, 25);// set size and location
        panel_.add(font_style);
        
        font_style_label = new JLabel("FONT STYLE");
        font_style_label.setBounds(35,35, 30, 25);// set size and location
        panel_.add(font_style_label);
        
        font_size = new JComboBox(font_size_array);
        font_size.setBounds(21, 6, 30, 25);// set size and location
        panel_.add(font_size);
        
        font_size_label = new JLabel("FONT SIZE");
        font_size_label.setBounds(35,35, 30, 25);// set size and location
        panel_.add(font_size_label);
        
        xpos_model = new SpinnerNumberModel(10,2,30,1);
        xpos = new JSpinner(xpos_model);
        xpos.setBounds(30, 7, 30, 25);// set size and location
        panel_.add(xpos);
        
        ypos_model =  new SpinnerNumberModel(10,2,30,1);
        ypos = new JSpinner(ypos_model);
        ypos.setBounds(25, 25, 30, 25);// set size and location
        panel_.add(ypos);
        
        xpos_label = new JLabel("x px: ");
        xpos_label.setBounds(35,35, 30, 25);// set size and location
        panel_.add(xpos_label);
        
        ypos_label = new JLabel("y px: ");
        ypos_label.setBounds(40,35, 30, 25);// set size and location
        panel_.add(ypos_label);
        
        
        
        
        
        
 }
}

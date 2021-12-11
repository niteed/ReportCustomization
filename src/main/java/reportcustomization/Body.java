package reportcustomization;

import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Administrator
 */
public class Body extends Control{
    private JCheckBox reports_checkBox = null; 
    String report_selection[] = {"Report 1","Report 2" ,"Report 3"}; 
    private JComboBox report_selection_comboBox = null; 
     
    private JCheckBox column_checkBox = null;
    String column_selection[] = {"Column 1", "Column 2","Column 3"}; 
    private JComboBox column_selection_comboBox = null;
     
    private JTextArea column_name_textArea = null; 
     
    private JCheckBox content_checkBox = new JCheckBox("Content");
     
    private JCheckBox row_checkBox = null;
    
    public void Show(Boolean show) {
        
        reports_checkBox.setVisible(show);
        report_selection_comboBox.setVisible(show);
        column_checkBox.setVisible(show);
        column_selection_comboBox.setVisible(show);
        column_name_textArea.setVisible(show);
        content_checkBox.setVisible(show);
        row_checkBox.setVisible(show);
        
    }
    
    public void Init(JPanel panel) {
        //I am header
        //panel_
        reports_checkBox = new JCheckBox("Reports");
        reports_checkBox.setBounds(0,100, 50,50);
        reports_checkBox.setBackground(Color.green);
        reports_checkBox.setVisible(false);
        panel.add(reports_checkBox);
        
        report_selection_comboBox = new JComboBox(report_selection);
        report_selection_comboBox.setBounds(1000,100, 50,50);
        report_selection_comboBox.setVisible(false);
        panel.add(report_selection_comboBox);
        
        column_checkBox = new JCheckBox("Column");
        column_checkBox.setBounds(100,200, 50,50);
        column_checkBox.setBackground(Color.green);
        column_checkBox.setVisible(false);
        panel.add(column_checkBox);
        
        column_selection_comboBox = new JComboBox(column_selection);
        column_selection_comboBox.setBounds(1000,100, 50,50);
        column_selection_comboBox.setVisible(false);
        panel.add(column_selection_comboBox);
        
        column_name_textArea = new JTextArea("Change column name",1,0);
        column_name_textArea.setBounds(1000,100, 50,50);
        column_name_textArea.setVisible(false);
        panel.add(column_name_textArea);
        
        content_checkBox = new JCheckBox("Content");
        content_checkBox.setBounds(0,100, 50,50);
        content_checkBox.setBackground(Color.green);
        content_checkBox.setVisible(false);
        panel.add(content_checkBox);
        
        row_checkBox = new JCheckBox("Row");
        row_checkBox.setBounds(0,100, 50,50);
        row_checkBox.setBackground(Color.green);
        row_checkBox.setVisible(false);
        panel.add(row_checkBox);
       
        
        
    }
}

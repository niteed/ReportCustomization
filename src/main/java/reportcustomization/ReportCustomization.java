

package reportcustomization;

import java.awt.Color;
import java.awt.Container;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class ReportCustomization {

    private static final JFrame frame_ = new JFrame();
    private static final int control_height_ = 40;
    private int current_tab_control_selection_index_ = 0; //0 - Header, 1 - Body, 2 - Footer
    private Common_Panel_Components common_panel_ = new Common_Panel_Components();
    private Control control_ = new Control();

    public ReportCustomization() {

        frame_.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame_.setUndecorated(true);
        frame_.setLocationRelativeTo(null);
        frame_.setLayout(null);
        frame_.setVisible(true);
        frame_.setAlwaysOnTop(false);
    }

    public void AddComponentsToMainFrame(Container panel) {
        int frame_width = frame_.getWidth();
        int frame_height = frame_.getHeight();

        JPanel title_panel = new JPanel();
        title_panel.setBackground(Color.blue);
        title_panel.setBounds(0, 0, frame_width, control_height_);
        title_panel.setBorder(BorderFactory.createEtchedBorder(0, Color.lightGray, Color.black));
        panel.add(title_panel);
        Rectangle titel_rect = title_panel.getBounds();

        JPanel privew_panel = new JPanel();
        privew_panel.setBackground(Color.DARK_GRAY);
        privew_panel.setBounds(0, titel_rect.height, (int) (frame_width * 0.7), frame_height - titel_rect.height);
        privew_panel.setBorder(BorderFactory.createEtchedBorder(0, Color.lightGray, Color.black));
        panel.add(privew_panel);
        Rectangle preview_rect = privew_panel.getBounds();

        JPanel control_variable_button_panel = new JPanel();
        control_variable_button_panel.setBackground(Color.ORANGE);
        control_variable_button_panel.setBounds(preview_rect.width, titel_rect.height, (int) (frame_width * 0.3), control_height_);//(int)(control_variable_height * 0.7));
        control_variable_button_panel.setBorder(BorderFactory.createEtchedBorder(0, Color.lightGray, Color.black));
        control_variable_button_panel.setLayout(null);
        panel.add(control_variable_button_panel);
        Rectangle control_variable_button_rect = control_variable_button_panel.getBounds();

        JPanel control_common_panel = new JPanel();
        control_common_panel.setBackground(Color.PINK);
        int control_common_height_ypos = (frame_height / 10) * 7;
        control_common_panel.setBounds(preview_rect.width, control_common_height_ypos, (int) (frame_width * 0.3), (int) (control_common_height_ypos * 2.5) / 7);
        control_common_panel.setBorder(BorderFactory.createEtchedBorder(0, Color.lightGray, Color.black));
        panel.add(control_common_panel);
        Rectangle control_common_rect = control_common_panel.getBounds();

        JPanel control_common_button_panel = new JPanel();
        control_common_button_panel.setBackground(Color.cyan);
        control_common_button_panel.setBounds(preview_rect.width, (int) (control_common_rect.height * 3.8), (int) (frame_width * 0.3), frame_height / 17);
        control_common_button_panel.setBorder(BorderFactory.createEtchedBorder(0, Color.lightGray, Color.black));
        control_common_button_panel.setLayout(null);
        panel.add(control_common_button_panel);
        Rectangle control_common_button_rect = control_common_button_panel.getBounds();

        int gap_variable = 3;
        int top_tab_button_width = (int) ((control_variable_button_panel.getWidth()) / 3) - gap_variable;
        int top_tab_button_xpos = 0;

        JButton header_button = new JButton("Header");
        header_button.setBounds(top_tab_button_xpos, 0, top_tab_button_width, control_height_);
        header_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                current_tab_control_selection_index_ = 0;
               control_.Show(current_tab_control_selection_index_);
                common_panel_.ShowMe(Boolean.TRUE);
            }
        });
        control_variable_button_panel.add(header_button);

        top_tab_button_xpos = top_tab_button_width + gap_variable;

        JButton body_button = new JButton("Body");
        body_button.setBounds(top_tab_button_xpos, 0, top_tab_button_width, control_height_);
        body_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                current_tab_control_selection_index_ = 1;
                control_.Show(current_tab_control_selection_index_);
                common_panel_.ShowMe(Boolean.TRUE);
            }
        });

        control_variable_button_panel.add(body_button);

        top_tab_button_xpos = 2 * (top_tab_button_width + gap_variable);

        JButton footer_button = new JButton("Footer");
        footer_button.setBounds(top_tab_button_xpos, 0, top_tab_button_width, control_height_);
        footer_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                current_tab_control_selection_index_ = 2;
                control_.Show(current_tab_control_selection_index_);
                common_panel_.ShowMe(Boolean.TRUE);
            }
        });

        control_variable_button_panel.add(footer_button);

        int bottom_tab_button_width = (int) ((control_variable_button_panel.getWidth()) / 3) - gap_variable;
        int bottom_tab_button_xpos = 0;

        JButton preview_button = new JButton("Preview");
        preview_button.setBounds(bottom_tab_button_xpos, 0, bottom_tab_button_width, control_height_);
        control_common_button_panel.add(preview_button);
        bottom_tab_button_xpos = bottom_tab_button_width + gap_variable;

        JButton reset_button = new JButton("Reset");
        reset_button.setBounds(bottom_tab_button_xpos, 0, bottom_tab_button_width, control_height_);
        control_common_button_panel.add(reset_button);

        bottom_tab_button_xpos = 2 * (bottom_tab_button_width + gap_variable);

        JButton close_button = new JButton("Close");
        close_button.setBounds(bottom_tab_button_xpos, 0, bottom_tab_button_width, control_height_);
        control_common_button_panel.add(close_button);

        int control_switch_panels_height = frame_height / 10;

        JPanel control_variable_panel = new JPanel();
        control_variable_panel.setBackground(Color.green);
        control_variable_panel.setBounds(preview_rect.width, control_switch_panels_height, (int) (frame_width * 0.3), (int) (control_switch_panels_height * 6));
        control_variable_panel.setBorder(BorderFactory.createEtchedBorder(0, Color.lightGray, Color.black));
        panel.add(control_variable_panel);

        control_.Init(control_variable_panel);
        
        common_panel_.set_panel(control_common_panel);
        common_panel_.Init();
        common_panel_.ShowMe(Boolean.TRUE);
    }

    public static void main(String[] args) {

        ReportCustomization report_customization = new ReportCustomization();
        report_customization.AddComponentsToMainFrame(frame_.getContentPane());

    }
}

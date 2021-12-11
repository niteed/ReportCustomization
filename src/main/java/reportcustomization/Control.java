/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportcustomization;

import javax.swing.JPanel;

/**
 *
 * @author k b dhuri
 */
public class Control {
    private static JPanel panel_ = null;
    private static Header header_ = new Header();
    private static Body body_ = new Body();
    private static Footer footer_ = new Footer();
     
    public void Init(JPanel panel){
        panel_ = panel;
        header_.Init(panel);
        body_.Init(panel);
        footer_.Init(panel);
        Show(0); //Default Header
    }
     
    public void Show(int control_selection_index) {
        if (control_selection_index == 0) { //Header
            header_.Show(Boolean.TRUE);
            body_.Show(Boolean.FALSE);
            footer_.Show(Boolean.FALSE);
        } else if (control_selection_index == 1) {// Body
            header_.Show(Boolean.FALSE);
            body_.Show(Boolean.TRUE);
            footer_.Show(Boolean.FALSE);
        } else if (control_selection_index == 2) {//Footer
            header_.Show(Boolean.FALSE);
            body_.Show(Boolean.FALSE);
            footer_.Show(Boolean.TRUE);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LogIn_Cus;
import View.MenuMinuman;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class GUI_Controller implements ActionListener {
    private LogIn_Cus gui;
    public GUI_Controller(){
        gui = new LogIn_Cus();
        gui.setVisible(true);
        gui.addlistener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if (o.equals(gui.getsubmitbtn())){
            gui.dispose();
            new MenuMinuman().setVisible(true);
        }
    }
    
}

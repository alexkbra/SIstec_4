/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jserialport;

import forms.FrmMantenimiento;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Rene Quintero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        // TODO code application logic here
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        FrmMantenimiento frm= new FrmMantenimiento();
        frm.show();
    }

}

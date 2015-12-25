
import java.io.IOException;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matz
 */
public class BrightnessManagerTest {
    
    public static void main(String[] args) throws IOException
    {
        //JTextField Array damit man in Zukunft um mehr Eingabefelder erweitern kann
        JTextField[] feld = {new JTextField()};
        Object[] msg = {"Helligkeit", feld[0]};  
        JOptionPane.showConfirmDialog(null, msg, "BrightnessManager", JOptionPane.OK_CANCEL_OPTION);
        int x = Integer.parseInt(feld[0].getText());

        BrightnessManager.setHelligkeit(x);
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rene Quintero
 */
public class Util {

    public static void grabarArchivo(String sFile, String sText) throws Exception{

        BufferedWriter bw = new BufferedWriter(new FileWriter(sFile));

        try {
            bw.write(sText);
            bw.close();
        } catch (IOException e) {
            throw new Exception(e.getMessage());
        }
    }

    public static String leerArchivo(String sFile)throws Exception{
        try {
            BufferedReader br = new BufferedReader(new FileReader(sFile));

            return br.readLine();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception(ex.getMessage());
        }

    }


}

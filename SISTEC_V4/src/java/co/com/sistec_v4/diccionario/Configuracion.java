package co.com.sistec_v4.diccionario;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Jhon Alexander Muñoz Duque.
 * @version 003
 * 
 */
public class Configuracion {
    
    public static String getPropiedad(String propiedad){
        String pro="";
        try {
            Properties propiedades = new Properties();
            try{
                propiedades.load(new FileInputStream("C:\\Users\\AleX\\Dropbox\\SISTEC\\Proyecto\\SISTEC_V4\\src\\java\\co\\com\\sistec_v3\\diccionario\\SISTEC_V4_Constantes.properties"));
            }catch(Exception es){
                propiedades.load(new FileInputStream("C:\\Users\\Tatiana\\Dropbox\\SISTEC\\Proyecto\\SISTEC_V4\\src\\java\\co\\com\\sistec_v3\\diccionario\\SISTEC_V4_Constantes.properties"));
            }
            pro = propiedades.getProperty(propiedad);
            return pro;
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
            return pro;
        }
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Util;

import giovynet.nativelink.SerialPort;
import giovynet.serial.Baud;
import giovynet.serial.Com;
import giovynet.serial.Parameters;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rene Quintero
 */
public class PuertoObj {

    Com puerto;
    private String formatoCadena;
    private String subCadena;
    private int caracterIniciaLectura;
    private Parameters parametros;
    private boolean  bRegresaCadenaCompleta = false;

    public PuertoObj() throws Exception{

        parametros = new Parameters();

    }

    public void ConfiguraPuerto(String nombrePuerto,
                                String baudios,
                                String paridad,
                                String bitsPorCaracter,
                                String bitsDeParada) throws Exception{

        //initParameters();

        parametros.setPort(nombrePuerto);
        parametros.setBaudRate(Baud.valueOf(baudios));
        parametros.setParity(paridad);
        parametros.setByteSize(bitsPorCaracter);
        parametros.setStopBits(bitsDeParada);
        
    }

    public void CerrarPuerto()throws Exception{
        try {
            puerto.close();
        } catch (Exception ex) {
            //Logger.getLogger(PuertoObj.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
    }

    public String LeerDatos()
    {
        String dato = "";
        try {
            String dt = puerto.receiveToString(formatoCadena.length());
            
            //System.out.println("La salida es: "+dt.length());
            if (dt == null || dt.trim().compareTo("")==0) {
                return "No hay datos";
            }
            if (!bRegresaCadenaCompleta) {
                dato = dt.substring(caracterIniciaLectura, subCadena.length());
            } else {
                dato = dt;
            }
        } catch (Exception ex) {
            Logger.getLogger(PuertoObj.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dato;
       
    }

    public void EscribirDatos(String dato) throws Exception
    {
        try
        {
            puerto.sendArrayChar(dato.toCharArray());
        }
        catch (Exception ex)
        {
            //throw ex;
        }
    }

    public void AbrirPuerto() throws Exception
    {
        //Determinal el caracter final de la lectura
        caracterIniciaLectura = 0;
        if(formatoCadena!=null){

            if(subCadena==null)
                subCadena = formatoCadena;

            caracterIniciaLectura = formatoCadena.indexOf(subCadena);
        }else{
            formatoCadena = "";
            bRegresaCadenaCompleta = true;
        }

        try
        {
            if (getFormatoCadena().length()>0){
                //puerto = formatoCadena.length();
            }

            puerto = new Com(parametros);

        }
        catch (Exception ex)
        {
            throw ex;
        }
    }

    
    public static List<String> getPuertosLibres(){
        List<String>puertos = null;
        try {
            SerialPort pr = new SerialPort();
            puertos = pr.getFreeSerialPort();

        } catch (Exception ex) {
            Logger.getLogger(PuertoObj.class.getName()).log(Level.SEVERE, null, ex);
        }

        return puertos;

    }

    /**
     * @return the formatoCadena
     */
    public String getFormatoCadena() {
        return formatoCadena;
    }

    /**
     * @param formatoCadena the formatoCadena to set
     */
    public void setFormatoCadena(String formatoCadena) {
        this.formatoCadena = formatoCadena;
    }

    /**
     * @return the subCadena
     */
    public String getSubCadena() {
        return subCadena;
    }

    /**
     * @param subCadena the subCadena to set
     */
    public void setSubCadena(String subCadena) {
        this.subCadena = subCadena;
    }
}

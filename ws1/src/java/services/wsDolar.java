/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author USER
 */
@WebService(serviceName = "wsDolar")
public class wsDolar {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "tipoCambio")
    public Double tipoCambio() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "tipoCambioDate")
    public Double tipoCambioDate(@WebParam(name = "anio") int anio, @WebParam(name = "mes") int mes, @WebParam(name = "dia") int dia) {
        //TODO write your implementation code here:
                SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");        
        Date day_uno = null;
        Date day_dos = null;
        Date day_tres = null;
        Date fecha = null;
        Double retorno = 0.0;
        String dd = String.valueOf(dia);
        String mm = String.valueOf(mes);
        String yy = String.valueOf(anio);
        String fec = dd + "/" + mm + "/" + yy;
        try {
            fecha = sdf.parse(fec);
            day_uno = sdf.parse("6/7/2020");
            day_dos = sdf.parse("6/8/2020");
            day_tres = sdf.parse("6/9/2020");
        } catch (Exception e) {
        }
        fecha = (Date) fecha;
        if(fecha.equals(day_uno)){
            retorno = 4.5;
        }
        else if(fecha.equals(day_dos)){
            retorno = 4.6;
        }
        else if(fecha.equals(day_tres)){
            retorno = 4.7;
        }
        else{
            retorno = 4.8;
        }   
        return retorno;
    }

}

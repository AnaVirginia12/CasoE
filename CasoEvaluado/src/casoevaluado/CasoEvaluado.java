/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluado;

import javax.swing.JOptionPane;

/**
 *
 * @author Ana Virginia
 */
public class CasoEvaluado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Factura factura = new Factura();
        IndicadorDeFactura InFactura = new IndicadorDeFactura();
        DatosAgente agente = new DatosAgente();
        String verificacion = "SI";
        
        do { 
            //Ingreso de datos De Agente 
            agente.setNombreAgente(JOptionPane.showInputDialog("Digite su nombre"));
            agente.setNombreAgente(JOptionPane.showInputDialog("Digite su cedula"));
            agente.setCodigoDeAgente(Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo de agente")));
            agente.setSucursalDePertenencia(Integer.parseInt(JOptionPane.showInputDialog("Digite a la surcusal que pertence")));
            
            
     
            //Ingreso de datos para facturacion
            factura.setNombreCliente(JOptionPane.showInputDialog("Digite su nombre"));
            factura.setCedulaCliente(JOptionPane.showInputDialog("Digite su cedula"));
            factura.setCodigoDeFactura(Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo de factura")));
            factura.setMontoDeLaFactura(Integer.parseInt(JOptionPane.showInputDialog("Digite el monto de la factura")));
            factura.setNumeroDeMes(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del Mes")));
            JOptionPane.showMessageDialog(null, "Mes:" + factura.getNombreMes()); 
            factura.setProductosAutomotrices(JOptionPane.showInputDialog("Digite el numero de productos de Automatris"));
            factura.setProductosDeConstruccion(JOptionPane.showInputDialog("Digite el numero de productos  de construccion"));
            factura.setProductosElectricos(JOptionPane.showInputDialog("Digite el numero de productos electricos"));
            
             verificacion= JOptionPane.showInputDialog("Desea ingresar mas facturas");
            
        } while (verificacion.compareTo("SI")==0);//Si la respuesta es "no" va a dejar de pedir datos
        
        
        JOptionPane.showMessageDialog(null,"El cliente"+factura.getNombreCliente()+"codigo:"+ factura.getCodigoDeFactura()+"en el mes de:"+factura.getNombreMes());
        JOptionPane.showMessageDialog(null,"El agente vendio total de facturas"+agente.getMonto()+ agente.PuntosAcumulados);
      
         
                     
            

        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado;

/**
 *
 * @author Ana Virginia
 */
public class Factura {
    
    
    //Creo variables para la infomacion del cliente para la facturacion
    private String NombreCliente;
    private String CedulaCliente;
    private int CodigoDeFactura;
    private int NumeroDeMes;
    private double MontoDeLaFactura;
    private String NombreMes;
   
    //Creo variables para saber que tipo de producto lleva 
    private String ProductosElectricos;
    private String ProductosAutomotrices;
    private String ProductosDeConstruccion;

    public String getProductosElectricos() {
        return ProductosElectricos;
    }

    public void setProductosElectricos(String ProductosElectricos) {
        this.ProductosElectricos = ProductosElectricos;
    }

    public String getProductosAutomotrices() {
        return ProductosAutomotrices;
    }

    public void setProductosAutomotrices(String ProductosAutomotrices) {
        this.ProductosAutomotrices = ProductosAutomotrices;
    }

    public String getProductosDeConstruccion() {
        return ProductosDeConstruccion;
    }

    public void setProductosDeConstruccion(String ProductosDeConstruccion) {
        this.ProductosDeConstruccion = ProductosDeConstruccion;
    }

    
    
    
    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getCedulaCliente() {
        return CedulaCliente;
    }

    public void setCedulaCliente(String CedulaCliente) {
        this.CedulaCliente = CedulaCliente;
    }

    public int getCodigoDeFactura() {
        return CodigoDeFactura;
    }

    public void setCodigoDeFactura(int CodigoDeFactura) {
        this.CodigoDeFactura = CodigoDeFactura;
    }

    public int getNumeroDeMes() {
        return NumeroDeMes;
    }

    public void setNumeroDeMes(int NumeroDeMes) {
        this.NumeroDeMes = NumeroDeMes;
    }

    public double getMontoDeLaFactura() {
        return MontoDeLaFactura;
    }

    public void setMontoDeLaFactura(double MontoDeLaFactura) {
        this.MontoDeLaFactura = MontoDeLaFactura;
    }

    public String getNombreMes() { //Creo switch para poder que salga el numero del mes 
        switch (NumeroDeMes) {
            case 1:
                NombreMes="Enero";
                break;
             
            case 2:
                NombreMes="Febrero";
                break;
            
            case 3:
                NombreMes="Marzo";
                break;
                
            case 4:
                NombreMes="Abril";
                break;
                
            case 5:
                NombreMes="Mayo";
                break;
             
            case 6:
                NombreMes="Junio";
                break;
             
            case 7:
                NombreMes="Julio";
                break;
            
            case 8:
                NombreMes="Septiembre";
                break;
             
            case 9:
                NombreMes="Octubre";
                break;
             
            case 10:
                NombreMes="Octubre";
                break;
                    
            case 11:
                NombreMes="Noviembre ";
                break;
               
            case 12:
                NombreMes="Diciembre";
                break;
                    
            default:
                throw new AssertionError();
        }
        return NombreMes;
    }

    public void setNombreMes(String NombreMes) {
        this.NombreMes = NombreMes;
    }
    
    
    
    
    
    
    
    
    
    
}

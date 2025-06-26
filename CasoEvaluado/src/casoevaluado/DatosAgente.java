/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado;

/**
 *
 * @author Ana Virginia
 */
public class DatosAgente {
    
  //Creo variables con la infomacion del Agente 
    private String NombreAgente;
    private String CedulaAgente;
    private int CodigoDeAgente;
    private int SucursalDePertenencia;
    private int Vehiculo;
    
    //Creo variables para el calculo 
    private double Tresproductos;
    private double ProductosElectricos;
    private double ProducosAutomotrices;
    private double ProductosContruccion;
    private double Monto;
    

    
    public double PuntosAcumulados=0;
    public double FacturasAcumuladas=0;
    public double Bono;

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }
    
    

    public double getTresproductos() {
        
        if (ProductosElectricos >0 && ProducosAutomotrices >0 && ProductosContruccion >0) {
            PuntosAcumulados+=3;
            if (Monto > 50000)PuntosAcumulados+=1;  {
                
            }
            
        }
        return Tresproductos;
    }

    public void setTresproductos(double Tresproductos) {
        this.Tresproductos = Tresproductos;
    }

    public double getProductosElectricos() {
        
       if (ProductosElectricos>3)PuntosAcumulados+=1;  {
          
                
            }
        
        return ProductosElectricos;
    }

    public void setProductosElectricos(double ProductosElectricos) {
        this.ProductosElectricos = ProductosElectricos;
    }

    public double getProducosAutomotrices() {
        
        if (ProducosAutomotrices>3) PuntosAcumulados+=1; {
          
          
        }
          return ProducosAutomotrices;
    }

    public void setProducosAutomotrices(double ProducosAutomotrices) {
        this.ProducosAutomotrices = ProducosAutomotrices;
    }

    public double getProductosContruccion() {
        
        if (ProductosContruccion>3)PuntosAcumulados+=3; {
          
          
        }
        
        
        return ProductosContruccion;
    }

    public void setProductosContruccion(double ProductosContruccion) {
        this.ProductosContruccion = ProductosContruccion;
    }
    
 

    public String getNombreAgente() {
        return NombreAgente;
    }

    public void setNombreAgente(String NombreAgente) {
        this.NombreAgente = NombreAgente;
    }

    public String getCedulaAgente() {
        return CedulaAgente;
    }

    public void setCedulaAgente(String CedulaAgente) {
        this.CedulaAgente = CedulaAgente;
    }

    public int getCodigoDeAgente() {
        return CodigoDeAgente;
    }

    public void setCodigoDeAgente(int CodigoDeAgente) {
        this.CodigoDeAgente = CodigoDeAgente;
    }

    public int getSucursalDePertenencia() {
        return SucursalDePertenencia;
    }

    public void setSucursalDePertenencia(int SucursalDePertenencia) {
        this.SucursalDePertenencia = SucursalDePertenencia;
    }

    public int getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(int Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    public double getPuntosAcumulados() {
        return PuntosAcumulados;
    }

    public void setPuntosAcumulados(double PuntosAcumulados) {
        this.PuntosAcumulados = PuntosAcumulados;
    }

    public double getFacturasAcumuladas() {
        return FacturasAcumuladas;
    }

    public void setFacturasAcumuladas(double FacturasAcumuladas) {
        this.FacturasAcumuladas = FacturasAcumuladas;
    }

    
    
    
    
    
    
    
}

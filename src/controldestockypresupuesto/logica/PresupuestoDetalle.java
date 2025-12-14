
package controldestockypresupuesto.logica;

public class PresupuestoDetalle {
    private int idPresupuestoDetalle;
    private int idPresupuesto;
    private int idMaterial;
    
    private String descripcion;
    private double ancho;
    private double alto;
    private int cantidad;
    private double separacion_x;
    private double separacion_y;
    private double precioUnitario;
    public double subTotal;
    
    public PresupuestoDetalle(){
        
    }
    
    //constructor completo
    public PresupuestoDetalle(int idPresupuestoDetalle,String descripcion,int cantidad,double precioUnitario){
        this.idPresupuestoDetalle= idPresupuestoDetalle;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        
    }
 
    //subtotal
    public void calcularSubTotal(){
        this.subTotal = cantidad * precioUnitario;
        
    }

    public double getSubTotal() {
        return subTotal;
    }
    
    
    
    

}

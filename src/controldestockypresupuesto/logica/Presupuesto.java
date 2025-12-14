
package controldestockypresupuesto.logica;
import java.util.Date;

public class Presupuesto {
    private int id_presupuesto;
    private int id_cliente;
    private Date fecha;
    private double monto_unidad;
    private double monto_total;
    private EstadoPresupuesto estado;
    private String observaciones;
    
    public Presupuesto(){
        
    }

    public Presupuesto(int id_presupuesto, int id_cliente, Date fecha, double monto_unidad, double monto_total,EstadoPresupuesto estado,String observaciones) {
        this.id_presupuesto = id_presupuesto;
        this.id_cliente = id_cliente;
        this.fecha = fecha;
        this.monto_unidad = monto_unidad;
        this.monto_total = monto_total;
        this.estado = estado;
        this.observaciones = observaciones;
    }

    public int getId_presupuesto() {
        return id_presupuesto;
    }

    public void setId_presupuesto(int id_presupuesto) {
        this.id_presupuesto = id_presupuesto;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto_unidad() {
        return monto_unidad;
    }

    public void setMonto_unidad(double monto_unidad) {
        this.monto_unidad = monto_unidad;
    }

    public double getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(double monto_total) {
        this.monto_total = monto_total;
    }

    public EstadoPresupuesto getEstado() {
        return estado;
    }

    public void setEstado(EstadoPresupuesto estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
    
    
    

}

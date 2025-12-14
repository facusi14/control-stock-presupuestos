
package controldestockypresupuesto.logica;
import java.util.Date;

public class Venta {
    private int idVenta;
    private int idPedido;
    private MetodoPago metodoPago;
    private double total;
    private Date fechaVenta;

    public Venta(int idVenta, int idPedido, MetodoPago metodoPago, double total, Date fechaVenta) {
        this.idVenta = idVenta;
        this.idPedido = idPedido;
        this.metodoPago = metodoPago;
        this.total = total;
        this.fechaVenta = fechaVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
    

}

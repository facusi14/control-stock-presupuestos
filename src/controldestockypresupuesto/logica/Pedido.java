
package controldestockypresupuesto.logica;
import java.util.Date;

public class Pedido {
    private int id;
    private String cliente;
    private String descripcion;
    private double total;
    private EstadoPedido estado;
    private Date fechaPedido;
    private Date fechaEntregaReal;
    private Date fechaEntregaEstimada;
    private double anticipo;
    private PrioridadPedido prioridadPedido;
    
    
    public Pedido(){
        
    }
    
    public Pedido (int id,String cliente){
        this.id = id;
        this.cliente = cliente;
              
    }

    public Pedido(int id, String cliente, String descripcion, double total, EstadoPedido estado) {
        this.id = id;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.total = total;
        this.estado = estado;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public EstadoPedido getestado() {
        return estado;
    }

    public void setEstadoId(EstadoPedido estado) {
        this.estado = estado;
    }
    

}

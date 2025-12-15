package controldestockypresupuesto.logica;

import java.util.Date;

public class Presupuesto {
    private int id;
    private int idCliente;
    private Date fecha;
    private double montoUnidad;
    private double montoTotal;
    private EstadoPresupuesto estado;
    private String observaciones;

    public Presupuesto() {}

    public Presupuesto(int id, int idCliente, Date fecha, double montoUnidad, double montoTotal,
                       EstadoPresupuesto estado, String observaciones) {
        this.id = id;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.montoUnidad = montoUnidad;
        this.montoTotal = montoTotal;
        this.estado = estado;
        this.observaciones = observaciones;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public double getMontoUnidad() { return montoUnidad; }
    public void setMontoUnidad(double montoUnidad) { this.montoUnidad = montoUnidad; }

    public double getMontoTotal() { return montoTotal; }
    public void setMontoTotal(double montoTotal) { this.montoTotal = montoTotal; }

    public EstadoPresupuesto getEstado() { return estado; }
    public void setEstado(EstadoPresupuesto estado) { this.estado = estado; }

    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }
}

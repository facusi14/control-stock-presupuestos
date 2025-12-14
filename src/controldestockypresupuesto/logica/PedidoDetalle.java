
package controldestockypresupuesto.logica;

public class PedidoDetalle {
    private int idDetalle;
    private int idPedido;
    private int idMaterial;
    private String descripcion;
    private double ancho;
    private double alto;
    private int cantidad;
    private double separacion_x;
    private double separacion_y;
    private double subtotal;
    private int precio_unitario;

    public PedidoDetalle(int idDetalle, int idPedido, int idMaterial, String descripcion, double ancho, double alto, int cantidad, double separacion_x, double separacion_y, double subtotal, int precio_unitario) {
        this.idDetalle = idDetalle;
        this.idPedido = idPedido;
        this.idMaterial = idMaterial;
        this.descripcion = descripcion;
        this.ancho = ancho;
        this.alto = alto;
        this.cantidad = cantidad;
        this.separacion_x = separacion_x;
        this.separacion_y = separacion_y;
        this.subtotal = subtotal;
        this.precio_unitario = precio_unitario;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSeparacion_x() {
        return separacion_x;
    }

    public void setSeparacion_x(double separacion_x) {
        this.separacion_x = separacion_x;
    }

    public double getSeparacion_y() {
        return separacion_y;
    }

    public void setSeparacion_y(double separacion_y) {
        this.separacion_y = separacion_y;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(int precio_unitario) {
        this.precio_unitario = precio_unitario;
    }
    
    

}


package controldestockypresupuesto.logica;

public class Cliente {
     public int id_cliente;
     private String nombre;
     private int descuento_cliente;
     private String telefono;
     
     public Cliente(){
         
     }
     
     public Cliente(int id_cliente, String nombre, int descuento_cliente,String telefono){
         this.id_cliente = id_cliente;
         this.nombre = nombre;
         this.descuento_cliente = descuento_cliente;
         this.telefono = telefono;
     }
     
     

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDescuento_cliente() {
        return descuento_cliente;
    }

    public void setDescuento_cliente(int descuento_cliente) {
        this.descuento_cliente = descuento_cliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
     
     

}

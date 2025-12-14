package controldestockypresupuesto.logica;

import java.util.List;

public class GestorPresupuesto {

    public Presupuesto presupuestar(Cliente cliente, List<PresupuestoDetalle> detalles) {

        // se crea un nuevo objeto Presupuesto. Todavia esta vacio, se va a ir completando
        Presupuesto presupuesto = new Presupuesto(); 
        
        
        //asociar cliente al presupuesto(solo el ID)
        presupuesto.setId_cliente(cliente.getId_cliente());

        double total = 0;
        
        //caluclar subtotales y total 
        for (PresupuestoDetalle detalle : detalles) {
            detalle.calcularSubTotal();
            total += detalle.getSubTotal();
            
        }

        // aplicar descuento del cliente
        if (cliente.getDescuento_cliente() > 0) {
            double descuento = total * cliente.getDescuento_cliente() / 100.0;
            total -= descuento;
        }
        
        //setear datos finales del presupuesto
        presupuesto.setMonto_total
        (total);
        presupuesto.setEstado(EstadoPresupuesto.EN_PROCESO);

        return presupuesto;
    }
}

package controldestockypresupuesto.logica;

public class GestorPedido {

    public Pedido crearPedidoDesdePresupuesto(Presupuesto presupuesto,
                                              PrioridadPedido prioridad,
                                              MetodoPago metodoPago) {
        // 1️⃣ Validación de presupuesto
        if (presupuesto.getEstado() != EstadoPresupuesto.COMPLETADO) {
            throw new IllegalStateException(
                "El presupuesto no está completado. No se puede generar el pedido."
            );
        }

        // 2️⃣ Crear pedido copiando datos relevantes
        Pedido pedido = new Pedido();
        pedido.setIdCliente(presupuesto.getIdCliente());
        pedido.setDescripcion(presupuesto.getObservaciones());
        pedido.setTotal(presupuesto.getMontoTotal());
        pedido.setPrioridad(prioridad);
        pedido.setMetodoPago(metodoPago);

        // 3️⃣ Estado inicial del pedido
        pedido.setEstado(EstadoPedido.DISEÑO);

        return pedido;
    }
}

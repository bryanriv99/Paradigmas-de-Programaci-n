package carr;

public class ITEM {
    private Producto producto;
    private int cantidad;

    public ITEM(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.producto.reducirStock(cantidad);
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

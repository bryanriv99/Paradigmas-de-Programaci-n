package carr;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void reducirStock(int cantidad) {
        if (stock >= cantidad) {
            stock -= cantidad;
        } else {
            throw new IllegalArgumentException("Stock insuficiente.");
        }
    }

    public void incrementarStock(int cantidad) {
        stock += cantidad;
    }
}

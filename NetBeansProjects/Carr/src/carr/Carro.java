package carr;
import java.util.ArrayList;
import java.util.List;

public class Carro {
    private int id;
    private String descripcion;
    private List<ITEM> items;

    public Carro(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<ITEM> getItems() {
        return items;
    }

    public void agregarItem(ITEM item) {
        items.add(item);
    }

    public void quitarItem(ITEM item) {
        items.remove(item);
    }

    public void vaciarCarro() {
        for (ITEM item : items) {
            item.getProducto().incrementarStock(item.getCantidad());
        }
        items.clear();
    }
}

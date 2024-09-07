package cuenta;

import java.util.ArrayList;

public class Cuenta {
    private String nombre;
    private ArrayList<Cliente> Titulares = new ArrayList<>();

    static ArrayList<Cuenta> Cts = new ArrayList<>();

    public Cuenta(String nombre) {
        this.nombre = nombre;
    }

    public void asignarTitular(Cliente titular) {
        Titulares.add(titular);
    }

    public static void RegistrarCuenta(Cuenta cu) {
        Cts.add(cu);
    }

    public boolean esTitular(Cliente titular) {
        return Titulares.contains(titular);
    }

    public String getNombre() {
        return nombre;
    }
}

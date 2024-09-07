package cuenta;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    static ArrayList<Cliente> Titulares = new ArrayList<>();

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public static void RegistrarTitular(Cliente c) {
        Titulares.add(c);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Cuenta> obtenerCuentasTitular() {
        ArrayList<Cuenta> cuentasTitular = new ArrayList<>();
        for (Cuenta cuenta : Cuenta.Cts) {
            if (cuenta.esTitular(this)) {
                cuentasTitular.add(cuenta);
            }
        }
        return cuentasTitular;
    }
}

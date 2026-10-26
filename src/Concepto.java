/**
 * Clase Concepto
 * Representa un concepto que declara impuestos: puede ser un producto o un servicio.
 * Permite calcular un impuesto, como el IVA y el importe final del concepto.
 * Autor: Susan Irene Pereyra Reyna
 */
public class Concepto {

    // ===== Atributos =====
    private final String descripcion;
    private final String tipo;       // "Producto" o "Servicio"
    private final double precio;     // precio sin IVA
    private final double tasaIva;    // tasa en porcentaje: 16, 8 o 0

    // ===== Constructor =====
    // Asigna los datos iniciales del concepto al crearlo con "new"
    public Concepto(String descripcion, String tipo, double precio, double tasaIva) {
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
        this.tasaIva = tasaIva;
    }

    // ===== Métodos =====
    // Calcula y regresa el monto de IVA del concepto
    public double calcularIva() {
        return precio * tasaIva / 100;
    }
    // Calcula y regresa el importe final (precio + IVA)
    public double calcularTotal() {
        return precio + calcularIva();
    }
    // Muestra en consola la información del concepto y sus cálculos
    public void mostrarInformacion() {
        System.out.println(tipo + ": " + descripcion);
        System.out.println("Precio sin IVA: $" + precio);
        System.out.println("Tasa de IVA: " + tasaIva + "%");
        System.out.println("IVA: $" + calcularIva());
        System.out.println("Importe final: $" + calcularTotal());
        System.out.println("---------------------------");
    }
}

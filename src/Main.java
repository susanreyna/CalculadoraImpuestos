/**
 * Clase Main
 * Programa principal de la Calculadora de Impuestos.
 * Crea conceptos (productos y servicios) con distintas tasas de IVA
 * y prueba sus métodos.
 *
 * Autor: Susan Irene Pereyra Reyna
 */
public class Main {

    public static void main(String[] args) {

        // Instanciación: crear objetos de la clase Concepto
        Concepto celular = new Concepto("Celular", "Producto", 5000, 16);
        Concepto consultoria = new Concepto("Consultoría contable", "Servicio", 3000, 16);

        // Prueba de métodos: mostrar la información de cada concepto
        System.out.println("=== CALCULADORA DE IMPUESTOS ===");
        celular.mostrarInformacion();
        consultoria.mostrarInformacion();


        // Prueba de un metodo por separado
        System.out.println("El IVA de la consultoría es: $" + consultoria.calcularIva());
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String animal = "Perro";
        String tipo;

        System.out.println("switch clásico:");
        switch (animal) {
            case "Perro":
            case "Gato":
            case "Conejo":
                tipo = "Mamífero";
                break;
            case "Águila":
            case "Loro":
            case "Halcón":
                tipo = "Ave";
                break;
            case "Tiburón":
            case "Delfín":
            case "Pez payaso":
                tipo = "Pez";
                break;
            default:
                tipo = "Desconocido";
        }
        System.out.println("El " + animal + " es un: " + tipo);

        // --- SWITCH MEJORADO (JAVA 14+) ---
        System.out.println("\nswitch nuevo:");
        tipo = switch (animal) {
            case "Perro", "Gato", "Conejo" -> "Mamífero";
            case "Águila", "Loro", "Halcón" -> "Ave";
            case "Tiburón", "Delfín", "Pez payaso" -> "Pez";
            default -> "Desconocido";
        };
        System.out.println("El " + animal + " es un: " + tipo);
    }
}
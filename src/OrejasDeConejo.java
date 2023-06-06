import java.util.Scanner;

public class OrejasDeConejo {
    public static int calcularOrejas(int conejos) {
        if (conejos == 0) {
            return 0;
        }

        // Cada conejo tiene 2 orejas
        int orejas = 2;

        // Por cada conejo sumaremos 2 orejas
        for (int i = 1; i < conejos; i++) {
            orejas += 2;
        }

        return orejas;
    }

    public static void main(String[] args) {
        // Ejemplo de uso del método calculateBunnyEars
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de conejos");
        int conejos =leer.nextInt();
        System.out.println("Cantidad de conejos: " + conejos);
        System.out.println("Cantidad de orejas: " + calcularOrejas(conejos));
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa la primera nota: ");
        double nota1 = teclado.nextDouble();
        
        System.out.print("Ingresa la segunda nota: ");
        double nota2 = teclado.nextDouble();
        
        if (nota1 < 0 || nota1 > 20 || nota2 < 0 || nota2 > 20) {
            System.out.println("Error: Las notas deben estar entre 0 y 20");
        } else {
            double promedio = (nota1 + nota2) / 2.0;
            System.out.println("El promedio exacto es: " + promedio);
        }
        
        teclado.close();
    }
}

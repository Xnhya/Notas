public class Main {
    public static void main(String[] args) {
        double nota1 = 15.5;
        double nota2 = 18.0;
        
        if (nota1 < 0 || nota1 > 20 || nota2 < 0 || nota2 > 20) {
            System.out.println("Error: Las notas deben estar entre 0 y 20");
        } else {
            double promedio = (nota1 + nota2) / 2.0;
            System.out.println("El promedio exacto es: " + promedio);
        }
    }
}
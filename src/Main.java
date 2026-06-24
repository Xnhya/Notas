public class Main {
    public static void main(String[] args) {
        int nota1 = 15;
        int nota2 = 25;
        
        if (nota1 < 0 || nota1 > 20 || nota2 < 0 || nota2 > 20) {
            System.out.println("Error: Las notas deben estar entre 0 y 20");
        } else {
            int promedio = (nota1 + nota2) / 2;
            System.out.println("El promedio es: " + promedio);
        }
    }
}
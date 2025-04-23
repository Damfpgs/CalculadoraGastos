import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        while(true){
            System.out.println("CALCULADORA GASTOS");
            System.out.println("1. Añadir gasto");
            System.out.println("2. Ver resumen de deudas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
        }
    }
}

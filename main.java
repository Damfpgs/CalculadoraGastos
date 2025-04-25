import java.util.ArrayList;
import java.util.List;
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

            switch(opcion){
                case 1:
                    System.out.println("Quién pagó?: ");
                    String pagador = scanner.nextLine();
                    System.out.println("Cuánto pagó?: ");
                    double cantidad = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("¿Para cuántas personas fue?: ");
                    int numPersonas = scanner.nextInt();
                    scanner.nextLine();

                    List<String> participantes = new ArrayList<>();
                    for (int i = 0; i < numPersonas; i++) {
                        System.out.println("Nombre del participante " + (i + 1) + ": ");
                        participantes.add(scanner.nextLine());
                    }

                    Gasto nuevoGasto = new Gasto(pagador, cantidad, participantes);
                    calculadora.agregarGasto(nuevoGasto);
                    System.out.println("Gasto registrado.");
                    break;

                    case 2:
                    calculadora.mostrarResumen();
                    break;


            }
        }
    }
}

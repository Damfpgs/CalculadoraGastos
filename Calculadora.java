import java.util.*;

public class Calculadora {
    private List<Gasto> gastos = new ArrayList<>();
 // Método para agregar un gasto nuevo a la lista
    public void agregarGasto(Gasto gasto) {
        gastos.add(gasto);
    }
// Método que muestra un resumen del balance de cada persona (quién debe a quién)
    public void mostrarResumen() {
        // Mapa para guardar el balance de cada persona (cuánto ha pagado o debe)
        Map<String, Double> balance = new HashMap<>();
 // Recorremos todos los gastos registrados
        for (Gasto gasto : gastos) {
            double cantidad = gasto.getCantidad();
            List<String> participantes = gasto.getParticipantes();
            double porPersona = cantidad / participantes.size();
 // Recorremos los participantes
            for (String persona : participantes) {
                 // Si la persona no es el que pagó...
                if (!persona.equals(gasto.getPagador())) {
                     // ...le restamos del balance su parte del gasto
                    balance.put(persona, balance.getOrDefault(persona, 0.0) - porPersona);
                       // ...y se la sumamos al pagador
                    balance.put(gasto.getPagador(), balance.getOrDefault(gasto.getPagador(), 0.0) + porPersona);
                }
            }
        }
// Mostramos el resumen del balance final
        System.out.println("\n--- RESUMEN DE DEUDAS ---");
        for (Map.Entry<String, Double> entry : balance.entrySet()) {
            String persona = entry.getKey();
            double saldo = entry.getValue();
            
            // Si el saldo es positivo, esa persona debe recibir dinero
            if (saldo > 0) {
                System.out.printf("%s debe recibir: %.2f €\n", persona, saldo);
            } else if (saldo < 0) {
                System.out.printf("%s debe pagar: %.2f €\n", persona, -saldo);
            // Si está en 0, está saldado
            } else {
                System.out.printf("%s está equilibrado.\n", persona);
            }
        }
    }
}
    


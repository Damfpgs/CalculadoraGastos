import java.util.*;

public class Calculadora {
    private List<Gasto> gastos = new ArrayList<>();

    public void agregarGasto(Gasto gasto) {
        gastos.add(gasto);
    }

    public void mostrarResumen() {
        Map<String, Double> balance = new HashMap<>();

        for (Gasto gasto : gastos) {
            double cantidad = gasto.getCantidad();
            List<String> participantes = gasto.getParticipantes();
            double porPersona = cantidad / participantes.size();

            for (String persona : participantes) {
                if (!persona.equals(gasto.getPagador())) {
                    balance.put(persona, balance.getOrDefault(persona, 0.0) - porPersona);
                    balance.put(gasto.getPagador(), balance.getOrDefault(gasto.getPagador(), 0.0) + porPersona);
                }
            }
        }
        
        System.out.println("\n--- RESUMEN DE DEUDAS ---");
        for (Map.Entry<String, Double> entry : balance.entrySet()) {
            String persona = entry.getKey();
            double saldo = entry.getValue();

            if (saldo > 0) {
                System.out.printf("%s debe recibir: %.2f €\n", persona, saldo);
            } else if (saldo < 0) {
                System.out.printf("%s debe pagar: %.2f €\n", persona, -saldo);
            } else {
                System.out.printf("%s está equilibrado.\n", persona);
            }
        }
    }
}
    


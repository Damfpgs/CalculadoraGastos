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
    }
}

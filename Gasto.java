import java.util.List;
// Nombre de la persona que pagó el gasto
public class Gasto {
    private String pagador;
    private double cantidad;
    private List<String> participantes;
 // Constructor que inicializa los valores del gasto
    public Gasto(String pagador, double cantidad, List<String> participantes) {
        this.pagador = pagador;
        this.cantidad = cantidad;
        this.participantes = participantes;
    }
    // Devuelve el nombre del pagador

    public String getPagador() {
        return pagador;
    }
    // Devuelve la cantidad total del gasto

    public double getCantidad() {
        return cantidad;
    }
    // Devuelve la lista de participantes del gasto

    public List<String> getParticipantes() {
        return participantes;
    }
}
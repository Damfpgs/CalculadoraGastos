import java.util.List;

public class Gasto {
    private String pagador;
    private double cantidad;
    private List<String> participantes;

    public Gasto(String pagador, double cantidad, List<String> participantes) {
        this.pagador = pagador;
        this.cantidad = cantidad;
        this.participantes = participantes;
    }

    public String getPagador() {
        return pagador;
    }

    public double getCantidad() {
        return cantidad;
    }

    public List<String> getParticipantes() {
        return participantes;
    }
}
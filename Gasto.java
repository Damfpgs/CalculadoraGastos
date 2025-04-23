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
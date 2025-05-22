package solid.ocp;

public class CalculadoraArea {
    public double calcularAreaTotal(Forma[] formas) {
        double total = 0;
        for (Forma forma : formas) {
            total += forma.calcularArea();
        }
        return total;
    }
}

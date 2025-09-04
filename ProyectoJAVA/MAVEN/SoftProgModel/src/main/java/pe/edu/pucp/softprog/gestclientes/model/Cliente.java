
package pe.edu.pucp.softprog.gestclientes.model;

public class Cliente {
    private double lineaCredito;
    private Categoria categoria;

    public double getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(double lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}

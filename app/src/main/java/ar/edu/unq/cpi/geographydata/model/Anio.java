package ar.edu.unq.cpi.geographydata.model;

public class Anio {
    private int numeroAnio;

    public Anio(int numero) { this.numeroAnio = numero; }

    public String getNumeroAsString() { return String.valueOf(this.numeroAnio); }
    public boolean isBisiesto() {
        return (this.numeroAnio % 400 == 0) ||
                ((this.numeroAnio % 4 == 0) && (this.numeroAnio % 100 != 0));
    }

    public String toString() { return this.getNumeroAsString(); }
}

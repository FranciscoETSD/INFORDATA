package pojos;

public class Alquilable extends Producto {
    protected double precioHora;

    public Alquilable(String codigo, String modelo, double precioHora) {
        super(codigo, modelo);

        this.precioHora = precioHora;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    @Override
    public String toString() {
        return "Alquilable{" +
                "precioHora=" + precioHora +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;


    }
}

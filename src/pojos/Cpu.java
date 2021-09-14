package pojos;

import java.util.Date;

public class Cpu extends Tecnologico {
    private int memoriaPrincipal;

    public Cpu(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricante, int memoriaPrincipal){
        super(codigo, modelo, paisOrigen, fechaFabricacion, fabricante);

        this.memoriaPrincipal = memoriaPrincipal;
    }

    private void Super(String codigo, String modelo) {
    }


    public int getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "memoriaPrincipal=" + memoriaPrincipal +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", fabricante=" + fabricante +
                '}';
    }
}

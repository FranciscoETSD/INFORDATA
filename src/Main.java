import pojos.*;

import java.sql.SQLOutput;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        /*
        //producto
        Producto producto = new Producto("C001", "Teclado Retroiluminado");
        System.out.println(producto);

        //Alquilable
        Alquilable alquilable = new Alquilable("A005","Monitor 19",10.5);
        System.out.println(alquilable);

        //Tecnologico
        Empresa empresa = new Empresa("DELL","CALLE FALSA 123", 2342);
        Tecnologico tecnologico = new Tecnologico("T100", "Vostro 100","USA", Calendar.getInstance().getTime(), empresa);
        System.out.println(tecnologico);

        //Monitor
        Monitor monitor = new Monitor("M111","Monitor 21",12.5,"FULL HD");
        System.out.println(monitor);

        //Cpu
        Empresa thosiba = new Empresa("THOSIBA","CALLE FALSA 123", 2342);
        Cpu cpu = new Cpu("T200","Satellite","China", Calendar.getInstance().getTime(), thosiba,16);
        System.out.println(cpu);

        */

        //Polimorfismo
        Producto producto = new Producto("G120", "G120+");

        Producto lj750 = new Impresora("lj750","Canon Laserjet 750",30);
        //System.out.println(lj750);
        Producto s200 = new Monitor("s200+","Samsung s200 plus",15,"FHD");
        //System.out.println(s200);
        Producto m500 = new DiscoDuro("m500","Maxtor m500",10,500);
        //System.out.println(m500);

        Impresora impresora = (Impresora) lj750;
        //System.out.println(impresora);
        Monitor monitor = (Monitor) s200;
        //System.out.println(monitor);
        DiscoDuro discoDuro = (DiscoDuro) m500;
        //System.out.println(discoDuro);

        Producto[] productos = new Producto[3];
        productos[0] = impresora;
        productos[1] = monitor;
        productos[2] = discoDuro;

        for (int i = 0; i <productos.length ; i++) {
            System.out.println(productos[i]);
        }

    }
}

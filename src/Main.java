import pojos.*;

import java.sql.SQLOutput;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
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
    }
}

import java.util.Date;

public class EjemploHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan", 25000);
        empleado1.setGenero('m');
        empleado1.setEdad(33);
        empleado1.setDireccion("cra 6");
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente(new Date(), true);

        cliente1.setNombre("karla");
        cliente1.setEdad(31);
        cliente1.setGenero('f');
        cliente1.setDireccion("clle");
        System.out.println("cliente1 = " + cliente1);
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Alvaro");
        cliente.setEdad(35);
        cliente.setTelefono(123456789);
        cliente.setCredito(5000);

        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("José");
        trabajador.setEdad(36);
        trabajador.setTelefono(222225555);
        trabajador.setSalario(30000);

        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Credito: " + trabajador.getSalario());


    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){

        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){

        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setTelefono(int telefono){

        this.telefono=telefono;
    }
    public int getTelefono(){
        return telefono;
    }
}

class Cliente extends Persona {
    int credito;
    public void setCredito(int credito){

        this.credito=credito;
    }
    public int getCredito(){

        return credito;
    }
}

class Trabajador extends Persona {
    int salario;
    public void setSalario(int salario){

        this.salario=salario;
    }
    public int getSalario(){

        return salario;
    }
}
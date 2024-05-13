package gestion;

public class Empleado {
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private int telefono;
    private double salario;
    private Empleado supervisor;

    public Empleado(String nombre, String apellidos, String dni, String direccion, int telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.supervisor = null;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Salario: " + salario);
        if (supervisor != null) {
            System.out.println("Supervisor: " + supervisor.getNombre());
        }
    }

    public void cambiarSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public void incrementarSalario(double porcentaje) {
        salario *= (1 + porcentaje / 100);
    }

    public String getNombre() {
        return nombre;
    }
}
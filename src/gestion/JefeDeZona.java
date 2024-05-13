/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import java.util.List;

public class JefeDeZona extends Empleado {
    private String despacho;
    private Secretario secretario;
    private List<Vendedor> vendedores;
    private String matriculaCoche;
    private String marcaCoche;
    private String modeloCoche;

    public JefeDeZona(String nombre, String apellidos, String DNI, String direccion, int telefono, double salario, String despacho, Secretario secretario, List<Vendedor> vendedores, String matriculaCoche, String marcaCoche, String modeloCoche) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.vendedores = vendedores;
        this.matriculaCoche = matriculaCoche;
        this.marcaCoche = marcaCoche;
        this.modeloCoche = modeloCoche;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Despacho: " + despacho);
        System.out.println("Secretario: " + secretario.getNombre());
        System.out.println("Vendedores: " + vendedores);
        System.out.println("Matricula Coche: " + matriculaCoche);
        System.out.println("Marca Coche: " + marcaCoche);
        System.out.println("Modelo Coche: " + modeloCoche);
    }

    public void cambiarSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public void cambiarCoche(String matriculaCoche, String marcaCoche, String modeloCoche) {
        this.matriculaCoche = matriculaCoche;
        this.marcaCoche = marcaCoche;
        this.modeloCoche = modeloCoche;
    }

    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(20); // 20% anual
    }
}
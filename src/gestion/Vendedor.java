/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Empleado {
    private String matriculaCoche;
    private String marcaCoche;
    private String modeloCoche;
    private String telefonoMovil;
    private String areaVenta;
    private List<String> clientes;
    private double comision;

    public Vendedor(String nombre, String apellidos, String dni, String direccion, int telefono, double salario, String matriculaCoche, String marcaCoche, String modeloCoche, String telefonoMovil, String areaVenta, double comision) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.matriculaCoche = matriculaCoche;
        this.marcaCoche = marcaCoche;
        this.modeloCoche = modeloCoche;
        this.telefonoMovil = telefonoMovil;
        this.areaVenta = areaVenta;
        this.clientes = new ArrayList<>();
        this.comision = comision;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Matrícula Coche: " + matriculaCoche);
        System.out.println("Marca Coche: " + marcaCoche);
        System.out.println("Modelo Coche: " + modeloCoche);
        System.out.println("Teléfono Móvil: " + telefonoMovil);
        System.out.println("Área Venta: " + areaVenta);
        System.out.println("Clientes: " + clientes);
    }
    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(10); // 10% anual
    }
    public void darDeAltaCliente(String cliente) {
        clientes.add(cliente);
    }
    public void darDeBajaCliente(String cliente) {
        clientes.remove(cliente);
    }
    public void cambiarCoche(String matriculaCoche, String marcaCoche, String modeloCoche) {
        this.matriculaCoche = matriculaCoche;
        this.marcaCoche = marcaCoche;
        this.modeloCoche = modeloCoche;
    }
    
}
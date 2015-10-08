/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Estudiante
 */
public class Trabajo {
    
    private String direccion;
    private int telefono;
    private String email;

    public Trabajo() {
        this.direccion = "Los Angeles, San Rafael, Heredia";
        this.telefono = 88537112;
        this.email = "hagem.rodriguez@gmail.com";        
    }
    
    public Trabajo(String direccion, int telefono, String email) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void imprime(){    
        System.out.println("Dirección: "+this.direccion);        
        System.out.println("Email: "+this.email);
        System.out.println("Teléfono: "+this.telefono);
    }
}

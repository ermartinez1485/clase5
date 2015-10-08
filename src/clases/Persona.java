package clases; //nombre del paquete donde esta el archivo

//aqui es donde deberian ir los imports (en este caso no hay)
import java.util.Date;



/*entre la declaracion del paquete y la declaracion de la clase 
solo hay imports y comentarios*/


/**
 *
 * @author Hagem Rodriguez
 */
public class Persona { //definicion de la clase
    
    private int cedula;
    private String nombre;
    private char genero;
    private double salario;
    private boolean casado;
    private Date fechaNacimiento;
    private Trabajo miTrabajo;
    
    public Persona(){
        this.cedula = 112460737;
        this.nombre = "Hagem Rortz";
        this.genero = 'H';
        this.salario = 1000.10;
        this.casado = true;                
        this.fechaNacimiento = new Date();
        this.miTrabajo = new Trabajo();
    }
    
    public Persona(int ced, String nomb, char gen, double sal,
            boolean casad, Date fecha, String direccion, int telefono, 
            String email){
        this.cedula = ced;
        this.nombre = nomb;
        this.genero = gen;
        this.salario = sal;
        this.casado = casad;                
        this.fechaNacimiento = fecha;
        this.miTrabajo = new Trabajo(direccion, telefono, email);
    }
    
    public Persona(int ced, String nomb, char gen, double sal,
            boolean casad, Date fecha, Trabajo miTrab){
        this.cedula = ced;
        this.nombre = nomb;
        this.genero = gen;
        this.salario = sal;
        this.casado = casad;                
        this.fechaNacimiento = fecha;
        this.miTrabajo = miTrab;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Trabajo getMiTrabajo() {
        return miTrabajo;
    }

    public void setMiTrabajo(Trabajo miTrabajo) {
        this.miTrabajo = miTrabajo;
    }
    
    public void imprime(){
        
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Cédula: "+this.cedula);
        System.out.println("Fecha de nacimiento: "+this.fechaNacimiento);
        System.out.println("Género: "+this.genero);
        System.out.println("Salario: "+this.salario);
        System.out.println("Casado S/N: "+this.casado);
        this.miTrabajo.imprime();  
        
    }
    
    
}

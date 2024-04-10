package Relaciones;

public class Persona {
    private String nombre;
    private int edad;
    private Curso curso;
    private Domicilio domicilio;

    public Persona(String nombre, int edad, String calle, int numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = new Domicilio(calle, numero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Curso getCurso() {
        return curso;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void agregarCurso(Curso curso1){
        this.curso = curso1;
    }

    public void caminar(int km){
        System.out.println("Caminé" + km + "kilómetros");
    }

    public void mostrarDatos(){
        System.out.println("Soy " + nombre + " mi edad es " + edad + " y vivo en " + domicilio.getCalle() + " " + domicilio.getNumero());
        if (this.curso != null){
            System.out.println("Y estoy en el curso de " + curso.getNombre());
        }
    }

}

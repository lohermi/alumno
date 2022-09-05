public class main {

    public static void main(String[] args) {

        Alumno alumno0 = new Alumno("Juan", "Lorenzo", 31);
        Alumno alumno1 = new Alumno("Alberto", "Lorenzo", 22);
        Alumno alumno2 = new Alumno("Pedro", "Lorenzo", 12);
        Alumno alumno3 = new Alumno("Javier", "Lorenzo", 34);
        Alumno alumno4 = new Alumno("Daniela", "Lorenzo", 14);
        Alumno alumno5 = new Alumno("Alejandro", "Lorenzo", 19);
        Alumno alumno6 = new Alumno("Miguel", "Lorenzo", 44);
        Alumno alumno7 = new Alumno("Maria", "Lorenzo", 45);
        Alumno alumno8 = new Alumno("Ángel", "Lorenzo", 44);
        Alumno alumno9 = new Alumno("Liberto", "Lorenzo", 56);

        Alumno[] alumnos = new Alumno[10];

        alumnos[0] = alumno0;
        alumnos[1] = alumno1;
        alumnos[2] = alumno2;
        alumnos[3] = alumno3;
        alumnos[4] = alumno4;
        alumnos[5] = alumno5;
        alumnos[6] = alumno6;
        alumnos[7] = alumno7;
        alumnos[8] = alumno8;
        alumnos[9] = alumno9;

        for (Alumno a : alumnos) {
            System.out.println(a);
        }

    }

}

class Alumno {

    private String nombre;
    private String apellido;
    private int edad;

    public Alumno(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public String toString() {
        return "Nombre: " + this.nombre + " Apellido: " + this.apellido + " Edad: " + this.edad + "\n";
    }
}
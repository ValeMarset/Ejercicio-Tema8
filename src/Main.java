public class Main {
    public static void main(String[] args) {

        //Creo el objeto personaUno
        Persona personaUno = new Persona();
        //Establezo un valor para cada propiedad por medio de su setter
        personaUno.setNombre("Valentina");
        personaUno.setEdad(23);
        personaUno.setTelefono("099999999");

        //Obtengo el valor de cada propiedad por medio de su getter y lo imprimo en consola
        System.out.println("El nombre de la persona es: " + personaUno.getNombre());
        System.out.println( "Su edad es: "+ personaUno.getEdad());
        System.out.println("Su telefono es: " + personaUno.getTelefono());
    }
}
//Creo la clase Persona:
class Persona {

    //Establezco sus propiedades como privadas
    private int edad;
    private String nombre;
    private String telefono;

    //Setter y Getters

    //Edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

//Nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

//Teléfono
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return telefono;
    }
}

public class Tema_8 {
  public static void main(String[] args) {
    // 4. Crear un objeto persona en el main.
    Persona miPersona = new Persona();

    // 5. Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
    miPersona.setEdad(34);
    miPersona.setNombre("Ramon");
    miPersona.setTelefono("555.55.55");
    int miEdad = miPersona.getEdad();
    String miNombre = miPersona.getNombre();
    String miTelefono = miPersona.getTelefono();
    System.out.printf("Hola soy %s y tengo %d años de edad. Puedes contactarme al %s.%n", miNombre, miEdad, miTelefono);
  }
}

// 1. Crear clase Persona.

class Persona {
  // 2. Crear variables las privadas edad, nombre y telefono de la clase Persona.
  private int edad;
  private String nombre;
  private String telefono;

  // 3. Crear gets y sets de cada propiedad.
  public void setEdad(int edad) {
    this.edad = edad;
  }
  public int getEdad() {
    return this.edad;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getNombre() {
    return this.nombre;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
  public String getTelefono() {
    return this.telefono;
  }
}
/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogotá - Colombia)
 * Departamento de Tecnología de la Información y Comunicaciones
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Basado en un Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: Bolsa de Empleo
 * Fecha: 11 de marzo de 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package universidadean.empleo.mundo;

/**
 * Es la clase que representa a un Aspirante <br>
 * <b>inv: </b> <br>
 * nombre != null <br>
 * profesion pertenece a { ADMINISTRADOR, INGENIERO_INDUSTRIAL, CONTADOR, ECONOMISTA } <br>
 * aniosExperiencia > 0 <br>
 * edad > 0 <br>
 * telefono != null <br>
 */

public class Aspirante {

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Indica que la profesión es ADMINISTRADOR
     */
    public static final String ADMINISTRADOR = "Administrador";

    /**
     * Indica que la profesión es INGENIERO INDUSTRIAL
     */
    public static final String INGENIERO_INDUSTRIAL = "Ingeniero Industrial";

    /**
     * Indica que la profesión es contador
     */
    public static final String CONTADOR = "Contador";

    /**
     * Indica que la profesión es economista
     */
    public static final String ECONOMISTA = "Economista";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * El nombre del aspirante
     */
    private String nombre;

    /**
     * La profesión del aspirante
     */
    private String profesion;

    /**
     * Los años de experiencia del aspirante
     */
    private int aniosExperiencia;

    /**
     * La edad del aspirante
     */
    private int edad;

    /**
     * El teléfono del aspirante
     */
    private String telefono;

    /**
     * La ruta de la imagen del aspirante
     */
    private String imagen;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo aspirante con los parámetros indicados
     *
     * @param nombreA           El nombre del aspirante - nombreA != null
     * @param profesionA        La profesión del aspirante - profesionA pertenece a { ADMINISTRADOR, INGENIERO_INDUSTRIAL, CONTADOR, ECONOMISTA }
     * @param aniosExperienciaA Años de experiencia del aspirante - aniosExperienciaA > 0
     * @param edadA             La edad del aspirante - edadA > 0
     * @param telefonoA         El teléfono del aspirante - telefonoA != null
     * @param imagenA           La ruta a la imagen del aspirante - imagenA != null
     */
    public Aspirante(String nombreA, String profesionA, int aniosExperienciaA, int edadA, String telefonoA, String imagenA) {
        nombre = nombreA;
        profesion = profesionA;
        aniosExperiencia = aniosExperienciaA;
        edad = edadA;
        telefono = telefonoA;
        imagen = imagenA;
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Retorna el nombre del aspirante
     *
     * @return nombre
     */
    public String darNombre() {
        return nombre;
    }

    /**
     * Retorna la profesión del aspirante
     *
     * @return profesion
     */
    public String darProfesion() {
        return profesion;
    }

    /**
     * Retorna los años de experiencia del aspirante
     *
     * @return aniosExperiencia
     */
    public int darAniosExperiencia() {
        return aniosExperiencia;
    }

    /**
     * Retorna la edad del aspirante
     *
     * @return edad
     */
    public int darEdad() {
        return edad;
    }

    /**
     * Retorna el teléfono del aspirante
     *
     * @return telefono
     */
    public String darTelefono() {
        return telefono;
    }

    /**
     * Retorna la ruta de la imagen del aspirante
     *
     * @return imagen
     */
    public String darImagen() {
        return imagen;
    }

    /**
     * Retorna una cadena con el nombre del aspirante, su profesión y los años de experiencia
     *
     * @return Información del aspirante en una cadena con el formato "<nombre> - <profesion>"
     */
    public String toString() {
        return nombre + " - " + profesion;
    }
}
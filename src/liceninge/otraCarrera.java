package liceninge;

// Se coloca el extends para que herede 
// los atributos de la clase padre.
public class otraCarrera extends perSona {
        
    // Variable o atributos de la clase hija.
    String grado;
    
    // Método constructor
    public otraCarrera(String grado, int codigo, String name, String carrera) {
        // Se coloca SUPER, para que herede 
        // los atributos de la clase padre.
        super(codigo, name, carrera);
        this.grado = grado;
    }
    
    // Función abstracta para mostrar en consola
    @Override
    public String mostrar() {
        return " ----- Datos de la persona ----- \n" +
                "Code : " + codigo 
                + "\nNombre : " + name 
                + "\nEl es " + grado + " en " + carrera
                + "\n---------------------------------\n";
    }
    
}
// @uthor: {Yb./M};
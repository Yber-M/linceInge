package liceninge;

// Se coloca el extends para que herede 
// los atributos de la clase padre.
public class ingeNiero extends perSona {
    
    // Variable o atributos de la clase hija.
    String ingDe;
    
    // Método constructor
    public ingeNiero(String ingDe, int codigo, String name, String carrera) {
        // Se coloca SUPER, para que herede 
        // los atributos de la clase padre.
        super(codigo, name, carrera);
        this.ingDe = ingDe;
    }
    
    // Función abstracta para mostrar en consola
    @Override
    public String mostrar() {  
        return " ----- Datos de la persona ----- \n" +
                "Code : " + codigo 
                + "\nNombre : " + name 
                + "\nEl es " + carrera + " de " + ingDe 
                + "\n---------------------------------\n";
    }
    
}
// @uthor: {Yb./M};
package liceninge;

// Se coloca 'abstract' para que pueda erar el 
// método abstracto en las clases hijas.
public abstract class perSona {
    // Variables o atributos de la clase padre.
    int codigo;
    String name;
    String carrera;

    // Método constructor
    public perSona(int codigo, String name, String carrera) {
        this.codigo = codigo;
        this.name = name;
        this.carrera = carrera;
    }
    
    // Función abstracto
    public abstract String mostrar();
    
}
// @uthor: {Yb./M};

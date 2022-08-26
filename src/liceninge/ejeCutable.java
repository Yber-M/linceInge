package liceninge;
import java.util.Scanner;

public class ejeCutable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Variable para buscar al sujeto según su código.
        int code;
        
        // Variable para indicar si se desea buscar datos 
        // de OTRO sujeto o finaliza el programa.
        int alter;
        
        // Asignandos los datos para el array.
          ingeNiero n1 = new ingeNiero("Sistemas", 30, "Marlon Yber", "INGENIERO");
          ingeNiero n2 = new ingeNiero("Sistemas", 31, "Angelo Ernesto", "INGENIERO");
          ingeNiero n3 = new ingeNiero("Software", 34, "Annie Rose", "INGENIERO");
          ingeNiero n4 = new ingeNiero("Minas", 35, "Jesús Esquives", "INGENIERO");
        otraCarrera n5 = new otraCarrera("LICENCIADO", 21, "Danicsa Rosely", "Enfermeria");
        otraCarrera n6 = new otraCarrera("LICENCIADO", 25, "Nayely Brittany", "Economia");
        otraCarrera n7 = new otraCarrera("LICENCIADO",29, "Rich Lito", "Disenio Grafico");
        otraCarrera n8 = new otraCarrera("LICENCIADO",28, "Lian Manuel", "Medicina");
        
        // Asignando el lugar en el array.
        perSona[] arrayPersona = new perSona[] {n1, n2, n3, n4, n5, n6, n7, n8};
        
        // Inicio del ciclo repetitivo.
        do {
            
        // Pedir el usuario que indique el código para buscarlo 
        // en el Array y guardarla en la variable 'code'.
        System.out.print("Indique el codigo : ");
        code = sc.nextInt();  
        System.out.println("");
        
        //Variable Booleana para verificar si hay datos o no.
        boolean verifi = true;
        
        // For para recorrer el array.
        for (perSona i: arrayPersona) {
            // Condicional para que verifique el código y mostrar en consola.
            if(i.codigo == code) {
                // Función mostrar de la clase padre.
                System.out.println(i.mostrar());
                verifi = true;
            } else {
                verifi = false;
            }
        }
            
        if (verifi != true) {
            System.out.println(">> ¡ERROR! NO SE ENCONTRARON DATOS CON EL CODIGO MENCIONADO <<\n");
        } else if (verifi = true) {
            System.out.println(">> DATOS MOSTRADOS ¡CORRECTAMENTE! <<\n");
        }
         
        // Preguntar al usuario si quiere hacer otra consulta
        // y guardarlo en la variable 'alter'.
        System.out.println("Si desea hacer otra consulta? - [1]Si/[2]No");
        alter = sc.nextInt();
        
        // Comprobar el proceso repetivo.
        } while (alter == 1);
        
        System.out.println("GRACIAS");
    }
    
}
// @uthor: {Yb./M};
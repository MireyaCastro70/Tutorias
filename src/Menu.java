import javax.swing.*;
import paquetes5B.*;
import paquetes5B.encuesta.Encuesta;
import paquetes5B.estudiantes.ControlEstudiante;
import paquetes5B.sesion.ControlUsuario;

import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ControlUsuario controlUsuario;
        ControlEstudiante controlEstudiante;
        Encuesta encuesta;
        public static void crearMenu(){
            int opc=0;
            do{
                JOptionPane.showInputDialog("\nBienvenido"
                        +"\n1. Agregar Usuario"
                        +"\n2. Mostrar Usuario"
                        +"\n3. Agregar estudiante"
                        +"\n4. Mostrar estudiante"
                        +"\n5. Agregar reactivo"
                        +"\n6. Mostrar reactivo"
                        +"\n7. Agregar respuesta"
                        +"\n8. Mostrar respuesta"
                        +"\n9. Salir");
                System.out.println("\nElige una opcion: ");
                opc=entrada.nextInt();

                switch (opc){
                    case 1:

                        break;

                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:

                        break;
                    default:
                        System.out.println("Opcion invalida");
                }

            } while(opc<=9);
        }
    }
}

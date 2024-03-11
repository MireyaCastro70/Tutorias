import javax.swing.*;
import paquetes5B.*;
import paquetes5B.encuesta.Encuesta;
import paquetes5B.estudiantes.ControlEstudiante;
import paquetes5B.sesion.ControlUsuario;

import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ControlUsuario controlUsuario = new ControlUsuario();
        ControlEstudiante controlEstudiante = new ControlEstudiante();
        Encuesta encuesta = new Encuesta();

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
                        System.out.println("Ingresa un nombre de usuario");
                        String usuario = entrada.nextLine();
                        System.out.println("Ingresa una contrasennia");
                        String pass = entrada.nextLine();
                        System.out.println("Ingresa el nombre");
                        String nombre = entrada.nextLine();
                        controlUsuario.addUsuario(usuario,pass,nombre);
                        break;

                    case 2:
                        System.out.println("Lista de usuarios");
                        break;
                    case 3:
                        System.out.println("Ingresa la matricula");
                        int matricula = Integer.parseInt(entrada.nextLine());
                        System.out.println("Ingresa el nombre");
                        String nombree = entrada.nextLine();
                        System.out.println("Ingresa la carrera");
                        String carrera = entrada.nextLine();
                        controlEstudiante.addEstudiantes(matricula,nombree,carrera);
                        break;
                    case 4:
                        System.out.println("Lista de estudiantes");
                        controlEstudiante.showEstudiante();
                        break;
                    case 5:
                        System.out.println("Agrega una pregunta");
                        String r = entrada.nextLine();
                        encuesta.addReactivo(r);
                        break;
                    case 6:
                        System.out.println("Lista de preguntas");
                        encuesta.showEncuesta();
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

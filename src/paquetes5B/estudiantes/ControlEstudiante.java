package paquetes5B.estudiantes;

import paquetes5B.encuesta.Reactivo;

public class ControlEstudiante {
        private int i = 0;
        private Estudiante[] estudiantes;
        public void addEstudiantes (int matricula, String nombre, String carrera){
                this.estudiantes[this.i] = new Estudiante();
                this.estudiantes [i].setNombre(nombre);
                this.estudiantes [i].setMatricula(matricula);
                this.estudiantes [i].setCarrera(carrera);
                this.i++;
        }
        public String getEstudiante(int matricula){
                return null;
        }
        public void showEstudiante(){
                for (int j = 0; j<i ; j++){
                        System.out.println(estudiantes[j].getNombre());
                        System.out.println(estudiantes[j].getMatricula());
                        System.out.println(estudiantes[j].getCarrera());
                }
        }
}

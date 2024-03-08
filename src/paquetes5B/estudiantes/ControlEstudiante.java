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
        public String getEstudiante(){
                return estudiante;
        }
        public String showEncuesta(){
                for (int j = 0; i < 100 ; j++){
                        System.out.println(getEstudiante(j));
                }
        }
}

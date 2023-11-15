/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac1;

/**
 *
 * @author Usuario
 */
public class Prac1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] calificaciones = {
            {90.5, 85.0, 78.5, 92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5, 91.0, 87.5}
        };
      
        calcularPromedioCalificacionesPorEstudiante(calificaciones);
        calcularPromedioCalificacionesPorMateria(calificaciones);
    }

    public static void calcularPromedioCalificacionesPorEstudiante(double[][] calificaciones) {
        for (int i = 0; i < calificaciones.length; i++) {
            double suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / calificaciones[i].length;

            System.out.println("El promedio de calificaciones del estudiante " + (i + 1) + " es: " + promedio);
        }
    }

    public static void calcularPromedioCalificacionesPorMateria(double[][] calificaciones) {
        for (int i = 0; i < calificaciones[0].length; i++) {
            double suma = 0;
            for (int j = 0; j < calificaciones.length; j++) {
                suma += calificaciones[j][i];
            }
            double promedio = suma / calificaciones.length;

            System.out.println("El promedio de calificaciones de la materia " + (i + 1) + " es: " + promedio);
        }
    }
}
    
    


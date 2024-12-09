// Nombre: Alisson Ibarguen
// Número de ID: 8-1020-2253
// Facultad: FACULTAD DE INGENIERÍA, ARQUITECTURA Y DISEÑO
// Carrera: Lic. INGENIERÍA EN SISTEMAS COMPUTACIONALES
// Curso: Programación de Computadoras II

/*
Enunciado: Elaborar una aplicación de consola que permita almacenar información sobre
un visitante a un edificio de departamentos utilizando todos los tipos de datos
primitivos en Java. Diseña un programa que declare y asigne valores a variables para
representar diferentes aspectos de la información del estudiante y luego imprima esos
valores en pantalla.
*/


// importamos la clase Scanner del paquete java.util
public class Main {
    public static void main(String[] args) {
        // Declaración y asignación de variables
        String nombre = "Alisson Ibarguen";
        byte edad = 20;
        short numeroDepartamento = 101;
        int numeroVisitas = 5;
        long telefono = 1234567890L;
        float altura = 1.75f;
        double peso = 70.5;
        char genero = 'F';
        boolean esResidente = false;

        // Impresión de los valores en pantalla
        System.out.println("Información del visitante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Número de departamento: " + numeroDepartamento);
        System.out.println("Número de visitas: " + numeroVisitas);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Género: " + genero);
        System.out.println("Es residente: " + esResidente);
    }
}
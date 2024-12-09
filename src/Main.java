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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer la edad del visitante
        System.out.print("Ingrese la edad: ");
        byte edad = scanner.nextByte();

        // Solicitar y leer el número de departamento
        System.out.print("Ingrese el número de departamento: ");
        short numeroDepartamento = scanner.nextShort();

        // Solicitar y leer el número de visitas
        System.out.print("Ingrese el número de visitas: ");
        int numeroVisitas = scanner.nextInt();

        // Solicitar y leer el número de teléfono
        System.out.print("Ingrese el teléfono: ");
        long telefono = scanner.nextLong();

        // Solicitar y leer la altura en metros
        System.out.print("Ingrese la altura (en metros): ");
        float altura = scanner.nextFloat();

        // Solicitar y leer el peso en kilogramos
        System.out.print("Ingrese el peso (en kg): ");
        double peso = scanner.nextDouble();

        // Solicitar y leer el género del visitante
        System.out.print("Ingrese el género (M/F): ");
        char genero = scanner.next().charAt(0);

        // Solicitar y leer si el visitante es residente
        System.out.print("¿Es residente? (true/false): ");
        boolean esResidente = scanner.nextBoolean();

        // Imprimir la información del visitante en pantalla
        System.out.println("\nInformación del visitante:");
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
package org.example;


import org.example.DAO.IEmpleado;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static IEmpleado empleadoDAO = new IEmpleado() {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\n1. Registrar nuevo empleado");
                System.out.println("2. Salir");
                System.out.print("Selecciona una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                switch (opcion) {
                    case 1:
                        registrarEmpleado();
                        break;
                    case 2:
                        System.out.println("Saliendo del programa...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opción no válida.");
                }
            }

        }

        public static void registrarEmpleado() {
            Scanner scanner = new Scanner(System.in);

            // Solicitar datos del animal
            System.out.print("Nombre del empleado: ");
            String nombre = scanner.nextLine();
            System.out.print("Id: ");
            String especie = scanner.nextLine();
            System.out.print("Departamento: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            System.out.print("Email: ");
            String descripcion = scanner.nextLine();

        }
    };
}



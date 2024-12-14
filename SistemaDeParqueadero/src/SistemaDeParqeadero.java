// SistemaDeParqeadero.java
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeParqeadero {
    static class Vehiculo {
        String placa;
        String modelo;
        String propietario;

        public Vehiculo(String placa, String modelo, String propietario) {
            this.placa = placa;
            this.modelo = modelo;
            this.propietario = propietario;
        }

        @Override
        public String toString() {
            return "Placa: " + placa + ", Modelo: " + modelo + ", Propietario: " + propietario;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Sistema de Parking ===");
            System.out.println("1. Registrar vehículo");
            System.out.println("2. Consultar vehículos");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            if (opcion == 1) {
                System.out.print("Ingrese la placa: ");
                String placa = scanner.nextLine();
                System.out.print("Ingrese el modelo: ");
                String modelo = scanner.nextLine();
                System.out.print("Ingrese el propietario: ");
                String propietario = scanner.nextLine();

                Vehiculo vehiculo = new Vehiculo(placa, modelo, propietario);
                vehiculos.add(vehiculo);
                System.out.println("Vehículo registrado exitosamente.");
            } else if (opcion == 2) {
                if (vehiculos.isEmpty()) {
                    System.out.println("No hay vehículos registrados.");
                } else {
                    System.out.println("\nLista de vehículos:");
                    for (Vehiculo v : vehiculos) {
                        System.out.println(v);
                    }
                }
            } else if (opcion == 3) {
                System.out.println("Saliendo del sistema...");
                break;
            } else {
                System.out.println("Opción no válida, intenta nuevamente.");
            }
        }
        scanner.close();
    }
}
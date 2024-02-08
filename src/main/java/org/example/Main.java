package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la distancia del viaje en kilómetros
        System.out.print("Ingrese la distancia total del viaje en kilómetros: ");
        double distanciaViaje = scanner.nextDouble();

        // Solicitar al usuario el consumo de combustible del automóvil (litros por cada 100 km)
        System.out.print("Ingrese el consumo de combustible del carro (litros por cada 100 km): ");
        double consumoCombustible = scanner.nextDouble();

        // Solicitar al usuario el precio por litro de combustible
        System.out.print("Ingrese el precio por litro de combustible: ");
        double precioLitroCombustible = scanner.nextDouble();

        // Calcular el consumo total de combustible para el viaje
        double consumoTotalCombustible = (consumoCombustible / 100) * distanciaViaje;

        // Calcular el costo total del combustible para el viaje
        double costoTotalCombustible = consumoTotalCombustible * precioLitroCombustible;

        // Mostrar los resultados
        System.out.printf("El consumo total de combustible para el viaje es: %.2f litros%n", consumoTotalCombustible);
        System.out.printf("El costo total de combustible para el viaje es: %.2f COP%n", costoTotalCombustible);

        // Cerrar el Scanner
        scanner.close();
    }
}
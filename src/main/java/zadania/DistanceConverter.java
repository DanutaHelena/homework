package zadania;

import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę mil : ");

        final double distanceInMiles = scanner.nextDouble();
        if (distanceInMiles <= 0){

        System.out.println("Niepoprawna liczba, podaj liczbę większą od zera");
        return;
    }

        double distanceInKilometers = distanceInMiles * 1.6;

        System.out.printf("Odległość w kilometrach to \u2248 %.2f ", distanceInKilometers);

    }
}
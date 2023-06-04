package Kontrolery;

import Modele.Samochod;
import Modele.Motocykl;
import java.util.Arrays;
import java.util.Scanner;

public class Kontroler_glowny {

    public void run() {
        System.out.println("Witaj w programie, za chwilę stworzysz swój samochód lub motocykl");
        System.out.println("Pojazd utworzy się na bazie nazwy, roku produkcji, koloru oraz typu (nadwozia lub motocykla)");
        System.out.println("Wprowadź co chcesz utworzyć, samochód czy motocykl?");

        Scanner scanner = new Scanner(System.in);
        String decision = scanner.nextLine();

        switch (decision) {
            case "samochód" -> {
                Samochod samochod = new Samochod();
                samochod.welcome(decision);
                breakLine();
                System.out.println("Podaj nazwę samochodu:");
                samochod.setName(scanner.nextLine());
                System.out.println("Podaj rok produkcji samochodu:");
                int year = Integer.parseInt(scanner.nextLine());
                if (year < 1886 || year > 2023) {
                    System.out.println("W podanym roku nie było tego typu pojazdów lub wybrałeś rok z przyszłości, spróbuj ponownie");
                    return;
                }
                samochod.setType(scanner.nextLine());
                System.out.println("Podaj rodzaj nadwozia samochodu: coupe, kombi, sedan, cabrio, roadster");
                String carType = scanner.nextLine();
                if (!isValidCarType(carType)) {
                    System.out.println("Nieprawidłowy rodzaj nadwozia, spróbuj ponownie");
                    return;
                }
            }
            case "motocykl" -> {
                Motocykl motocykl = new Motocykl();
                motocykl.welcome(decision);
                breakLine();
                System.out.println("Podaj nazwę motocykla:");
                motocykl.setName(scanner.nextLine());
                System.out.println("Podaj rok produkcji motocykla:");
                int year = Integer.parseInt(scanner.nextLine());
                if (year < 1885 || year > 2023) {
                    System.out.println("W podanym roku nie było tego typu pojazdów lub wybrałeś rok z przyszłości, spróbuj ponownie");
                    return;
                }
                motocykl.setType(scanner.nextLine());
                System.out.println("Podaj rodzaj motocykla: sportowy, turystyczny, cruiser, enduro, naked");
                String motorcycleType = scanner.nextLine();
                if (!isValidMotorcycleType(motorcycleType)) {
                    System.out.println("Nieprawidłowy rodzaj motocykla, spróbuj ponownie");
                    return;
                }
            }
            default -> {
                System.out.println("Błąd, zły wybór");
                run();
            }
        }
        System.out.println("Gratulacje, utworzono pojazd!");
    }

    private boolean isValidCarType(String carType) {
        String[] validCarTypes = {"coupe", "kombi", "sedan", "cabrio", "roadster"};
        return Arrays.asList(validCarTypes).contains(carType);
    }

    private boolean isValidMotorcycleType(String motorcycleType) {
        String[] validBikeTypes = {"sportowy", "turystyczny", "cruiser", "enduro", "naked"};
        return Arrays.asList(validBikeTypes).contains(motorcycleType);
    }

    private void breakLine() {
        System.out.println("=====================");
    }

    public static void main(String[] args) {
        Kontroler_glowny kontrolerGlowny = new Kontroler_glowny();
        kontrolerGlowny.run();
    }
}

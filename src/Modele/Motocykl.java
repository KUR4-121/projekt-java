package Modele;

public class Motocykl {
    private String name;
    private int year;
    private String type;

    public Motocykl() {
        this.name = name;
        this.year = year;
        this.type = type;
    }

    public void Informacje() {
        System.out.println("Nazwa: " + name);
        System.out.println("Rok produkcji: " + year);
        System.out.println("Rodzaj: " + type);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void welcome(String decision) {
    }

    public void breakLine() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
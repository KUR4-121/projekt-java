package Modele;

public abstract class BasicModel {
    public String name;

    public String year;

    public String getName() { return this.name;}

    public void setName(String name) { this.name = name;}

    public String getYear() { return String.valueOf(this.year);}

    public void setYear(int year) { this.year = String.valueOf(year);}

    public void breakLine() { System.out.println("================================="); }
    }


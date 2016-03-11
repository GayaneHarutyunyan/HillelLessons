package lesson9.polymorfism.abstraction;

public class Auto {
    int year;

    public Auto(int year) {
        this.year = year;
    }

    public abstract String getMark();

    @Override
    public String toString() {
        return "Auto " + getMark() + ", year  " + year;
    }
}

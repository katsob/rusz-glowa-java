import java.time.LocalDate;

class kot {
    public static void main(String[] args) {
        String imie = "Miau";
        LocalDate teraz = LocalDate.now();
        int waga = 5;
        String op_imie = "Mrech Kocielska";

        String PrzedstawSie = "imie kota: " + imie + " kocia waga: " + waga + " kocia data urodzenia: " + teraz
                + " Koci opiekun: " + op_imie;
        System.out.println(PrzedstawSie);
    }
}

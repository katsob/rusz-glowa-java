
//sprawdzenie i sklejanie kodu, kod wyświetla się poprawnie
class ksiazka{
    String tytul;
    String autor;
}
class KsiazkaTester {
    public static void main(String[]args) {
        ksiazka[] mojeKsiazki = new ksiazka[3];
        mojeKsiazki[0] = new ksiazka();
        mojeKsiazki[1] = new ksiazka();
        mojeKsiazki[2] = new ksiazka();
        int x = 3;
        
        mojeKsiazki[0].tytul = "Czterej koderzy i Java";
        mojeKsiazki[1].tytul = "Java nocy letniej";
        mojeKsiazki[2].tytul = "Java.Receptury";

        mojeKsiazki[0].autor = "janek";
        mojeKsiazki[1].tytul = "wilheim";
        mojeKsiazki[2].tytul = "ian";
        
        while (x<3){
            System.out.print(mojeKsiazki[x].tytul);
            System.out.print(", autor ");
            System.out.println(mojeKsiazki[x].autor);
                x = x+1;
        }
        }
}




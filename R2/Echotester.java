//Zagadkowy basen:
//uzupełnienie kodu java podanego na stronie 76
//elementy kodu będę komentować "b"
//elementy wporwadzone przez ze mnie będę oznaczone "z" 
//wynik kodu:
// sieeeemasz...
// sieeeemasz...
// sieeeemasz...
// sieeeemasz...
// 10

class Echo{                                                  // "z" ozanczenie nazwy klasy
    int ilosc = 0;                                                // "z" pierwszy warunek klasy
    void witaj() {                                                 // "z" warunek void
        System.out.println("sieeeemasz...");           // "b"
    }
}

public class Echotester {                               // "b"
    public static void main(String[]args){              // "b"
    Echo e1 = new Echo();                               // "b"
    Echo e2 = new Echo();                               // "z"
    int x = 0;                                          // "b"                             // "z"
    while (x<4){                                        // "z" argument while       
    e1.witaj();                                         // "z"
    e1.ilosc = e1.ilosc+1;                              // "z"
    if ( x==3){                                              // "z" argument if
        e2.ilosc = e2.ilosc+1;                          // "b"
    }
    if (x>0){                                              // "z" aggument if
        e2.ilosc = e2.ilosc+e1.ilosc;                   // "b"
    }
    x = x+1;                                            // "b"
    }
    System.out.println(e2.ilosc);                       // "b"
    }
}

class PiosenkaOPiwie{
    public static void main(String[] args){
        int iloscButelek = 99;
        String slowo = "bottles";
        while (iloscButelek > 0){
            if (iloscButelek == 99){
                slowo = "bottle";           
            }
            System.out.println(iloscButelek + " " + slowo + " of beer on the wall.");
            System.out.println(iloscButelek + " " + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            
            if (iloscButelek > 0){
                iloscButelek = iloscButelek -1;
            }
            else{ 
                System.out.println("No more bottles of beer on the wall.");
            }

        }
    }
}
 //elemnty kodu zostały rozsypane, należało je poskładać w całość
 //wynik wyświetlany miał być następujący:
 //bam,bam, baaaa-am-am
 //brzdęk, brzrzrzdęęk
 
 class Perkusja {
    boolean talerze = true;
    boolean benben = true;
    void zagrajNaBebnie(){
        System.out.println("bam, bam, baaaa-am-am");
    }
    void zagrajNaTalerzach(){
        System.out.println("brzdęk, brzrzrzdęęk");
    }
}
class PerkusjaTester{
    public static void main(String[]args){
        Perkusja p = new Perkusja();
        p.zagrajNaBebnie();
        p.benben = false;
        p.zagrajNaTalerzach();
        if (p.benben == true){
            p.zagrajNaBebnie();
        
}
}
}
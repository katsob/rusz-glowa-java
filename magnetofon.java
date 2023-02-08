class magnetofon {
    boolean mozeNagrywac = false;
    void odtworzTasme(){
        System.out.println("odtwarza taśmę");
    }
    void nagrajTasme() {
        System.out.println("nagrywam taśmę");
    }
}
class MagnetofonTester{
    public static void main(String[]args){
        magnetofon m = new magnetofon();
        m.mozeNagrywac = true;
        m.odtworzTasme();
        if (m.mozeNagrywac == true){
            m.nagrajTasme();
        }
    }
}

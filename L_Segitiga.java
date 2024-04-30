public class L_Segitiga {
    
    double alas, tinggi;

    double Luas_Segitiga() {
        alas = 6;
        tinggi = 8;

        return alas * tinggi / 2;

    }

    void output() {
        System.out.println(Luas_Segitiga());
    }

    public static void main(String[] args) {
        L_Segitiga luas = new L_Segitiga();
        luas.output();
    }
}

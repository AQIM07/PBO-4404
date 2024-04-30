public class K_Ling {

    double dia;

    double Kel_ling() {
    dia=10;

        return 2 * 3.14 * (dia / 2);
    }
    
    void output() {
        System.out.println(Kel_ling());
    }
    public static void main(String[] args) {


        K_Ling kel_ling = new K_Ling();
        kel_ling.output();
}
}


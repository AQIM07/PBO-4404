public class V_Tabung {
    
    double dia, tinggi;

    double v_Tabung(){
        dia = 5;
        tinggi = 10;

        return 3.14 * (dia / 2) * (dia / 2) * tinggi;
    }
    
    void output(){
        System.out.println(v_Tabung());
    }

    public static void main(String[] args) {

        V_Tabung v_Tabung = new V_Tabung();
        v_Tabung.output();
    }
}

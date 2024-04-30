public class Nama{

    String nama;
    String prodi;
    String code;

    public static void main(String[] args) {

        Nama main = new Nama();
        main.nama = "A'la qim";
        main.prodi = "Teknik Informatika Universitas Dian Nuswantoro";
        main.code = "Java";

        System.out.println("Halo, nama saya adalah " + main.nama);
        System.out.println("Saya adalah mahasiswa " + main.prodi);
        System.out.println("Saya sedang menulis program " + main.code);
    }
}
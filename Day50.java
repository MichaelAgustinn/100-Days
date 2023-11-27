package Day50;

public class Main {
    
    public static void main(String[] args) {
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        System.out.println("Hari dalam Seminggu yaitu:\n");
        for (int i = 0; i < namaHari.length; i++) {
            System.out.println("Hari ke " + (i + 1) + ": " + namaHari[i]);
        }
    }
}

public class Hello {
    int jumlahplatmobile = 5;
    static int totaljumlahmobil=55;
    public static String[] Kudus = new  String[9];
    public static String[] Jakarta = new String[10];
    public static String[] Jogja = new String[11];
    public static String[] Karawang = new String[12];
    public static String[] Solo = new String[13];
    public static void infoplat() {
        int totalkudus = 0;
        int siaamobile = 0;
        for (int i = 0;i <Kudus.length;i++) {
            if (Kudus[i] != null)
                totalkudus++;
        }
        int totaljakarta = 0;
        for (int i = 0;i <Jakarta.length;i++) {
            if (Jakarta[i] != null)
                totaljakarta++;
        }
        int totaljogja = 0;
        for (int i = 0;i <Jogja.length;i++) {
            if (Jogja[i] != null)
                totaljogja++;
        }
        int totalkarawang = 0;
        for (int i = 0;i <Karawang.length;i++) {
            if (Karawang[i] != null)
                totalkarawang++;
        }
        int totalSolo = 0;
        for (int i = 0;i <Solo.length;i++) {
            if (Solo[i] != null)
                totalSolo++;
        }
        siaamobile = totaljumlahmobil - totaljogja - totaljakarta - totalkarawang - totalSolo;
        System.out.println(" Total plat mobil Kudus:" + totalkudus + "| Total plat mobil jakarta:" + totaljakarta
                + " Total plat mobil jogja" + totaljogja + "| Total plat mobil Karawang : " + totalkarawang + "| Total plat mobil solo:" + totalSolo);
        System.out.println("Jumlah seluruh mobil " + totaljumlahmobil + "| Total sisa mobile" + siaamobile);
        System.out.println();
    }
    public static void simpanmobile(String lokasi) {
        switch (lokasi) {
            case "K":
                System.out.println("plat nomor Kudus ");
                infoplat();
                break;
            case "B":
                System.out.println("plat nomor jakarta");
                infoplat();
                break;
            case "AB":
                System.out.println("plat nomor jogja");
                infoplat();
                break;
            case "T":
                System.out.println("plat nomor karawang");
                infoplat();
                break;
            case "AD":
                System.out.println("plat nomor Solo");
                infoplat();
                break;
        }
    }
public static void ganjilgenap(int nomor){
        if (nomor %2==0) {
            System.out.println("nomor plat termasuk plat genap");
        }else {
            System.out.println("nomor plat termasuk plat ganjil");

            int i,j,k = 0, jlh_genap = 0, jlh_gqnjil = 0;

            for (i = 1; 1<=100; i++){
                if (i % 2==0){
                    jlh_genap++;
                }
            }
            for (i = 1;i <= 100; i++) {
               if (i % 2 == 0) {
               }
           }

        }
    }

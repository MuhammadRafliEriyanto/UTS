public class UTS1D {
    public static void UbahHurufEToStar(String[] baru){
        for (int i = 0; i<baru.length; i ++) {
            System.out.println(baru[i].replace("e", "*"));
        }

 }

    public static void main(String[]args) {
        String[]_block = new String[]{"Triangle","Cubes","Circle"};
        UbahHurufEToStar(_block);
    }
}

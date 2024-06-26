public class Methods {
    public static void main(String[] args) {
//        System.out.println(saberi(2,2));
//        System.out.println(punoIme("Veljko", "Jovkovic"));
//        poredjenjeBrojeva(1,2);
        parniBrojevi();
    }
    public static int saberi(int a, int b){
        return a + b;
    }

    public static String punoIme(String ime, String prezime){
        return ime + " " + prezime;
    }

    public static void poredjenjeBrojeva(int a, int b){
        if (a > b){
            System.out.println(a + "je vece od " + b );
        } else if (b > a){
            System.out.println(b +"je vece od" + a);
        } else {
            System.out.println("jednaki su");
        }
    }
    public static void parniBrojevi(){
        for (int i = 1; i <= 10; i++){
            if ( i % 2 == 0 ){
                if(i == 4){
                    continue;
                }
                System.out.println(i);
            }
        }

    }
}

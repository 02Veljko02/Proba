public class Farma {
    public static void main(String[] args) {
        Zivotinja prase = new Prase();
        prase.eat();
        prase.makeSound();
        Zivotinja patka = new Patka();
        patka.eat();
        patka.makeSound();

        nahrani(patka);
        nahrani(prase);
    }
    public static void nahrani(Zivotinja zivotinja){
        if(zivotinja instanceof Prase){
            System.out.println("s kukuruz");
        } else if (zivotinja instanceof Patka) {
            System.out.println("s bube");
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        Flat flat = new Flat(3,2);
        FlatArea flatArea = new FlatArea(flat);
        double absoluteFlatArea = flatArea.calculateFlatArea();
        System.out.println(absoluteFlatArea);
    }
}

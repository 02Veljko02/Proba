public class ObjectInit {
    public static void main(String[] args) {
        Rectangle kvadrat = new Rectangle();
        kvadrat.setLenght(2);
        kvadrat.setWidth(3);
        double area = kvadrat.calculateArea();
        System.out.println(area);
    }
}

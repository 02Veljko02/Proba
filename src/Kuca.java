public class Kuca {
    private static double room1Area;
    private static double room2Area;

    public static void main(String[] args) {
        Rectangle room1 = new Rectangle(3,2);
        Rectangle room2 = new Rectangle();
        room2.setWidth(2);
        room2.setLenght(2);
        room1Area = room1.calculateArea();
        room2Area = room2.calculateArea();
        System.out.println(totalArea());
    }
    public static double totalArea(){
        return room1Area + room2Area;

    }
}

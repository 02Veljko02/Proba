public class Rectangle {
    private double lenght;
    private double width;
    public Rectangle(){
//        lenght = 2;
//        width = 3;
        setLenght(lenght);
        setWidth(width);
    }
    public Rectangle(double lenght, double width){
//        this.lenght = lenght;
//        this.width = width;
        setLenght(lenght);
        setWidth(width);
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea(){
        return lenght * width;
    }
}

public class Flat {
    private double width;
    private double lenght;

    public Flat(double width, double lenght){
        setWidth(width);
        setLenght(lenght);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }
}

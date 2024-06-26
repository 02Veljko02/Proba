public class FlatArea {
    public Flat flat;
    public FlatArea(Flat flat){
        this.flat = flat;
    }
    public double calculateFlatArea(){
        return this.flat.getLenght() * this.flat.getWidth();
    }
}

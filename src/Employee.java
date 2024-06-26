public class Employee extends Person{
    private String work;
    private int id;

    public Employee(String work, int id){
        super(2, "Mika");
        setWork(work);
        setId(id);
        System.out.println("Child constructor");
    }
    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

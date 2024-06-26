public class Test {
    public static void main(String[] args) {
        Person person = new Person(1,"Milivoje");
        String realName = person.getName();
        System.out.println(realName);

        Employee employee = new Employee("odzacar", 1);
//        employee.setWork("Odzacar");
    }
}

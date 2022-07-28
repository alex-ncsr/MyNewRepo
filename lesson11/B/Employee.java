package md.tekwill.homework.lesson11.B;

public class Employee {

    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void doubleSalary(){
        System.out.println("New salary = " + salary * 2);
    }

    void employeeInfo(){
        System.out.println("Name is " + name + " ; salary = " + salary);
    }




}

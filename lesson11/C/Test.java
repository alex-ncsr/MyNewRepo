package md.tekwill.homework.lesson11.C;

import md.tekwill.homework.lesson11.A.Cat;
import md.tekwill.homework.lesson11.B.Employee;

public class Test {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Murzic";
//        cat.weight = 2; - compile time error
//        cat.getWeight(); - compile time error
        System.out.println(cat.getName()); // output - Murzic
//        cat.eat(); - compile time error
//        cat.sleep(); - compile time error
        cat.info();  /*  output: Cat eating
                                Murzic
                                0
                                Quiet! The cat is sleeping now!!!  */


        System.out.println("******************************");
        Employee emp = new Employee();
        emp.setName("Alex");
        emp.setSalary(500);
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        emp.doubleSalary();
//        emp.employeeInfo(); - compile time error
    }

}

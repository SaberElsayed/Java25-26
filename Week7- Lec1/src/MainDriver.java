/**
 * Classes and Objects
 *
 * @author Saber Elsayed
 * @version 1.1
 * @since: 10/02/2026
 *
 * */

public class MainDriver {
    public static void main(String[] args) {


        Person p1 = new Person();

        System.out.println("Person 1:" + p1.getName() + "\t" + p1.getAge() + "\t" + p1.getId());

        Person p2 = new Person("Ali", 50);
        System.out.println("Person 2: " + p2.getName() + "\t" + p2.getAge() + "\t" + p2.getId());

        Person p3 = new Person("Mohamed", 30, 1000);
        System.out.println("Person 3: " + p3.getName() + "\t" + p3.getAge() + "\t" + p3.getId());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


//        p1=p3; // any change in any one of them will affect the other
//        p1.name= "Mahmoud";
//        System.out.println(p1);
//        System.out.println(p3);

        //  IMPORTANT - A COMMON QUESTION IN EXAMS
        p1= new Person(p3.getName(), p3.getAge(), p3.getId());// it will use values from p3, but not the same locatio

        p1.setName("Mahmoud");
        System.out.println(p1);
        System.out.println(p3);


        int y=0; // local variables must be intialized to be able print them

        System.out.println(y);

        System.out.println(p1.testValue); // test a default value of un initialized class attribute


        System.out.println(p2.balance);// test a static variable

        p1.balance =1000000;
        System.out.println(p1.balance);// test a static variable
        System.out.println(p2.balance);// test a static variable



    }
}

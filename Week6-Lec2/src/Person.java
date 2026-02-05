/**
 * Classes and Objects
 *
 * @author Saber Elsayed
 * @version 1.0
 * @since: 05/02/2026
 */
public class Person {

    String  name; // will talk about private variables later
    int age;
    int id;

    Person(){
        name="Saber";
        age=20;
        id=1111;
    }

    Person(String initialName,int initialAge){
        name=initialName;
        age=initialAge;
        id=1111;
    }
    Person(String initialName, int intialAge, int initialID){
        name=initialName;
        age=intialAge;
        id=initialID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public  static void main(String [] args){

        Person p1 = new Person();
       System.out.println("Person 1:" +  p1.name + "\t" + p1.age + "\t" + p1.id);

        Person p2 = new Person("Ali", 50);
        System.out.println("Person 2: " +  p2.name + "\t" + p2.age + "\t" + p2.id);

        Person p3 = new Person("Mohamed", 30, 1000);
        System.out.println("Person 3: "+   p3.name + "\t" + p3.age + "\t" + p3.id);



        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


    }

}

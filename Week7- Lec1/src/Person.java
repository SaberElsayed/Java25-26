/**
 * Classes and Objects
 *
 * @author Saber Elsayed
 * @version 1.1
 * @since: 10/02/2026
 */
public class Person {

    String testValue; // just to show not assigned variables will have default values
    private String name; // ensures encapsualtion (hinding)
    private int age;
    private int id;
    public static int balance = 0;// shared among all objects; if you change it using one object it will be affected in the others

    /**
     * constructor 1
     */
    Person() {
        name = "Saber";
        age = 20;
        id = 1111;
    }

    /**
     * constructor 2
     *
     * @param name name
     * @param age  age of the person
     */
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        id = 1111;
    }

    /**
     * constructor to set all values
     *
     * @param name name
     * @param age  age in years
     * @param id   person id
     */
    Person(String name, int age, int id) {
        this(name, age); // this is to call the constructor
//        this.name = name;
//        this.age = age;
        this.id = id;
    }

    /**
     * get name
     *
     * @return name as a string
     */
    public String getName() {
        return name;
    }

    /**
     * return age in  years
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * get ID
     *
     * @return id as integer
     */
    public int getId() {
        return id;
    }

    /**
     * set the name of the person
     *
     * @param newName
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * set age
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * set ID
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * info about the object
     *
     * @return a string with all info
     */
    @Override
    public String toString() {
        String output = "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';

        return output;
    }

    /**
     * set a value of a balance
     * this variable was used just to explain "static" variables
     */
    public static void setBalance() {
        balance = 100;
    }


}

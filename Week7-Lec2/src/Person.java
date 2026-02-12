

public class Person {

    private static int id;
    private String name;
    private int age;

    private BirthDay birthday;

    public Person(int id, String name, int age, BirthDay birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public String toString() {


        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
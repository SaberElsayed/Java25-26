import java.util.Random;

public class MainDriver {
    public static void main(String[] args) {

        String name1 = "Saber";
        String name2 = new String("Saber2");

        BirthDay p1_birthday = new BirthDay(1, 1, 2000);
        Person p = new Person(1, "Mona", 21, p1_birthday);

        System.out.println(p);


        p1_birthday.setYear(2010);

        System.out.println(p);

        Random rand = new Random();


    }
}

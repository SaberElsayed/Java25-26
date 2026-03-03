public class DynamicBinding {

    public static void main(String[] args){
        print(new Person());
        print(new Student());
        print(new GraduateStudent());

        double val =5.5;
        System.out.println("Val: " + (int)val);





    }

    public static  void print(Object o){
        System.out.println(o.toString());
    }
}

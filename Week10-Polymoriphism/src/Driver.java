public class Driver {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();

        //a.bark(); // compile error



        Animal b = new Dog();
        Dog d = (Dog) b; // downcasting to be able to
        d.sound();
        d.bark();

       // Dog df = new Animal();// is not allowed

        Animal[] array = new Animal[5];
         for (int i=0; i<5; i++)
         {
            int val2= (int) (Math.random()*3);
            if (val2==0){
                array[i]= new Animal();
            }else if (val2==1){
                array[i]= new Dog();
            }else if (val2==2){
                array[i]= new Cow();
            }

        }
//         for (Animal a1 : array){
//
//             if(a1 instanceof Dog){
//                 System.out.println("This is a Dog");
//             }else if (a1 instanceof Cow){
//                 System.out.println("This is a Cow");
//             }else if (a1 instanceof Animal){
//                 System.out.println("This is an Animal");
//             }
//         }


        for (int i=0; i<5; i++)
            if (array[i] instanceof Cow) {
                System.out.println("This is a Cow");
            }else if (array[i] instanceof Dog){
                System.out.println("This is a Dog");
            }else if(array[i] instanceof Animal) {
                System.out.println("This is an Animal");
            }




    }
}

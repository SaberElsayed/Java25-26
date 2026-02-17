public class DriverClass {

    public static void main(String[] args) {



        int output = Methods.max(1, 5);

        System.out.println(output);

        // arrays
        int [] a = new int [5];
        a[0]=1;
        a[1]=20;
        a[2]=3;
        a[3]=14;
        a[4]=15;

        // print an array
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        // init an array with 4 values
        int [] b = new int []{10, 30 ,50 ,60};
        System.out.println(b[4]); // will generate a runtime error

    }
}

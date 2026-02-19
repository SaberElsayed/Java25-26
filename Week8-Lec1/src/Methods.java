public class Methods {

    public  static  int max(int a, int b) {
        int result;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }

    /**
     * an overloading method example
     * @param a input 1
     * @param b input 2
     * @param c input 3
     * @return the maximum value between a and b
     */
    public  static  int max(int a, int b, int c) {
        int result;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }
    /**
     * an overloading method example: returning double
     * @param a input 1
     * @param b input 2
     * @return the maximum value between a and b
     */
    public  static  double max(double a,double b) {
        double result;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }

    public static void main(String[] args) {

       // Methods m=new Methods(); // use it if we are calling a non-static method

        // as it is static, there is no need to creat an object; otherwise, m.max
        int output = max(1, 5);

        System.out.println(output);

    }


}

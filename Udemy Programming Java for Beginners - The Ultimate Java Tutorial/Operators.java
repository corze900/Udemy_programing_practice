public class Operators {
    public static void main(String[] args){
        int num1,num2;
        num1 = 120;
        num2 = 23;
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(4 % 2);

        //order of operations
        //() * / + - 


        //finals / const

        final double PI = 3.14159;
        //finals is capitals now
        double radisu =2.0;
        double area = PI * (radisu *radisu);
        System.out.println(area);

        //math lib
        int num = 100;
        System.out.println(Math.abs(num));
        System.out.println(Math.sqrt(num));
        System.out.println(Math.nextUp(num));
        //round will round the number  

        //formula excercise
        // x/y-3
        // 1/(x+y)
        // sqrt of x to the 6th plus y to the 5th
        // absolute of x +y
        System.out.println("\n");

        double x,y,z;
        x = 13.0;
        y =2.0;
        z = x/y-3;
        System.out.println(z);
        z = 1 / (x+y);
        System.out.println(z);
        z = Math.sqrt(Math.pow(x, 6)+Math.pow(y, 5));
        System.out.println(Math.round(z));
        System.out.println(Math.abs(x+y));
    }    
}

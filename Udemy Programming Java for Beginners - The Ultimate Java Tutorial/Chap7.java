import java.util.Scanner;

public class Chap7 {
    public static void main(String[] args){
        //learning about new lines \n just put it
        //inside a string
        System.out.println("My name is \n Corey \n Rowsell");
        //can also use the tab \t to tab stuff
        System.out.println("My name is\tCorey\tRowsell");

        //setpresision and set witdh
        // %10.4f 1 is feild witdh and second is presission
        System.out.printf("Pi = %.4f",Math.PI);


        //scanner
        //obj of scanner class
       /* System.out.println("\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        System.out.println(a+b);*/



        System.out.println("\n");
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scan.next();
        scan.close();
        System.out.println("Your name is "+name);
        //next is looking for an enter or space
        //next line takes the entire line

    }
}
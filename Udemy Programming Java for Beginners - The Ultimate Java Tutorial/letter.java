import java.util.Scanner;
public class letter {
    public static void main(String[] arg){
        String sName,rName,present;
        int age;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the sender's name: ");
        sName = scan.nextLine();
        System.out.print("Please enter the reciver's name: ");
        rName = scan.nextLine();
        System.out.print("Please enter the present: ");
        present = scan.nextLine();
        System.out.print("Please enter the age: ");
        age = scan.nextInt();
        scan.close();


        System.out.println("Dear "+rName+", \n\n Thank you for the "+present+" I really like it. I can't believe I'm already "+age+" years old, but it doesn't feel that much different than being "+(age-1)+"\n Thank you again for the "+present+"\n Sincerely,\n"+sName);
        


    }    
}

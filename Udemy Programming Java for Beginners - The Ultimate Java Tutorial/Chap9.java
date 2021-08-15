public class Chap9 {
    public static void main(String[] args){
        //count control while loop
        /*int count =0;
        while(count<5){
            System.out.println("Hello, World!");
            count++;
        }

        int num = 1;
        while(num<=10){
            System.out.println(num);
            num++;
        }


        //balance, rate, years
        double balance = 5000;
        double rate = 1.02;
        //count in count control loop
        int year = 1;
        while (year<=10){
            balance *= rate;
            ++year;
        }
        System.out.printf("After 10 years the balance is %.2f$", balance);*/
        //count the number of vouales in a string

        String test= "This is the best idea I can come up with!";
        int vowels = 0;

        for(int i=0;i<test.length();i++){
            if(test.charAt(i)=='a'||test.charAt(i)=='e'||test.charAt(i)=='i'||test.charAt(i)=='o'||test.charAt(i)=='u'){
                vowels++;
            }
        }
        System.out.println("The number of vowels is "+vowels);

    }
}

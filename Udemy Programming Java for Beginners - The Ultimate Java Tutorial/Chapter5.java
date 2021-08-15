public class Chapter5 {

        //this should be moved to the name class
        static String Capitalize(String name){
            return name = name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
        }
        public static void main(String[] args){
        //instantiation
        Name person1 = new Name("Corey","D","Rowsell");
        Name kappa = new Name();
        System.out.println(person1.toString());
        System.out.println(kappa.toString());
        kappa.setFirst("kappa");
        kappa.setLast("Twitch");
        kappa.setFirst(Capitalize(kappa.getFirst()));
        System.out.println(kappa.toString());

        Date time1 = new Date(02,07,2021);
        System.out.println(time1);
        
        
    }
    
}

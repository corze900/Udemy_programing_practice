public class Name {
        //data part and method parts
        private String first;
        private String middle;
        private String last;

        //default constructor
        //compiler will auto make one
        public Name(){
            first = "UNKNOWN";
            middle = "UNKNOWN";
            last = "UNKNOWN";
        }

        //contrustor methods
        public Name(String f, String m,String l){
            first = f;
            middle = m;
            last =l;
        }
        public Name(String f, String l){
            first = f;
            middle = "";
            last = l;
        }
        //overloading method
        //getter and setters
        public String getFirst(){
            return first;
        }
        public String getLast(){
            return last;
        }
        public void setFirst(String fname){
            first = fname;
        }
        public void setLast(String lname){
            last = lname;
        }

        //return type of method
        public String displayName(){
            return first+" "+middle+" "+last;
        }

        public String getInitials(){
            return first.substring(0,1) + last.substring(0,1);
        }

        //toString methods
        public String toString(){
            return first + " "+ middle+" "+last;
        }

    
}

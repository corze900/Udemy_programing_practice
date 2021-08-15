public class Date {
    
    //data
    private int month;
    private int day;
    private int year;

    // contructor
    public Date(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }

    //getters / setters

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    


    //toString
    public String toString(){
        return "The Date is " +this.day+"/"+this.month+"/"+this.year;
    }


}

class Date{
    public String month;
    public int day;
    public int year;

    public void displayDate(){
        System.out.println(month + " " + day + " " + year);
    }

    public static void main(String[] args){
        Date date1, date2;
        date1 = new Date();
        date1.month = "January";
        date1.day = 1;
        date1.year = 2026;
        System.out.println("date1:");
        date1.displayDate();
        date2 = new Date();
        date2.month = "December";
        date2.day = 2;
        date2.year = 2025;
        System.out.println("date2:");
        date2.displayDate();
    }
}


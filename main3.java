class Main3 {
    public static void main(String[] args) {
        int year = 2020;

        String check = (year%400==0)? "a leap year" :
                       (year%100==0)? "not a leap year" :
                       (year%4==0)? "a leap year" : "Not a leap year";
        System.out.println(year + " is " + check);


    }
}
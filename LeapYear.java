public class LeapYear {
    public static void leapYear(int leapYear){
        if (leapYear%4==0|| leapYear%400==0){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }


        public static void main(String args[]) {
        leapYear(2022);



        }

}

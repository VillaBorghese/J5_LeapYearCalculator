public class LeapYear {

    public static boolean isLeapYear(int year){
        if (year <= 1 || year >= 9999){
            return false;
        } else {
            return year % 4 == 0 && year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0;

        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-2000));
    }
}

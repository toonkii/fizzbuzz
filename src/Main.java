public class Main {

    // Count from 1 to 100 if number is a multiple of 3 then output fizz and
    // if a multiple of 5 output buzz and if both a multiple of 3 and 5
    // output fizzbuzz.
    public static void main(String[] args) {
        int startHere = 1;
        int endHere  = 100;

        for (int i = startHere; i <= endHere; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }

        }
    }
}

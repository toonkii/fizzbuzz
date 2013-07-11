public class Main {

    // Count from 1 to 100 if number is a multiple of 3 then output fizz and
    // if a multiple of 5 output buzz and if both a multiple of 3 and 5
    // output fizzbuzz.
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

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

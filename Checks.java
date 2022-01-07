public class Checks{

    public static void main(String[] args) {
        try {

            System.out.println("0");

        } catch (Exception e) { //generic exception

            e.printStackTrace(); /* FLAW: Print stack trace to console on error */
        }

    }
}

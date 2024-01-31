public class IfStatement {
    public static void main(String[] args) {

        int age = 17;

        if (age >= 75) {
            System.out.println("Du er for gammel!");
        } else if (age >= 18) {
            System.out.println("Du er voksen!");
        } else if (age >= 13) {
            System.out.println("Du er tennåring!");
        } else {
            System.out.println("Du er ikke gammel nok!");
        }
    }
}

package KodeTesting;

public class AperHoppeSang {
    public static void main(String[] args) {
        int aperNum = 5;
        String ord = "apekatter";

        while (aperNum > 0) {

            if (aperNum == 1) {
                ord = "apekatt";
            }

            System.out.println(aperNum + " små " + ord + " hopper i en seng");
            System.out.println("En falt ned og slo hod-et sitt");
            System.out.println("Mamma ringte legen, og leghen sa: ");
            System.out.println("Hoppe i sengen? Det r ikke bra!");
            aperNum = aperNum - 1;

            System.out.println("\n");

            if (aperNum == 0) {
                System.out.println("Ingen " + ord + " hopper i en seng mer igjen");
            }
        }


    }
}

public class Scanner {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Hei! Hva heter du? ");
        String name = scanner.nextLine();

        System.out.println("Hvor gammel er du? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Hva liker du å spise? ");
        String food = scanner.nextLine();

        System.out.println("Hei! Du heter " + name + ".");
        System.out.println("Er " + age + " år.");
        System.out.println("Og du liker å spise " + food + ".");
        System.out.println("Hyggelig å hilse på deg! ");
    }
}

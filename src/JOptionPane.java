public class JOptionPane {
    public static void main(String[] args) {
        String name = javax.swing.JOptionPane.showInputDialog("Enter your name");
        javax.swing.JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Enter your age"));
        javax.swing.JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Enter your height"));
        javax.swing.JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }


}

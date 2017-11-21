import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String person = JOptionPane.showInputDialog("Enter a Name");
		JOptionPane.showMessageDialog(null, "Hello " + person);
	}
}

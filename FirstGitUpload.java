import javax.swing.JOptionPane;

public class FirstGitUpload {
	public static void main(String[] args) {
//variables
		String Name;
		String age;
		String dob;
		String address;
//inputs		
		Name = JOptionPane.showInputDialog("Enter Your Name:");
		age = JOptionPane.showInputDialog("Enter Your Age:");
		dob = JOptionPane.showInputDialog("Enter Your DOB:");
		address = JOptionPane.showInputDialog("Enter Your Adress");
//ouput		
		JOptionPane.showMessageDialog(null, "Your name is "+\'+Name+". Your age is "+\'+age+\'+". Your DOB is "+\'+dob+\'+". Your address is "+\'+address+\'+".");
		
		

	}

}

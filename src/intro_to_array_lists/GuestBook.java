package intro_to_array_lists;

import javax.swing.*;


public class GuestBook {
	// 1. Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	public void createUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton b = new JButton();
		frame.add(panel);
		panel.add(b);
	}
	// 2. When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// 3. that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// 4. all the names added to the list. Format the list as follows:
	// 5. Guest #1: Bob Banders
	// 6. Guest #2: Sandy Summers
	// 7. Guest #3: Greg Ganders
	// 8. Guest #4: Donny Doners
}

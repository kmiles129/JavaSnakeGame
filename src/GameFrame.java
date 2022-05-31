import javax.swing.JFrame;
@SuppressWarnings("serial")
public class GameFrame extends JFrame{

	 // Create and set up the window.
	GameFrame(){
		GamePanel panel = new GamePanel();
		this.add(panel); //used to add the element ‘element’ to this collection
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}

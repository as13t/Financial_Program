import java.awt.*;
import javax.swing.*;

public class LoginPage extends JFrame
{
	private JFrame loginFrame;
	private JPanel loginPanel;
	private JTextField userName;
	private JPasswordField password;
	
	public void createFrame()
	{
		loginFrame = new JFrame("Login");
		addTextData();
		
		loginFrame.setLayout(new GridLayout(0,1));
		loginFrame.setSize(300, 300);
		loginFrame.setVisible(true);
		loginFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void addTextData()
	{
		loginPanel = new JPanel();
		loginPanel.setLayout(new GridLayout(0,1));
		
		userName = new JTextField(10);
		password = new JPasswordField("Hidden Text");
		
		loginPanel.add(userName);
		loginPanel.add(password);
		
		loginFrame.add(loginPanel);
	}
	
}

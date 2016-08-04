import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MainGui extends JFrame
{
	private JFrame frame;
	private JPanel menuPanel;
	private JButton submitButton;
	private JComboBox menuCombo;
	private int indexItem;
	
	public void createGui()
	{
		frame = new JFrame("Temp Frame");
		
		createPanel();
		
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void createPanel()
	{
		String[] menuList = {"","Deposit", "Withdrawal", "Balance", "Statement"};
		menuCombo = new JComboBox(menuList);
		menuCombo.setSelectedIndex(0);
		
		indexItem = menuCombo.getSelectedIndex();
		
		menuPanel = new JPanel();
		submitButton = new JButton("Submit");
		
		submitButton.addActionListener( new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						if(menuCombo.getSelectedIndex()==1)
						{
							JOptionPane.showMessageDialog(null, "Deposit");
						}
					}
				});
		frame.add(menuPanel);
		menuPanel.add(menuCombo);
		menuPanel.add(submitButton);
	}
}

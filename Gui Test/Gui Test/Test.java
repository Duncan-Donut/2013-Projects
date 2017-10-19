import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;


public class Test {
	static JFrame frame = new JFrame("Test");
	public static void main(String[] args) {
		Frame();
		Menu();
		Label();
		Visible();
	}
	public static void Frame(){
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

	public static void Label (){
		
		JLabel yellowLabel = new JLabel();
	    yellowLabel.setOpaque(true);
	    yellowLabel.setBackground(new Color(248, 213, 131));
	    yellowLabel.setPreferredSize(new Dimension(10, 10)); 
	    frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);

	}
	public static void Menu(){	
		
		JMenuBar menuBar;
		JMenu menu, submenu;
		JMenuItem menuItem;
		JRadioButtonMenuItem rbMenuItem;
		JCheckBoxMenuItem cbMenuItem;

		//Create the menu bar.
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(120,120,120));
	
		//Create a yellow label to put in the content pane.
		
	    
	    //Creating a grey label to put in the content pane.
	    JLabel grayLabel = new JLabel();
	    
	    grayLabel.setOpaque(true);
	    grayLabel.setBackground(new Color(120,120,120));
	    grayLabel.setPreferredSize(new Dimension(30,30));
	    frame.getContentPane().add(grayLabel, BorderLayout.PAGE_END);
		//Build the first menu.
		menu = new JMenu("A Menu");
		menuBar.add(menu);

		//a group of JMenuItems
		menuItem = new JMenuItem("A text-only menu item");	
		menu.add(menuItem);

		 menuItem = new JMenuItem("Both text and icon",
		                         new ImageIcon("images/middle.gif"));
		menu.add(menuItem);

		menuItem = new JMenuItem(new ImageIcon("images/middle.gif"));
		menuItem.setMnemonic(KeyEvent.VK_D);
		menu.add(menuItem);

		//a group of radio button menu items
		menu.addSeparator();
		ButtonGroup group = new ButtonGroup();
		rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
		rbMenuItem.setSelected(true);
		rbMenuItem.setMnemonic(KeyEvent.VK_R);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);

		rbMenuItem = new JRadioButtonMenuItem("Another one");
		rbMenuItem.setMnemonic(KeyEvent.VK_O);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);

		//a group of check box menu items
		menu.addSeparator();
		cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
		cbMenuItem.setMnemonic(KeyEvent.VK_C);
		menu.add(cbMenuItem);

		cbMenuItem = new JCheckBoxMenuItem("Another one");
		cbMenuItem.setMnemonic(KeyEvent.VK_H);
		menu.add(cbMenuItem);

		//a submenu
		menu.addSeparator();
		submenu = new JMenu("A submenu");
		submenu.setMnemonic(KeyEvent.VK_S);

		menuItem = new JMenuItem("An item in the submenu");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_2, ActionEvent.ALT_MASK));
		submenu.add(menuItem);

		menuItem = new JMenuItem("Another item");
		submenu.add(menuItem);
		menu.add(submenu);

		//Build second menu in the menu bar.
		menu = new JMenu("Another Menu");
		menu.setMnemonic(KeyEvent.VK_N);
		menu.getAccessibleContext().setAccessibleDescription(
		        "This menu does nothing");
		menuBar.add(menu);
		//setting the menuBar
		frame.setJMenuBar(menuBar);
	}
	public static void Visible(){
		frame.setVisible(true);
	}

}

package com.thearchermancoding.chemcalc;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.BorderLayout;
import javax.swing.JMenuItem;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Elements, Compositions, Amounts, Multiplicity");
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		mntmNewMenuItem.setBounds(32, 50, 386, 19);
		frame.getContentPane().add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Elements, Compositions");
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.CENTER);
		mntmNewMenuItem_1.setBounds(32, 81, 386, 19);
		frame.getContentPane().add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Elements, Amounts");
		mntmNewMenuItem_2.setHorizontalAlignment(SwingConstants.CENTER);
		mntmNewMenuItem_2.setBounds(32, 112, 386, 19);
		frame.getContentPane().add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Elements, Compositions, Experimental Mass");
		mntmNewMenuItem_3.setHorizontalAlignment(SwingConstants.CENTER);
		mntmNewMenuItem_3.setBounds(32, 143, 386, 19);
		frame.getContentPane().add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Elements, Amounts, Experimental Mass");
		mntmNewMenuItem_4.setHorizontalAlignment(SwingConstants.CENTER);
		mntmNewMenuItem_4.setBounds(32, 174, 386, 19);
		frame.getContentPane().add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Lookup Element");
		mntmNewMenuItem_5.setHorizontalAlignment(SwingConstants.CENTER);
		mntmNewMenuItem_5.setBounds(32, 205, 386, 19);
		frame.getContentPane().add(mntmNewMenuItem_5);
	}
}

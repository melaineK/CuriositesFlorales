package com.cf.view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class SalesManagement extends JPanel implements ActionListener {
	
	private JTextField referenceField = new JTextField();
	JTextField priceField = new JTextField();
	JTextField quantityField = new JTextField();
	JTextField totalField = new JTextField();
	
	JButton save = new JButton("Valider");
	JButton reset = new JButton("Annuler");
	JButton home = new JButton("Acceuil");
	
	public SalesManagement(){
		
		//setBackground(Color.red);
		setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		
		constraints.gridx =  0;
		constraints.gridy = 0;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		//constraints.anchor = GridBagConstraints.ABOVE_BASELINE;
		constraints.insets = new Insets(10, 15, 0, 0);
		
		JLabel title = new JLabel("VENTES");
		add(title, constraints);
		
		JSeparator separator = new JSeparator();
		add(separator, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.NONE;
		
		JLabel reference = new JLabel("Référence : ");
		add(reference, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		
		add(referenceField, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth= 1;
		constraints.fill = GridBagConstraints.NONE;
		
		JLabel price = new JLabel("Prix : ");
		add(price, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		
		add(priceField);
		
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth= 1;
		constraints.fill = GridBagConstraints.NONE;
		
		JLabel quantity = new JLabel("Quantité : ");
		add(quantity, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		
		add(quantityField, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.gridwidth= 1;
		constraints.fill = GridBagConstraints.NONE;
		
		JLabel total = new JLabel("Total : ");
		add(total, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 4;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		
		totalField.setEditable(false);
		add(totalField, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 5;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.insets = new Insets(10, 10, 0, 10);
		save.addActionListener(this);
		add(save, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 5;
		reset.addActionListener(this);
		add(reset, constraints);
		
		constraints.gridx = 2;
		constraints.gridy = 5;
		home.addActionListener(this);
		add(home, constraints);
		
	}

	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource() == save){
			
		}else if(event.getSource() == reset){
			
			System.out.println(event.getSource());
			referenceField.setText(" ");
			priceField.setText("");
			quantityField.setText("");
			totalField.setText("");
			
		}else if(event.getSource() == home){
			
			
		}
		
	}

}

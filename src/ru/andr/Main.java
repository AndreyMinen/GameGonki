package ru.andr;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		JFrame f=new JFrame("Гонки");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1100, 580);
		f.add(new Road());
		f.setVisible(true);
		f.setResizable(false);

	}

}

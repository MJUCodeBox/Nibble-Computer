package main;

import view.MainFrame;

public class Main {
	public static void main(String[] args) {
		System.out.println("Penguin");
		MainFrame mazFrame = new MainFrame(false); // MainFrame (boolean debug);
		mazFrame.init();
		mazFrame.start();
	}
}

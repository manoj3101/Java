package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("1920×1080");
	}

	public static void main(String[] args) {
		Desktop system = new Desktop();
		system.computerModel();
		system.desktopSize();
		

	}

}

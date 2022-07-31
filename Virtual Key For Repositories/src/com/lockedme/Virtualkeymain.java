package com.lockedme;


public class Virtualkeymain {
	public static void main(String[] args) {

		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");

		MenuOptions.printWelcomeScreen("Virtualkey", "Guru vignesh.k");

		HandleOptions.handleWelcomeScreenInput();
	}

}

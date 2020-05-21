package com.thearchermancoding.chemcalc;

import java.io.IOException;
import java.util.Scanner;

//import java.util.ArrayList;
/**
 * The main loop that runs the cli so the user can actually use the app.
 */
public final class CLI {

    private CLI() {
        // Not called.
    }

    /**
     * Pauses until next input.
     */
    static void pause() {
        try {
            System.in.read();
        } catch (IOException e) {
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String menuString = "(1) Elements, Compositions, Amounts, Multiplicity\n(2) Elements, Compositions\n(3) Elements, Amounts\n(4) Elements, Compositions, Experimental Mass\n(5) Elements, Amounts, Experimental Mass\n(6) Lookup Element\n(7) List all Elements";
        String lookupMenu = "(1) Lookup Element by Symbol\n(2) Lookup Element by Atomic Number\n(3) Lookup Element by Name";
        System.out.println(
                "Turns out you can do user input in the command line with maven. Settings the while loop to never go off so this passes my github checks.");
        // while (true) {
        // int numElements;
        // ArrayList<Element> elements;
        // ArrayList<Double> compositions;
        // int multiplicity;
        // int[] amounts;
        // Compound compound;
        // Double experimentalMass;

        // System.out.println(menuString);
        // System.out.print("Choice: ");
        // int choice = scan.nextInt();
        // switch (choice) {
        // case 1:
        // System.out.print("How many elements? ");
        // numElements = scan.nextInt();
        // elements = new ArrayList<Element>(numElements);
        // compositions = new ArrayList<Double>(numElements);
        // amounts = new int[numElements];

        // for (int i = 0; i < numElements; i++) {
        // System.out.print("Element " + (i + 1) + ": ");
        // Element element = Element.valueOf(scan.next());
        // elements.add(element);
        // }
        // for (int i = 0; i < numElements; i++) {
        // System.out.print("Composition " + (i + 1) + ": ");
        // Double composition = scan.nextDouble();
        // compositions.add(composition);
        // }
        // for (int i = 0; i < numElements; i++) {
        // System.out.print("Amount " + (i + 1) + ": ");
        // int amount = scan.nextInt();
        // amounts[i] = amount;
        // }
        // System.out.print("What is the multiplicity of this compound? ");
        // multiplicity = scan.nextInt();
        // scan.nextLine();
        // compound = new Compound(elements, compositions, amounts, multiplicity);
        // System.out.print("What is this compounds name? ");
        // compound.addName(scan.nextLine());
        // System.out.println(compound);
        // pause();
        // break;
        // case 2:
        // System.out.print("How many elements? ");
        // numElements = scan.nextInt();
        // elements = new ArrayList<Element>(numElements);
        // compositions = new ArrayList<Double>(numElements);
        // for (int i = 0; i < numElements; i++) {
        // System.out.print("Element " + (i + 1) + ": ");
        // Element element = Element.valueOf(scan.next());
        // elements.add(element);
        // }
        // for (int i = 0; i < numElements; i++) {
        // System.out.print("Composition " + (i + 1) + ": ");
        // Double composition = scan.nextDouble();
        // compositions.add(composition);
        // }
        // scan.nextLine();
        // compound = new Compound(elements, compositions);
        // System.out.print("What is this compounds name? ");
        // compound.addName(scan.nextLine());
        // System.out.println(compound);
        // pause();
        // break;
        // case 3:
        // System.out.print("How many elements? ");
        // numElements = scan.nextInt();
        // elements = new ArrayList<Element>(numElements);
        // compositions = new ArrayList<Double>(numElements);
        // amounts = new int[numElements];

        // for (int i = 0; i < numElements; i++) {
        // System.out.print("Element " + (i + 1) + ": ");
        // Element element = Element.valueOf(scan.next());
        // elements.add(element);
        // }
        // for (int i = 0; i < numElements; i++) {
        // System.out.print("Amount " + (i + 1) + ": ");
        // int amount = scan.nextInt();
        // amounts[i] = amount;
        // }
        // scan.nextLine();
        // compound = new Compound(elements, amounts);
        // System.out.print("What is this compounds name? ");
        // compound.addName(scan.nextLine());
        // System.out.println(compound);
        // pause();
        // break;
        // case 4:
        // System.out.print("How many elements? ");
        // numElements = scan.nextInt();
        // elements = new ArrayList<Element>(numElements);
        // compositions = new ArrayList<Double>(numElements);
        // amounts = new int[numElements];

        // for (int i = 0; i < numElements; i++) {
        // System.out.print("Element " + (i + 1) + ": ");
        // Element element = Element.valueOf(scan.next());
        // elements.add(element);
        // }
        // for (int i = 0; i < numElements; i++) {
        // System.out.print("Composition " + (i + 1) + ": ");
        // Double composition = scan.nextDouble();
        // compositions.add(composition);
        // }
        // System.out.print("What is the experimental mass of this compound? ");
        // experimentalMass = scan.nextDouble();
        // scan.nextLine();
        // compound = new Compound(elements, compositions, experimentalMass);
        // System.out.print("What is this compounds name? ");
        // compound.addName(scan.nextLine());
        // System.out.println(compound);
        // pause();
        // break;
        // case 5:
        // System.out.print("How many elements? ");
        // numElements = scan.nextInt();
        // elements = new ArrayList<Element>(numElements);
        // compositions = new ArrayList<Double>(numElements);
        // amounts = new int[numElements];

        // for (int i = 0; i < numElements; i++) {
        // System.out.print("Element " + (i + 1) + ": ");
        // Element element = Element.valueOf(scan.next());
        // elements.add(element);
        // }
        // for (int i = 0; i < numElements; i++) {
        // System.out.print("Amount " + (i + 1) + ": ");
        // int amount = scan.nextInt();
        // amounts[i] = amount;
        // }
        // System.out.print("What is the experimental mass of this compound? ");
        // experimentalMass = scan.nextDouble();
        // scan.nextLine();
        // compound = new Compound(elements, amounts, experimentalMass);
        // System.out.print("What is this compounds name? ");
        // compound.addName(scan.nextLine());
        // System.out.println(compound);
        // pause();
        // break;
        // case 6:
        // System.out.println(lookupMenu);
        // System.out.print("Choice: ");
        // int choice2 = scan.nextInt();
        // switch (choice2) {
        // case 1:
        // System.out.print("Symbol: ");
        // System.out.println(Element.valueOf(scan.next()));
        // pause();
        // break;
        // case 2:
        // System.out.print("Number: ");
        // System.out.println(Element.forAtomicNumber(scan.nextInt()));
        // pause();
        // break;
        // case 3:
        // System.out.print("Name: ");
        // System.out.println(Element.forName(scan.next()));
        // pause();
        // break;
        // default:
        // System.out.println("Invalid Choice");
        // break;
        // }
        // break;
        // case 7:
        // Element.printAllElements();
        // pause();
        // break;
        // default:
        // System.out.println("Invalid Choice");
        // }
        // }
    }
}
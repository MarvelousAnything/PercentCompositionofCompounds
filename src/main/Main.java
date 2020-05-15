package main;

import java.util.ArrayList;
import java.util.Scanner;
import compound.Compound;
import element.Element;

public class Main {
    public static void pause() {
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String menuString = "(1) Elements, Compositions, Amounts, Multiplicity\n(2) Elements, Compositions\n(3) Elements, Amounts\n(4) Elements, Compositions, Experimental Mass\n(5) Elements, Amounts, Experimental Mass\n(6) Lookup Element\n(7) List all Elements";
        String lookupMenu = "(1) Lookup Element by Symbol\n(2) Lookup Element by Atomic Number\n(3) Lookup Element by Name";
        while (true) {
            int numElements;
            ArrayList<Element> elements;
            ArrayList<Double> compositions;
            int multiplicity;
            int[] amounts;
            Compound compound;
            Double experimental_mass;

            System.out.println(menuString);
            System.out.print("Choice: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("How many elements? ");
                    numElements = scan.nextInt();
                    elements = new ArrayList<Element>(numElements);
                    compositions = new ArrayList<Double>(numElements);
                    amounts = new int[numElements];

                    for (int i = 0; i < numElements; i++) {
                        System.out.print("Element " + (i + 1) + ": ");
                        Element element = Element.valueOf(scan.next());
                        elements.add(element);
                    }
                    for (int i = 0; i < numElements; i++) {
                        System.out.print("Composition " + (i + 1) + ": ");
                        Double composition = scan.nextDouble();
                        compositions.add(composition);
                    }
                    for (int i = 0; i < numElements; i++) {
                        System.out.print("Amount " + (i + 1) + ": ");
                        int amount = scan.nextInt();
                        amounts[i] = amount;
                    }
                    System.out.print("What is the multiplicity of this compound? ");
                    multiplicity = scan.nextInt();
                    scan.nextLine();
                    compound = new Compound(elements, compositions, amounts, multiplicity);
                    System.out.print("What is this compounds name? ");
                    compound.addName(scan.nextLine());
                    System.out.println(compound);
                    pause();
                    break;
                case 2:
                    System.out.print("How many elements? ");
                    numElements = scan.nextInt();
                    elements = new ArrayList<Element>(numElements);
                    compositions = new ArrayList<Double>(numElements);
                    for (int i = 0; i < numElements; i++) {
                        System.out.print("Element " + (i + 1) + ": ");
                        Element element = Element.valueOf(scan.next());
                        elements.add(element);
                    }
                    for (int i = 0; i < numElements; i++) {
                        System.out.print("Composition " + (i + 1) + ": ");
                        Double composition = scan.nextDouble();
                        compositions.add(composition);
                    }
                    scan.nextLine();
                    compound = new Compound(elements, compositions);
                    System.out.print("What is this compounds name? ");
                    compound.addName(scan.nextLine());
                    System.out.println(compound);
                    pause();
                    break;
                case 3:
                    System.out.print("How many elements? ");
                    numElements = scan.nextInt();
                    elements = new ArrayList<Element>(numElements);
                    compositions = new ArrayList<Double>(numElements);
                    amounts = new int[numElements];

                    for (int i = 0; i < numElements; i++) {
                        System.out.print("Element " + (i + 1) + ": ");
                        Element element = Element.valueOf(scan.next());
                        elements.add(element);
                    }
                    for (int i = 0; i < numElements; i++) {
                        System.out.print("Amount " + (i + 1) + ": ");
                        int amount = scan.nextInt();
                        amounts[i] = amount;
                    }
                    scan.nextLine();
                    compound = new Compound(elements, amounts);
                    System.out.print("What is this compounds name? ");
                    compound.addName(scan.nextLine());
                    System.out.println(compound);
                    pause();
                    break;
                case 4:
                    System.out.print("How many elements? ");
                    numElements = scan.nextInt();
                    elements = new ArrayList<Element>(numElements);
                    compositions = new ArrayList<Double>(numElements);
                    amounts = new int[numElements];

                    for (int i = 0; i < numElements; i++) {
                        System.out.print("Element " + (i + 1) + ": ");
                        Element element = Element.valueOf(scan.next());
                        elements.add(element);
                    }
                    for (int i = 0; i < numElements; i++) {
                        System.out.print("Composition " + (i + 1) + ": ");
                        Double composition = scan.nextDouble();
                        compositions.add(composition);
                    }
                    System.out.print("What is the experimental mass of this compound? ");
                    experimental_mass = scan.nextDouble();
                    scan.nextLine();
                    compound = new Compound(elements, compositions, experimental_mass);
                    System.out.print("What is this compounds name? ");
                    compound.addName(scan.nextLine());
                    System.out.println(compound);
                    pause();
                    break;
                case 5:
                    System.out.print("How many elements? ");
                    numElements = scan.nextInt();
                    elements = new ArrayList<Element>(numElements);
                    compositions = new ArrayList<Double>(numElements);
                    amounts = new int[numElements];

                    for (int i = 0; i < numElements; i++) {
                        System.out.print("Element " + (i + 1) + ": ");
                        Element element = Element.valueOf(scan.next());
                        elements.add(element);
                    }
                    for (int i = 0; i < numElements; i++) {
                        System.out.print("Amount " + (i + 1) + ": ");
                        int amount = scan.nextInt();
                        amounts[i] = amount;
                    }
                    System.out.print("What is the experimental mass of this compound? ");
                    experimental_mass = scan.nextDouble();
                    scan.nextLine();
                    compound = new Compound(elements, amounts, experimental_mass);
                    System.out.print("What is this compounds name? ");
                    compound.addName(scan.nextLine());
                    System.out.println(compound);
                    pause();
                    break;
                case 6:
                    System.out.println(lookupMenu);
                    System.out.print("Choice: ");
                    int choice2 = scan.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.print("Symbol: ");
                            System.out.println(Element.valueOf(scan.next()));
                            pause();
                            break;
                        case 2:
                            System.out.print("Number: ");
                            System.out.println(Element.forAtomicNumber(scan.nextInt()));
                            pause();
                            break;
                        case 3:
                            System.out.print("Name: ");
                            System.out.println(Element.forName(scan.next()));
                            pause();
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                    break;
                case 7:
                    Element.printAllElements();
                    pause();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
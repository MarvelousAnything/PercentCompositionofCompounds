package test;

import java.util.ArrayList;

import compound.Compound;
import element.Element;
import main.Main;

public class Test {

    public void testMain() {
        String[] args = new String[0];
        Main.main(args);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Element> elements = new ArrayList<Element>(3);
        elements.add(Element.C);
        elements.add(Element.H);
        elements.add(Element.N);

        ArrayList<Double> compositions = new ArrayList<Double>(3);
        compositions.add(74.0);
        compositions.add(8.7);
        compositions.add(17.3);
        int[] amounts = { 5, 7, 1 };
        Compound nicotine = new Compound(elements, compositions, 521.0);
        System.out.println(nicotine);

    }
}
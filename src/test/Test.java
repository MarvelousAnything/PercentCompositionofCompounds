package test;

import java.util.ArrayList;

import compound.Compound;
import element.Element;

public class Test {
    public static void main(String[] args) {
        ArrayList<Element> elements = new ArrayList<Element>(3);
        elements.add(Element.C);
        elements.add(Element.H);
        elements.add(Element.N);
        for (Element e : elements) {
            System.out.println(e.getAtomicMass());
        }
        ArrayList<Double> compositions = new ArrayList<Double>(3);
        compositions.add(74.0);
        compositions.add(8.7);
        compositions.add(17.3);
        System.out.println(compositions);
        Compound nicotine = new Compound(elements, compositions);
        System.out.println(nicotine);
    }
}
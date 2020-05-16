package com.Thearchermancoding.PercentCompChemCalc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
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

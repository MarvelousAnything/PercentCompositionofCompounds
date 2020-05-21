package com.thearchermancoding.chemcalc;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CLITest {
    /**
     * Rigorous Test.
     */
    @Test
    void testCompound() {
        ArrayList<Element> elements = new ArrayList<Element>(3);
        elements.add(Element.C);
        elements.add(Element.H);
        elements.add(Element.N);

        ArrayList<Double> compositions = new ArrayList<Double>(3);
        compositions.add(74.0);
        compositions.add(8.7);
        compositions.add(17.3);
        int[] amounts = {5, 7, 1};
        Compound nicotine = new Compound(elements, compositions, 521.0);
        System.out.println(nicotine);
    }

    @Test

    void testMain() {
        String[] args = {""};
        CLI.main(args);
    }
}

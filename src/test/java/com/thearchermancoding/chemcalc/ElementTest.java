package com.thearchermancoding.chemcalc;

import com.thearchermancoding.chemcalc.chemistry.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The type Element test.
 */
class ElementTest {

    /**
     * For atomic number.
     */
    @Test
    void forAtomicNumber() {
        assertEquals(Element.C, Element.forAtomicNumber(6));
    }

    /**
     * For name.
     */
    @Test
    void forName() {
        assertEquals(Element.He, Element.forName("Helium"));
    }

    /**
     * Gets atomic number.
     */
    @Test
    void getAtomicNumber() {
        assertEquals(7, Element.N.getAtomicNumber());
    }

    /**
     * Gets full name.
     */
    @Test
    void getFullName() {
        assertEquals("Argon", Element.Ar.getFullName());
    }

    /**
     * Gets atomic mass.
     */
    @Test
    void getAtomicMass() {
        assertEquals(91.2242, Element.Zr.getAtomicMass());
    }

    /**
     * Print all elements.
     */
    @Test
    void printAllElements() {
        Element.printAllElements();
    }

    /**
     * Gets info.
     */
    @Test
    void getInfo() {
        Element.Eu.getInfo();
    }

    /**
     * Values.
     */
    @Test
    void values() {
        Element.values();
    }

    /**
     * Value of.
     */
    @Test
    void valueOf() {
        assertEquals(Element.Na, Element.valueOf("Na"));
    }
}

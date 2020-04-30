package compound;

import java.util.*;
import java.lang.Math;

import element.Element;

public class Compound {

    private ArrayList<Element> elements;
    private ArrayList<Double> compositions;
    private int[] amounts;
    private Double empirical_mass;
    private Double experimental_mass;
    private Double[] moles;

    public Compound(ArrayList<Element> elements, ArrayList<Double> compositions, int[] amounts) {
        this.elements = elements;
        this.compositions = compositions;
        this.amounts = amounts;
        for (int i = 0; i < this.elements.size(); i++) {
            this.empirical_mass += this.amounts[i] * this.elements.get(i).getAtomicMass();
        }
        /*
         * this.empirical_mass = empirical_mass; this.experimental_mass =
         * experimental_mass;
         */
    }

    public Compound(ArrayList<Element> elements, ArrayList<Double> compositions) {
        assert elements.size() == compositions.size() : "There needs to be the same number of Compositions as Elements";

        this.elements = elements;
        this.compositions = compositions;
        this.amounts = new int[this.elements.size()];
        this.empirical_mass = 0.0;
        this.moles = new Double[this.elements.size()];

        Double smallestMole = Double.MAX_VALUE;
        for (int i = 0; i < this.elements.size(); i++) {
            this.moles[i] = this.compositions.get(i) / this.elements.get(i).getAtomicMass();
            smallestMole = Math.min(smallestMole, this.moles[i]);
        }
        for (int i = 0; i < this.elements.size(); i++) {
            this.amounts[i] = Math.round((float) (this.moles[i] / smallestMole));
        }
        for (int i = 0; i < this.elements.size(); i++) {
            this.empirical_mass += this.amounts[i] * this.elements.get(i).getAtomicMass();
        }
    }

    public Compound(ArrayList<Element> elements, int[] amounts) {
        this.elements = elements;
        this.amounts = amounts;
        for (int i = 0; i < this.elements.size(); i++) {
            this.empirical_mass += this.amounts[i] * this.elements.get(i).getAtomicMass();
        }
        for (int i = 0; i < this.elements.size(); i++) {
            this.compositions.add((((this.amounts[i] * this.elements.get(i).getAtomicMass()) / this.empirical_mass)));
        }
    }

    public ArrayList<Element> getElements() {
        return this.elements;
    }

    public ArrayList<Double> getCompositions() {
        return this.compositions;
    }

    public int[] getAmounts() {
        return this.amounts;
    }

    public Double getEmpiricalMass() {
        return this.empirical_mass;
    }

    public Double getExperimentalMass() {
        return this.experimental_mass;
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < this.elements.size(); i++) {
            out += this.elements.get(i) + "" + this.amounts[i];
        }
        return out;
    }
}
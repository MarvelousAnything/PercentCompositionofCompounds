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
    private int multiplicity;
    private int[] molecular_amounts;
    private Double molecular_mass;

    public Compound(ArrayList<Element> elements, ArrayList<Double> compositions, int[] amounts, int multiplicity) {
        this.elements = elements;
        this.compositions = compositions;
        this.amounts = amounts;
        this.multiplicity = multiplicity;
        this.molecular_amounts = amounts;
        this.molecular_mass = 0.0;
        for (int i = 0; i < this.molecular_amounts.length; i++) {
            this.molecular_amounts[i] *= this.multiplicity;
        }
        for (int i = 0; i < this.elements.size(); i++) {
            this.empirical_mass += this.amounts[i] * this.elements.get(i).getAtomicMass();
        }
        for (int i = 0; i < this.elements.size(); i++) {
            this.molecular_mass += this.molecular_amounts[i] * this.elements.get(i).getAtomicMass();
        }
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
            this.empirical_mass += this.amounts[i] * this.elements.get(i).getAtomicMass();
        }
    }

    public Compound(ArrayList<Element> elements, int[] amounts) {
        this.elements = elements;
        this.amounts = amounts;
        this.molecular_mass = 0.0;
        for (int i = 0; i < this.elements.size(); i++) {
            this.empirical_mass += this.amounts[i] * this.elements.get(i).getAtomicMass();
        }
        this.molecular_amounts = this.amounts;
        for (int i = 0; i < this.molecular_amounts.length; i++) {
            this.molecular_amounts[i] *= this.multiplicity;
        }
        for (int i = 0; i < this.elements.size(); i++) {
            this.molecular_mass += this.molecular_amounts[i] * this.elements.get(i).getAtomicMass();
        }
        for (int i = 0; i < this.elements.size(); i++) {
            this.compositions.add((((this.amounts[i] * this.elements.get(i).getAtomicMass()) / this.empirical_mass)));
        }
    }

    public Compound(ArrayList<Element> elements, ArrayList<Double> compositions, Double experimental_mass) {
        this(elements, compositions);
        this.experimental_mass = experimental_mass;
        this.multiplicity = Math.round((float) (this.experimental_mass / this.empirical_mass));
        this.molecular_amounts = this.amounts;
        for (int i = 0; i < this.molecular_amounts.length; i++) {
            this.molecular_amounts[i] *= this.multiplicity;
            this.molecular_mass += this.molecular_amounts[i] * this.elements.get(i).getAtomicMass();
        }
    }

    public Compound(ArrayList<Element> elements, int[] amounts, Double experimental_mass) {
        this(elements, amounts);
        this.experimental_mass = experimental_mass;
        this.multiplicity = Math.round((float) (this.experimental_mass / this.empirical_mass));
        this.molecular_amounts = this.amounts;
        for (int i = 0; i < this.molecular_amounts.length; i++) {
            this.molecular_amounts[i] *= this.multiplicity;
            this.molecular_mass += this.molecular_amounts[i] * this.elements.get(i).getAtomicMass();
        }
    }

    /**
     * @return ArrayList<Element>
     */
    public ArrayList<Element> getElements() {
        return this.elements;
    }

    /**
     * @return ArrayList<Double>
     */
    public ArrayList<Double> getCompositions() {
        return this.compositions;
    }

    /**
     * @return int[]
     */
    public int[] getAmounts() {
        return this.amounts;
    }

    /**
     * @return int[]
     */
    public int[] getMolecularAmounts() {
        return this.molecular_amounts;
    }

    /**
     * @return Double
     */
    public Double getEmpiricalMass() {
        return this.empirical_mass;
    }

    /**
     * @return Double
     */
    public Double getMolecularMass() {
        return this.molecular_mass;
    }

    /**
     * @return Double
     */
    public Double getExperimentalMass() {
        return this.experimental_mass;
    }

    public String getMolecularFormula() {
        String out = "";
        for (int i = 0; i < this.elements.size(); i++) {
            out += this.elements.get(i) + "" + this.molecular_amounts[i];
        }
        return out;
    }

    public String getEmpiricalFormula() {
        String out = "";
        for (int i = 0; i < this.elements.size(); i++) {
            out += this.elements.get(i) + "" + this.amounts[i];
        }
        return out;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < this.elements.size(); i++) {
            out += this.elements.get(i) + "" + this.amounts[i];
        }
        return out;
    }
}
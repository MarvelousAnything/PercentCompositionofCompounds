package com.thearchermancoding.chemcalc.chemistry;

import java.util.ArrayList;

/**
 * Class that puts together and outputs information about compounds based on
 * what elements are in it, what percent of that element is in it, and how much
 * of each element is in it.
 */
public class Compound {

    private final ArrayList<Element> elements;
    private final ArrayList<Double> compositions;
    private final int[] amounts;
    private Double empiricalMass;
    private Double experimentalMass;
    private int multiplicity;
    private int[] molecularAmounts;
    private Double molecularMass;
    private String name;

    /**
     *
     * @param elements
     * @param compositions
     * @param amounts
     * @param multiplicity
     */
    public Compound(ArrayList<Element> elements, ArrayList<Double> compositions, int[] amounts, int multiplicity) {
        this.elements = elements;
        this.compositions = compositions;
        this.amounts = amounts;
        this.multiplicity = multiplicity;
        this.molecularAmounts = amounts;
        this.molecularMass = 0.0;
        this.empiricalMass = 0.0;
        this.molecularAmounts = amounts.clone();
        for (int i = 0; i < this.molecularAmounts.length; i++) {
            this.molecularAmounts[i] *= this.multiplicity;
        }
        for (int i = 0; i < this.elements.size(); i++) {
            this.empiricalMass += this.amounts[i] * this.elements.get(i).getAtomicMass();
        }
        for (int i = 0; i < this.elements.size(); i++) {
            this.molecularMass += this.molecularAmounts[i] * this.elements.get(i).getAtomicMass();
        }
    }

    /**
     *
     * @param elements
     * @param compositions
     */
    public Compound(ArrayList<Element> elements, ArrayList<Double> compositions) {
        assert elements.size() == compositions.size() : "There needs to be the same number of Compositions as Elements";

        this.elements = elements;
        this.compositions = compositions;
        this.amounts = new int[this.elements.size()];
        this.empiricalMass = 0.0;
        Double[] moles = new Double[this.elements.size()];

        Double smallestMole = Double.MAX_VALUE;
        for (int i = 0; i < this.elements.size(); i++) {
            moles[i] = this.compositions.get(i) / this.elements.get(i).getAtomicMass();
            smallestMole = Math.min(smallestMole, moles[i]);
        }
        for (int i = 0; i < this.elements.size(); i++) {
            this.amounts[i] = Math.round((float) (moles[i] / smallestMole));
        }
        this.molecularAmounts = this.amounts.clone();
        for (int i = 0; i < this.elements.size(); i++) {
            this.empiricalMass += this.amounts[i] * this.elements.get(i).getAtomicMass();
        }
        this.molecularMass = this.empiricalMass;
    }

    /**
     *
     * @param elements
     * @param amounts
     */
    public Compound(ArrayList<Element> elements, int[] amounts) {
        this.elements = elements;
        this.amounts = amounts;
        this.molecularAmounts = this.amounts.clone();
        this.empiricalMass = 0.0;
        this.compositions = new ArrayList<Double>();
        for (int i = 0; i < this.elements.size(); i++) {
            this.empiricalMass += this.amounts[i] * this.elements.get(i).getAtomicMass();
        }
        this.molecularMass = this.empiricalMass;
        for (int i = 0; i < this.elements.size(); i++) {
            this.compositions
                    .add(((this.amounts[i] * this.elements.get(i).getAtomicMass()) / this.empiricalMass) * 100);
        }
    }

    /**
     *
     * @param elements
     * @param compositions
     * @param experimentalMass
     */
    public Compound(ArrayList<Element> elements, ArrayList<Double> compositions, Double experimentalMass) {
        this(elements, compositions);
        this.experimentalMass = experimentalMass;
        this.multiplicity = Math.round((float) (this.experimentalMass / this.empiricalMass));
        if (this.multiplicity == 0) {
            this.multiplicity = 1;
        }
        this.molecularAmounts = this.amounts.clone();
        this.molecularMass = 0.0;
        for (int i = 0; i < this.molecularAmounts.length; i++) {
            this.molecularAmounts[i] *= this.multiplicity;
            this.molecularMass += this.molecularAmounts[i] * this.elements.get(i).getAtomicMass();
        }
    }

    /**
     *
     * @param elements
     * @param amounts
     * @param experimentalMass
     */
    public Compound(ArrayList<Element> elements, int[] amounts, Double experimentalMass) {
        this(elements, amounts);
        this.experimentalMass = experimentalMass;
        this.multiplicity = Math.round((float) (this.experimentalMass / this.empiricalMass));
        if (this.multiplicity == 0) {
            this.multiplicity = 1;
        }
        this.molecularAmounts = this.amounts.clone();
        this.molecularMass = 0.0;
        for (int i = 0; i < this.molecularAmounts.length; i++) {
            this.molecularAmounts[i] *= this.multiplicity;
            this.molecularMass += this.molecularAmounts[i] * this.elements.get(i).getAtomicMass();
        }
    }

    /**
     * @param name
     */
    public void addName(String name) {
        this.name = name;
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
        return this.molecularAmounts;
    }

    /**
     * @return Double
     */
    public Double getEmpiricalMass() {
        return this.empiricalMass;
    }

    /**
     * @return Double
     */
    public Double getMolecularMass() {
        return this.molecularMass;
    }

    /**
     * @return Double
     */
    public Double getExperimentalMass() {
        return this.experimentalMass;
    }

    /**
     * @return int
     */
    public int getMultiplicity() {
        return this.multiplicity;
    }

    /**
     * @return String
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return String
     */
    public String getMolecularFormula() {
        String out = "";
        for (int i = 0; i < this.elements.size(); i++) {
            out += this.elements.get(i).name() + "" + this.molecularAmounts[i];
        }
        return out;
    }

    /**
     * @return String
     */
    public String getEmpiricalFormula() {
        String out = "";
        for (int i = 0; i < this.elements.size(); i++) {
            out += this.elements.get(i).name() + "" + this.amounts[i];
        }
        return out;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "Name: " + getName() + "\nEmpirical Formula: " + getEmpiricalFormula() + "\nMolecular Formula: "
                + getMolecularFormula() + "\nMultiplicity: " + getMultiplicity() + "\nCompositions: "
                + getCompositions() + "\nEmpirical Mass: " + getEmpiricalMass() + "\nMolecular Mass: "
                + getMolecularMass() + "\nExperimental Mass: " + getExperimentalMass();
    }
}

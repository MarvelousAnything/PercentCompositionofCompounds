import java.util.HashMap;
import java.util.Map;

/**
 * Enum holding data for the elements on the periodic table.
 */
public enum Element {
    /** Hydrogen. */
    H(1, "Hydrogen", 1.008),
    /** Helium. */
    He(2, "Helium", 4.0026022),
    /** Lithium. */
    Li(3, "Lithium", 6.94),
    /** Beryllium. */
    Be(4, "Beryllium", 9.01218315),
    /** Boron. */
    B(5, "Boron", 10.81),
    /** Carbon. */
    C(6, "Carbon", 12.011),
    /** Nitrogen. */
    N(7, "Nitrogen", 14.007),
    /** Oxygen. */
    O(8, "Oxygen", 15.999),
    /** Fluorine. */
    F(9, "Fluorine", 18.9984031636),
    /** Neon. */
    Ne(10, "Neon", 20.17976),
    /** Sodium. */
    Na(11, "Sodium", 22.989769282),
    /** Magnesium. */
    Mg(12, "Magnesium", 24.305),
    /** Aluminium. */
    Al(13, "Aluminium", 26.98153857),
    /** Silicon. */
    Si(14, "Silicon", 28.085),
    /** Phosphorus. */
    P(15, "Phosphorus", 30.9737619985),
    /** Sulfur. */
    S(16, "Sulfur", 32.06),
    /** Chlorine. */
    Cl(17, "Chlorine", 35.45),
    /** Argon. */
    Ar(18, "Argon", 39.9481),
    /** Potassium. */
    K(19, "Potassium", 39.09831),
    /** Calcium. */
    Ca(20, "Calcium", 40.0784),
    /** Scandium. */
    Sc(21, "Scandium", 44.9559085),
    /** Titanium. */
    Ti(22, "Titanium", 47.8671),
    /** Vanadium. */
    V(23, "Vanadium", 50.94151),
    /** Chromium. */
    Cr(24, "Chromium", 51.99616),
    /** Manganese. */
    Mn(25, "Manganese", 54.9380443),
    /** Iron. */
    Fe(26, "Iron", 55.8452),
    /** Cobalt. */
    Co(27, "Cobalt", 58.9331944),
    /** Nickel. */
    Ni(28, "Nickel", 58.69344),
    /** Copper. */
    Cu(29, "Copper", 63.5463),
    /** Zinc. */
    Zn(30, "Zinc", 65.382),
    /** Gallium. */
    Ga(31, "Gallium", 69.7231),
    /** Germanium. */
    Ge(32, "Germanium", 72.6308),
    /** Arsenic. */
    As(33, "Arsenic", 74.9215956),
    /** Selenium. */
    Se(34, "Selenium", 78.9718),
    /** Bromine. */
    Br(35, "Bromine", 79.904),
    /** Krypton. */
    Kr(36, "Krypton", 83.7982),
    /** Rubidium. */
    Rb(37, "Rubidium", 85.46783),
    /** Strontium. */
    Sr(38, "Strontium", 87.621),
    /** Yttrium. */
    Y(39, "Yttrium", 88.905842),
    /** Zirconium. */
    Zr(40, "Zirconium", 91.2242),
    /** Niobium. */
    Nb(41, "Niobium", 92.906372),
    /** Molybdenum. */
    Mo(42, "Molybdenum", 95.951),
    /** Technetium. */
    Tc(43, "Technetium", 98),
    /** Ruthenium. */
    Ru(44, "Ruthenium", 101.072),
    /** Rhodium. */
    Rh(45, "Rhodium", 102.905502),
    /** Palladium. */
    Pd(46, "Palladium", 106.421),
    /** Silver. */
    Ag(47, "Silver", 107.86822),
    /** Cadmium. */
    Cd(48, "Cadmium", 112.4144),
    /** Indium. */
    In(49, "Indium", 114.8181),
    /** Tin. */
    Sn(50, "Tin", 118.7107),
    /** Antimony. */
    Sb(51, "Antimony", 121.7601),
    /** Tellurium. */
    Te(52, "Tellurium", 127.603),
    /** Iodine. */
    I(53, "Iodine", 126.904473),
    /** Xenon. */
    Xe(54, "Xenon", 131.2936),
    /** Cesium. */
    Cs(55, "Cesium", 132.905451966),
    /** Barium. */
    Ba(56, "Barium", 137.3277),
    /** Lanthanum. */
    La(57, "Lanthanum", 138.905477),
    /** Cerium. */
    Ce(58, "Cerium", 140.1161),
    /** Praseodymium. */
    Pr(59, "Praseodymium", 140.907662),
    /** Neodymium. */
    Nd(60, "Neodymium", 144.2423),
    /** Promethium. */
    Pm(61, "Promethium", 145),
    /** Samarium. */
    Sm(62, "Samarium", 150.362),
    /** Europium. */
    Eu(63, "Europium", 151.9641),
    /** Gadolinium. */
    Gd(64, "Gadolinium", 157.253),
    /** Terbium. */
    Tb(65, "Terbium", 158.925352),
    /** Dysprosium. */
    Dy(66, "Dysprosium", 162.5001),
    /** Holmium. */
    Ho(67, "Holmium", 164.930332),
    /** Erbium. */
    Er(68, "Erbium", 167.2593),
    /** Thulium. */
    Tm(69, "Thulium", 168.934222),
    /** Ytterbium. */
    Yb(70, "Ytterbium", 173.0451),
    /** Lutetium. */
    Lu(71, "Lutetium", 174.96681),
    /** Hafnium. */
    Hf(72, "Hafnium", 178.492),
    /** Tantalum. */
    Ta(73, "Tantalum", 180.947882),
    /** Tungsten. */
    W(74, "Tungsten", 183.841),
    /** Rhenium. */
    Re(75, "Rhenium", 186.2071),
    /** Osmium. */
    Os(76, "Osmium", 190.233),
    /** Iridium. */
    Ir(77, "Iridium", 192.2173),
    /** Platinum. */
    Pt(78, "Platinum", 195.0849),
    /** Gold. */
    Au(79, "Gold", 196.9665695),
    /** Mercury. */
    Hg(80, "Mercury", 200.5923),
    /** Thallium. */
    Tl(81, "Thallium", 204.38),
    /** Lead. */
    Pb(82, "Lead", 207.21),
    /** Bismuth. */
    Bi(83, "Bismuth", 208.980401),
    /** Polonium. */
    Po(84, "Polonium", 209),
    /** Astatine. */
    At(85, "Astatine", 210),
    /** Radon. */
    Rn(86, "Radon", 222),
    /** Francium. */
    Fr(87, "Francium", 223),
    /** Radium. */
    Ra(88, "Radium", 226),
    /** Actinium. */
    Ac(89, "Actinium", 227),
    /** Thorium. */
    Th(90, "Thorium", 232.03774),
    /** Protactinium. */
    Pa(91, "Protactinium", 231.035882),
    /** Uranium. */
    U(92, "Uranium", 238.028913),
    /** Neptunium. */
    Np(93, "Neptunium", 237),
    /** Plutonium. */
    Pu(94, "Plutonium", 244),
    /** Americium. */
    Am(95, "Americium", 243),
    /** Curium. */
    Cm(96, "Curium", 247),
    /** Berkelium. */
    Bk(97, "Berkelium", 247),
    /** Californium. */
    Cf(98, "Californium", 251),
    /** Einsteinium. */
    Es(99, "Einsteinium", 252),
    /** Fermium. */
    Fm(100, "Fermium", 257),
    /** Mendelevium. */
    Md(101, "Mendelevium", 258),
    /** Nobelium. */
    No(102, "Nobelium", 259),
    /** Lawrencium. */
    Lr(103, "Lawrencium", 266),
    /** Rutherfordium. */
    Rf(104, "Rutherfordium", 267),
    /** Dubnium. */
    Db(105, "Dubnium", 268),
    /** Seaborgium. */
    Sg(106, "Seaborgium", 269),
    /** Bohrium. */
    Bh(107, "Bohrium", 270),
    /** Hassium. */
    Hs(108, "Hassium", 269),
    /** Meitnerium. */
    Mt(109, "Meitnerium", 278),
    /** Darmstadtium. */
    Ds(110, "Darmstadtium", 281),
    /** Roentgenium. */
    Rg(111, "Roentgenium", 282),
    /** Copernicium. */
    Cn(112, "Copernicium", 285),
    /** Nihonium. */
    Nh(113, "Nihonium", 286),
    /** Flerovium. */
    Fl(114, "Flerovium", 289),
    /** Moscovium. */
    Mc(115, "Moscovium", 289),
    /** Livermorium. */
    Lv(116, "Livermorium", 293),
    /** Tennessine. */
    Ts(117, "Tennessine", 294),
    /** Oganesson. */
    Og(118, "Oganesson", 294),
    /** Ununennium. */
    Uue(119, "Ununennium", 315);

    private static class Holder {
        private static Map<Integer, Element> map = new HashMap<Integer, Element>();
        private static Map<String, Element> map2 = new HashMap<String, Element>();
    }

    private final int atomicNumber;
    private final String fullName;
    private final double atomicMass;

    /**
     *
     * @param atomicNumber
     * @param fullName
     * @param atomicMass
     */
    Element(int atomicNumber, String fullName, double atomicMass) {
        this.atomicNumber = atomicNumber;
        this.fullName = fullName;
        this.atomicMass = atomicMass;
        Holder.map.put(atomicNumber, this);
        Holder.map2.put(fullName, this);
    }

    /**
     *
     * @param atomicNumber
     * @return
     */
    public static Element forAtomicNumber(int atomicNumber) {
        return Holder.map.get(atomicNumber);
    }

    /**
     *
     * @param name
     * @return
     */
    public static Element forName(String name) {
        return Holder.map2.get(name);
    }

    /**
     *
     * @return
     */
    public int getAtomicNumber() {
        return atomicNumber;
    }

    /**
     *
     * @return
     */
    public String getFullName() {
        return fullName;
    }

    /**
     *
     * @return
     */
    public double getAtomicMass() {
        return atomicMass;
    }

    /**
     * Prints all elements in the enum.
     */
    public static void printAllElements() {
        for (int i = 0; i < Holder.map.size(); i++) {
            System.out.println(Holder.map.get(i + 1));
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "Name: " + getFullName() + "\nAtomic Number: " + getAtomicNumber() + "\nSymbol: " + this.name()
                + "\nAtomic Mass: " + getAtomicMass();
    }
}

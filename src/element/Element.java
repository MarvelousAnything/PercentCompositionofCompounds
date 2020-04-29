package element;

import java.util.HashMap;
import java.util.Map;

public enum Element {
    H(1, "Hydrogen", 1.008), He(2, "Helium", 4.0026022), Li(3, "Lithium", 6.94), Be(4, "Beryllium", 9.01218315),
    B(5, "Boron", 10.81), C(6, "Carbon", 12.011), N(7, "Nitrogen", 14.007), O(8, "Oxygen", 15.999),
    F(9, "Fluorine", 18.9984031636), Ne(10, "Neon", 20.17976), Na(11, "Sodium", 22.989769282),
    Mg(12, "Magnesium", 24.305), Al(13, "Aluminium", 26.98153857), Si(14, "Silicon", 28.085),
    P(15, "Phosphorus", 30.9737619985), S(16, "Sulfur", 32.06), Cl(17, "Chlorine", 35.45), Ar(18, "Argon", 39.9481),
    K(19, "Potassium", 39.09831), Ca(20, "Calcium", 40.0784), Sc(21, "Scandium", 44.9559085),
    Ti(22, "Titanium", 47.8671), V(23, "Vanadium", 50.94151), Cr(24, "Chromium", 51.99616),
    Mn(25, "Manganese", 54.9380443), Fe(26, "Iron", 55.8452), Co(27, "Cobalt", 58.9331944), Ni(28, "Nickel", 58.69344),
    Cu(29, "Copper", 63.5463), Zn(30, "Zinc", 65.382), Ga(31, "Gallium", 69.7231), Ge(32, "Germanium", 72.6308),
    As(33, "Arsenic", 74.9215956), Se(34, "Selenium", 78.9718), Br(35, "Bromine", 79.904), Kr(36, "Krypton", 83.7982),
    Rb(37, "Rubidium", 85.46783), Sr(38, "Strontium", 87.621), Y(39, "Yttrium", 88.905842),
    Zr(40, "Zirconium", 91.2242), Nb(41, "Niobium", 92.906372), Mo(42, "Molybdenum", 95.951), Tc(43, "Technetium", 98),
    Ru(44, "Ruthenium", 101.072), Rh(45, "Rhodium", 102.905502), Pd(46, "Palladium", 106.421),
    Ag(47, "Silver", 107.86822), Cd(48, "Cadmium", 112.4144), In(49, "Indium", 114.8181), Sn(50, "Tin", 118.7107),
    Sb(51, "Antimony", 121.7601), Te(52, "Tellurium", 127.603), I(53, "Iodine", 126.904473), Xe(54, "Xenon", 131.2936),
    Cs(55, "Cesium", 132.905451966), Ba(56, "Barium", 137.3277), La(57, "Lanthanum", 138.905477),
    Ce(58, "Cerium", 140.1161), Pr(59, "Praseodymium", 140.907662), Nd(60, "Neodymium", 144.2423),
    Pm(61, "Promethium", 145), Sm(62, "Samarium", 150.362), Eu(63, "Europium", 151.9641), Gd(64, "Gadolinium", 157.253),
    Tb(65, "Terbium", 158.925352), Dy(66, "Dysprosium", 162.5001), Ho(67, "Holmium", 164.930332),
    Er(68, "Erbium", 167.2593), Tm(69, "Thulium", 168.934222), Yb(70, "Ytterbium", 173.0451),
    Lu(71, "Lutetium", 174.96681), Hf(72, "Hafnium", 178.492), Ta(73, "Tantalum", 180.947882),
    W(74, "Tungsten", 183.841), Re(75, "Rhenium", 186.2071), Os(76, "Osmium", 190.233), Ir(77, "Iridium", 192.2173),
    Pt(78, "Platinum", 195.0849), Au(79, "Gold", 196.9665695), Hg(80, "Mercury", 200.5923), Tl(81, "Thallium", 204.38),
    Pb(82, "Lead", 207.21), Bi(83, "Bismuth", 208.980401), Po(84, "Polonium", 209), At(85, "Astatine", 210),
    Rn(86, "Radon", 222), Fr(87, "Francium", 223), Ra(88, "Radium", 226), Ac(89, "Actinium", 227),
    Th(90, "Thorium", 232.03774), Pa(91, "Protactinium", 231.035882), U(92, "Uranium", 238.028913),
    Np(93, "Neptunium", 237), Pu(94, "Plutonium", 244), Am(95, "Americium", 243), Cm(96, "Curium", 247),
    Bk(97, "Berkelium", 247), Cf(98, "Californium", 251), Es(99, "Einsteinium", 252), Fm(100, "Fermium", 257),
    Md(101, "Mendelevium", 258), No(102, "Nobelium", 259), Lr(103, "Lawrencium", 266), Rf(104, "Rutherfordium", 267),
    Db(105, "Dubnium", 268), Sg(106, "Seaborgium", 269), Bh(107, "Bohrium", 270), Hs(108, "Hassium", 269),
    Mt(109, "Meitnerium", 278), Ds(110, "Darmstadtium", 281), Rg(111, "Roentgenium", 282), Cn(112, "Copernicium", 285),
    Nh(113, "Nihonium", 286), Fl(114, "Flerovium", 289), Mc(115, "Moscovium", 289), Lv(116, "Livermorium", 293),
    Ts(117, "Tennessine", 294), Og(118, "Oganesson", 294), Uue(119, "Ununennium", 315);

    private static class Holder {
        static Map<Integer, Element> map = new HashMap<Integer, Element>();
    }

    private final int atomicNumber;
    private final String fullName;
    private final double atomicMass;

    private Element(int atomicNumber, String fullName, double atomicMass) {
        this.atomicNumber = atomicNumber;
        this.fullName = fullName;
        this.atomicMass = atomicMass;
        Holder.map.put(atomicNumber, this);
    }

    public static Element forAtomicNumber(int atomicNumber) {
        return Holder.map.get(atomicNumber);
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public double getAtomicMass() {
        return atomicMass;
    }
}
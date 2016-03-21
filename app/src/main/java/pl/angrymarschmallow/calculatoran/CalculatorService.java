package pl.angrymarschmallow.calculatoran;

/**
 * Główna klasa obliczająca (typu Service, nic nie przechowuje, nie jest obiektem w rozumieniu
 * Domain Drive Development - zawiera jedynie metody, które coś robią i zawsze wynik zwracają)
 */
public class CalculatorService implements CalculatorEngine {
    // Miejsce na implementację metod z interfejsu :]

    // ! Piszcie komentarze do metod.


    /**
     * dzielenie modularne
     * @param a - licznik
     * @param b - dzielnik
     * @return - wynik operacji dzielenia modularnego a przez b
     */
    @Override
    public int mod(int a, int b) {
        return  a % b;
    }

    /**
     * silnia
     * @param a - stopien potegi
     * @return - wartość n-silni
     */
    @Override
    public int fact(int a) {
        if (a < 1){
            return 1;
        }else {
            return a * fact(a -1);
        }
    }

    public CalculatorService() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double multip(double a, double b) {
        return 0;
    }

    @Override
    public double div(double a, double b) {
        return 0;
    }

    @Override
    public double sum(double... a) {
        return 0;
    }

    @Override
    public double substr(double a, double b) {
        return 0;
    }

    @Override
    public double pow(double a, double b) {
        return 0;
    }

    @Override
    public double sqrt(double a, double b) {
        return 0;
    }

    @Override
    public double[] quadratic(double a, double b, double c) {
        return new double[0];
    }

    @Override
    public double sin(double a) {
        return 0;
    }

    @Override
    public double cos(double a) {
        return 0;
    }

    @Override
    public double tg(double a) {
        return 0;
    }

    @Override
    public double ctg(double a) {
        return 0;
    }

    @Override
    public boolean perfect(int a) {
        return false;
    }

    @Override
    public boolean first(int a) {
        return false;
    }

    @Override
    public double nwd(int a, int b) {
        return 0;
    }

    @Override
    public String decToBin(int a) {
        return Integer.toBinaryString(a);
    }

    @Override
    public int binToDec(String a) {
        return Integer.getInteger(a,2);
    }

    @Override
    public String decToHex(int a) {
        return Integer.toHexString(a);
    }

    @Override
    public int hexToDec(String a) {
        return Integer.getInteger(a,16);
    }
}

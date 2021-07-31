package de.termitehuegel.erweitertereuklidischeralgorithmus.logic;

/**
 * @author termitehuegel
 */
public class AdvancedEuclideanAlgorithm {

    int a;
    int b;
    int s;
    int t;
    int ggT;

    public AdvancedEuclideanAlgorithm(int a, int b) {
        this.a = a;
        this.b = b;

        calculate(a, b, 0);
    }



    private void calculate(int a, int b, int r) {
        int q;
        if (b!=0) {
            q = a / b;
            r = a % b;
            //System.out.println("a=" + a +  "; b=" + b + "; q=" + q + "; r=" + r);
            a=b;
            b=r;
            calculate(a, b, r);
        } else {
            this.ggT = a;
            this.s = 0;
            q =0;
            this.t = 1;
            //System.out.println("a=" + a +  "; b=" + b + "; q=" + q + "; r=" + r);
        }
        int sOld = this.s;
        this.s = this.t;
        this.t = sOld - q * this.t;
        //System.out.println("a=" + a +  "; b=" + b + "; q=" + q + "; r=" + r + "; s=" + s + "; t=" + t);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getS() {
        return s;
    }

    public int getT() {
        return t;
    }

    public int getGGT() {
        return ggT;
    }

    public String getEquation() {
        String aText = a<0 ? "(" + a + ")" : String.valueOf(a);
        String bText = b<0 ? "(" + b + ")" : String.valueOf(b);
        String sText = s<0 ? "(" + s + ")" : String.valueOf(s);
        String tText = t<0 ? "(" + t + ")" : String.valueOf(t);

        return aText+"*"+sText+" + "+bText+"*"+tText+" = "+ggT;
    }

    @Override
    public String toString() {
        return "AdvancedEuclideanAlgorithm{" +
                "a=" + a +
                ", b=" + b +
                ", s=" + s +
                ", t=" + t +
                ", ggT=" + ggT +
                ", " + getEquation() +
                '}';
    }
}

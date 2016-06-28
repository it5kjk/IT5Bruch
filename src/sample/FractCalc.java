package sample;
//fraction calculator by VP/JNK
//Creation of FractCalc class - this class contains the arithmetic functions for the fractions
public class FractCalc
{
    //Default-Constructor
    public FractCalc()
    {
    }

    //function to compute a sum, two fractions as arguments
    public Fract sum(Fract fract1, Fract fract2)
    {
        int zNumerator, zDenominator;

        zNumerator = fract2.numerator() * fract1.denominator() + fract1.numerator() * fract2.denominator(); //arithmetic logic
        zDenominator = fract2.denominator() * fract1.denominator(); // arithmetic logic
        Fract br = new Fract(zNumerator, zDenominator);        //Initialization of new fraction
        br.shorten();                                //shorten method from Fract class is called

        return br;  //the shortened sum fraction is returned
    }

    public Fract difference(Fract fract1, Fract fract2)
    {
        return sum( new Fract(fract1.numerator(), fract1.denominator()) ,
                new Fract (-fract2.numerator(),fract2.denominator()));

    }

    public Fract quotient(Fract fract1, Fract fract2)
    {
        int zNumerator, zDenominator;

        zNumerator = fract2.denominator() * fract1.numerator();
        zDenominator = fract2.numerator() * fract1.denominator();
        Fract br = new Fract(zNumerator, zDenominator);

        br.shorten();

        return br;
    }

    public Fract product(Fract fract1, Fract fract2)
    {
        int zNumerator, zDenominator;

        zDenominator = fract2.denominator() * fract1.denominator();
        zNumerator = fract2.numerator() * fract1.numerator();
        Fract br = new Fract(zNumerator, zDenominator);

        br.shorten();

        return br;
    }

}
package sample;
//fraction calculator by VP/JNK
//initializing of Fract class and assigning of attributes
public class Fract
{
    int zDenominator,zNumerator;

    public Fract(int pNumerator,int pDenominator) //format of fraction is (numerator, denominator)
    {   zNumerator = pNumerator;
        zDenominator = pDenominator;
    }

    public int numerator()
    {
        return zNumerator;
    } // getter - function to output numerator

    public int denominator()
    {
        return zDenominator;
    } //getter - function to output denominator

    //function to compute greatest common divisor with Euklid formula
    private int gcd(int number1, int number2) 
    {
        int number3 = 0;
        while (number2 != 0)
        {
            number3= Math.abs(number1) % Math.abs(number2);
            number1=number2;
            number2=number3;
        }
        return number1;
    }

    public void shorten()    //setter - method for shortening fractions
    {
        int gcd = gcd(zNumerator,zDenominator);
        zDenominator /= gcd;
        zNumerator /= gcd;
    }
}
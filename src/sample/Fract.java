package sample;
//Bruchrechner by VP/JNK
//Erstellung der Klasse "Fract" und Zuweisung von Attributen
public class Fract
{
    int zDenominator,zNumerator;

    public Fract(int pNumerator,int pDenominator) //Bruch immer im Format Fract(Zaehler,Nenner)
    {   zNumerator = pNumerator;
        zDenominator = pDenominator;
    }

    public int numerator()
    {
        return zNumerator;
    } // getter - Funktion um Zaehler auszugeben

    public int denominator()
    {
        return zDenominator;
    } //getter - Funktion um Nenner auszugeben


    private int ggt(int number1, int number2) // Funktion um den Kehrwert zu ermitteln
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

    public void shorten()    // setter - Methode zum Kürzen des Bruchs
    {
        int ggt = ggt(zNumerator,zDenominator);
        zDenominator /= ggt;
        zNumerator /= ggt;
    }
}
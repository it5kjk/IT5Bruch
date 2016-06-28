package sample;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//fraction calculator by VP/JNK
//controller class is defined
public class Controller {

    //Erstellung von von Objekten (names are identical to the fx:id's in the GUI style file - sample.fxml)
    public TextField numerator1 = new TextField("1");
    public TextField denominator1 = new TextField("1");
    public TextField numerator2 = new TextField("1");
    public TextField denominator2 = new TextField("1");
    public Label result;
    public TextField resultZ;
    public TextField resultN;
    public Label resultDeci;
    public Button minusbutton;
    public Button malbutton;
    public Button teilbutton;
    public Button plusbutton;

    //Funktion zum Erfassen des Inhalts der Textfelder - GETTER

    public int input1(){
        int Input1 = Integer.parseInt(numerator1.getText());
        return Input1;
    }
    public int input2(){
        int Input2 = Integer.parseInt(denominator1.getText());
        return Input2;
    }
    public int input3(){
        int Input3 = Integer.parseInt(numerator2.getText());
        return Input3;
    }
    public int input4(){
        int Input4 = Integer.parseInt(denominator2.getText());
        return Input4;
    }

    //Methode die beim Event "onMouseClicked" auf Button Addieren ausgeführt wird
    public void add(Event event) {
        Fract fr1 = new Fract(input1(), input2()); //Erstellung des ersten Bruchs
        Fract fr2 = new Fract(input3(), input4()); //Erstellung des zweiten Bruchs
        FractCalc Add = new FractCalc(); //Neues Objekt aus der Klasse FractCalc wird erstellt
        int z1 = Add.sum(fr1,fr2).numerator(); // Objekt "Add" wird mit der Funktion "Summe" berechnet - Zähler
        int n2 = Add.sum(fr1,fr2).denominator(); // Das selbe wie oben nur für den Nenner
    //output of the result
        result.setText("result of addition: ");
        showResult(z1,n2);
        resultDeci.setText("in decimal: " + (double)z1 / n2);
    }

    public void subtract(Event event) {
        Fract fr1 = new Fract(input1(), input2());
        Fract fr2 = new Fract(input3(), input4());
        FractCalc Sub = new FractCalc();
        int z1 = Sub.difference(fr1,fr2).numerator();
        int n2 = Sub.difference(fr1,fr2).denominator();

        result.setText("result of subtraction: ");
        showResult(z1,n2);
        resultDeci.setText("in decimal: " + (double)z1 / n2);
    }

    public void multiply(Event event) {
        Fract fr1 = new Fract(input1(), input2());
        Fract fr2 = new Fract(input3(), input4());
        FractCalc Mul = new FractCalc();
        int z1 = Mul.product(fr1,fr2).numerator();
        int n2 = Mul.product(fr1,fr2).denominator();

        result.setText("result of multiplication: ");
        showResult(z1,n2);
        resultDeci.setText("in decimal: " + (double)z1 / n2);
    }

    public void divide(Event event) {
        Fract fr1 = new Fract(input1(), input2());
        Fract fr2 = new Fract(input3(), input4());
        FractCalc Div = new FractCalc();
        int z1 = Div.quotient(fr1,fr2).numerator();
        int n2 = Div.quotient(fr1,fr2).denominator();

        result.setText("result of division: ");
        showResult(z1,n2);
        resultDeci.setText("in decimal: " + (double)z1 / n2);
    }
    
    //Method to handle negative results
	private void showResult(int z1, int n2) {
		if (n2 < 0){
        	resultZ.setText("" + (-1*z1) );
        	resultN.setText("" + (-1*n2) );
		} else {
        	resultZ.setText("" + z1 );
        	resultN.setText("" + n2 );
        }	
	}
}

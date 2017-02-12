package com.example.android.carbuyingcalculations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.carbuyingcalculations.R.id.mileage1;
import static com.example.android.carbuyingcalculations.R.id.mileage2;
import static com.example.android.carbuyingcalculations.R.id.mpg1;
import static com.example.android.carbuyingcalculations.R.id.mpg2;
import static com.example.android.carbuyingcalculations.R.id.petrol1;
import static com.example.android.carbuyingcalculations.R.id.petrol2;

public class MainActivity extends AppCompatActivity {

    /* Sets the global variables */
    double totalcost1; double totalcost2; String car1; String car2; String whichCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayCalculation(View view) {
        displayCar1(createCar1());
        displayCar2(createCar2());
        displayResults(createResults());
    }

    private String createCar1() {
        /* Gets the content of the text box and converts it from a string to a float */
        EditText textbox = (EditText) findViewById(R.id.purchaseprice1);
        String convert = textbox.getText().toString();

        /* Detects if there is a null value in the text box entered and informs the user then returns if this is the case */
        try{
            double pp1 = Float.parseFloat(convert);
        } catch (NumberFormatException pp1) {
            Toast.makeText(this, "You did not enter the purchase price of car 1", Toast.LENGTH_SHORT).show();
            return "Value of car 1 = ";
        }

        /* Converts the String from the textbox into a double numerical variable */
        double pp1 = Float.parseFloat(convert);

        /* Detects if the value entered in the text box is 0 or below and informs the user then returns if this is the case */
        if (pp1 <= 0) {
            Toast.makeText(this, "You need to enter a value higher than 0", Toast.LENGTH_SHORT).show();
            return "Value of car 1 = ";
        }

        textbox = (EditText) findViewById(mpg1);
        convert = textbox.getText().toString();

        try{
            double mpg1 = Float.parseFloat(convert);
        } catch (NumberFormatException mpg1) {
            Toast.makeText(this, "You did not enter the miles per gallon of car 1", Toast.LENGTH_SHORT).show();
            return "Value of car 1 = ";
        }

        double mpg1 = Float.parseFloat(convert);

        if (mpg1 <= 0) {
            Toast.makeText(this, "You need to enter a value higher than 0", Toast.LENGTH_SHORT).show();
            return "Value of car 1 = ";
        }

        textbox = (EditText) findViewById(petrol1);
        convert = textbox.getText().toString();

        try{
            double petrol1 = Float.parseFloat(convert);
        } catch (NumberFormatException petrol1) {
            Toast.makeText(this, "You did not enter the petrol price of car 1", Toast.LENGTH_SHORT).show();
            return "Value of car 1 = ";
        }

        double petrol1 = Float.parseFloat(convert);

        if (petrol1 <= 0) {
            Toast.makeText(this, "You need to enter a value higher than 0", Toast.LENGTH_SHORT).show();
            return "Value of car 1 = ";
        }

        textbox = (EditText) findViewById(mileage1);
        convert = textbox.getText().toString();

        try{
            double mileage1 = Float.parseFloat(convert);
        } catch (NumberFormatException mileage1) {
            Toast.makeText(this, "You did not enter the mileage of car 1", Toast.LENGTH_SHORT).show();
            return "Value of car 1 = ";
        }

        double mileage1 = Float.parseFloat(convert);

        if (mileage1 <= 0) {
            Toast.makeText(this, "You need to enter a value higher than 0", Toast.LENGTH_SHORT).show();
            return "Value of car 1 = ";
        }

        /* Converts the petrol entered in litres into gallons for the calculation below. As petrol prices in the UK are in litres */
        double petrolGallons1 = petrol1 * 4.54609;

        /* Calculates the total value of car 1 using an algorithm */
        totalcost1 = (mileage1 / mpg1) * petrolGallons1 + pp1;

        /* Rounds off the total to 2 decimal places */
        double rounded1 = (double) Math.round(totalcost1 * 100) / 100;

        /* Converts the rounded off total to a string to be displayed as a return value in the relevant textbox field */
        car1 = String.valueOf(rounded1);
        return "Value of car 1 = £" + car1;
    }
    private String createCar2() {
        EditText textbox = (EditText) findViewById(R.id.purchaseprice2);
        String convert = textbox.getText().toString();

        try{
            double pp2 = Float.parseFloat(convert);
        } catch (NumberFormatException pp2) {
            Toast.makeText(this, "You did not enterthe  purchase price of car 2", Toast.LENGTH_SHORT).show();
            return "Value of car 2 = ";
        }

        double pp2 = Float.parseFloat(convert);

        if (pp2 <= 0) {
            Toast.makeText(this, "You need to enter a value higher than 0", Toast.LENGTH_SHORT).show();
            return "Value of car 1 = ";
        }

        textbox = (EditText) findViewById(mpg2);
        convert = textbox.getText().toString();

        try{
            double mpg2 = Float.parseFloat(convert);
        } catch (NumberFormatException mpg2) {
            Toast.makeText(this, "You did not enter the miles per gallon of car 2", Toast.LENGTH_SHORT).show();
            return "Value of car 2 = ";
        }

        double mpg2 = Float.parseFloat(convert);

        if (mpg2 <= 0) {
            Toast.makeText(this, "You need to enter a value higher than 0", Toast.LENGTH_SHORT).show();
            return "Value of car 2 = ";
        }

        textbox = (EditText) findViewById(petrol2);
        convert = textbox.getText().toString();

        try{
            double petrol2 = Float.parseFloat(convert);
        } catch (NumberFormatException petrol2) {
            Toast.makeText(this, "You did not enter the petrol price of car 2", Toast.LENGTH_SHORT).show();
            return "Value of car 2 = ";
        }

        double petrol2 = Float.parseFloat(convert);

        if (petrol2 <= 0) {
            Toast.makeText(this, "You need to enter a value higher than 0", Toast.LENGTH_SHORT).show();
            return "Value of car 1 = ";
        }

        textbox = (EditText) findViewById(mileage2);
        convert = textbox.getText().toString();

        try{
            double mileage2 = Float.parseFloat(convert);
        } catch (NumberFormatException mileage2) {
            Toast.makeText(this, "You did not enter the petrol price of car 2", Toast.LENGTH_SHORT).show();
            return "Value of car 2 = ";
        }

        double mileage2 = Float.parseFloat(convert);
        if (mileage2 <= 0) {
            Toast.makeText(this, "You need to enter a value higher than 0", Toast.LENGTH_SHORT).show();
            return "Value of car 1 = ";
        }

        double petrolGallons2 = petrol2 * 4.54609;
        totalcost2 = (mileage2 / mpg2) * petrolGallons2 + pp2;

        double rounded2 = (double) Math.round(totalcost2 * 100) / 100;
        car2 = String.valueOf(rounded2);

        return "Value of car 2 = £" + car2;
    }
    private void displayCar1(String message) {
        TextView car1TextView = (TextView) findViewById(R.id.car1text);
        car1TextView.setText(message);
    }
    private void displayCar2(String message) {
        TextView car2TextView = (TextView) findViewById(R.id.car2text);
        car2TextView.setText(message);
    }
    private void displayResults(String message) {
        TextView resultsTextView = (TextView) findViewById(R.id.resultstext);
        resultsTextView.setText(message);
    }
    private String createResults() {
        if (totalcost1 <=0) {
            whichCar = "Which car to buy: ";
        }
        if (totalcost2 <=0) {
            whichCar = "Which car to buy: ";
        }
        if (totalcost1 > totalcost2) {
            whichCar = "Which car to buy: Car 2";
        }
        if (totalcost2 > totalcost1) {
            whichCar = "Which car to buy: Car 1";
        }
        if (totalcost2 == totalcost1) {
            whichCar = "Which car to buy: You can buy either car";
        }
        return whichCar;
    }
    public void ResetValues(View view) {
        /* Clears the text boxes */
        EditText emptyText = (EditText) findViewById(R.id.purchaseprice1);
        emptyText.setText("");
        emptyText = (EditText) findViewById(R.id.purchaseprice2);
        emptyText.setText("");
        emptyText = (EditText) findViewById(mpg1);
        emptyText.setText("");
        emptyText = (EditText) findViewById(R.id.mpg2);
        emptyText.setText("");
        emptyText = (EditText) findViewById(petrol1);
        emptyText.setText("");
        emptyText = (EditText) findViewById(petrol2);
        emptyText.setText("");
        emptyText = (EditText) findViewById(mileage1);
        emptyText.setText("");
        emptyText = (EditText) findViewById(mileage2);
        emptyText.setText("");

        /* Clears the values of the global variables */
        totalcost1=0; totalcost2=0; car1=""; car2=""; whichCar="";

        /* Displays the results textviews as they originally were */
        TextView resultsTextView = (TextView) findViewById(R.id.car1text);
        resultsTextView.setText("Value of car 1 = ");

        resultsTextView = (TextView) findViewById(R.id.car2text);
        resultsTextView.setText("Value of car 2 = ");

        resultsTextView = (TextView) findViewById(R.id.resultstext);
        resultsTextView.setText("Which car to buy: ");
    }
}

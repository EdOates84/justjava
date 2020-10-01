package com.example.android.justjava;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.NumberFormat;
import java.text.*

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    public void increment(View view){

        quantity++;
        display(quantity);
    }

    public void decrement(View view){
        if(quantity>=1) {

            quantity--;
            display(quantity);
        }
    }

    // uncommenting this function.
   public void submitOrder(View view) {
       int numberofCoffees = 2;
       display(numberofCoffees);
       int price = 5;
       displayPrice(quantity*5);
   }

    public void submitOrder(View view) {

        int price = 5;
        displayPrice(quantity);

        if(quantity==0) {
            String priceMessage = "Free!";
            displayMessage(priceMessage);
        }
    }

    public void displayMessage(String message){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }



    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }


}

package com.exampel.android.justjava;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import static com.exampel.android.justjava.R.id.prise_text_view;

public class MainActivity extends Activity {
    protected int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {

        display(quantity);
        displayPrice(quantity * 5);
    }

    public void increment(View view) {

        quantity++;
        display(quantity);
    }

    public void decrement(View view) {

        if (quantity <= 0) {
            quantity = quantity;
        }else{
            quantity--;
        }
        display(quantity);
    }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(prise_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}

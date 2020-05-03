package com.first.conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class productsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner mainSpinner;

    private TextView textView11;
    private TextView textView22;
    private TextView textView33;
    private TextView textView44;
    private TextView textView55;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        textView11 =findViewById(R.id.text_view11);
        textView22 =findViewById(R.id.text_view22);
        textView33 =findViewById(R.id.text_view33);
        textView44 = findViewById(R.id.text_view44);
        textView55 = findViewById(R.id.text_view55);


        mainSpinner= findViewById(R.id.productsChoose);



        //array adapter adapting(fit) an array of objects as a data source- links the adapter to products data set
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.products , android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        // fit the adapter we create to the spinner
        mainSpinner.setAdapter(adapter);
        mainSpinner.setOnItemSelectedListener(this);
        mainSpinner.setPrompt("אנא בחר מוצר");

    }

    //methods for OnItemSelectedListener

    //the item the user is selected
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        setValues(text);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    private void setValues(String str){

        if(str.equals("אבקת אפייה")){
            textView11.setText("שקית אבקת אפייה שווה ל10 גרם");
            textView22.setText("כף אבקת אפייה שווה כ-7 גרם");
            textView33.setText("כפית אבקת אפיה שווה ל4 גרם - חצי שקית");
            textView44.setText("");
            textView55.setText("");

        }


        if (str.equals("קמח לבן")){
            textView11.setText("כוס קמח שווה כ-140 גרם קמח");
            textView22.setText("כף קמח שווה כ-10 גרם");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if (str.equals("קמח מלא")){
            textView11.setText("כוס קמח שווה כ-125 גרם קמח");
            textView22.setText("כף קמח שווה 8 גרם");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if(str.equals("יוגורט")){
            textView11.setText("גביע יוגורט שווה 200 גרם");
            textView22.setText("");
            textView33.setText("");
            textView44.setText("");
            textView55.setText("");
        }


        if (str.equals("אבקת סוכר")){
            textView11.setText("כוס אבקת סוכר שווה כ-120 גרם");
            textView22.setText("כף אבקת סוכר שווה כ-10 גרם");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if(str.equals("אגוזים טחונים")){
            textView11.setText("כוס אגוזים טחונים שווה כ-90 גרם");
            textView22.setText("כף אגוזים טחונים שווה כ-10 גרם");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }


        if (str.equals("ביצה")){
            textView11.setText("ביצה S שווה כ-50 גרם");
            textView22.setText("ביצה M שווה כ-60 גרם");
            textView33.setText("ביצה L שווה כ-70 גרם");
            textView44.setText("ביצה XL שווה כ-80 גרם");
            textView55.setText("");
        }

        if(str.equals("גלטין")){
            textView11.setText("שקית ג’לטין שווה 14 גרם");
            textView22.setText("כפית ג'לטין שווה 4 גרם");
            textView33.setText("");
            textView44.setText("");
            textView55.setText("");
        }

        if(str.equals("דבש")){
            textView11.setText("כוס דבש שווה 350 גרם");
            textView22.setText("כף דבש שווה 20 גרם");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if(str.equals("חלב")){
            textView11.setText("כוס חלב שווה 240 מל");
            textView22.setText("כף חלב שווה 15 מל");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("מידות זהות עבור חלב סויה/ חלב שקדים/ חלב אורז וחלב שיבולת שועל");
        }

        if(str.equals("סודה לשתייה")){
            textView11.setText("כפית סודה לשתייה שווה 5 גרם");
            textView22.setText("");
            textView33.setText("");
            textView44.setText("");
            textView55.setText("");
        }

        if(str.equals("מלח")){
            textView11.setText("כף מלח שווה 20 גרם");
            textView22.setText("כפית מלח שווה 7 גרם");
            textView33.setText("");
            textView44.setText("");
            textView55.setText("");
        }

        if(str.equals("סוכר חום")) {
            textView11.setText("כוס סוכר חום שווה 240 גרם");
            textView22.setText("כף סוכר חום שווה 15 גרם");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if(str.equals("סוכר לבן")) {
            textView11.setText("כוס סוכר לבן שווה 200 גרם");
            textView22.setText("כף סוכר לבן שווה 10 גרם");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if(str.equals("סילאן")) {
            textView11.setText("כוס סילאן שווה 350 גרם");
            textView22.setText("כף סילאן שווה 20ג גרם");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if(str.equals("פרג")) {
            textView11.setText("כוס פרג שווה 80 גרם");
            textView22.setText("כף פרג שווה 10 גרם");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if(str.equals("קונפלור")) {
            textView11.setText("כוס קונפלור שווה 140 גרם");
            textView22.setText("כף קונפלור שווה 12 גרם");
            textView33.setText("כפית קונפלור שווה 5 גרם");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if(str.equals("קקאו")) {
            textView11.setText("כוס קקאו שווה 140 גרם");
            textView22.setText("כף קקאו שווה 12 גרם");
            textView33.setText("כפית קקאו שווה 5 גרם");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if(str.equals("מים")) {
            textView11.setText("כוס מים שווה 240 מל");
            textView22.setText("כף מים שווה 15 מל");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if(str.equals("מיץ תפוזים")) {
            textView11.setText("כוס מיץ תפוזים שווה 240 מל");
            textView22.setText("");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if(str.equals("קינמון")) {
            textView11.setText("כף קינמון שווה 10 גרם");
            textView22.setText("כפית קינמון שווה 5 גרם");
            textView33.setText("");
            textView44.setText("");
            textView55.setText("");
        }

        if(str.equals("שיבולת שועל")) {
            textView11.setText("כוס שיבולת שועל שווה 100 גרם");
            textView22.setText("כף שיבולת שועל שווה 15 גרם");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if(str.equals("קוקוס טחון")) {
            textView11.setText("כוס קוקוס שווה 100 גרם");
            textView22.setText("כף קוקוס שווה 10 גרם");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if(str.equals("מייפל")) {
            textView11.setText("כוס מייפל שווה 240 גרם");
            textView22.setText("");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if(str.equals("שמרים יבשים")) {
            textView11.setText("כף שמרים יבשים שווים 10 גרם");
            textView22.setText("כפית שמרים יבשים שווה 4 גרם");
            textView33.setText("");
            textView44.setText("");
            textView55.setText("** המרה לשמרים טריים ניתן לראות בלשונית המרות");
        }

        if(str.equals("שמנת חמוצה")) {
            textView11.setText("מיכל שמנת חמוצה שווה 200 מל");
            textView22.setText("");
            textView33.setText("");
            textView44.setText("");
            textView55.setText("");
        }

        if(str.equals("שמן")) {
            textView11.setText("כוס שמן שווה 200 מל");
            textView22.setText("");
            textView33.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView44.setText("");
            textView55.setText("מידות זהות עבור שמן קנולה/ שמן קוקוס/ שמן זית או כל שמן צמחי אחר");
        }

        if(str.equals("ממרח נוטלה")) {
            textView11.setText("כוס נוטלה שווה 280 גרם");
            textView22.setText("כף נוטלה שווה 20 גרם");
            textView33.setText("");
            textView44.setText("");
            textView55.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
        }

        if(str.equals("ממרח חמאת בוטנים")) {
            textView11.setText("כוס חמאת בוטנים שווה 250 גרם");
            textView22.setText("כף חמאת בוטנים שווה 15 גרם");
            textView33.setText("");
            textView44.setText("");
            textView55.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
        }

        if(str.equals("אספרסו")) {
            textView11.setText("כף אספרסו שווה 15 מל");
            textView22.setText("");
            textView33.setText("");
            textView44.setText("");
            textView55.setText("");
        }

        if(str.equals("טחינה גולמית")) {
            textView11.setText("כוס טחינה גולמית שווה 240 גרם");
            textView22.setText("כף טחינה גולמית 15 גרם");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if(str.equals("חלב מרוכז ממותק")) {
            textView11.setText("פחית חלב מרוכז שווה 40 מל");
            textView22.setText("כוס חלב מרוכז שווה 240 מל");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if(str.equals("חלב קוקוס")) {
            textView11.setText("פחית חלב קוקוס שווה 400 מל");
            textView22.setText("כוס חלב קוקוס שווה 240 מל");
            textView33.setText("");
            textView44.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView55.setText("");
        }

        if(str.equals("אינסטנט פודינג")) {
            textView11.setText("חבילה אינסטנט פודינג שווה 80 גרם");
            textView22.setText("כף אינסטנט פודינג שווה 15 גרם");
            textView33.setText("");
            textView44.setText("");
            textView55.setText("");
        }




    }

}

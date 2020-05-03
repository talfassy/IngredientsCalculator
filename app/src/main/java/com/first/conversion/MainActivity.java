package com.first.conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.muddzdev.styleabletoast.StyleableToast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView textView_search;
    private AutoCompleteTextView autoCompleteTextView;
    private ImageView searchImage;
    private ImageView productsImage;
    private ImageView convImage;
    private TextView productText;

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private Button productsBtn;
    private List<Product_item> productList;


    private long mLastClickTime_productImage = 0;
    private long mLastClickTime_productText = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchImage = findViewById(R.id.searchImageView);
        productsImage = findViewById(R.id.productImageView);
        convImage = findViewById(R.id.convImageView);
        productText = findViewById(R.id.productTextView);

        autoCompleteTextView = findViewById(R.id.complete);

        textView1 =findViewById(R.id.text_view1);
        textView2 =findViewById(R.id.text_view2);
        textView3 =findViewById(R.id.text_view3);
        textView4 = findViewById(R.id.text_view4);
        textView5 = findViewById(R.id.text_view5);


        searchImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                autoCompleteTextView.setVisibility(View.VISIBLE);
            }
        });


        String prodcuts[] = getResources().getStringArray(R.array.products);
        AutoCompleteTextView editText = findViewById(R.id.complete);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, prodcuts);
        editText.setAdapter(adapter);
        editText.setThreshold(1);

        editText.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View arg1, int position, long arg3) {
                Object item = parent.getItemAtPosition(position);
             //   textView1.setText(item.toString());
                setValuesFun(item.toString());
                }

        });


        productsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //handle multiple clicks
                if ((SystemClock.elapsedRealtime() - mLastClickTime_productImage < 4000) && (SystemClock.elapsedRealtime() - mLastClickTime_productText < 4000) ){
                    return;
                }
                else {
                    mLastClickTime_productImage = SystemClock.elapsedRealtime();
                    openProductsActivity();
                }
            }
        });
        productText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //handle multiple clicks
                if ((SystemClock.elapsedRealtime() - mLastClickTime_productText < 4000) &&(SystemClock.elapsedRealtime() - mLastClickTime_productImage < 3000) ){
                    return;
                }
                else {
                    mLastClickTime_productText = SystemClock.elapsedRealtime();
                    openProductsActivity();
                }
            }
        });


        convImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConvActivity();
            }


        });


    }



    private void openConvActivity() {
        Intent in = new Intent(this, ConvActivity.class);
        startActivity(in);

    }

    private void setValuesFun(String str){

        if(str.equals("אבקת אפייה")){
            textView1.setText("שקית אבקת אפייה שווה ל10 גרם");
            textView2.setText("כף אבקת אפייה שווה כ-7 גרם");
            textView3.setText("כפית אבקת אפיה שווה ל4 גרם - חצי שקית");
            textView4.setText("");
            textView5.setText("");

        }


        if (str.equals("קמח לבן")){
            textView1.setText("כוס קמח שווה כ-140 גרם קמח");
            textView2.setText("כף קמח שווה כ-10 גרם");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if (str.equals("קמח מלא")){
            textView1.setText("כוס קמח שווה כ-125 גרם קמח");
            textView2.setText("כף קמח שווה 8 גרם");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if(str.equals("יוגורט")){
            textView1.setText("גביע יוגורט שווה 200 גרם");
            textView2.setText("");
            textView3.setText("");
            textView4.setText("");
            textView5.setText("");
        }


        if (str.equals("אבקת סוכר")){
            textView1.setText("כוס אבקת סוכר שווה כ-120 גרם");
            textView2.setText("כף אבקת סוכר שווה כ-10 גרם");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if(str.equals("אגוזים טחונים")){
            textView1.setText("כוס אגוזים טחונים שווה כ-90 גרם");
            textView2.setText("כף אגוזים טחונים שווה כ-10 גרם");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }


        if (str.equals("ביצה")){
            textView1.setText("ביצה S שווה כ-50 גרם");
            textView2.setText("ביצה M שווה כ-60 גרם");
            textView3.setText("ביצה L שווה כ-70 גרם");
            textView4.setText("ביצה XL שווה כ-80 גרם");
            textView5.setText("");
        }

        if(str.equals("גלטין")){
            textView1.setText("שקית ג’לטין שווה 14 גרם");
            textView2.setText("כפית ג'לטין שווה 4 גרם");
            textView3.setText("");
            textView4.setText("");
            textView5.setText("");
        }

        if(str.equals("דבש")){
            textView1.setText("כוס דבש שווה 350 גרם");
            textView2.setText("כף דבש שווה 20 גרם");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if(str.equals("חלב")){
            textView1.setText("כוס חלב שווה 240 מל");
            textView2.setText("כף חלב שווה 15 מל");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("מידות זהות עבור חלב סויה/ חלב שקדים/ חלב אורז וחלב שיבולת שועל");
        }

        if(str.equals("סודה לשתייה")){
            textView1.setText("כפית סודה לשתייה שווה 5 גרם");
            textView2.setText("");
            textView3.setText("");
            textView4.setText("");
            textView5.setText("");
        }

        if(str.equals("מלח")){
            textView1.setText("כף מלח שווה 20 גרם");
            textView2.setText("כפית מלח שווה 7 גרם");
            textView3.setText("");
            textView4.setText("");
            textView5.setText("");
        }

        if(str.equals("סוכר חום")) {
            textView1.setText("כוס סוכר חום שווה 240 גרם");
            textView2.setText("כף סוכר חום שווה 15 גרם");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if(str.equals("סוכר לבן")) {
            textView1.setText("כוס סוכר לבן שווה 200 גרם");
            textView2.setText("כף סוכר לבן שווה 10 גרם");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if(str.equals("סילאן")) {
            textView1.setText("כוס סילאן שווה 350 גרם");
            textView2.setText("כף סילאן שווה 20ג גרם");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if(str.equals("פרג")) {
            textView1.setText("כוס פרג שווה 80 גרם");
            textView2.setText("כף פרג שווה 10 גרם");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if(str.equals("קונפלור")) {
            textView1.setText("כוס קונפלור שווה 140 גרם");
            textView2.setText("כף קונפלור שווה 12 גרם");
            textView3.setText("כפית קונפלור שווה 5 גרם");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if(str.equals("קקאו")) {
            textView1.setText("כוס קקאו שווה 140 גרם");
            textView2.setText("כף קקאו שווה 12 גרם");
            textView3.setText("כפית קקאו שווה 5 גרם");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if(str.equals("מים")) {
            textView1.setText("כוס מים שווה 240 מל");
            textView2.setText("כף מים שווה 15 מל");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if(str.equals("מיץ תפוזים")) {
            textView1.setText("כוס מיץ תפוזים שווה 240 מל");
            textView2.setText("");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if(str.equals("קינמון")) {
            textView1.setText("כף קינמון שווה 10 גרם");
            textView2.setText("כפית קינמון שווה 5 גרם");
            textView3.setText("");
            textView4.setText("");
            textView5.setText("");
        }

        if(str.equals("שיבולת שועל")) {
            textView1.setText("כוס שיבולת שועל שווה 100 גרם");
            textView2.setText("כף שיבולת שועל שווה 15 גרם");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if(str.equals("קוקוס טחון")) {
            textView1.setText("כוס קוקוס שווה 100 גרם");
            textView2.setText("כף קוקוס שווה 10 גרם");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if(str.equals("מייפל")) {
            textView1.setText("כוס מייפל שווה 240 גרם");
            textView2.setText("");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if(str.equals("שמרים יבשים")) {
            textView1.setText("כף שמרים יבשים שווים 10 גרם");
            textView2.setText("כפית שמרים יבשים שווה 4 גרם");
            textView3.setText("");
            textView4.setText("");
            textView5.setText("** המרה לשמרים טריים ניתן לראות בלשונית המרות");
        }

        if(str.equals("שמנת חמוצה")) {
            textView1.setText("מיכל שמנת חמוצה שווה 200 מל");
            textView2.setText("");
            textView3.setText("");
            textView4.setText("");
            textView5.setText("");
        }

        if(str.equals("שמן")) {
            textView1.setText("כוס שמן שווה 200 מל");
            textView2.setText("");
            textView3.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView4.setText("");
            textView5.setText("מידות זהות עבור שמן קנולה/ שמן קוקוס/ שמן זית או כל שמן צמחי אחר");
        }

        if(str.equals("ממרח נוטלה")) {
            textView1.setText("כוס נוטלה שווה 280 גרם");
            textView2.setText("כף נוטלה שווה 20 גרם");
            textView3.setText("");
            textView4.setText("");
            textView5.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
        }

        if(str.equals("ממרח חמאת בוטנים")) {
            textView1.setText("כוס חמאת בוטנים שווה 250 גרם");
            textView2.setText("כף חמאת בוטנים שווה 15 גרם");
            textView3.setText("");
            textView4.setText("");
            textView5.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
        }

        if(str.equals("אספרסו")) {
            textView1.setText("כף אספרסו שווה 15 מל");
            textView2.setText("");
            textView3.setText("");
            textView4.setText("");
            textView5.setText("");
        }

        if(str.equals("טחינה גולמית")) {
            textView1.setText("כוס טחינה גולמית שווה 240 גרם");
            textView2.setText("כף טחינה גולמית 15 גרם");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if(str.equals("חלב מרוכז ממותק")) {
            textView1.setText("פחית חלב מרוכז שווה 40 מל");
            textView2.setText("כוס חלב מרוכז שווה 240 מל");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if(str.equals("חלב קוקוס")) {
            textView1.setText("פחית חלב קוקוס שווה 400 מל");
            textView2.setText("כוס חלב קוקוס שווה 240 מל");
            textView3.setText("");
            textView4.setText("**כוס מדידה- כוס חד פעמית שתייה חמה או כוס זכוכית בגודל דומה");
            textView5.setText("");
        }

        if(str.equals("אינסטנט פודינג")) {
            textView1.setText("חבילה אינסטנט פודינג שווה 80 גרם");
            textView2.setText("כף אינסטנט פודינג שווה 15 גרם");
            textView3.setText("");
            textView4.setText("");
            textView5.setText("");
        }




    }
/*
    private void inputValidation(String str) {
        if (!(str.equals("אינסטנט פודינג")) && !(str.equals("חלב קוקוס")) && !(str.equals("חלב מרוכז ממותק")) && !(str.equals("טחינה גולמית"))
        && !(str.equals("טחינה גולמית")) && !(str.equals("אספרסו")) && !(str.equals("ממרח חמאת בוטנים")) && !(str.equals("ממרח נוטלה")) &&
        !(str.equals("שמן")) && !(str.equals("שמנת חמוצה")) && !(str.equals("שמרים יבשים")) && !(str.equals("מיץ תפוזים")) && !(str.equals("מים"))
                && !(str.equals("מייפל")) && !(str.equals("שבבי קוקוס")) && !(str.equals("שיבולת שועל")) && !(str.equals("קינמון"))
                && !(str.equals("קקאו")) && !(str.equals("קונפלור")) && !(str.equals("פרג")) && !(str.equals("סילאן")) && !(str.equals("סוכר לבן"))
                && !(str.equals("סוכר חום")) && !(str.equals("קמח")) && !(str.equals("מלח")) && !(str.equals("סודה לשתייה")) && !(str.equals("חלב"))
                && !(str.equals("דבש")) && !(str.equals("גלטין")) && !(str.equals("אגוזים טחונים")) && !(str.equals("ביצה")) && !(str.equals("אבקת סוכר"))
                && !(str.equals("יוגורט")) && !(str.equals("אבקת אפייה")))
        {
            textView1.setText("הזנת מוצר שלא קיים ברשימה/ לא תקין");
            textView2.setText("אנא נסה שוב בבקשה");
            textView3.setText("");
            textView4.setText("");
        }


    }*/

    private void openProductsActivity() {

        Intent in = new Intent(this, productsActivity.class);
        startActivity(in);

    }
}

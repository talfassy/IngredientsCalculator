package com.first.conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;

public class ConvActivity extends AppCompatActivity {

    private AutoCompleteTextView autoCompleteTextView;
    private ImageView searchImage;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;

    private long mLastClickTime_SearchtImage = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conv);

        autoCompleteTextView = findViewById(R.id.complete2);
        searchImage = findViewById(R.id.searchImageView2);

        textView1 =findViewById(R.id.text_view111);
        textView2 =findViewById(R.id.text_view222);
        textView3 =findViewById(R.id.text_view333);
        textView4 = findViewById(R.id.text_view444);

        searchImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    //handle multiple clicks
                    if ((SystemClock.elapsedRealtime() - mLastClickTime_SearchtImage < 4000) && (SystemClock.elapsedRealtime() - mLastClickTime_SearchtImage < 4000) ){
                        return;
                    }
                    else {
                        mLastClickTime_SearchtImage = SystemClock.elapsedRealtime();
                        autoCompleteTextView.setVisibility(View.VISIBLE);
                    }

            }

        });




        String convprodcuts[] = getResources().getStringArray(R.array.convproduct);
        AutoCompleteTextView editText = findViewById(R.id.complete2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, convprodcuts);
        editText.setAdapter(adapter);
        editText.setThreshold(1);
        editText.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View arg1, int position, long arg3) {
                Object item = parent.getItemAtPosition(position);
                //   textView1.setText(item.toString());
                convFunc(item.toString());
            }

        });

    }

    private void convFunc(String str){

        if(str.equals("ביצה")){
            textView1.setText("ביצה 1 = חצי בננה מעוכה + רבע כפית אבקת אפיה");
            textView2.setText("1 ביצה = רבע כוס רסק תפוחים לא תוספת סוכר ");
            textView3.setText("11 ביצה =  כף זרעי צ'יה טחונים + 3 כפות מים ( לערבב ולהכניס להתייצות למקרר לפחות לשעתיים)");
            textView4.setText("1 ביצה = חצי כוס גרגירי חומוס ");
        }

        if(str.equals("חלב")){
            textView1.setText("כוס חלב פרה = כוס תחליפי חלב ( חלב סויה/ שיבולת שועל/ אורז");
            textView2.setText("כוס חלב = כוס חלב קוקוס עם 6-14% שומן");
            textView3.setText("אם מדובר בעוגה בחושה אפשר להמיר כוס חלב בכוס מים)");
            textView4.setText("יש לשים לב שלתחליפי חלב יש טעמי לוואי ולכן יש להתאים את התחליף בהתאם לעוגה שלכם");
        }

        if(str.equals("חמאה")){
            textView1.setText("100 גרם חמאה = 75 גרם שמן קוקוס או חמאת קוקוס");
            textView2.setText("אם במתכון רשום חמאה קרה יש להשתמש בשמן קוקוס קר מהמקרר");
            textView3.setText("אם במתכון רשום חמאה רכה יש להשתמש בשמן קוקוס בטמפ' חדר");
            textView4.setText("אם במתכון רשום חמאה מומסת יש להשתמש בשמן קוקוס מומס או לחילופין בכל שמן צמחי (75 גרם למאה גרם חמאה) ");
        }

        if(str.equals("סוכר")){
            textView1.setText("כוס סוכר = 3/4 כוס של דבש או מייפל טבעי");
            textView2.setText("כוס סוכר = כוס סילאן טבעי ");
            textView3.setText("כוס סוכר לבן = כוס של סוכר קוקוס");
            textView4.setText("2 כפיות מלאות רכז תפוחים טבעי = כפית סוכר. ");
        }


        if(str.equals("קמח")){
            textView1.setText("כוס קמח = כוס שקדים טחונים");
            textView2.setText("כוס קמח = כוס זרעי פשתן טחונים דק");
            textView3.setText("כוס קמח = כוס שיבולת שועל טחונה דק");
            textView4.setText("");
        }


        if(str.equals("קמח תופח")){
            textView1.setText("כוס קמח תופח = כוס קמח רגיל + כפית אבקת אפייה");
            textView2.setText("");
            textView3.setText("");
            textView4.setText("");
        }

        if(str.equals("שמן")){
            textView1.setText("כוס שמן ניתן להמיר ב3/4 כוס רסק תפוחים+ רבע כפית סודה לשתייה ורבע כוס שמן");
            textView2.setText("");
            textView3.setText("");
            textView4.setText("");
        }


        if(str.equals("שמנת חמוצה")){
            textView1.setText("גביע שמנת חמוצה = 200 גרם חלב קוקוס");
            textView2.setText("");
            textView3.setText("");
            textView4.setText("");
        }


        if(str.equals("שמנת מתוקה")){
            textView1.setText("להקצפה - במקום 250 מל שמנת מתוקה ניתן להשתמש ב- 250 מל קרם קוקוס קר. (רק בחלק השומני המוקשה ללא הנוזלים)");
            textView2.setText("שימוש כללי בשמנת - ניתן להשתמש במקום בגביע שמנת מתוקה ב-250 מל קרם קוקוס במצבו הרגיל");
            textView3.setText("");
            textView4.setText("");
        }


        if(str.equals("שמרים יבשים")){
            textView1.setText("2 כפות שמרים יבשים = 50 גרם שמרים טריים (שקית)");
            textView2.setText("");
            textView3.setText("");
            textView4.setText("");
        }
    }
}

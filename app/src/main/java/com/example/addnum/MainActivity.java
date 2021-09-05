package com.example.addnum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private Button button;
   private TextView textView;
   private EditText editText1;
   private EditText editText2;
   private LinearLayout linearLayout;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        editText1 = findViewById(R.id.editTextNumber);
       editText2 = findViewById(R.id.editTextNumber2);

       InputMethodManager imm = (InputMethodManager)getSystemService(
               Context.INPUT_METHOD_SERVICE);
       imm.hideSoftInputFromWindow(editText1.getWindowToken(), 0);

       InputMethodManager imn = (InputMethodManager)getSystemService(
               Context.INPUT_METHOD_SERVICE);
       imn.hideSoftInputFromWindow(editText2.getWindowToken(), 0);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String s = editText1.getText().toString();
               String p = editText2.getText().toString();

               int r = Integer.parseInt(s);
               int t = Integer.parseInt(p);

               int sum = r+t;
               textView.setText("sum is"+sum);

           }
       });
    }
}
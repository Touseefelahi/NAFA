package com.example.touseefelahi.nafa;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        float amount=0.0f;
        try {
            amount=( Float.parseFloat(textboxAmount.getText().toString()));
            amount=amount*1.2f;
        }
        catch (Exception ex){
            TextView textboxOutcome=(TextView) findViewById(R.id.textboxOutcome);
            textboxAmount.setText("");
            return;
        }

        TextView textboxOutcome=(TextView) findViewById(R.id.textboxOutcome);
        textboxOutcome.setText(Float.toString(amount)+ " RS");
    }

    TextView textboxAmount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        Button buttonCalculate=(Button) findViewById(R.id.buttonCalculate);
        textboxAmount=(TextView) findViewById(R.id.textboxAmount);


        buttonCalculate.setOnClickListener(new Button.OnClickListener(){
           public void onClick(View v){
               updateOutcome();
           }
        });
    }

    void updateOutcome(){
        float amount=0.0f;
        try {
            amount=( Float.parseFloat(textboxAmount.getText().toString()));
            amount=amount*1.2f;
        }
        catch (Exception ex){
            TextView textboxOutcome=(TextView) findViewById(R.id.textboxOutcome);
            textboxOutcome.setText("Enter Valid Value");
            return;
        }

        TextView textboxOutcome=(TextView) findViewById(R.id.textboxOutcome);
        textboxOutcome.setText(Float.toString(amount)+ " RS");
    }
}

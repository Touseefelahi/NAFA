package com.example.touseefelahi.nafa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Button;
public class welcomeScreen extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome_screen);

        Button textViewRetirementCalc=(Button) findViewById(R.id.labelRetirement);
        Button textViewTaxRebate=(Button) findViewById(R.id.labelTaxRebate);
        Button textViewFuture=(Button)findViewById(R.id.labelFutureValue);
        Button textViewPeriodic=(Button)findViewById(R.id.labelPeriodicPayment);
        Button textViewPresent=(Button)findViewById(R.id.labelPresentValue);
        Button textViewVPS=(Button)findViewById(R.id.labelVPS);
        Button textViewRetirement=(Button)findViewById(R.id.labelRetirement);

        textViewFuture.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                onClickFutureValue(view);
            }
        });

        textViewPeriodic.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                onClickPeriodicPayment(view);
            }
        });

        textViewTaxRebate.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                onClickTaxRebate(view);
            }
        });

        textViewPresent.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                onClickPresentValue(view);
            }
        });
        textViewVPS.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                onClickVPSSimulator(view);
            }
        });

        textViewRetirement.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                onClickRetirement(view);
            }
        });

    }



    protected void onClickRetirement(View view){
        Intent i= new Intent(this,retirementCalculator.class);
        startActivity(i);
    }

    protected void onClickTaxRebate(View view){
        Intent i= new Intent(this,taxRebateActivity.class);
        startActivity(i);
    }

    protected void onClickPeriodicPayment(View view){
        Intent i= new Intent(this,periodicPayment.class);
        startActivity(i);
    }

    protected void onClickFutureValue(View view){
        Intent i= new Intent(this, futureValueActivity.class);
        startActivity(i);
    }

    protected void onClickPresentValue(View view){
        Intent i= new Intent(this, presentActivity.class);
        startActivity(i);
    }

    protected void onClickVPSSimulator(View view){
        Intent i= new Intent(this, vpsSimulator.class);
        startActivity(i);
    }

}

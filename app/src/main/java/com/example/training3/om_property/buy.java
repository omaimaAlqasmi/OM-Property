package com.example.training3.om_property;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.training3.om_property.R.color.icons;

public class buy extends AppCompatActivity {
    private boolean isButtonClicked = false;
    Button btnflat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);


    }

    public void onFlat(View v) {
        boolean isButtonClicked = false;
        if (v.getId() == R.id.btnFlat_Buy) {
            isButtonClicked = !isButtonClicked; // toggle the boolean flag
            v.setBackgroundResource(isButtonClicked ? R.drawable.btn_on : R.drawable.btn_off);
        }
    }

    public void onHostel(View v) {
        boolean isButtonClicked = false;
        if (v.getId() == R.id.btnHostel_Buy) {
            isButtonClicked = !isButtonClicked; // toggle the boolean flag
            v.setBackgroundResource(isButtonClicked ? R.drawable.btn_on : R.drawable.btn_off);
        }

    }

    public void onShops(View v) {
        boolean isButtonClicked = false;
        if (v.getId() == R.id.btnShops_Buy) {
            isButtonClicked = !isButtonClicked; // toggle the boolean flag
            v.setBackgroundResource(isButtonClicked ? R.drawable.btn_on : R.drawable.btn_off);
        }

    }

    public void onLand(View v) {
        boolean isButtonClicked = false;
        if (v.getId() == R.id.btnLand_Buy) {
            isButtonClicked = !isButtonClicked; // toggle the boolean flag
            v.setBackgroundResource(isButtonClicked ? R.drawable.btn_on : R.drawable.btn_off);
        }

    }
    public void onHouse(View v) {
        boolean isButtonClicked = false;
        if (v.getId() == R.id.btnHouse_buy) {
            isButtonClicked = !isButtonClicked; // toggle the boolean flag
            v.setBackgroundResource(isButtonClicked ? R.drawable.btn_on : R.drawable.btn_off);
        }

    }
    public void onRone(View v) {
        boolean isButtonClicked = false;
        if (v.getId() == R.id.btnNo1_buy) {
            isButtonClicked = !isButtonClicked; // toggle the boolean flag
            v.setBackgroundResource(isButtonClicked ? R.drawable.btn_on : R.drawable.btn_off);
        }

    }

    public void onRtwo(View v) {
        boolean isButtonClicked = false;
        if (v.getId() == R.id.btnNo2_buy) {
            isButtonClicked = !isButtonClicked; // toggle the boolean flag
            v.setBackgroundResource(isButtonClicked ? R.drawable.btn_on : R.drawable.btn_off);
        }

    }
    public void onRthree(View v) {
        boolean isButtonClicked = false;
        if (v.getId() == R.id.btnNo3_buy) {
            isButtonClicked = !isButtonClicked; // toggle the boolean flag
            v.setBackgroundResource(isButtonClicked ? R.drawable.btn_on : R.drawable.btn_off);
        }

    }

    public void onRfour(View v) {
        boolean isButtonClicked = false;
        if (v.getId() == R.id.btnNo4_buy) {
            isButtonClicked = !isButtonClicked; // toggle the boolean flag
            v.setBackgroundResource(isButtonClicked ? R.drawable.btn_on : R.drawable.btn_off);
        }

    }

    public void onRfive(View v) {
        boolean isButtonClicked = false;
        if (v.getId() == R.id.btnNo5_buy) {
            isButtonClicked = !isButtonClicked; // toggle the boolean flag
            v.setBackgroundResource(isButtonClicked ? R.drawable.btn_on : R.drawable.btn_off);
        }

    }
    public void onSearch(View v){
        Intent buy_prop=new Intent(buy.this,BuyDropDetails.class);
        startActivity(buy_prop);
    }
}
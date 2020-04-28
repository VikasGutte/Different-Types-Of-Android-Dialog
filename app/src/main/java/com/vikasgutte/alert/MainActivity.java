package com.vikasgutte.alert;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView show_alert, custom_alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show_alert = findViewById(R.id.text);
        custom_alert = findViewById(R.id.custom_alert);

        custom_alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowCustomAlert();
            }
        });

        show_alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowAlert();
            }
        });
    }

    @SuppressLint("ResourceAsColor")
    private void ShowCustomAlert() {
        TextView title = new TextView(this);
        title.setText(R.string.Custom_alert);
        title.setTextColor(R.color.title);
        title.setPadding(20, 20, 20, 20);
        title.setGravity(Gravity.CENTER);
        title.setBackgroundColor(R.color.white);
        title.setTextSize(20);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);//this is activity
        builder.setMessage(R.string.show_alert)
                .setCustomTitle(title)
                .setPositiveButton(R.string.show, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        show_alert.setText("Alert Showed");
                    }
                }).setNegativeButton(R.string.dont, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                show_alert.setText("Alert Not Showed");
            }
        }).show();

    }

    public void ShowAlert() {
        //Use Builder for dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(this);//this is activity
        builder.setMessage(R.string.show_alert)
                .setPositiveButton(R.string.show, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        show_alert.setText("Alert Showed");
                    }
                }).setNegativeButton(R.string.dont, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                show_alert.setText("Alert Not Showed");
            }
        }).show();
    }
}

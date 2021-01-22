package com.example.mykvestjava;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button_olya = findViewById(R.id.button_olya);

        button_olya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
                builder.setTitle("Правильно!!!")
                        .setMessage("Оля и есть пятая дочь, это говорится в первой строчке")
                        .setCancelable(false)
                        .setPositiveButton("Дальше",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();

                                        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                                        startActivity(intent);
                                    }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }

    public void fail(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
        builder.setTitle("Ошибка!!!")
                .setMessage("Подумай и ответь снова")
                .setCancelable(false)
                .setPositiveButton("В начало",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();

                                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                                startActivity(intent);
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
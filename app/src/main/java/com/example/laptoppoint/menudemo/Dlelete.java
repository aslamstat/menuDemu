package com.example.laptoppoint.menudemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Dlelete extends AppCompatActivity {
    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dlelete);
        editText=(EditText)findViewById(R.id.lit);
        button=(Button)findViewById(R.id.save);
        save();

    }
    public  void save()
    {
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                String name=editText.getText().toString();
                intent.putExtra("name",name);
                setResult(RESULT_OK,intent);
                finish();

            }
        });
    }
}
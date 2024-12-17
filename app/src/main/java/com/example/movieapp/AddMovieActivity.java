package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddMovieActivity extends AppCompatActivity {

    Button b1,b2;
    EditText et1,et2,et3,et4,et5,et6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_movie);

        b1=(Button) findViewById(R.id.submitbutt);
        b2=(Button) findViewById(R.id.backtobutt);
        et1=(EditText) findViewById(R.id.namebutt);
        et2=(EditText) findViewById(R.id.langbutt);
        et3=(EditText) findViewById(R.id.directorbutt);
        et4=(EditText) findViewById(R.id.actorbutt);
        et5=(EditText) findViewById(R.id.actressbutt);
        et6=(EditText) findViewById(R.id.yearbutt);


      b1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String getName=et1.getText().toString();
              String getLang=et2.getText().toString();
              String getDir=et3.getText().toString();
              String getActor=et4.getText().toString();
              String getActress=et5.getText().toString();
              String getYear=et6.getText().toString();

              Toast.makeText(getApplicationContext(),"Movie Added",Toast.LENGTH_LONG).show();
          }
      });
      b2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent ob=new Intent(getApplication(), DashboardActivity.class);
              startActivity(ob);
          }
      });

    }
}
package com.dipak.topic3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spin;
    EditText country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin=findViewById(R.id.spinner);

        String countries[]={"Nepal","China","India","London","USA","Afghanistan"};
        ArrayAdapter adapter=new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                countries
        );
       spin.setAdapter(adapter);


       spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(MainActivity.this,spin.getSelectedItem().toString(),Toast.LENGTH_LONG).show();
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });
    }
}

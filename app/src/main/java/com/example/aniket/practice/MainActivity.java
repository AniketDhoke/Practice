package com.example.aniket.practice;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    ArrayAdapter<String> arrayAdapter;
    ArrayList<String> arrayList;
    ListView listView;
    Button button;
    EditText editText;
    String countries;

    int j = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        getListViewItem();

        listView = findViewById(R.id.listView);
        button = findViewById(R.id.btnAppend);
        editText = findViewById(R.id.editText);

        arrayList = new ArrayList<>();
        arrayList.add("India");
        arrayList.add("USA");
        arrayList.add("UK");

        arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countries = editText.getText().toString();

                if (!countries.isEmpty()) {
                    arrayList.add(countries);

                    arrayAdapter.notifyDataSetChanged();

                } else {
                    Toast.makeText(MainActivity.this,"Please enter country name",Toast.LENGTH_SHORT).show();
                }
                    editText.setText("");
            }

        });

    }

    public void getListViewItem()
    {
        for (int i = 0; i < arrayList.size(); i++)
        {
            int j;
            if (countries.equals(arrayList.get(i))){
                j = 0;
                j++;
                Log.i("j = ",j+"");
            }
        }
    }
}

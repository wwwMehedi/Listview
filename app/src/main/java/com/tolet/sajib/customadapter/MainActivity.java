package com.tolet.sajib.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.tolet.sajib.customadapter.adapter.CustomAdapter;

public class MainActivity extends AppCompatActivity {

        private ListView listView;
        private TextView textView;
    private int []flags={R.drawable.bdicon,R.drawable.indicon,R.drawable.nepal,
            R.drawable.mayanmar,R.drawable.srilanka,R.drawable.canada,
            R.drawable.souticon,R.drawable.vutan,R.drawable.usa};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listid);
        textView=findViewById(R.id.textviewid);
        final String[] countryname=getResources().getStringArray(R.array.countrynames);
   CustomAdapter customAdapter=new CustomAdapter(this,countryname,flags);
   listView.setAdapter(customAdapter);
   listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
       @Override
       public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           Toast.makeText(MainActivity.this, ""+position, Toast.LENGTH_SHORT).show();
       }
   });

    }
}

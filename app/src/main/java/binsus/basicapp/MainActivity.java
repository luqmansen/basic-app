package binsus.basicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String[] nameArray = {"Java", "Python", "Golang", "C++"};

    String[] infoArray = {
            " platform independence, which means that Java programs can be run on many different types of computers",
            "Python is great for backend web development, data analysis, artificial intelligence, and scientific computing.",
            "GoLang great at concurrency and as it was designed for server software",
            "intensive functions of CPU and to provide control over hardware, and this language is very fast"};

    Integer[] imageArray = {
            R.drawable.java,
            R.drawable.python,
            R.drawable.golang,
            R.drawable.cpp};

    ListView listView;
    Button btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbout = findViewById(R.id.about);
        btnAbout.setOnClickListener(this);

        CustomListAdapter adapter = new CustomListAdapter(this,nameArray, infoArray, imageArray);

        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, detail.class);
                String title = nameArray[position];
                String info = infoArray[position];
                Integer gambar = imageArray[position];
                Integer posisi = position;
                intent.putExtra("judul", title);
                intent.putExtra("keterangan", info);
                intent.putExtra("gambar",gambar);
                intent.putExtra("posisi", posisi);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.about:
                Intent moveIntent = new Intent(MainActivity.this, About_activity.class);
                startActivity(moveIntent);
                break;
        }
    }
}

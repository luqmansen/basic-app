package binsus.basicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter adapter = new CustomListAdapter(this,nameArray, infoArray, imageArray);

        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(adapter);
    }
}

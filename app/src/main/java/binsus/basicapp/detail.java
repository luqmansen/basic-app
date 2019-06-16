package binsus.basicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String savedExtra = getIntent().getStringExtra("Programming Language");
        TextView myText = (TextView) findViewById(R.id.textID);
        myText.setText(savedExtra);
    }
}

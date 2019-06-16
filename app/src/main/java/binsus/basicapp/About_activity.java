package binsus.basicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class About_activity extends AppCompatActivity {

    String[] stringDetail = {"Luqman Setyo Nugroho",
                            "Universitas Diponegoro",
                            "luqmansen.me",
                            "github.com/luqmansen"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_activity);

        TextView AboutTitle = (TextView) findViewById(R.id.aboutTitle);
        AboutTitle.setText("About This App");

        TextView NameAbout = (TextView) findViewById(R.id.nameAbout);
        NameAbout.setText(stringDetail[0]);

        TextView uniAbout = (TextView) findViewById(R.id.UniAbout);
        uniAbout.setText(stringDetail[1]);

        TextView webAbout = (TextView) findViewById(R.id.websiteAbout);
        webAbout.setText(stringDetail[2]);

        TextView githubAbout = (TextView) findViewById(R.id.githubAbout);
        githubAbout.setText(stringDetail[3]);
    }
}

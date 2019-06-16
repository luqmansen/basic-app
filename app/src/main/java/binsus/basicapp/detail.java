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

        String judulExtra = getIntent().getStringExtra("judul");
        TextView judul = (TextView) findViewById(R.id.textID);

        String keteranganExtra = getIntent().getStringExtra("keterangan");
        TextView keterangan = (TextView) findViewById(R.id.infoID);

        judul.setText(judulExtra);
        keterangan.setText(keteranganExtra);
    }
}

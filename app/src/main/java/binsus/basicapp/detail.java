package binsus.basicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
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

        Integer gambarExtra = getIntent().getIntExtra("gambar", 0);
        ImageView gambar = (ImageView) findViewById(R.id.imageViewID);

        judul.setText(judulExtra);
        keterangan.setText(keteranganExtra);
        gambar.setImageResource(gambarExtra);
    }
}

package binsus.basicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class detail extends AppCompatActivity {
    String[] infoArrayDetail = {
            "Java is a general-purpose programming language that is class-based, object-oriented (although not a pure OO language, as it contains primitive types), and designed to have as few implementation dependencies as possible. It is intended to let application developers write once, run anywhere (WORA),meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but it has fewer low-level facilities than either of them. As of 2018, Java was one of the most popular programming languages in use according to GitHub, particularly for client-server web applications, with a reported 9 million developers.",
            "Python is an interpreted, high-level, general-purpose programming language. Created by Guido van Rossum and first released in 1991, Python's design philosophy emphasizes code readability with its notable use of significant whitespace. Its language constructs and object-oriented approach aims to help programmers write clear, logical code for small and large-scale projects.",
            "Go, also known as Golang, is a statically typed, compiled programming language designed at Google by Robert Griesemer, Rob Pike, and Ken Thompson. Go is syntactically similar to C, but with memory safety, garbage collection, structural typing, and CSP-style concurrency.",
            "C++ (/ˌsiːˌplʌsˈplʌs/) is a general-purpose programming language created by Bjarne Stroustrup as an extension of the C programming language, or \"C with Classes\". The language has expanded significantly over time, and modern C++ has object-oriented, generic, and functional features in addition to facilities for low-level memory manipulation. It is almost always implemented as a compiled language, and many vendors provide C++ compilers, including the Free Software Foundation, LLVM, Microsoft, Intel, and IBM, so it is available on many platforms."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String judulExtra = getIntent().getStringExtra("judul");
        TextView judul = (TextView) findViewById(R.id.textID);

        //String keteranganExtra = getIntent().getStringExtra("keterangan");
        //TextView keterangan = (TextView) findViewById(R.id.infoID);

        Integer gambarExtra = getIntent().getIntExtra("gambar", 0);
        ImageView gambar = (ImageView) findViewById(R.id.imageViewID);

        Integer posisiExtra = getIntent().getIntExtra("posisi", 0);
        TextView keterangan = (TextView) findViewById(R.id.infoID);

        judul.setText(judulExtra);
        keterangan.setText(infoArrayDetail[posisiExtra]);
        gambar.setImageResource(gambarExtra);
    }
}

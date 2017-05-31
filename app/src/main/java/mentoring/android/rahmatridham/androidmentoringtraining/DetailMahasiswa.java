package mentoring.android.rahmatridham.androidmentoringtraining;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMahasiswa extends AppCompatActivity {
    ImageView gambarOrang, nelpon, sms;
    TextView nama, nim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_mahasiswa);

        gambarOrang = (ImageView) findViewById(R.id.imageViewGambar);
        nelpon = (ImageView) findViewById(R.id.imageViewNelfon);
        sms = (ImageView) findViewById(R.id.imageViewSMS);
        nama = (TextView) findViewById(R.id.textViewNama);
        nim = (TextView) findViewById(R.id.textViewNIM);

    }
}

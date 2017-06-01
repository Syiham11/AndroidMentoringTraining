package mentoring.android.rahmatridham.androidmentoringtraining;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        String nama = getIntent().getExtras().getString("nama", "kosong");
        String nim = getIntent().getExtras().getString("nim", "kosong");
        String jenisKelamin = getIntent().getExtras().getString("jenisKelamin", "kosong");
        String noTelpon = getIntent().getExtras().getString("noTelpon", "kosong");

        this.nama.setText(nama);
        this.nim.setText(nim);

        if (jenisKelamin.equals("L")) {
            this.gambarOrang.setImageResource(R.drawable.man);
        } else {
            this.gambarOrang.setImageResource(R.drawable.woman);
        }

        nelpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + getIntent().getExtras().getString("noTelpon", "081280124")));
                if (ActivityCompat.checkSelfPermission(DetailMahasiswa.this.getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(intent);
            }
        });
    }
}

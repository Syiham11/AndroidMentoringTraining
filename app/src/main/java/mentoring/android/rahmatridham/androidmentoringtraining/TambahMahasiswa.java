package mentoring.android.rahmatridham.androidmentoringtraining;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class TambahMahasiswa extends AppCompatActivity {
    EditText nama,alamat,nim,noTelp;
    RadioButton laki,cewe;
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_mahasiswa);

        nama = (EditText) findViewById(R.id.editText3Nama);
        alamat = (EditText) findViewById(R.id.editText2Alamat);
        nim = (EditText) findViewById(R.id.editText4Nim);
        noTelp = (EditText) findViewById(R.id.editText5NoTelp);
        laki = (RadioButton) findViewById(R.id.radioButton2Laki);
        cewe = (RadioButton) findViewById(R.id.radioButtonCewe);
        save = (Button) findViewById(R.id.buttonSave);
    }
}

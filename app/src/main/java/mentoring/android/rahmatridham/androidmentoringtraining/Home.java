package mentoring.android.rahmatridham.androidmentoringtraining;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Home extends AppCompatActivity {
    ListView listViewMahasiswa;
    FloatingActionButton fabTambah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listViewMahasiswa = (ListView) findViewById(R.id.listMahasiswa);
        fabTambah = (FloatingActionButton) findViewById(R.id.fabTambah);
    }


}

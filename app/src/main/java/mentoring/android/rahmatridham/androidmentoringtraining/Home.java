package mentoring.android.rahmatridham.androidmentoringtraining;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    ListView listViewMahasiswa;
    FloatingActionButton fabTambah;
    ArrayList<Mahasiswa> mahasiswaArrayList;
    ListMahasiswaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listViewMahasiswa = (ListView) findViewById(R.id.listMahasiswa);
        fabTambah = (FloatingActionButton) findViewById(R.id.fabTambah);
        mahasiswaArrayList = new ArrayList<>();
        adapter = new ListMahasiswaAdapter(mahasiswaArrayList, this);
        listViewMahasiswa.setAdapter(adapter);
        addMahasiswa();

        fabTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Kepencet", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Home.this, TambahMahasiswa.class);
                startActivity(intent);
            }
        });

        adapter.notifyDataSetChanged();
    }

    public void addMahasiswa() {
//        Mahasiswa mahasiswa1 = new Mahasiswa("ikhdar","1102353928","L","sukabirus","08123945323592");
        mahasiswaArrayList.add(new Mahasiswa("ikhdar", "1102353928", "L", "sukabirus", "08123945323592"));
        mahasiswaArrayList.add(new Mahasiswa("budi", "1102353928", "L", "sukabirus", "08123945323592"));
        mahasiswaArrayList.add(new Mahasiswa("putri", "1102353928", "P", "sukabirus", "08123945323592"));
        mahasiswaArrayList.add(new Mahasiswa("dani", "1102353928", "L", "sukabirus", "08123945323592"));
        mahasiswaArrayList.add(new Mahasiswa("aisyah", "1102353928", "P", "sukabirus", "08123945323592"));
    }

}

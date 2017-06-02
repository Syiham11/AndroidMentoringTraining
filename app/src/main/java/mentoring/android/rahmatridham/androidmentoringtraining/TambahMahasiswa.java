package mentoring.android.rahmatridham.androidmentoringtraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class TambahMahasiswa extends AppCompatActivity {
    EditText nama, alamat, nim, noTelp;
    RadioButton laki, cewe;
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

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nim.getText().toString().length()<10){
                    Toast.makeText(TambahMahasiswa.this, "Nimnya kurang dari 10 gan", Toast.LENGTH_SHORT).show();
                }else {
                    postNewMahasiswa();
                }
            }
        });
    }

    public void postNewMahasiswa() {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://api-android.herokuapp.com/mahasiswa",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
//                        Toast.makeText(ListMahasiswa.this, response, Toast.LENGTH_SHORT).show();

                        try {
                            JSONObject result = new JSONObject(response);
                            if (result.optString("status", "null").equals("success")) {
                                Toast.makeText(TambahMahasiswa.this, "Berhasil yeah", Toast.LENGTH_SHORT).show();

                                Intent intent = new Intent(TambahMahasiswa.this,Home.class);
                                startActivity(intent);
                                finish();
                            } else {
                                Toast.makeText(TambahMahasiswa.this, "Ga berhasil ditambahin", Toast.LENGTH_SHORT).show();
                            }


                        } catch (Exception e) {
                            Toast.makeText(TambahMahasiswa.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(TambahMahasiswa.this, "Gak ada internet hahaha", Toast.LENGTH_SHORT).show();
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();

                params.put("nama", nama.getText().toString());
                params.put("nim", nim.getText().toString());
                if (laki.isChecked()) {
                    params.put("jenisKelamin", "L");
                } else {
                    params.put("jenisKelamin", "P");
                }
                params.put("alamat", alamat.getText().toString());
                params.put("noTelpon", noTelp.getText().toString());
                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}

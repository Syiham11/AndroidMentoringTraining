package mentoring.android.rahmatridham.androidmentoringtraining;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rahmatridham on 6/1/2017.
 */

public class ListMahasiswaAdapter extends BaseAdapter {

    ArrayList<Mahasiswa> mahasiswaArrayList;
    Context context;

    public ListMahasiswaAdapter(ArrayList<Mahasiswa> mahasiswaArrayList, Context context) {
        this.mahasiswaArrayList = mahasiswaArrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mahasiswaArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return mahasiswaArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listrow_mahasiswa, viewGroup, false);
        }

        Mahasiswa mahasiswa = mahasiswaArrayList.get(i);

        ImageView gambar = (ImageView) view.findViewById(R.id.listGambar);
        TextView nama = (TextView) view.findViewById(R.id.listNama);
        TextView nim = (TextView) view.findViewById(R.id.listNim);

        nama.setText(mahasiswa.getNama());
        nim.setText(mahasiswa.getNim());

        if(mahasiswa.getJenisKelamin().equals("L")){
            gambar.setImageResource(R.drawable.man);
        }else {
            gambar.setImageResource(R.drawable.woman);
        }

        return view;
    }
}

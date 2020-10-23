package com.arif.foodlicious;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class DetailActivity extends AppCompatActivity {


    public static final String ex_name = "namaya";
    public static final String ex_detail = "detailnya";
    public static final String ex_tipe = "tipenya";
    public static String ex_image;
    public static String ex_namedaerah = "daerah";
    Button btnshare;
    Intent shareIntent;


    CarouselView carouselView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(4);
        carouselView.setImageListener(imageListener);
        btnshare =  findViewById(R.id.btn_share);
        btnshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sharebody ="Manfaatnya banyak terkandung dalam "+ " "+ getIntent().getStringExtra(ex_name);
                shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,"FoodLicious");
                shareIntent.putExtra(Intent.EXTRA_TEXT, sharebody);
                startActivity(Intent.createChooser(shareIntent, "Share via"));

            }
        });

        TextView nama = findViewById(R.id.nama);
        String isi_nama = getIntent().getStringExtra(ex_name);
        nama.setText(isi_nama);
//        TextView manfaat = findViewById(R.id.manfaat);
//        String isi_manfaat = getIntent().getStringExtra(ex_namedaerah);
//       manfaat.setText(isi_manfaat);
        TextView detail = findViewById(R.id.serah);
        String isi = ""+getIntent().getStringExtra(ex_detail)+"\n";
        detail.setText(isi);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            FoodData hdata = new FoodData();
            int[][] posisiImage = hdata.getFoodimages();
            int img = getIntent().getIntExtra(ex_image, 0);
            int[] gambar = {posisiImage[img][0],posisiImage[img][1], posisiImage[img][2], posisiImage[img][3]};
            imageView.setImageResource(gambar[position]);
        }
    };

   
}

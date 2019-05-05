package com.e.onlineshoppingstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView itemname,itemprice,itemdesc;
    ImageView itemimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        itemname=findViewById(R.id.itemName);
        itemprice=findViewById(R.id.itemPrice);
        itemdesc=findViewById(R.id.itemdesc);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null) {
            itemname.setText(bundle.getString("itemname"));
            itemprice.setText(bundle.getString("itemprice"));
            itemimg.setImageResource(Integer.parseInt(bundle.getString("itemimg")));
            itemdesc.setText(bundle.getString("itemdesc"));
        }
    }
}

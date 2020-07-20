package com.example.itsmesk.revaevent;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.example.itsmesk.revaevent.R;

public class DetailsActivity extends AppCompatActivity {

    TextView nameDetailTextView,descriptionDetailTextView,dateDetailTextView,categoryDetailTextView,linkDetailTextView,phoneDetailTextView, organDetailTextView;
    ImageView teacherDetailImageView;

    private void initializeWidgets(){
        nameDetailTextView= findViewById(R.id.nameDetailTextView);
        descriptionDetailTextView= findViewById(R.id.descriptionDetailTextView);
        dateDetailTextView= findViewById(R.id.dateDetailTextView);
        categoryDetailTextView= findViewById(R.id.categoryDetailTextView);
        teacherDetailImageView=findViewById(R.id.teacherDetailImageView);
        linkDetailTextView=findViewById(R.id.linkTextView);
        phoneDetailTextView=findViewById(R.id.phoneDetailTextView);
        organDetailTextView=findViewById(R.id.OrganName);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        initializeWidgets();

        //RECEIVE DATA FROM ITEMSACTIVITY VIA INTENT
        Intent i=this.getIntent();
        String name=i.getExtras().getString("NAME_KEY");
        String description=i.getExtras().getString("DESCRIPTION_KEY");
        String imageURL=i.getExtras().getString("IMAGE_KEY");
        String category=i.getExtras().getString("CATEGORY");
        String date=i.getExtras().getString("DATE");
        String link=i.getExtras().getString("LINK");
        String phone=i.getExtras().getString("PHONE");
        String organ=i.getExtras().getString("ORGAN");

        //SET RECEIVED DATA TO TEXTVIEWS AND IMAGEVIEWS
        nameDetailTextView.setText(name);
        descriptionDetailTextView.setText("DESCRIPTION: "+description);
        dateDetailTextView.setText("DATE: "+date);
        categoryDetailTextView.setText("CATEGORY: "+category);
        linkDetailTextView.setText("LINK: "+link);
        phoneDetailTextView.setText("PHONE: "+phone);
        organDetailTextView.setText("INCHARGE: "+organ);

        Picasso.with(this).load(imageURL).placeholder(R.drawable.placeholder).fit().centerCrop().into(teacherDetailImageView);

    }

}

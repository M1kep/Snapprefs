package com.marz.snapprefs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class profile_Image_uploader_activity extends Activity {

    ImageButton imgBtn1;
    ImageButton imgBtn2;
    ImageButton imgBtn3;
    ImageButton imgBtn4;
    ImageButton imgBtn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_image_uploader_layout);
        imgBtn1 = (ImageButton) findViewById(R.id.profile_image1_btn);
        imgBtn2 = (ImageButton) findViewById(R.id.profile_image2_btn);
        imgBtn3 = (ImageButton) findViewById(R.id.profile_image3_btn);
        imgBtn4 = (ImageButton) findViewById(R.id.profile_image4_btn);
        imgBtn5 = (ImageButton) findViewById(R.id.profile_image5_btn);

        imgBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, 1);
            }
        });

        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, 2);
            }
        });

        imgBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, 3);
            }
        });

        imgBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, 4);
            }
        });

        imgBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, 5);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK) {
            switch (requestCode) {
                case 1:
                    try {
                        final Uri imageUri = data.getData();
                        final InputStream imgStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap chosenImg = BitmapFactory.decodeStream(imgStream);
                        imgBtn1.setImageBitmap(chosenImg);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                case 2:
                    try {
                        final Uri imageUri = data.getData();
                        final InputStream imgStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap chosenImg = BitmapFactory.decodeStream(imgStream);
                        imgBtn2.setImageBitmap(chosenImg);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                case 3:
                    try {
                        final Uri imageUri = data.getData();
                        final InputStream imgStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap chosenImg = BitmapFactory.decodeStream(imgStream);
                        imgBtn3.setImageBitmap(chosenImg);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                case 4:
                    try {
                        final Uri imageUri = data.getData();
                        final InputStream imgStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap chosenImg = BitmapFactory.decodeStream(imgStream);
                        imgBtn4.setImageBitmap(chosenImg);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                case 5:
                    try {
                        final Uri imageUri = data.getData();
                        final InputStream imgStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap chosenImg = BitmapFactory.decodeStream(imgStream);
                        imgBtn5.setImageBitmap(chosenImg);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
            }
        }

    }
}

package com.example.marim.memorygame;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;
    ImageView img10;
    ImageView img11;
    ImageView img12;
    ImageView img13;
    ImageView img14;
    ImageView img15;
    ImageView img16;
    LinearLayout layout;

    int x;
    int i=0;
    int count = 0;
    int arr [] = new int[3];
    int id [] = new int[3];
    //int randomImages [] = new int[8];


    public void dropIn (View view) {
            if (view.getId() == img1.getId()) {
                img1.setImageResource(R.drawable.card4);
                x=4;
            } else if (view.getId() == img2.getId()) {
                img2.setImageResource(R.drawable.card7);
                x=7;
            } else if (view.getId() == img3.getId()) {
                img3.setImageResource(R.drawable.card1);
                x=1;
            } else if (view.getId() == img4.getId()) {
                img4.setImageResource(R.drawable.card2);
                x=2;
            } else if (view.getId() == img5.getId()) {
                img5.setImageResource(R.drawable.card5);
                x=5;
            } else if (view.getId() == img6.getId()) {
                img6.setImageResource(R.drawable.card8);
                x=8;
            } else if (view.getId() == img7.getId()) {
                img7.setImageResource(R.drawable.card3);
                x=3;
            } else if (view.getId() == img8.getId()) {
                img8.setImageResource(R.drawable.card6);
                x=6;
            } else if (view.getId() == img9.getId()) {
                img9.setImageResource(R.drawable.card2);
                x=2;
            } else if (view.getId() == img10.getId()) {
                img10.setImageResource(R.drawable.card6);
                x=6;
            } else if (view.getId() == img11.getId()) {
                img11.setImageResource(R.drawable.card1);
                x=1;
            } else if (view.getId() == img12.getId()) {
                img12.setImageResource(R.drawable.card3);
                x=3;
            } else if (view.getId() == img13.getId()) {
                img13.setImageResource(R.drawable.card4);
                x=4;
            } else if (view.getId() == img14.getId()) {
                img14.setImageResource(R.drawable.card8);
                x=8;
            } else if (view.getId() == img15.getId()) {
                img15.setImageResource(R.drawable.card5);
                x=5;
            } else {
                img16.setImageResource(R.drawable.card7);
                x=7;
            }
        id[i]=view.getId();
        arr[i]=x;
        if(count==2) {
            if (arr[0] == arr[1] && id[0]!=id[1]) {
                visibility(id);
            } else {
                changeImage(id);
            }
            i = 0;
            count = 0;
            arr[0] = arr[2];
            id[0] = id[2];
        }
        count ++ ;
        i++;
        if(PlayAgain()){
            layout.setVisibility(View.VISIBLE);
        }
    }

    public void visibility (int arrayID[]){
        for(int i =0 ; i<2;i++) {
            if (img1.getId() == arrayID[i]) {
                img1.setVisibility(View.INVISIBLE);
            } else if (img2.getId() == arrayID[i]) {
                img2.setVisibility(View.INVISIBLE);
            } else if (img3.getId() == arrayID[i]) {
                img3.setVisibility(View.INVISIBLE);
            } else if (img4.getId() == arrayID[i]) {
                img4.setVisibility(View.INVISIBLE);
            } else if (img5.getId() == arrayID[i]) {
                img5.setVisibility(View.INVISIBLE);
            } else if (img6.getId() == arrayID[i]) {
                img6.setVisibility(View.INVISIBLE);
            } else if (img7.getId() == arrayID[i]) {
                img7.setVisibility(View.INVISIBLE);
            } else if (img8.getId() == arrayID[i]) {
                img8.setVisibility(View.INVISIBLE);
            } else if (img9.getId() == arrayID[i]) {
                img9.setVisibility(View.INVISIBLE);
            } else if (img10.getId() == arrayID[i]) {
                img10.setVisibility(View.INVISIBLE);
            } else if (img11.getId() == arrayID[i]) {
                img11.setVisibility(View.INVISIBLE);
            } else if (img12.getId() == arrayID[i]) {
                img12.setVisibility(View.INVISIBLE);
            } else if (img13.getId() == arrayID[i]) {
                img13.setVisibility(View.INVISIBLE);
            } else if (img14.getId() == arrayID[i]) {
                img14.setVisibility(View.INVISIBLE);
            } else if (img15.getId() == arrayID[i]) {
                img15.setVisibility(View.INVISIBLE);
            } else if(img16.getId() == arrayID[i]){
                img16.setVisibility(View.INVISIBLE);
            }
        }
    }

    public void changeImage (int arrayID[]){
        for(int i =0 ; i<2;i++) {
            if (img1.getId() == arrayID[i]) {
                img1.setImageResource(R.drawable.icon);
            } else if (img2.getId() == arrayID[i]) {
                img2.setImageResource(R.drawable.icon);
            } else if (img3.getId() == arrayID[i]) {
                img3.setImageResource(R.drawable.icon);
            } else if (img4.getId() == arrayID[i]) {
                img4.setImageResource(R.drawable.icon);
            } else if (img5.getId() == arrayID[i]) {
                img5.setImageResource(R.drawable.icon);
            } else if (img6.getId() == arrayID[i]) {
                img6.setImageResource(R.drawable.icon);
            } else if (img7.getId() == arrayID[i]) {
                img7.setImageResource(R.drawable.icon);
            } else if (img8.getId() == arrayID[i]) {
                img8.setImageResource(R.drawable.icon);
            } else if (img9.getId() == arrayID[i]) {
                img9.setImageResource(R.drawable.icon);
            } else if (img10.getId() == arrayID[i]) {
                img10.setImageResource(R.drawable.icon);
            } else if (img11.getId() == arrayID[i]) {
                img11.setImageResource(R.drawable.icon);
            } else if (img12.getId() == arrayID[i]) {
                img12.setImageResource(R.drawable.icon);
            } else if (img13.getId() == arrayID[i]) {
                img13.setImageResource(R.drawable.icon);
            } else if (img14.getId() == arrayID[i]) {
                img14.setImageResource(R.drawable.icon);
            } else if (img15.getId() == arrayID[i]) {
                img15.setImageResource(R.drawable.icon);
            } else if(img16.getId() == arrayID[i]){
                img16.setImageResource(R.drawable.icon);
            }
        }
    }

    public boolean PlayAgain (){
        if (img1.getVisibility()==View.INVISIBLE &&
                img2.getVisibility()==View.INVISIBLE &&
                img3.getVisibility()==View.INVISIBLE &&
                img4.getVisibility()==View.INVISIBLE &&
                img5.getVisibility()==View.INVISIBLE &&
                img6.getVisibility()==View.INVISIBLE &&
                img7.getVisibility()==View.INVISIBLE &&
                img8.getVisibility()==View.INVISIBLE &&
                img9.getVisibility()==View.INVISIBLE &&
                img10.getVisibility()==View.INVISIBLE &&
                img11.getVisibility()==View.INVISIBLE &&
                img12.getVisibility()==View.INVISIBLE &&
                img13.getVisibility()==View.INVISIBLE &&
                img14.getVisibility()==View.INVISIBLE &&
                img15.getVisibility()==View.INVISIBLE &&
                img16.getVisibility()==View.INVISIBLE) {
            return true;
        }else{
            return false;
        }
    }

    public void playAgain (View view){
        layout.setVisibility(View.INVISIBLE);
        img1.setImageResource(R.drawable.icon);
        img2.setImageResource(R.drawable.icon);
        img3.setImageResource(R.drawable.icon);
        img4.setImageResource(R.drawable.icon);
        img5.setImageResource(R.drawable.icon);
        img6.setImageResource(R.drawable.icon);
        img7.setImageResource(R.drawable.icon);
        img8.setImageResource(R.drawable.icon);
        img9.setImageResource(R.drawable.icon);
        img10.setImageResource(R.drawable.icon);
        img11.setImageResource(R.drawable.icon);
        img12.setImageResource(R.drawable.icon);
        img13.setImageResource(R.drawable.icon);
        img14.setImageResource(R.drawable.icon);
        img15.setImageResource(R.drawable.icon);
        img16.setImageResource(R.drawable.icon);

        img1.setVisibility(View.VISIBLE);
        img2.setVisibility(View.VISIBLE);
        img3.setVisibility(View.VISIBLE);
        img4.setVisibility(View.VISIBLE);
        img5.setVisibility(View.VISIBLE);
        img6.setVisibility(View.VISIBLE);
        img7.setVisibility(View.VISIBLE);
        img8.setVisibility(View.VISIBLE);
        img9.setVisibility(View.VISIBLE);
        img10.setVisibility(View.VISIBLE);
        img11.setVisibility(View.VISIBLE);
        img12.setVisibility(View.VISIBLE);
        img13.setVisibility(View.VISIBLE);
        img14.setVisibility(View.VISIBLE);
        img15.setVisibility(View.VISIBLE);
        img16.setVisibility(View.VISIBLE);

        i=0;
        count=0;
        arr[0]=arr[1]=arr[2]=0;
        id[0]=id[1]=id[2]=0;
    }

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            img1 = (ImageView) findViewById(R.id.imageView1);
            img2 = (ImageView) findViewById(R.id.imageView2);
            img3 = (ImageView) findViewById(R.id.imageView3);
            img4 = (ImageView) findViewById(R.id.imageView4);
            img5 = (ImageView) findViewById(R.id.imageView5);
            img6 = (ImageView) findViewById(R.id.imageView6);
            img7 = (ImageView) findViewById(R.id.imageView7);
            img8 = (ImageView) findViewById(R.id.imageView8);
            img9 = (ImageView) findViewById(R.id.imageView9);
            img10 = (ImageView) findViewById(R.id.imageView10);
            img11 = (ImageView) findViewById(R.id.imageView11);
            img12 = (ImageView) findViewById(R.id.imageView12);
            img13 = (ImageView) findViewById(R.id.imageView13);
            img14 = (ImageView) findViewById(R.id.imageView14);
            img15 = (ImageView) findViewById(R.id.imageView15);
            img16 = (ImageView) findViewById(R.id.imageView16);

            layout = (LinearLayout)findViewById(R.id.playAgainLayout);

            /*int counter=0;
            for (int i=0;i<randomImages.length;i++) {
                Random rand = new Random();
                int rndInt = rand.nextInt(8) + 1;
                String drawableName = "card" + rndInt;
                int resID = getResources().getIdentifier(drawableName, "drawable", getPackageName());
                randomImages[i]=resID;
                System.out.println(randomImages[i]);
            }*/

        }
    }
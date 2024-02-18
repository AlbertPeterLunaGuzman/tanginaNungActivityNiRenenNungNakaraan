package com.example.activitykayrenen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tawagin mo sa main method
        executeLogicDamingAlamHays();
    }

    //tawagin mo sa main method
    public void executeLogicDamingAlamHays(){
        //Palitan mo nalang yung mga id ng Id ng cards mo
        CardView firstCard = findViewById(R.id.firstCard);
        CardView secondCard = findViewById(R.id.secondCard);
        CardView thirdCard = findViewById(R.id.thirdCard);

        //tas lagay mo dito yung mga card names
        showFirstDialog(firstCard);
        showSecondDialog(secondCard);
        showThirdDialog(thirdCard);
    }
    // tawagin mo sa "executeLogicDamingAlamHays"
    public void showFirstDialog(CardView card){
        Dialog firstDialog = new Dialog(MainActivity.this);
        //Palitan mo nalang yung R.layout.nameNungLayoutMo
        firstDialog.setContentView(R.layout.firstdialogbox);
        //Palitan mo alang yung R.drawable.nameNungBackgroundMo sa drawables
        firstDialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.background));
        firstDialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        card.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // palitan muna yung background card color
                card.setCardBackgroundColor(getResources().getColor(R.color.black));

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Ibalik yung background card color
                        card.setCardBackgroundColor(getResources().getColor(R.color.white));
                    }
                }, 100); // 100 = yung oras ng tagal bago ibalik sa dati

                firstDialog.show();
            }
        });

        //palitan mo nalang yung button id nung nandun sa dialog box mo
        Button firstButton = firstDialog.findViewById(R.id.firstDialogButton);
        firstButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                firstDialog.dismiss();
            }
        });

        //copy paste mo nalang ng dalawang beses pa

    }

    public void showSecondDialog(CardView card){
        Dialog secondDialog = new Dialog(MainActivity.this);
        secondDialog.setContentView(R.layout.seconddialogbox);
        secondDialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.background2));
        secondDialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);


        card.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                card.setCardBackgroundColor(getResources().getColor(R.color.lightBlue));

                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        card.setCardBackgroundColor(getResources().getColor(R.color.white));
                    }
                },100);

                secondDialog.show();
            }
        });

        Button secondButton = secondDialog.findViewById(R.id.secondDialogButton);
        secondButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                secondDialog.dismiss();
            }
        });
    }

    public void  showThirdDialog (CardView card){
        Dialog thirdDialog = new Dialog(MainActivity.this);
        thirdDialog.setContentView(R.layout.thirddialogbox);
        thirdDialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.background3));
        thirdDialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        card.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                card.setCardBackgroundColor(getResources().getColor(R.color.lightGreen));

                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        card.setCardBackgroundColor(getResources().getColor(R.color.white));
                    }
                },100);
                thirdDialog.show();
            }
        });

        Button thirdButton = thirdDialog.findViewById(R.id.thirdDialogButton);
        thirdButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                thirdDialog.dismiss();
            }
        });
    }

}

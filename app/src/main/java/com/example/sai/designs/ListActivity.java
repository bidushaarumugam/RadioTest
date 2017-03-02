package com.example.sai.designs;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    /*AlertDialog alertDialog1;
    CharSequence[] values = {" Red "," Green "," Blue "," Yellow","Light grey","Grey","Cyan"};*/

    private RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        relativeLayout=(RelativeLayout)findViewById(R.id.vi);

    }

    public void ambClick(View v) {

        StatusActivity c=new StatusActivity();
        c.show(getFragmentManager(),"Dialog");
    }

   /*public void onclick(View V)
    {
        CreateAlertDialog() ;

    }


   public void CreateAlertDialog(){



        AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);

        builder.setTitle("Phone Ringtones");



        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(ListActivity.this, android.R.layout.select_dialog_singlechoice);
        arrayAdapter.add("None");
        arrayAdapter.add("Archit");
        arrayAdapter.add("Callisto");
        arrayAdapter.add("Carousel");
        arrayAdapter.add("Ding");
        arrayAdapter.add("Ganymade");
        arrayAdapter.add("Gatti");
        arrayAdapter.add("Guitar");
        arrayAdapter.add("Luna");
        arrayAdapter.add("MiMix");
        arrayAdapter.add("MIUI");
        arrayAdapter.add("Retro");
        arrayAdapter.add("Thinker");

        builder.setPositiveButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.setAdapter(arrayAdapter, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String strName = arrayAdapter.getItem(which);
                AlertDialog.Builder builderInner = new AlertDialog.Builder(ListActivity.this);
                builderInner.setMessage(strName);
                builderInner.setTitle("Your Ringtone is");
                builderInner.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog,int which) {
                        Toast.makeText(getApplicationContext(),"Done",Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                builderInner.show();
            }
        });
        builder.show();

       *//* //No Button
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Canceled",Toast.LENGTH_LONG).show();
                           }
        });*//*


        *//*builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int item) {

                switch(item)
                {
                    case 0:

                        relativeLayout.setBackgroundColor(Color.RED);
                        break;
                    case 1:

                        relativeLayout.setBackgroundColor(Color.GREEN);
                        break;
                    case 2:

                        relativeLayout.setBackgroundColor(Color.BLUE);
                        break;

                    case 3:
                        relativeLayout.setBackgroundColor(Color.YELLOW);
                        break;

                    case 4:
                        relativeLayout.setBackgroundColor(Color.LTGRAY);
                        break;

                    case 5:
                        relativeLayout.setBackgroundColor(Color.GRAY);
                        break;

                    case 6:

                        relativeLayout.setBackgroundColor(Color.CYAN);
                        break;


                }


                          alertDialog1.dismiss();

            }

        });
        alertDialog1 = builder.create();
        alertDialog1.show();
*//*
    }*/
}
//select_dialog_singlechoice
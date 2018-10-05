package com.example.asus.dialogactivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Dialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Dialog.this);

        alertDialogBuilder.setTitle(this.getTitle()+"Dialogwindow");
        alertDialogBuilder.setMessage("what do you want ?");

        alertDialogBuilder.setPositiveButton("Positive", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent positiveActivity =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(positiveActivity);
            }
        });

        alertDialogBuilder.setNegativeButton("negative", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                Toast.makeText(getApplicationContext(),"bye bye!",Toast.LENGTH_LONG).show();
            }
        });
        alertDialogBuilder.setNeutralButton("quit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Dialog.this.finish();
            }
        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();

    }
}

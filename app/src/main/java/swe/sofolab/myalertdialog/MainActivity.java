package swe.sofolab.myalertdialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog_methods();

    }

    public void dialog_methods(){


        btn=(Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder mydialog=new AlertDialog.Builder(MainActivity.this);


                mydialog.setTitle("Attention Here");

                mydialog.setMessage("Are you sure you want to go there");

                mydialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(),"You clicked positive button",Toast.LENGTH_SHORT).show();

                        Intent i=new Intent(MainActivity.this,Main2Activity.class);

                        startActivity(i);

                    }
                });



                mydialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(),"you are clicked on negative button",Toast.LENGTH_SHORT).show();

                    }
                });

                AlertDialog ami=mydialog.create();

                ami.show();

            }
        });


    }




}

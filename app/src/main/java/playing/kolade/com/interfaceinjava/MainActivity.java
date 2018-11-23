package playing.kolade.com.interfaceinjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btnThrowJabBoxer, btnThrowCrossBoxer, btnThrowHookBoxer, btnThrowUppercutBoxer, btnKickBoxerThrowJab, btnKickBoxerThrowCross;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnThrowJabBoxer = findViewById(R.id.btnThrowJabBoxer);
        btnThrowCrossBoxer = findViewById(R.id.btnThrowCrossBoxer);
        btnThrowHookBoxer = findViewById(R.id.btnThrowHookBoxer);
        btnThrowUppercutBoxer = findViewById(R.id.btnThrowUppercutBoxer);

        btnKickBoxerThrowJab = findViewById(R.id.btnKickBoxerThrowJab);
        btnKickBoxerThrowCross = findViewById(R.id.btnKickBoxerThrowCross);

        final Boxer boxerA = new Boxer();      //note that the object must be declared as final as we would be referring to it from the inner class
        final KickBoxer kickBoxerA = new KickBoxer();

        btnThrowJabBoxer.setOnClickListener(new View.OnClickListener() { //inner anonymous class is defined here. View.OnClickListener is an interface

            @Override
            public void onClick(View v) {  //This is the default implementation of the interface i.e. right click - generate

                Toast.makeText(MainActivity.this, boxerA.throwJab(), Toast.LENGTH_LONG).show();

            }
        });

        btnThrowCrossBoxer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, boxerA.throwCross(), Toast.LENGTH_LONG).show();
            }
        });

        btnThrowHookBoxer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, boxerA.throwHook(), Toast.LENGTH_LONG).show();
            }
        });

        btnThrowUppercutBoxer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, boxerA.throwUppercut(), Toast.LENGTH_LONG).show();
            }
        });

        btnKickBoxerThrowJab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, kickBoxerA.throwJab(), Toast.LENGTH_LONG).show();
            }
        });

        btnKickBoxerThrowCross.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, kickBoxerA.throwCross(), Toast.LENGTH_LONG).show();
            }


        });
    }
-
package ir.sematec.saturdays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //defining activities layout
        setContentView(R.layout.activity_main);



        Log.d("MYAPPSTAG","onCreate Called");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MYAPPSTAG","onStart Called");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MYAPPSTAG","onResume Called");

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MYAPPSTAG","onPause Called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MYAPPSTAG","onStop Called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MYAPPSTAG","onDestroy Called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}

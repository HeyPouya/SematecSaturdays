package ir.sematec.saturdays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class TestHandlerActivity extends AppCompatActivity {


    Boolean hasUserClickedOnBack = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_handler);
    }


    @Override
    public void onBackPressed() {
        if (!hasUserClickedOnBack) {
            Toast.makeText(this, "please press back again", Toast.LENGTH_SHORT).show();
            hasUserClickedOnBack = true;

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    hasUserClickedOnBack = false;
                }
            }, 2000);

        } else {
            super.onBackPressed();
        }
    }
}

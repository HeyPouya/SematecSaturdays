package ir.sematec.saturdays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView txt = findViewById(R.id.txtName);


        Intent intent = getIntent();

        String s = intent.getStringExtra("userName");

        txt.setText(s);


    }
}

package ir.sematec.saturdays;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TestStartForResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_start_for_result);

        Button btnSetting = findViewById(R.id.btnSetting);


        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestStartForResultActivity.this, TestChildStartForResultActivity.class);

                startActivityForResult(intent, 150);

            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == 150) {
            if (resultCode == Activity.RESULT_OK) {

                String back = data.getStringExtra("background");
                Toast.makeText(TestStartForResultActivity.this, back, Toast.LENGTH_LONG).show();
            }


        }


    }
}

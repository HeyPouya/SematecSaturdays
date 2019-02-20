package ir.sematec.saturdays;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestPermissionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_permission);


        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((ContextCompat.checkSelfPermission(TestPermissionActivity.this, Manifest.permission.CAMERA))
                        != PackageManager.PERMISSION_GRANTED) {

                    ActivityCompat.requestPermissions(TestPermissionActivity.this,
                            new String[]{Manifest.permission.CAMERA},
                            1500);

                }


            }
        });
    }
}

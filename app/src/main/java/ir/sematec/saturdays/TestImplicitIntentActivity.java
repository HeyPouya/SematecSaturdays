package ir.sematec.saturdays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestImplicitIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_implicit_intent);

        Button btnOpenPage = findViewById(R.id.openPage);
        //explicit intent
//        Intent intent = new Intent(TestImplicitIntentActivity.this,ThirdActivity.class);
//        startActivity(intent);






        btnOpenPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //implicit intent
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://heydarii.ir"));
                startActivity(intent);

            }
        });




    }
}

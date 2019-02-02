package ir.sematec.saturdays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TestEdittextActivity extends AppCompatActivity {

    String userName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_edittext);


        final EditText edtName = findViewById(R.id.edtName);
        Button btnOk = findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userName = edtName.getText().toString();
                Toast.makeText(TestEdittextActivity.this, userName, Toast.LENGTH_LONG).show();
            }
        });
    }
}

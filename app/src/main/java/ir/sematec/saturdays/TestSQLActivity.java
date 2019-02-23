package ir.sematec.saturdays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class TestSQLActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_sql);

        TestDBOpenHelper openHelper = new TestDBOpenHelper(this, "sematec", null, 1);
        openHelper.insertScore("Pouya", 18);
        openHelper.insertScore("Ali", 20);
        openHelper.insertScore("Naghi", 10);
        openHelper.insertScore("Parvaneh", 2);
        openHelper.insertScore("Mousa", 3);
        openHelper.insertScore("Mamad", 0);


        String allNames = openHelper.getAllNames();

        Toast.makeText(this, allNames, Toast.LENGTH_SHORT).show();
    }
}

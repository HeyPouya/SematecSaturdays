package ir.sematec.saturdays;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestMenuActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_menu_activiy);


        IntentFilter filter = new IntentFilter();
        filter.addAction("android.intent.action.AIRPLANE_MODE");
        TestBroadcastReceiver receiver = new TestBroadcastReceiver();
        registerReceiver(receiver, filter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(0, 1, 0, "Added by code");


        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Toast.makeText(this, "Java", Toast.LENGTH_SHORT).show();
                break;
            case R.id.first_item:
                Toast.makeText(this, "first Item", Toast.LENGTH_SHORT).show();
                break;
            case R.id.second_item:
                Toast.makeText(this, "second Item", Toast.LENGTH_SHORT).show();
                break;
            case R.id.third_item:
                Toast.makeText(this, "third Item", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;

    }
}

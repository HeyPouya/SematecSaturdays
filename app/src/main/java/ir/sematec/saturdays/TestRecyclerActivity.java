package ir.sematec.saturdays;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class TestRecyclerActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler);

        List<String> names = new ArrayList<>();
        names.add("Pouya");
        names.add("Pouya");
        names.add("Pouya");
        names.add("Pouya");
        names.add("Pouya");
        names.add("Pouya");
        names.add("Pouya");
        names.add("Pouya");
        names.add("Pouya");
        names.add("Pouya");

        RecyclerView recycler = findViewById(R.id.recycler);

        TestAdapter adapter = new TestAdapter(names);

        recycler.setAdapter(adapter);


        recycler.setLayoutManager(new GridLayoutManager(TestRecyclerActivity.this, 3, RecyclerView.VERTICAL, false));

    }
}

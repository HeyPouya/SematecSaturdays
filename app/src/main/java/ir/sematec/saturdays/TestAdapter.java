package ir.sematec.saturdays;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestViewHolder> {

    List<String> myList;

    TestAdapter(List<String> list) {
        myList = list;

    }

    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_recycler_item, parent, false);

        TestViewHolder holder = new TestViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) {

        String s = myList.get(position);
        holder.txt.setText(s);


    }

    @Override
    public int getItemCount() {
        return myList.size();

    }

    class TestViewHolder extends RecyclerView.ViewHolder {

        TextView txt;

        public TestViewHolder(@NonNull View itemView) {
            super(itemView);

            txt = itemView.findViewById(R.id.txtName);

        }


    }
}

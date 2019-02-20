package ir.sematec.saturdays;

import androidx.appcompat.app.AppCompatActivity;
import cz.msebera.android.httpclient.Header;
import ir.sematec.saturdays.praymodel.PrayTimesClass;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONObject;

public class TestAsyncClientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_async_client);


        String url = "https://api.aladhan.com/v1/timingsByCity?city=tehran&country=Iran&method=8";

        AsyncHttpClient client = new AsyncHttpClient();

        client.get(url, new JsonHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);

                Gson gson = new Gson();

                PrayTimesClass pray = gson.fromJson(response.toString(), PrayTimesClass.class);

                String m = pray.getData().getTimings().getMaghrib();

                Log.d("response", m);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
            }
        });
    }
}

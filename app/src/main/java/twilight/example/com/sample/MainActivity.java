package twilight.example.com.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String value="hello";
    String value1="hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hello =(TextView) findViewById(R.id.hello);
        TextView hello1 =(TextView) findViewById(R.id.hello1);

        hello.setText(value);
        hello1.setText(value1);
    }
}

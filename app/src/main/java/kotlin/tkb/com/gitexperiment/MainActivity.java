package kotlin.tkb.com.gitexperiment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a=5 ,b=5;
        Log.i("Tag: "," The sum is: "+a+b);
    }
}

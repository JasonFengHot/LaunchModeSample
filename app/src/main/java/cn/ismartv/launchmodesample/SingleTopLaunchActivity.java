package cn.ismartv.launchmodesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SingleTopLaunchActivity extends AppCompatActivity {
    private static final String TAG = SingleTopLaunchActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top_launch);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "task id: " + getTaskId());
        Log.d(TAG, "instance: " + this);
    }
}

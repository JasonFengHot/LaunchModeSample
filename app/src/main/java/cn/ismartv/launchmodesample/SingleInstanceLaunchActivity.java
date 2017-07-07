package cn.ismartv.launchmodesample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SingleInstanceLaunchActivity extends AppCompatActivity {
    private static final String TAG = SingleInstanceLaunchActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "-----------onCreate-----------");
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "-----------onReStart-----------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "-----------onStart-----------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "-----------onResume-----------");
        Log.d(TAG, "task id: " + getTaskId());
        Log.d(TAG, "instance: " + this);
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "-----------onPause-----------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "-----------onStop-----------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "-----------onDestroy-----------");
    }



    public void launchSingleTask(View view) {
        Intent intent = new Intent(this, SingleTaskLaunchActivity.class);
        startActivity(intent);
    }

    public void launchStandard(View view) {
        Intent intent = new Intent(this, StandardLaunchActivity.class);
        startActivity(intent);
    }

    public void launchSingleInstance(View view) {
        Intent intent = new Intent(this, SingleInstanceLaunchActivity.class);
        startActivity(intent);
    }

    public void launchSingleTop(View view) {
        Intent intent = new Intent(this, SingleTopLaunchActivity.class);
        startActivity(intent);
    }
}

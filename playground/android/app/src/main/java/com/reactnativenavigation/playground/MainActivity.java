package com.reactnativenavigation.playground;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.reactnativenavigation.NavigationActivity;
import com.reactnativenavigation.ndk.demo.JSIDemo;

import androidx.annotation.Nullable;

public class MainActivity extends NavigationActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSplashLayout();
        JSIDemo jsiDemo = new JSIDemo();
        Log.d("JSI++", "onCreate: "+jsiDemo.getDemoInt());
    }

    private void setSplashLayout() {
        ImageView img = new ImageView(this);
        img.setImageDrawable(getDrawable(R.drawable.ic_android));
        setContentView(img);
    }
}

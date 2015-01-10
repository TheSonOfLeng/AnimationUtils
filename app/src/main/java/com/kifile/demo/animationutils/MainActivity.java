package com.kifile.demo.animationutils;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

import com.kifile.utils.animation.interpolator.EasingInterpolator;
import com.kifile.utils.animation.interpolator.EasingType;


public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {
    public static final int[][] MODE_ARRAY = {
            {EasingType.EASE_IN_QUAD, EasingType.EASE_OUT_QUAD, EasingType.EASE_IN_OUT_QUAD},
            {EasingType.EASE_IN_CUBIC, EasingType.EASE_OUT_CUBIC, EasingType.EASE_IN_OUT_CUBIC},
            {EasingType.EASE_IN_QUART, EasingType.EASE_OUT_QUART, EasingType.EASE_IN_OUT_QUART},
            {EasingType.EASE_IN_QUINT, EasingType.EASE_OUT_QUINT, EasingType.EASE_IN_OUT_QUINT},
            {EasingType.EASE_IN_SINE, EasingType.EASE_OUT_SINE, EasingType.EASE_IN_OUT_SINE},
            {EasingType.EASE_IN_EXPO, EasingType.EASE_OUT_EXPO, EasingType.EASE_IN_OUT_EXPO},
            {EasingType.EASE_IN_CIRC, EasingType.EASE_OUT_CIRC, EasingType.EASE_IN_OUT_CIRC},
            {EasingType.EASE_IN_ELASTIC, EasingType.EASE_OUT_ELASTIC, EasingType.EASE_IN_OUT_ELASTIC},
            {EasingType.EASE_IN_BACK, EasingType.EASE_OUT_BACK, EasingType.EASE_IN_OUT_BACK},
            {EasingType.EASE_IN_BOUNCE, EasingType.EASE_OUT_BOUNCE, EasingType.EASE_IN_OUT_BOUNCE},
            {EasingType.LINEAR, EasingType.LINEAR, EasingType.LINEAR},
    };

    private static final int[] ANIMATION_ARRY = {R.anim.fall_down1, R.anim.fall_down2, R.anim.fall_down3};

    private ImageView[] mImgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner mSpinner = (Spinner) findViewById(R.id.spinner);
        mSpinner.setOnItemSelectedListener(this);
        mImgs = new ImageView[3];
        mImgs[0] = (ImageView) findViewById(R.id.img1);
        mImgs[1] = (ImageView) findViewById(R.id.img2);
        mImgs[2] = (ImageView) findViewById(R.id.img3);
        setAnimation(0);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        setAnimation(position);

    }

    private void setAnimation(int position) {
        if (mImgs != null) {
            int[] animations = MODE_ARRAY[position];
            for (int i = 0; i < 3; i++) {
                Animation animation = AnimationUtils.loadAnimation(this, ANIMATION_ARRY[i]);
                animation.setInterpolator(new EasingInterpolator(animations[i]));
                mImgs[i].startAnimation(animation);
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

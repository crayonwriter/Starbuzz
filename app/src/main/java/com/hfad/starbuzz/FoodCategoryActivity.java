package com.hfad.starbuzz;

import android.app.Activity;
import android.os.Bundle;

public class FoodCategoryActivity extends Activity {
    public static final String EXTRA_FOODID = "foodId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }
}

package com.example.lab2_pt;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class case6 extends Activity {


    GridView gvMenu;
    Spinner spnThumbnail;
    EditText edtName;
    CheckBox cbPromotion;
    List<Dish> dishes;
    List<Thumbnail> thumbnails;
    DishAdapter dishAdapter;
    Button btnAddNewDish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.case6);

        findViewsById();

        initSpnThumbnail();
        initGvMenu();

        handleEvents();
    }

    private void findViewsById()
    {
        // findViewById
        gvMenu = (GridView) findViewById(R.id.gv_menu);
        spnThumbnail = (Spinner) findViewById(R.id.spn_thumbnail);
        edtName = (EditText) findViewById(R.id.et_name);
        cbPromotion = (CheckBox) findViewById(R.id.cb_promotion);
        btnAddNewDish = (Button) findViewById(R.id.btn_add_new_dish);
    }

    private void initSpnThumbnail()
    {
        // Fake thumbnail list
        thumbnails = new ArrayList<>();
        thumbnails.add(Thumbnail.Thumbnail1);
        thumbnails.add(Thumbnail.Thumbnail2);
        thumbnails.add(Thumbnail.Thumbnail3);
        thumbnails.add(Thumbnail.Thumbnail4);

        // Set Adapter for spnThumbnail
        ThumbnailAdapter thumbnailAdapter = new ThumbnailAdapter(case6.this, 1, thumbnails);
        spnThumbnail.setAdapter(thumbnailAdapter);
    }

    private void initGvMenu()
    {
        // fake dishes
        dishes = new ArrayList<>();

        // Set adapter gridview
        dishAdapter = new DishAdapter(case6.this, R.layout.item_dish, dishes);
        gvMenu.setAdapter(dishAdapter);
    }

    private void addADish()
    {
        if (!validateData()) return;


        String name = edtName.getText().toString();
        Thumbnail thumnail = (Thumbnail) spnThumbnail.getSelectedItem();
        boolean promotion = cbPromotion.isChecked();


        Dish dish = new Dish(name, thumnail, promotion);
        dishes.add(dish);


        dishAdapter.notifyDataSetChanged();

        Toast.makeText(case6.this,getString(R.string.added_successfully), Toast.LENGTH_SHORT).show();


        edtName.setText("");
        spnThumbnail.setSelection(0);
        cbPromotion.setChecked(false);
    }

    private boolean validateData()
    {
        if (edtName.getText().length() == 0)
        {
            Toast.makeText(case6.this, getString(R.string.please_enter_a_nane), Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private void handleEvents()
    {
        btnAddNewDish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addADish();
            }
        });
    }

}

package com.app.androidmvp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.app.androidmvp.R;
import com.app.androidmvp.presenter.CalculatePresenter;
import com.app.androidmvp.presenter.CalculatePresenterInterface;

public class CalculateView extends AppCompatActivity implements CalculateViewInterface {

    //Declared Variables layout calculate
    private EditText et_calculate_number;
    private TextView tw_show_result;

    //Create object of presenter
    private CalculatePresenterInterface presenter;

    //Start Activity calculate layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculate_view);
        findComponents();


        //Create instance of presenter
        presenter = new CalculatePresenter(this);

    }


    // Start layout components of calculate view
    private void findComponents() {
        et_calculate_number = findViewById(R.id.et_calculate_number);
        tw_show_result = findViewById(R.id.tw_show_result);
    }

    //Send parameters for presenter
    public void calculate(View view) {
        presenter.squared((et_calculate_number.getText().toString()));
    }


    //Show result for user
    @Override
    public void showResult(String result) {
        tw_show_result.setText(result);

    }
}

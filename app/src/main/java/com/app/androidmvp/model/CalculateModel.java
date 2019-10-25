package com.app.androidmvp.model;

import com.app.androidmvp.presenter.CalculatePresenter;
import com.app.androidmvp.presenter.CalculatePresenterInterface;

public class CalculateModel implements CalculateModelInterface {

    //Declared interface objects presenter
    private CalculatePresenterInterface presenter;


    //Variable for calculate
    private double result;

    //Constructor
    public CalculateModel(CalculatePresenterInterface presenter) {
        this.presenter = presenter;
    }

    //Main methodo for Squared Calculate
    public void squared(String data) {
        result = 0;
        result = Double.valueOf(data) * Double.valueOf(data);
        presenter.showResult(String.valueOf(result));

    }
}

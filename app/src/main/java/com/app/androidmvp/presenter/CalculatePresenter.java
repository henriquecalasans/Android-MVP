package com.app.androidmvp.presenter;

import com.app.androidmvp.model.CalculateModel;
import com.app.androidmvp.model.CalculateModelInterface;
import com.app.androidmvp.view.CalculateView;
import com.app.androidmvp.view.CalculateViewInterface;

public class CalculatePresenter implements CalculatePresenterInterface {


    //Declared interface objects of view and model
    private CalculateViewInterface view;
    private CalculateModelInterface model;

    //Constructor
    public CalculatePresenter(CalculateViewInterface view) {
        this.view = view;
        model = new CalculateModel(this);
    }

    //Send paramaters for model
    @Override
    public void squared(String data) {
        if (view != null) {
            model.squared(data);

        }

    }


    //Return result from view
    @Override
    public void showResult(String result) {
        if (view != null) {
            view.showResult(result);
        }
    }
}

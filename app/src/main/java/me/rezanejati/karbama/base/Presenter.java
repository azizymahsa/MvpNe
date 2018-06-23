package me.rezanejati.karbama.base;
/**
 * Created by Reza Nejati on 23,June,2018
 */
public abstract class Presenter<T> {
    public abstract void initialize();

    public abstract void onResume();

    public abstract void onPause();

    public abstract void onDestroy();

    protected T view;

    public void setView(T v) {
        view = v;
    }
}


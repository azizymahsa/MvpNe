package me.rezanejati.karbama.mvp;
import me.rezanejati.karbama.activity.BaseActivity;
/**
 * Created by Reza Nejati on 23,June,2018
 */
public abstract class BasePresenter<T,E extends ContractMvp> {

    T t;
    E e;


    public BasePresenter(T t, E e) {
        this.t = t;
        this.e = e;
    }

    public BasePresenter( E e) {
        this.e = e;
    }



    public T getT() {
        return t;
    }

    public E getE() {
        return e;
    }


}

package me.rezanejati.karbama.mvp;
/**
 * Created by Reza Nejati on 23,June,2018
 */
public abstract interface ContractMvp {
    void onLoading();
    void stop();
    void onError(String msg);

}

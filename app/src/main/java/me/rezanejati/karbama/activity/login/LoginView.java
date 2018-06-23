package me.rezanejati.karbama.activity.login;
import android.view.View;

import me.rezanejati.karbama.mvp.ContractMvp;
/**
 * Created by Reza Nejati on 23,June,2018
 */
public interface LoginView extends ContractMvp {
    void onLoginValitatorError(View view);
}

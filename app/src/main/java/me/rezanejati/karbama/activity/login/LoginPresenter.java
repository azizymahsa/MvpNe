package me.rezanejati.karbama.activity.login;
import android.widget.EditText;

import me.rezanejati.karbama.mvp.BasePresenter;
import me.rezanejati.karbama.mvp.ContractMvp;
/**
 * Created by Reza Nejati on 23,June,2018
 */
public class LoginPresenter extends BasePresenter<LoginModel,LoginView> {
    public LoginPresenter(LoginModel loginModel, LoginView loginView) {
        super(loginModel, loginView);
    }

    public LoginPresenter(LoginView loginView) {
        super(loginView);
    }


    public void sendPostLogin(EditText username, EditText pass)
    {
        if (username.getText().toString().isEmpty())
        {
            getE().onLoginValitatorError(username);
            return;
        }

        if (pass.getText().toString().isEmpty())
        {
            getE().onLoginValitatorError(pass);
            return;
        }
    }
}

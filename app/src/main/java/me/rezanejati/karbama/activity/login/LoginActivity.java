package me.rezanejati.karbama.activity.login;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import me.rezanejati.karbama.R;
import me.rezanejati.karbama.activity.BaseActivity;
public class LoginActivity extends BaseActivity implements LoginView, View.OnClickListener {
    private LoginPresenter presenter;
    public EditText username, password;
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        presenter = new LoginPresenter(this);
        username = findViewById(R.id.username);
        password = findViewById(R.id.pass);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onLoading() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void onError(String msg) {
    }

    @Override
    public void onLoginValitatorError(View view) {
        view.requestFocus();

    }

    @Override
    public void onClick(View v) {
        presenter.sendPostLogin(username, password);
    }
}

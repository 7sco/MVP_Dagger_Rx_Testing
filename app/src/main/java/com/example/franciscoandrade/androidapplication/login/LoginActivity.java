package com.example.franciscoandrade.androidapplication.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.franciscoandrade.androidapplication.R;
import com.example.franciscoandrade.androidapplication.root.App;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginActivityMVP.View{

    @BindView(R.id.first_name_ET)
    EditText firstNameET;
    @BindView(R.id.last_name_ET)
    EditText lastNameET;
    @BindView(R.id.btn_login)
    Button btnLogin;

    @Inject
    LoginActivityMVP.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ((App)getApplication()).getComponent().inject(this);
    }


    @Override
    protected void onResume() {
        super.onResume();
        //setPresenter for this view
        presenter.setView(this);
        presenter.getCurrentUser();

    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        presenter.loginButtonClicked();
    }

    @Override
    public String getFirstName() {
        return firstNameET.getText().toString();
    }

    @Override
    public String getLastName() {
        return lastNameET.getText().toString();
    }

    @Override
    public void showUserNotAvailable() {
        Toast.makeText(this, "User Not Available", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showInputError() {
        Toast.makeText(this, "Input Error", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showUserSaved() {
        Toast.makeText(this, "User Saved", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void setFirstName(String fName) {
        firstNameET.setText(fName);
    }

    @Override
    public void setLastName(String lName) {
        lastNameET.setText(lName);

    }
}

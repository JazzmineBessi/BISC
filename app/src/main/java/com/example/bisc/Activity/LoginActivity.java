package com.example.bisc.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bisc.LocalModel.User;
import com.example.bisc.R;
import com.example.bisc.RetrofitClasses.ApiUtil;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    private Button connect;
    String loginTXT;
    String mdpTXT;
     String basic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        connect = findViewById(R.id.connect);
        EditText editTextLogin = findViewById(R.id.login);
        EditText editTextMdp = findViewById(R.id.mdp);
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editTextLogin.equals("")) {
                    Toast.makeText(LoginActivity.this, "login ou Mot de passe incorrect", Toast.LENGTH_LONG).show();
                } else {
                    loginTXT = editTextLogin.getText().toString();
                }

                if (editTextMdp.equals("")) {
                    Toast.makeText(LoginActivity.this, "login ou Mot de passe incorrect", Toast.LENGTH_LONG).show();
                } else {
                    mdpTXT = editTextMdp.getText().toString();
                }

                User user= new User();
                user.setLogin(loginTXT);
                user.setMDP(mdpTXT);
                connectClicked(user);
            }

            private void connectClicked(User user) {
                String credentials = user.getLogin() + ":" + user.getMDP();
                  basic = "Basic " + Base64.encodeToString(credentials.getBytes(), Base64.NO_WRAP);

                Call<User>  call;
                call = ApiUtil.getServiceClass().getUserLogin (basic,"application/json","application/json","76ad62e779cc4182a4c003df6a9bd0a8", user);
                call.enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        Log.e("TAG", "onResponse:OK" );

                        if (response.code()==200){
                            Intent home= new Intent(LoginActivity.this, HomeActivity.class);
                            startActivity(home);
                            Log.e("TAG", "onResponse:ok200" );

                        }else if (response.code()==401){
                            Toast.makeText(LoginActivity.this,"login ou Mot de passe incorrect",Toast.LENGTH_LONG).show();
                            Log.e("TAG", "onResponse:ok401" );

                        }else if (response.code()==500){
                            Toast.makeText(LoginActivity.this,"login ou Mot de passe incorrect",Toast.LENGTH_LONG).show();
                            Log.e("TAG", "onResponse:ok500" );

                        }else  if (response.code()==400){
                            Toast.makeText(LoginActivity.this,"login ou Mot de passe incorrect",Toast.LENGTH_LONG).show();
                            Log.e("TAG", "onResponse:ok400" );

                        }
                    }
                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        Log.e("TAG", "onResponse:NOK" );
                        Toast.makeText(LoginActivity.this,"login ou Mot de passe incorrect",Toast.LENGTH_LONG).show();
                        Intent home= new Intent(LoginActivity.this, HomeActivity.class);
                        startActivity(home);
                    }
                });

            }
        });

    }
}
package com.example.bisc;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

public class MainActivity extends AppCompatActivity {
    private Button connect;
    private EditText mdp;
    private EditText login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connect = findViewById(R.id.connect);
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextLogin = findViewById(R.id.login);
                EditText editTextMdp = findViewById(R.id.mdp);
                String login = editTextLogin.getText().toString();
                String mdp = editTextMdp.getText().toString();
                connectClicked(login,mdp);

            }

            private void connectClicked(String login , String mdp ) {
             Call<User>  call;
                call = ApiUtil.getServiceClass().getUserLogin (login ,mdp);
                call.enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        Log.e("TAG", "onResponse:OK" );
                        //
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        Log.e("TAG", "onResponse:NOK" );

                    }
                });

            }
        });

    }
}
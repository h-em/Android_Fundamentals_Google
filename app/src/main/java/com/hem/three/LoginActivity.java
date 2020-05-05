package com.hem.three;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.hem.one.R;

public class LoginActivity extends AppCompatActivity {


    EditText edEmail;
    EditText edPhone;
    CheckBox checkBox;
    Button submitButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout_w3);


        edEmail = findViewById(R.id.et_email);
        edPhone = findViewById(R.id.et_phone);
        checkBox = findViewById(R.id.cb_t_c);
        submitButton = findViewById(R.id.btn_submit);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()){
                    handleSubmit(edEmail.getText(), edPhone.getText());
                }else{
                    Toast.makeText(LoginActivity.this, "Email or Phone is invalid",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void handleSubmit(CharSequence email, CharSequence phone){
        if( email == null || email.length()== 0){
            edEmail.setError("incorrect email");
        } else if( phone == null || phone.length()== 0) {
            edEmail.setError("incorrect phone");
        }else {
            Toast.makeText(LoginActivity.this, "Logged!",Toast.LENGTH_SHORT).show();
        }
    }
}

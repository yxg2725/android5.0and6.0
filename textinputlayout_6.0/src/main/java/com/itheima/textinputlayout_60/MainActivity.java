package com.itheima.textinputlayout_60;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextInputLayout textInputLayout_user = (TextInputLayout) findViewById(R.id.textInput1);
        final TextInputLayout textInputLayout_pwd = (TextInputLayout) findViewById(R.id.textInput2);

        EditText editText_user = textInputLayout_user.getEditText();
        EditText editText_pwd = textInputLayout_pwd.getEditText();

        editText_user.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() < 6){
                    textInputLayout_user.setError("字数不可小于6");
                }else{
                    textInputLayout_user.setErrorEnabled(false);
                }

            }
        });
        editText_pwd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() < 6){
                    textInputLayout_pwd.setError("字数不可小于6");
                }else{
                    textInputLayout_pwd.setErrorEnabled(false);
                }

            }
        });


    }
}

package com.example.mliky.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText id = (EditText) findViewById(R.id.editText1);
        EditText pass = (EditText) findViewById(R.id.editText2);
        boolean flag1 = check(id.getText().toString(),pass.getText().toString());
        result(flag1);
    }

    public boolean check(String id, String pass){
        boolean flag1 = false;
        Acount acount = new Acount();
            if (id.equals(acount.idlist) && pass.equals(acount.pwlist)) {
                flag1 = true;
            }
        return flag1;
    }

    public void result(boolean flag1){
        TextView text = (TextView) findViewById(R.id.textView2);

        if (flag1) {
            Intent intent = new Intent(this, SubActivity.class);
            startActivity(intent);
        }else{
            text.setText("ID/PASS が一致しませんでした");
        }
    }
}
class Acount{
    final String  idlist = "x16n000";
    final String  pwlist = "n000000";
}
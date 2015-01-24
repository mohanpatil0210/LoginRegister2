package com.example.loginregister2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_login, menu);
        return true;
    }
    
    public void onRegisterClick(View v)
    {
    	Intent intent  = new Intent(this, RegisterActivity.class);
    	startActivity(intent);
    	finish();
    }
    
    public void onLoginClick(View v)
    {
    	
    }
    
}

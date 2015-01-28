package com.example.loginregister2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends Activity
{

	private EditText etName;
	private EditText etMobile;
	private EditText etEmail;
	private EditText etCity;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		initview();
	}

	private void initview()
	{
		etName = (EditText) this.findViewById(R.id.etName);
		etMobile = (EditText) this.findViewById(R.id.etMobile);
		etEmail = (EditText) this.findViewById(R.id.etEmail);
		etCity = (EditText) this.findViewById(R.id.etCity);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_register, menu);
		return true;
	}

	public void onLoginClick(View v)
	{
		Intent intent = new Intent(this, LoginActivity.class);
		startActivity(intent);
		finish();
	}

	// validating email id
	private boolean isValidEmail(String email)
	{
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	// validating password with retype password
	private boolean isValidPassword(String pass)
	{
		if (pass != null && pass.length() > 6)
		{
			return true;
		}
		return false;
	}

	private boolean isNumeric(String str)
	{
		int i;
		for (i = 0; i < str.length(); i++)
		{

		}
		return false;

	}

	public void onRegisterClick(View v)
	{
		String strMsg="";
		if(etName.length() <= 0)
		{
			//Dialog diag = new Dialog(this);
			//diag.setContentView(layoutResID);
			
			strMsg += "Enter your Name\n"; 
		}
		if(etMobile.length() > 10 && 
	}
}

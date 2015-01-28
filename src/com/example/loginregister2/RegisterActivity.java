package com.example.loginregister2;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.util.Log;
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
		Log.e("init", "initview called");
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

	private boolean isValidPassword(String pass)
	{
		if (pass != null && pass.length() > 6)
		{
			return true;
		}
		return false;
	}
	
	private boolean isValidMobile(String str)
	{
		String expression = "^[0-9-1+]{10,15}$";
		Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(str);
		return (matcher.matches()) ? true : false;
	}

	private boolean isValidEmail(String str)
	{
		Log.e("Email Input", str);
		String expression = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
		Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(str);
		return (matcher.matches()) ? true : false;
	}

	public void onRegisterClick(View v)
	{
		boolean error = false;

		if (etName.getText().length() <= 0)
		{
			etName.setError("Enter your Name");
			error = true;
		}

		if (!isValidMobile(etMobile.getText().toString()))
		{
			etMobile.setError("Enter valid Mobile Number");
			error = true;
		}

		if (!isValidEmail(etEmail.getText().toString()))
		{
			etEmail.setError("Enter valid Email ID");
			error = true;
		}

		if (etCity.getText().length() <= 0)
		{
			etCity.setError("Enter City Name");
			error = true;
		}

		if (error == true)
		{
			//Write this information in database
		}
	}
}

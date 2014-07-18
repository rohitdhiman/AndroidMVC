package com.fba.utility;

import android.os.Bundle;
import android.widget.Toast;
import android.app.Activity;
import android.app.ProgressDialog;

public class BaseActivity extends Activity{
	ProgressDialog progressDialog;
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
	}
	
	public void showToast(String message)
	{
		Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
	}

	//Validate Email
	public Boolean isEmailValid(String email)
	{
		CharSequence target = email;
		return (target == null) ? false : android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
	}
	
	//Validate Password
	public Boolean isPasswordValid(String password)
	{
		int lenght = password.length();
		if(lenght < 6) return false;
		for(int index = 0 ; index < lenght; index++)
		{
			char c = password.charAt(index);
			if(Character.isWhitespace(c))
			{
				return false;
			}
		}
		return true;
		
	}

	//Show Progress
	public void showProgressHud()
	{
		progressDialog = new ProgressDialog(this);
		progressDialog.setMessage("loading...");
		progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		progressDialog.setIndeterminate(true);
	}
	
	//Hide Progress
	public void hideProgressHud()
	{
		if(progressDialog != null && progressDialog.isShowing())
		{
			progressDialog.dismiss();
			progressDialog = null;
		}
	}
}

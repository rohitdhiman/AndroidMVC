package com.fba.fbainbound;

import org.json.JSONObject;
import com.fba.proxy.ProxyInterface;
import com.fba.proxy.UserProxy;
import com.fba.utility.BaseActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class UserLoginActivity extends BaseActivity implements OnClickListener, ProxyInterface{

	EditText userNameEditText;
	EditText passwordEditText;
	Button loginButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_login);
		
		System.out.println("Validating user access...");
		intilizeLoginActivity();
	}

	public void intilizeLoginActivity()
	{
		userNameEditText = (EditText) findViewById(R.id.userNameEditText);
		passwordEditText = (EditText) findViewById(R.id.passwordEditText);
		loginButton = (Button) findViewById(R.id.loginButton);
		loginButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.loginButton:
		{
			validateLogin();
			
		}
			break;

		default:
			break;
		}
		
		
	}

	public void validateLogin()
	{
		System.out.println("Validating user access");
		
		
//		if((userNameEditText.length() > 0 && !userNameEditText.getText().toString().equalsIgnoreCase("")) &&
//		   (passwordEditText.length() > 0 && !passwordEditText.getText().toString().equalsIgnoreCase("")) && 
//		   isEmailValid(userNameEditText.getText().toString()) && isPasswordValid(passwordEditText.getText().toString()))	
		{
			
			//proxy.getRequestWithURL("http://ec2-54-255-2-220.ap-southeast-1.compute.amazonaws.com/api/v1/todolist?page=1", "Vg3keBspS6bfm4G1bALb", "OrderListRequest");	
			//proxy.postRequestWithURL("http://ec2-54-255-2-220.ap-southeast-1.compute.amazonaws.com/api/v1/login", "", userLoginBody, "LoginRequest");
			
			
			showProgressHud();
			try
			{
				JSONObject loginJson = new JSONObject();
				loginJson.put("email", "delivery@fulflmnt.com");
				loginJson.put("password", "fulflmnt@123");
				
				JSONObject userLoginBody = new JSONObject();
				userLoginBody.put("user", loginJson);
		
				UserProxy userProxy = new UserProxy();
				userProxy.postLoginWithUserDict(userLoginBody);
				
				//Map<String, String>errorResponse = userProxy.onFailResponse();
				//System.out.println("Erro Respsne : "+errorResponse.get("error"));
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
		//else
		{
			//showToast("Enter valid login data");
		}
	}

	@Override
	public void onSuccessResponse(String response, String requestName) {
		// TODO Auto-generated method stub
		System.out.println("This is on success : "+response);
	}

	@Override
	public void onFailResponse(String response, String requestName) {
		// TODO Auto-generated method stub
		System.out.println("This si erro  : "+response);
	}
	
	
}

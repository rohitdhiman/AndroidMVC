package com.fba.proxy;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import com.fba.utility.Common.APPURL;
import com.fba.utility.Constant;

public class UserProxy extends Proxy implements ProxyInterface{

	String requestName;
	Map<String, String> errorResponseMap;
	
	public void postLoginWithUserDict(JSONObject userJson)
	{
		String url = APPURL.LOGIN_URL;
		super.postRequestWithURL(url, "", userJson, Constant.k_LOGIN_REQUEST);
		requestName = Constant.k_LOGIN_REQUEST;
	}
	
	//Get Success Response And Parse response 
	public void connectionFinishLoadingWithResponse(String response, String requestName)
	{
		System.out.println("Response user proxy : "+requestName+" response : "+response);
		
		onSuccessResponse(response, requestName);
	}
	
	//Get fail response
	public void connectionFinishLoadingWithError(String error, String requestName)
	{
		errorResponseMap = new HashMap<String, String>();
		errorResponseMap.put("error", error);
		errorResponseMap.put("requestName", requestName);
		System.out.println("error map : "+errorResponseMap);
		
		onFailResponse(error, requestName);
		
	}

	@Override
	public void onSuccessResponse(String response, String requestName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFailResponse(String response, String requestName) {
		// TODO Auto-generated method stub
		System.out.println("onfail : "+response);
		
		
		
	}
	
	
	/////Inner class
	
	 public static final class ResponseHandler
	 {
		 public interface ResponseHandlerInterface
		 {
			 public void onSuccess(String response);
			 
			 public void onFail(String error);
		 }
	 }
}

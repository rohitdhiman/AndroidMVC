package com.fba.proxy;


public interface ProxyInterface {

	public void onSuccessResponse(String response, String requestName);
	
	public void onFailResponse(String response, String requestName);

}

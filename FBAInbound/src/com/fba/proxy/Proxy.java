package com.fba.proxy;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.fba.utility.ApplicationController;
import com.fba.utility.Constant;

public class Proxy {

	//get request method
	String serverURL;
	String content;
	public void getRequestWithURL(String url, final String key, final String requestName) 
	{
		try{
		JsonObjectRequest jsonRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

			@Override
			public void onResponse(JSONObject response) {
				// TODO Auto-generated method stub
				String errorString = validate(response);
				if(errorString.length() > 0)
				{
					System.out.println("Error : "+errorString);
					
					connectionFinishLoadingWithError(errorString, requestName);
					
				}
				else
				{
					System.out.println("Response : "+response.toString());
					
					connectionFinishLoadingWithResponse(response.toString(), requestName);
				}
			}
			
		}, new Response.ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError error) {
				// TODO Auto-generated method stub
				System.out.println("Error Response : "+error.getMessage());
			}
			
		}){     
			public Map<String, String> getHeaders() throws AuthFailureError 
			{ 
				Map<String, String>  params = new HashMap<String, String>();  
				params.put("Content-Type", String.format("application/json"));
                params.put("Accept", String.format("application/json"));
                params.put("RequestType", requestName);
                params.put("Authorization", "Token token="+key);
				return params;  
			}
		};
		System.out.println("json object req: "+jsonRequest.toString());
		ApplicationController.getInstance().getRequestQueue().add(jsonRequest);
		}
		catch(Exception e)
		{
			System.out.println("Exception; "+ e.getMessage());
		}	
	
	}
	
	//post request method
	public void postRequestWithURL(String url, final String key, JSONObject body, final String requestName)
	{
		try
		{
			System.out.println("Post Body : "+body.toString());
			  JsonObjectRequest jsonRequest = new JsonObjectRequest(Request.Method.POST, url, body, new Response.Listener<JSONObject>(){
				@Override
				public void onResponse(JSONObject response)
				{
					String errorString = validate(response);
	
					if(errorString.length() > 0)
					{
						//Error
						System.out.println("Error ; "+errorString);
						
						connectionFinishLoadingWithError(errorString, requestName);
					}
					else 	
					{
						System.out.println("Response ; "+response);
						
						connectionFinishLoadingWithResponse(response.toString(), requestName);
					}	
					
				}
			},
			new Response.ErrorListener() 
			{
				@Override
				public void onErrorResponse(VolleyError error) 
				{
					System.out.println("Error = "+error.getMessage());
				}
			}){     
				@Override
				public Map<String, String> getHeaders() throws AuthFailureError 
				{ 
					Map<String, String>  params = new HashMap<String, String>();  
					params.put("Content-Type", String.format("application/json"));
	                params.put("Accept", String.format("application/json"));
	                params.put("RequestType", requestName);
	                if(!requestName.equalsIgnoreCase(Constant.k_LOGIN_REQUEST)){
	                	params.put("Authorization", "Token token="+key);
	                }
					return params;  
				}
			};
			System.out.println("json object req: "+jsonRequest.toString());
			ApplicationController.getInstance().addToRequestQueue(jsonRequest);//getRequestQueue().add(jsonRequest);
			
		}
		catch(Exception e)
		{
			connectionFinishLoadingWithError("This is error", requestName);
			System.out.println("Exception : "+e.getMessage());
		}
		
	}
	
	public void putRequestWithURL(String url, final String key, JSONObject body, final String requestName)
	{
		try{
			JsonObjectRequest jsonRequest = new JsonObjectRequest(Request.Method.PUT, url, body, new Response.Listener<JSONObject>() {
				@Override
				public void onResponse(JSONObject response)
				{
					String errorString = validate(response);

					if(errorString.length() > 0)
					{
						//Error
						System.out.println("Error ; "+errorString);
						
						connectionFinishLoadingWithError(errorString, requestName);
					}
					else 	
					{
						System.out.println("Response ; "+response);
						
						connectionFinishLoadingWithResponse(response.toString(), requestName);
					}	
					
				}
			},
			new Response.ErrorListener() 
			{
				@Override
				public void onErrorResponse(VolleyError error) 
				{
					System.out.println("Error = "+error.getMessage());
				}
			}){     
				@Override
				public Map<String, String> getHeaders() throws AuthFailureError 
				{ 
					Map<String, String>  params = new HashMap<String, String>();  
					params.put("Content-Type", String.format("application/json"));
	                params.put("Accept", String.format("application/json"));
	                params.put("RequestType", requestName);
	                params.put("Authorization", "Token token="+key);
					return params;  
				}
			};
			System.out.println("json object req: "+jsonRequest.toString());
			ApplicationController.getInstance().getRequestQueue().add(jsonRequest);
			}
			catch(Exception e)
			{
				System.out.println("Exception : "+e.getMessage());
			}
	}
	
	public void deleteRequestWithURL(String url, final String key, final String requestName)
	{
		try{
			JsonObjectRequest jsonRequest = new JsonObjectRequest(Request.Method.DELETE, url, null, new Response.Listener<JSONObject>() {
				@Override
				public void onResponse(JSONObject response)
				{
					String errorString = validate(response);

					if(errorString.length() > 0)
					{
						//Error
						System.out.println("Error ; "+errorString);
						
						connectionFinishLoadingWithError(errorString, requestName);
					}
					else 	
					{
						System.out.println("Response ; "+response);
						
						connectionFinishLoadingWithResponse(response.toString(), requestName);
					}	
					
				}
			},
			new Response.ErrorListener() 
			{
				@Override
				public void onErrorResponse(VolleyError error) 
				{
					System.out.println("Error = "+error.getMessage());
				}
			}){     
				@Override
				public Map<String, String> getHeaders() throws AuthFailureError 
				{ 
					Map<String, String>  params = new HashMap<String, String>();  
					params.put("Content-Type", String.format("application/json"));
	                params.put("Accept", String.format("application/json"));
	                params.put("RequestType", requestName);
	                params.put("Authorization", "Token token="+key);
					return params;  
				}
			};
			System.out.println("json object req: "+jsonRequest.toString());
			ApplicationController.getInstance().getRequestQueue().add(jsonRequest);
			}
			catch(Exception e)
			{
				System.out.println("Exception : "+e.getMessage());
			}
	}
	
	public void deleteRequestWithURL(String url, final String key, JSONObject body, final String requestName)
	{
		try{
			JsonObjectRequest jsonRequest = new JsonObjectRequest(Request.Method.PUT, url, body, new Response.Listener<JSONObject>() {
				@Override
				public void onResponse(JSONObject response)
				{
					String errorString = validate(response);

					if(errorString.length() > 0)
					{
						//Error
						System.out.println("Error ; "+errorString);
						
						connectionFinishLoadingWithError(errorString, requestName);
					}
					else 	
					{
						System.out.println("Response ; "+response);
						
						connectionFinishLoadingWithResponse(response.toString(), requestName);
					}	
					
				}
			},
			new Response.ErrorListener() 
			{
				@Override
				public void onErrorResponse(VolleyError error) 
				{
					System.out.println("Error = "+error.getMessage());
				}
			}){     
				@Override
				public Map<String, String> getHeaders() throws AuthFailureError 
				{ 
					Map<String, String>  params = new HashMap<String, String>();  
					params.put("Content-Type", String.format("application/json"));
	                params.put("Accept", String.format("application/json"));
	                params.put("RequestType", requestName);
	                params.put("Authorization", "Token token="+key);
					return params;  
				}
			};
			System.out.println("json object req: "+jsonRequest.toString());
			ApplicationController.getInstance().getRequestQueue().add(jsonRequest);
			}
			catch(Exception e)
			{
				System.out.println("Exception : "+e.getMessage());
			}
	}

	public static String validate(JSONObject response) 
	{
		if(response.has("error"))
		{
			try
			{
				return response.getString("error");
			} 
			catch (JSONException e)
            {
				e.printStackTrace();
			}
		}
		else if(response.has("exception"))
		{
			try 
			{
				return response.getString("exception");
			} 
			catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return "";
	}
	
	public void connectionFinishLoadingWithResponse(String response, String requestName)
	{
		
	}
	
	public void connectionFinishLoadingWithError(String error, String requestName)
	{
		
	}
	
}

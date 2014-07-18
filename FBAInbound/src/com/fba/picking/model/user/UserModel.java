package com.fba.picking.model.user;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("serial")
public class UserModel implements Serializable
{
	@SerializedName("auth_token") private String auth_token;
	@SerializedName("roles") private List<UserRoleModel> roles;
	@SerializedName("first_name") private String firstName;
	@SerializedName("last_name") private String lastName;
	@SerializedName("phone") private String phone;
	@SerializedName("email") private String email;
	@SerializedName("api_key") private String api_Key;
	@SerializedName("is_older_than_21") private Boolean is_older_than_21;
	@SerializedName("id") private String userId;
	@SerializedName("name") private String name;
	@SerializedName("origin") private String origin;
	@SerializedName("permissions") private List<PermissionModel> permissions;
	@SerializedName("company") private String company;
	
	//auth_token 
	public void setAuthToken(String auth_token)
	{
		this.auth_token = auth_token;
	}
	public String getAuthToken()
	{
		return this.auth_token;
	}
	
	//roles
	public void setUserRoles(List<UserRoleModel> roles)
	{
		this.roles = roles;
	}
	public List<UserRoleModel> getUserRoles()
	{
		return this.roles;
	}
	
	//firstName
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	
	//lastName
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getLastName()
	{
		return this.lastName;
	}	
	
	//phone
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String getPhone()
	{
		return this.phone;
	}	
	
	//email
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getEmail()
	{
		return this.email;
	}
	
	//API Key
	public void setAPIKEY(String api_Key)
	{
		this.api_Key = api_Key;
	}
	public String getAPIKEY()
	{
		return this.api_Key;
	}

	//is_older_than_21
	public void setIsOlderThan21(Boolean is_older_than_21)
	{
		this.is_older_than_21 = is_older_than_21;
	}
	public Boolean getIsOlderThan21()
	{
		return this.is_older_than_21;
	}
	
	//userId
	public void SetUserId(String userId)
	{
		this.userId = userId;
	}
	public String getUserId()
	{
		return this.userId;
	}
	
	//name
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	
	//origin
	public void setOrigin(String origin)
	{
		this.origin = origin;
	}
	public String getOrigin()
	{
		return this.origin;
	}
	
	//permission
	public void setPermission(List<PermissionModel> permissions)
	{
		this.permissions = permissions;
	}
	public List<PermissionModel> getPermission()
	{
		return this.permissions;
	}
	
	//company
	public void setCompany(String company)
	{
		this.company = company;
	}
	
}

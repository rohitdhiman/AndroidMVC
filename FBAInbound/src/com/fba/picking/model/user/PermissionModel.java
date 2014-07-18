package com.fba.picking.model.user;

import java.io.Serializable;
import com.google.gson.annotations.SerializedName;

public class PermissionModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SerializedName("id") private String permissionId;
	@SerializedName("action") private String action;
	@SerializedName("model") private String model;
	@SerializedName("role_id") private String role_id;
	@SerializedName("user_id") private String user_id;
	@SerializedName("created_at") private String created_at;
	@SerializedName("updated_at") private String updated_at;

	//permissionId
	public void setPermissionId(String permissionId)
	{
		this.permissionId = permissionId;
	}
	public String getPermissionId()
	{
		return this.permissionId;
	}
	
	//action
	public void setAction(String action)
	{
		this.action = action;
	}
	public String getAction()
	{
		return this.action;
	}
		
	//model
	public void setModel(String model)
	{
		this.model = model;
	}
	public String getModel()
	{
		return this.model;
	}
		
	//role_id
	public void setRoleId(String role_id)
	{
		this.role_id = role_id;
	}
	public String getRoleId()
	{
		return this.role_id;
	}
		
	//user_id
	public void setUserId(String user_id)
	{
		this.user_id = user_id;
	}
	public String getUserId()
	{
		return this.user_id;
	}
		
	//created_at
	public void setCreatedAt(String created_at)
	{
		this.created_at = created_at;
	}
	public String getCreatedAt()
	{
		return this.created_at;
	}
		
	//updated_at
	public void setUpdatedAt(String updated_at)
	{
		this.updated_at = updated_at;
	}
	public String getUpdatedAt()
	{
		return this.updated_at;
	}
	
}

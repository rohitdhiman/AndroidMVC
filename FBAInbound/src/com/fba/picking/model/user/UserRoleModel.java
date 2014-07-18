package com.fba.picking.model.user;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class UserRoleModel implements Serializable{

	private static final long serialVersionUID = 1L;
	@SerializedName("id") private String roleId;
	@SerializedName("created_at") private String created_at;
	@SerializedName("updated_at") private String updated_at;
	@SerializedName("deleted_at") private String deleted_at;
	@SerializedName("modified_by") private String modified_by;
	@SerializedName("display_name") private String display_name;
	@SerializedName("name") private String name;
	
	//roleId
	public void setRoleId(String roleId)
	{
		this.roleId = roleId;
	}
	public String getRoleId()
	{
		return this.roleId;
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
	
	//deleted_at
	public void setDeletedAt(String deleted_at)
	{
		this.deleted_at = deleted_at;
	}
	public String getDeletedAt()
	{
		return this.deleted_at;
	}
	
	//modified_by
	public void setModifiyBy(String modified_by)
	{
		this.modified_by = modified_by;
	}
	public String getModifiyBy()
	{
		return this.modified_by;
	}

	//display_name
	public void setDisplayName(String display_name)
	{
		this.display_name = display_name;
	}
	public String getDisplayName()
	{
		return this.display_name;
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
}

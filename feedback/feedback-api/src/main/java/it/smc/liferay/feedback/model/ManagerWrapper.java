/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package it.smc.liferay.feedback.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Manager}.
 * </p>
 *
 * @author dbg
 * @see Manager
 * @generated
 */
@ProviderType
public class ManagerWrapper implements Manager, ModelWrapper<Manager> {
	public ManagerWrapper(Manager manager) {
		_manager = manager;
	}

	@Override
	public Class<?> getModelClass() {
		return Manager.class;
	}

	@Override
	public String getModelClassName() {
		return Manager.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("managerId", getManagerId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("plid", getPlid());
		attributes.put("description", getDescription());
		attributes.put("url", getUrl());
		attributes.put("userAgent", getUserAgent());
		attributes.put("internalNote", getInternalNote());
		attributes.put("file", getFile());
		attributes.put("userManagerId", getUserManagerId());
		attributes.put("status", getStatus());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long managerId = (Long)attributes.get("managerId");

		if (managerId != null) {
			setManagerId(managerId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long plid = (Long)attributes.get("plid");

		if (plid != null) {
			setPlid(plid);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String userAgent = (String)attributes.get("userAgent");

		if (userAgent != null) {
			setUserAgent(userAgent);
		}

		String internalNote = (String)attributes.get("internalNote");

		if (internalNote != null) {
			setInternalNote(internalNote);
		}

		String file = (String)attributes.get("file");

		if (file != null) {
			setFile(file);
		}

		Long userManagerId = (Long)attributes.get("userManagerId");

		if (userManagerId != null) {
			setUserManagerId(userManagerId);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _manager.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _manager.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _manager.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _manager.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<it.smc.liferay.feedback.model.Manager> toCacheModel() {
		return _manager.toCacheModel();
	}

	@Override
	public int compareTo(it.smc.liferay.feedback.model.Manager manager) {
		return _manager.compareTo(manager);
	}

	/**
	* Returns the status of this manager.
	*
	* @return the status of this manager
	*/
	@Override
	public int getStatus() {
		return _manager.getStatus();
	}

	@Override
	public int hashCode() {
		return _manager.hashCode();
	}

	@Override
	public it.smc.liferay.feedback.model.Manager toEscapedModel() {
		return new ManagerWrapper(_manager.toEscapedModel());
	}

	@Override
	public it.smc.liferay.feedback.model.Manager toUnescapedModel() {
		return new ManagerWrapper(_manager.toUnescapedModel());
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _manager.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ManagerWrapper((Manager)_manager.clone());
	}

	/**
	* Returns the description of this manager.
	*
	* @return the description of this manager
	*/
	@Override
	public java.lang.String getDescription() {
		return _manager.getDescription();
	}

	/**
	* Returns the file of this manager.
	*
	* @return the file of this manager
	*/
	@Override
	public java.lang.String getFile() {
		return _manager.getFile();
	}

	/**
	* Returns the internal note of this manager.
	*
	* @return the internal note of this manager
	*/
	@Override
	public java.lang.String getInternalNote() {
		return _manager.getInternalNote();
	}

	/**
	* Returns the url of this manager.
	*
	* @return the url of this manager
	*/
	@Override
	public java.lang.String getUrl() {
		return _manager.getUrl();
	}

	/**
	* Returns the user agent of this manager.
	*
	* @return the user agent of this manager
	*/
	@Override
	public java.lang.String getUserAgent() {
		return _manager.getUserAgent();
	}

	/**
	* Returns the user name of this manager.
	*
	* @return the user name of this manager
	*/
	@Override
	public java.lang.String getUserName() {
		return _manager.getUserName();
	}

	/**
	* Returns the user uuid of this manager.
	*
	* @return the user uuid of this manager
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _manager.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _manager.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _manager.toXmlString();
	}

	/**
	* Returns the create date of this manager.
	*
	* @return the create date of this manager
	*/
	@Override
	public Date getCreateDate() {
		return _manager.getCreateDate();
	}

	/**
	* Returns the modified date of this manager.
	*
	* @return the modified date of this manager
	*/
	@Override
	public Date getModifiedDate() {
		return _manager.getModifiedDate();
	}

	/**
	* Returns the status date of this manager.
	*
	* @return the status date of this manager
	*/
	@Override
	public Date getStatusDate() {
		return _manager.getStatusDate();
	}

	/**
	* Returns the company ID of this manager.
	*
	* @return the company ID of this manager
	*/
	@Override
	public long getCompanyId() {
		return _manager.getCompanyId();
	}

	/**
	* Returns the group ID of this manager.
	*
	* @return the group ID of this manager
	*/
	@Override
	public long getGroupId() {
		return _manager.getGroupId();
	}

	/**
	* Returns the manager ID of this manager.
	*
	* @return the manager ID of this manager
	*/
	@Override
	public long getManagerId() {
		return _manager.getManagerId();
	}

	/**
	* Returns the plid of this manager.
	*
	* @return the plid of this manager
	*/
	@Override
	public long getPlid() {
		return _manager.getPlid();
	}

	/**
	* Returns the primary key of this manager.
	*
	* @return the primary key of this manager
	*/
	@Override
	public long getPrimaryKey() {
		return _manager.getPrimaryKey();
	}

	/**
	* Returns the user ID of this manager.
	*
	* @return the user ID of this manager
	*/
	@Override
	public long getUserId() {
		return _manager.getUserId();
	}

	/**
	* Returns the user manager ID of this manager.
	*
	* @return the user manager ID of this manager
	*/
	@Override
	public long getUserManagerId() {
		return _manager.getUserManagerId();
	}

	@Override
	public void persist() {
		_manager.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_manager.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this manager.
	*
	* @param companyId the company ID of this manager
	*/
	@Override
	public void setCompanyId(long companyId) {
		_manager.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this manager.
	*
	* @param createDate the create date of this manager
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_manager.setCreateDate(createDate);
	}

	/**
	* Sets the description of this manager.
	*
	* @param description the description of this manager
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_manager.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_manager.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_manager.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_manager.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the file of this manager.
	*
	* @param file the file of this manager
	*/
	@Override
	public void setFile(java.lang.String file) {
		_manager.setFile(file);
	}

	/**
	* Sets the group ID of this manager.
	*
	* @param groupId the group ID of this manager
	*/
	@Override
	public void setGroupId(long groupId) {
		_manager.setGroupId(groupId);
	}

	/**
	* Sets the internal note of this manager.
	*
	* @param internalNote the internal note of this manager
	*/
	@Override
	public void setInternalNote(java.lang.String internalNote) {
		_manager.setInternalNote(internalNote);
	}

	/**
	* Sets the manager ID of this manager.
	*
	* @param managerId the manager ID of this manager
	*/
	@Override
	public void setManagerId(long managerId) {
		_manager.setManagerId(managerId);
	}

	/**
	* Sets the modified date of this manager.
	*
	* @param modifiedDate the modified date of this manager
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_manager.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_manager.setNew(n);
	}

	/**
	* Sets the plid of this manager.
	*
	* @param plid the plid of this manager
	*/
	@Override
	public void setPlid(long plid) {
		_manager.setPlid(plid);
	}

	/**
	* Sets the primary key of this manager.
	*
	* @param primaryKey the primary key of this manager
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_manager.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_manager.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this manager.
	*
	* @param status the status of this manager
	*/
	@Override
	public void setStatus(int status) {
		_manager.setStatus(status);
	}

	/**
	* Sets the status date of this manager.
	*
	* @param statusDate the status date of this manager
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_manager.setStatusDate(statusDate);
	}

	/**
	* Sets the url of this manager.
	*
	* @param url the url of this manager
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_manager.setUrl(url);
	}

	/**
	* Sets the user agent of this manager.
	*
	* @param userAgent the user agent of this manager
	*/
	@Override
	public void setUserAgent(java.lang.String userAgent) {
		_manager.setUserAgent(userAgent);
	}

	/**
	* Sets the user ID of this manager.
	*
	* @param userId the user ID of this manager
	*/
	@Override
	public void setUserId(long userId) {
		_manager.setUserId(userId);
	}

	/**
	* Sets the user manager ID of this manager.
	*
	* @param userManagerId the user manager ID of this manager
	*/
	@Override
	public void setUserManagerId(long userManagerId) {
		_manager.setUserManagerId(userManagerId);
	}

	/**
	* Sets the user name of this manager.
	*
	* @param userName the user name of this manager
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_manager.setUserName(userName);
	}

	/**
	* Sets the user uuid of this manager.
	*
	* @param userUuid the user uuid of this manager
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_manager.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ManagerWrapper)) {
			return false;
		}

		ManagerWrapper managerWrapper = (ManagerWrapper)obj;

		if (Objects.equals(_manager, managerWrapper._manager)) {
			return true;
		}

		return false;
	}

	@Override
	public Manager getWrappedModel() {
		return _manager;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _manager.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _manager.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_manager.resetOriginalValues();
	}

	private final Manager _manager;
}
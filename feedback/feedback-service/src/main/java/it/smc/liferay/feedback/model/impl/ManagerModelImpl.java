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

package it.smc.liferay.feedback.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import it.smc.liferay.feedback.model.Manager;
import it.smc.liferay.feedback.model.ManagerModel;
import it.smc.liferay.feedback.model.ManagerSoap;
import it.smc.liferay.feedback.util.ServiceProps;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Manager service. Represents a row in the &quot;feedback_Manager&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ManagerModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ManagerImpl}.
 * </p>
 *
 * @author dbg
 * @see ManagerImpl
 * @see Manager
 * @see ManagerModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class ManagerModelImpl extends BaseModelImpl<Manager>
	implements ManagerModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a manager model instance should use the {@link Manager} interface instead.
	 */
	public static final String TABLE_NAME = "feedback_Manager";
	public static final Object[][] TABLE_COLUMNS = {
			{ "managerId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "plid", Types.BIGINT },
			{ "description", Types.VARCHAR },
			{ "url", Types.VARCHAR },
			{ "userAgent", Types.VARCHAR },
			{ "internalNote", Types.VARCHAR },
			{ "file", Types.VARCHAR },
			{ "userManagerId", Types.BIGINT },
			{ "status", Types.INTEGER },
			{ "statusDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("managerId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("plid", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("url", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("userAgent", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("internalNote", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("file", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("userManagerId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("statusDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table feedback_Manager (managerId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,plid LONG,description VARCHAR(75) null,url VARCHAR(75) null,userAgent VARCHAR(75) null,internalNote VARCHAR(75) null,file VARCHAR(75) null,userManagerId LONG,status INTEGER,statusDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table feedback_Manager";
	public static final String ORDER_BY_JPQL = " ORDER BY manager.managerId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY feedback_Manager.managerId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(ServiceProps.get(
				"value.object.entity.cache.enabled.it.smc.liferay.feedback.model.Manager"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(ServiceProps.get(
				"value.object.finder.cache.enabled.it.smc.liferay.feedback.model.Manager"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(ServiceProps.get(
				"value.object.column.bitmask.enabled.it.smc.liferay.feedback.model.Manager"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long USERID_COLUMN_BITMASK = 4L;
	public static final long MANAGERID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Manager toModel(ManagerSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Manager model = new ManagerImpl();

		model.setManagerId(soapModel.getManagerId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setPlid(soapModel.getPlid());
		model.setDescription(soapModel.getDescription());
		model.setUrl(soapModel.getUrl());
		model.setUserAgent(soapModel.getUserAgent());
		model.setInternalNote(soapModel.getInternalNote());
		model.setFile(soapModel.getFile());
		model.setUserManagerId(soapModel.getUserManagerId());
		model.setStatus(soapModel.getStatus());
		model.setStatusDate(soapModel.getStatusDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Manager> toModels(ManagerSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Manager> models = new ArrayList<Manager>(soapModels.length);

		for (ManagerSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(ServiceProps.get(
				"lock.expiration.time.it.smc.liferay.feedback.model.Manager"));

	public ManagerModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _managerId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setManagerId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _managerId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

	@JSON
	@Override
	public long getManagerId() {
		return _managerId;
	}

	@Override
	public void setManagerId(long managerId) {
		_managerId = managerId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getPlid() {
		return _plid;
	}

	@Override
	public void setPlid(long plid) {
		_plid = plid;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	@Override
	public String getUrl() {
		if (_url == null) {
			return StringPool.BLANK;
		}
		else {
			return _url;
		}
	}

	@Override
	public void setUrl(String url) {
		_url = url;
	}

	@JSON
	@Override
	public String getUserAgent() {
		if (_userAgent == null) {
			return StringPool.BLANK;
		}
		else {
			return _userAgent;
		}
	}

	@Override
	public void setUserAgent(String userAgent) {
		_userAgent = userAgent;
	}

	@JSON
	@Override
	public String getInternalNote() {
		if (_internalNote == null) {
			return StringPool.BLANK;
		}
		else {
			return _internalNote;
		}
	}

	@Override
	public void setInternalNote(String internalNote) {
		_internalNote = internalNote;
	}

	@JSON
	@Override
	public String getFile() {
		if (_file == null) {
			return StringPool.BLANK;
		}
		else {
			return _file;
		}
	}

	@Override
	public void setFile(String file) {
		_file = file;
	}

	@JSON
	@Override
	public long getUserManagerId() {
		return _userManagerId;
	}

	@Override
	public void setUserManagerId(long userManagerId) {
		_userManagerId = userManagerId;
	}

	@JSON
	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;
	}

	@JSON
	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Manager.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Manager toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Manager)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ManagerImpl managerImpl = new ManagerImpl();

		managerImpl.setManagerId(getManagerId());
		managerImpl.setGroupId(getGroupId());
		managerImpl.setCompanyId(getCompanyId());
		managerImpl.setUserId(getUserId());
		managerImpl.setUserName(getUserName());
		managerImpl.setCreateDate(getCreateDate());
		managerImpl.setModifiedDate(getModifiedDate());
		managerImpl.setPlid(getPlid());
		managerImpl.setDescription(getDescription());
		managerImpl.setUrl(getUrl());
		managerImpl.setUserAgent(getUserAgent());
		managerImpl.setInternalNote(getInternalNote());
		managerImpl.setFile(getFile());
		managerImpl.setUserManagerId(getUserManagerId());
		managerImpl.setStatus(getStatus());
		managerImpl.setStatusDate(getStatusDate());

		managerImpl.resetOriginalValues();

		return managerImpl;
	}

	@Override
	public int compareTo(Manager manager) {
		long primaryKey = manager.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Manager)) {
			return false;
		}

		Manager manager = (Manager)obj;

		long primaryKey = manager.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		ManagerModelImpl managerModelImpl = this;

		managerModelImpl._originalGroupId = managerModelImpl._groupId;

		managerModelImpl._setOriginalGroupId = false;

		managerModelImpl._originalCompanyId = managerModelImpl._companyId;

		managerModelImpl._setOriginalCompanyId = false;

		managerModelImpl._originalUserId = managerModelImpl._userId;

		managerModelImpl._setOriginalUserId = false;

		managerModelImpl._setModifiedDate = false;

		managerModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Manager> toCacheModel() {
		ManagerCacheModel managerCacheModel = new ManagerCacheModel();

		managerCacheModel.managerId = getManagerId();

		managerCacheModel.groupId = getGroupId();

		managerCacheModel.companyId = getCompanyId();

		managerCacheModel.userId = getUserId();

		managerCacheModel.userName = getUserName();

		String userName = managerCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			managerCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			managerCacheModel.createDate = createDate.getTime();
		}
		else {
			managerCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			managerCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			managerCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		managerCacheModel.plid = getPlid();

		managerCacheModel.description = getDescription();

		String description = managerCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			managerCacheModel.description = null;
		}

		managerCacheModel.url = getUrl();

		String url = managerCacheModel.url;

		if ((url != null) && (url.length() == 0)) {
			managerCacheModel.url = null;
		}

		managerCacheModel.userAgent = getUserAgent();

		String userAgent = managerCacheModel.userAgent;

		if ((userAgent != null) && (userAgent.length() == 0)) {
			managerCacheModel.userAgent = null;
		}

		managerCacheModel.internalNote = getInternalNote();

		String internalNote = managerCacheModel.internalNote;

		if ((internalNote != null) && (internalNote.length() == 0)) {
			managerCacheModel.internalNote = null;
		}

		managerCacheModel.file = getFile();

		String file = managerCacheModel.file;

		if ((file != null) && (file.length() == 0)) {
			managerCacheModel.file = null;
		}

		managerCacheModel.userManagerId = getUserManagerId();

		managerCacheModel.status = getStatus();

		Date statusDate = getStatusDate();

		if (statusDate != null) {
			managerCacheModel.statusDate = statusDate.getTime();
		}
		else {
			managerCacheModel.statusDate = Long.MIN_VALUE;
		}

		return managerCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{managerId=");
		sb.append(getManagerId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", plid=");
		sb.append(getPlid());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", userAgent=");
		sb.append(getUserAgent());
		sb.append(", internalNote=");
		sb.append(getInternalNote());
		sb.append(", file=");
		sb.append(getFile());
		sb.append(", userManagerId=");
		sb.append(getUserManagerId());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", statusDate=");
		sb.append(getStatusDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("it.smc.liferay.feedback.model.Manager");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>managerId</column-name><column-value><![CDATA[");
		sb.append(getManagerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>plid</column-name><column-value><![CDATA[");
		sb.append(getPlid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userAgent</column-name><column-value><![CDATA[");
		sb.append(getUserAgent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>internalNote</column-name><column-value><![CDATA[");
		sb.append(getInternalNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>file</column-name><column-value><![CDATA[");
		sb.append(getFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userManagerId</column-name><column-value><![CDATA[");
		sb.append(getUserManagerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDate</column-name><column-value><![CDATA[");
		sb.append(getStatusDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Manager.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Manager.class
		};
	private long _managerId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _plid;
	private String _description;
	private String _url;
	private String _userAgent;
	private String _internalNote;
	private String _file;
	private long _userManagerId;
	private int _status;
	private Date _statusDate;
	private long _columnBitmask;
	private Manager _escapedModel;
}
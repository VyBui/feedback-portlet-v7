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

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import it.smc.liferay.feedback.model.Manager;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Manager in entity cache.
 *
 * @author dbg
 * @see Manager
 * @generated
 */
@ProviderType
public class ManagerCacheModel implements CacheModel<Manager>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ManagerCacheModel)) {
			return false;
		}

		ManagerCacheModel managerCacheModel = (ManagerCacheModel)obj;

		if (managerId == managerCacheModel.managerId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, managerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{managerId=");
		sb.append(managerId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", plid=");
		sb.append(plid);
		sb.append(", description=");
		sb.append(description);
		sb.append(", url=");
		sb.append(url);
		sb.append(", userAgent=");
		sb.append(userAgent);
		sb.append(", internalNote=");
		sb.append(internalNote);
		sb.append(", file=");
		sb.append(file);
		sb.append(", userManagerId=");
		sb.append(userManagerId);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Manager toEntityModel() {
		ManagerImpl managerImpl = new ManagerImpl();

		managerImpl.setManagerId(managerId);
		managerImpl.setGroupId(groupId);
		managerImpl.setCompanyId(companyId);
		managerImpl.setUserId(userId);

		if (userName == null) {
			managerImpl.setUserName(StringPool.BLANK);
		}
		else {
			managerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			managerImpl.setCreateDate(null);
		}
		else {
			managerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			managerImpl.setModifiedDate(null);
		}
		else {
			managerImpl.setModifiedDate(new Date(modifiedDate));
		}

		managerImpl.setPlid(plid);

		if (description == null) {
			managerImpl.setDescription(StringPool.BLANK);
		}
		else {
			managerImpl.setDescription(description);
		}

		if (url == null) {
			managerImpl.setUrl(StringPool.BLANK);
		}
		else {
			managerImpl.setUrl(url);
		}

		if (userAgent == null) {
			managerImpl.setUserAgent(StringPool.BLANK);
		}
		else {
			managerImpl.setUserAgent(userAgent);
		}

		if (internalNote == null) {
			managerImpl.setInternalNote(StringPool.BLANK);
		}
		else {
			managerImpl.setInternalNote(internalNote);
		}

		if (file == null) {
			managerImpl.setFile(StringPool.BLANK);
		}
		else {
			managerImpl.setFile(file);
		}

		managerImpl.setUserManagerId(userManagerId);
		managerImpl.setStatus(status);

		if (statusDate == Long.MIN_VALUE) {
			managerImpl.setStatusDate(null);
		}
		else {
			managerImpl.setStatusDate(new Date(statusDate));
		}

		managerImpl.resetOriginalValues();

		return managerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		managerId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		plid = objectInput.readLong();
		description = objectInput.readUTF();
		url = objectInput.readUTF();
		userAgent = objectInput.readUTF();
		internalNote = objectInput.readUTF();
		file = objectInput.readUTF();

		userManagerId = objectInput.readLong();

		status = objectInput.readInt();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(managerId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(plid);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}

		if (userAgent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userAgent);
		}

		if (internalNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(internalNote);
		}

		if (file == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(file);
		}

		objectOutput.writeLong(userManagerId);

		objectOutput.writeInt(status);
		objectOutput.writeLong(statusDate);
	}

	public long managerId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long plid;
	public String description;
	public String url;
	public String userAgent;
	public String internalNote;
	public String file;
	public long userManagerId;
	public int status;
	public long statusDate;
}
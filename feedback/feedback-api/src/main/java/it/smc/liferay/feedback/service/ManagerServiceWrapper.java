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

package it.smc.liferay.feedback.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ManagerService}.
 *
 * @author dbg
 * @see ManagerService
 * @generated
 */
@ProviderType
public class ManagerServiceWrapper implements ManagerService,
	ServiceWrapper<ManagerService> {
	public ManagerServiceWrapper(ManagerService managerService) {
		_managerService = managerService;
	}

	@Override
	public int getGroupEntriesCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerService.getGroupEntriesCount(groupId);
	}

	@Override
	public it.smc.liferay.feedback.model.Manager addManager(long userId,
		long groupId, long plid, java.lang.String description,
		java.lang.String url, java.lang.String userAgent,
		java.lang.String shortFileName, java.io.InputStream inputStream,
		long userManagerId, int status, java.util.Date statusDate,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _managerService.addManager(userId, groupId, plid, description,
			url, userAgent, shortFileName, inputStream, userManagerId, status,
			statusDate, serviceContext);
	}

	@Override
	public it.smc.liferay.feedback.model.Manager getManager(long managerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _managerService.getManager(managerId);
	}

	@Override
	public it.smc.liferay.feedback.model.Manager updateManager(long managerId,
		long plid, java.lang.String description, long userManagerId,
		int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _managerService.updateManager(managerId, plid, description,
			userManagerId, status, serviceContext);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _managerService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<it.smc.liferay.feedback.model.Manager> getGroupEntries(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerService.getGroupEntries(groupId, start, end);
	}

	@Override
	public void deleteManager(long managerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_managerService.deleteManager(managerId);
	}

	@Override
	public ManagerService getWrappedService() {
		return _managerService;
	}

	@Override
	public void setWrappedService(ManagerService managerService) {
		_managerService = managerService;
	}

	private ManagerService _managerService;
}
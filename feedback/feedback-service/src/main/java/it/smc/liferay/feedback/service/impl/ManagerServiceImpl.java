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

package it.smc.liferay.feedback.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import aQute.bnd.annotation.ProviderType;
import it.smc.liferay.feedback.model.Manager;
import it.smc.liferay.feedback.service.base.ManagerServiceBaseImpl;

/**
 * The implementation of the manager remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link it.smc.liferay.feedback.service.ManagerService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author dbg
 * @see ManagerServiceBaseImpl
 * @see it.smc.liferay.feedback.service.ManagerServiceUtil
 */
@ProviderType
public class ManagerServiceImpl extends ManagerServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link it.smc.liferay.feedback.service.ManagerServiceUtil} to access the manager remote service.
	 */
	public Manager addManager(
			long userId, long groupId, long plid, String description,
			String url, String userAgent,
			String shortFileName, InputStream inputStream, long userManagerId,
			int status, Date statusDate, ServiceContext serviceContext)
			throws PortalException, SystemException {

			// ManagerPermission.check(
			// getPermissionChecker(), groupId, ActionKeys.ADD_MANAGER);

			return managerLocalService.addManager(
				userId, plid, description, url, userAgent, shortFileName,
				inputStream, userManagerId, status, statusDate, serviceContext);
		}

		public void deleteManager(long managerId)
			throws PortalException, SystemException {

			// ManagerPermission.check(
			// getPermissionChecker(), managerId, ActionKeys.DELETE);

			managerLocalService.deleteManager(managerId);
		}

		public Manager updateManager(
			long managerId, long plid, String description,
			long userManagerId, int status,
			ServiceContext serviceContext)
			throws PortalException, SystemException {

			// ManagerPermission.check(
			// getPermissionChecker(), managerId, ActionKeys.UPDATE);

			return managerLocalService.updateManager(
				managerId, plid, description, userManagerId, status,
				serviceContext);
		}

		public Manager getManager(long managerId)
			throws PortalException, SystemException {

			Manager manager = managerLocalService.getManager(managerId);

			// ManagerEntryPermission.check(
			// getPermissionChecker(), manager, ActionKeys.VIEW);

			return manager;
		}

		public List<Manager> getGroupEntries(long groupId, int start, int end)
			throws SystemException {

			return managerLocalService.getGroupEntries(groupId, start, end);
		}

		public int getGroupEntriesCount(long groupId)
			throws SystemException {

			int count = managerLocalService.getGroupEntriesCount(groupId);

			return count;
		}
}
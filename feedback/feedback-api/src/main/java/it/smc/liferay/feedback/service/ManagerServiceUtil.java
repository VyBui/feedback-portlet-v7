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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Manager. This utility wraps
 * {@link it.smc.liferay.feedback.service.impl.ManagerServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author dbg
 * @see ManagerService
 * @see it.smc.liferay.feedback.service.base.ManagerServiceBaseImpl
 * @see it.smc.liferay.feedback.service.impl.ManagerServiceImpl
 * @generated
 */
@ProviderType
public class ManagerServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link it.smc.liferay.feedback.service.impl.ManagerServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static int getGroupEntriesCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGroupEntriesCount(groupId);
	}

	public static it.smc.liferay.feedback.model.Manager addManager(
		long userId, long groupId, long plid, java.lang.String description,
		java.lang.String url, java.lang.String userAgent,
		java.lang.String shortFileName, java.io.InputStream inputStream,
		long userManagerId, int status, java.util.Date statusDate,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addManager(userId, groupId, plid, description, url,
			userAgent, shortFileName, inputStream, userManagerId, status,
			statusDate, serviceContext);
	}

	public static it.smc.liferay.feedback.model.Manager getManager(
		long managerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getManager(managerId);
	}

	public static it.smc.liferay.feedback.model.Manager updateManager(
		long managerId, long plid, java.lang.String description,
		long userManagerId, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateManager(managerId, plid, description, userManagerId,
			status, serviceContext);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<it.smc.liferay.feedback.model.Manager> getGroupEntries(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGroupEntries(groupId, start, end);
	}

	public static void deleteManager(long managerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteManager(managerId);
	}

	public static ManagerService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ManagerService, ManagerService> _serviceTracker =
		ServiceTrackerFactory.open(ManagerService.class);
}
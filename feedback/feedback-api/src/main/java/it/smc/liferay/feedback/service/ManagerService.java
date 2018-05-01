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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import it.smc.liferay.feedback.model.Manager;

import java.io.InputStream;

import java.util.Date;
import java.util.List;

/**
 * Provides the remote service interface for Manager. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author dbg
 * @see ManagerServiceUtil
 * @see it.smc.liferay.feedback.service.base.ManagerServiceBaseImpl
 * @see it.smc.liferay.feedback.service.impl.ManagerServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=feedback", "json.web.service.context.path=Manager"}, service = ManagerService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ManagerService extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManagerServiceUtil} to access the manager remote service. Add custom service methods to {@link it.smc.liferay.feedback.service.impl.ManagerServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getGroupEntriesCount(long groupId) throws SystemException;

	public Manager addManager(long userId, long groupId, long plid,
		java.lang.String description, java.lang.String url,
		java.lang.String userAgent, java.lang.String shortFileName,
		InputStream inputStream, long userManagerId, int status,
		Date statusDate, ServiceContext serviceContext)
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Manager getManager(long managerId)
		throws PortalException, SystemException;

	public Manager updateManager(long managerId, long plid,
		java.lang.String description, long userManagerId, int status,
		ServiceContext serviceContext) throws PortalException, SystemException;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Manager> getGroupEntries(long groupId, int start, int end)
		throws SystemException;

	public void deleteManager(long managerId)
		throws PortalException, SystemException;
}
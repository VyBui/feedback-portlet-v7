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
 * Provides a wrapper for {@link ManagerLocalService}.
 *
 * @author dbg
 * @see ManagerLocalService
 * @generated
 */
@ProviderType
public class ManagerLocalServiceWrapper implements ManagerLocalService,
	ServiceWrapper<ManagerLocalService> {
	public ManagerLocalServiceWrapper(ManagerLocalService managerLocalService) {
		_managerLocalService = managerLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _managerLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _managerLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _managerLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _managerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _managerLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countByG_U(long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.countByG_U(groupId, userId);
	}

	@Override
	public int getCompanyEntriesCount(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.getCompanyEntriesCount(companyId);
	}

	@Override
	public int getGroupEntriesCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.getGroupEntriesCount(groupId);
	}

	/**
	* Returns the number of managers.
	*
	* @return the number of managers
	*/
	@Override
	public int getManagersCount() {
		return _managerLocalService.getManagersCount();
	}

	@Override
	public int searchCount(long companyId, long groupId, long plid,
		java.lang.String description, long userManagerId, int status,
		boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.searchCount(companyId, groupId, plid,
			description, userManagerId, status, andOperator);
	}

	/**
	* Adds the manager to the database. Also notifies the appropriate model listeners.
	*
	* @param manager the manager
	* @return the manager that was added
	*/
	@Override
	public it.smc.liferay.feedback.model.Manager addManager(
		it.smc.liferay.feedback.model.Manager manager) {
		return _managerLocalService.addManager(manager);
	}

	@Override
	public it.smc.liferay.feedback.model.Manager addManager(long userId,
		long plid, java.lang.String description, java.lang.String url,
		java.lang.String userAgent, java.lang.String filename,
		java.io.InputStream inputStream, long userManagerId, int status,
		java.util.Date statusDate,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.addManager(userId, plid, description, url,
			userAgent, filename, inputStream, userManagerId, status,
			statusDate, serviceContext);
	}

	/**
	* Creates a new manager with the primary key. Does not add the manager to the database.
	*
	* @param managerId the primary key for the new manager
	* @return the new manager
	*/
	@Override
	public it.smc.liferay.feedback.model.Manager createManager(long managerId) {
		return _managerLocalService.createManager(managerId);
	}

	/**
	* Deletes the manager from the database. Also notifies the appropriate model listeners.
	*
	* @param manager the manager
	* @return the manager that was removed
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public it.smc.liferay.feedback.model.Manager deleteManager(
		it.smc.liferay.feedback.model.Manager manager)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.deleteManager(manager);
	}

	/**
	* Deletes the manager with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param managerId the primary key of the manager
	* @return the manager that was removed
	* @throws PortalException if a manager with the primary key could not be found
	* @throws SystemException
	*/
	@Override
	public it.smc.liferay.feedback.model.Manager deleteManager(long managerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.deleteManager(managerId);
	}

	@Override
	public it.smc.liferay.feedback.model.Manager fetchManager(long managerId) {
		return _managerLocalService.fetchManager(managerId);
	}

	/**
	* Returns the manager with the primary key.
	*
	* @param managerId the primary key of the manager
	* @return the manager
	* @throws PortalException if a manager with the primary key could not be found
	*/
	@Override
	public it.smc.liferay.feedback.model.Manager getManager(long managerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _managerLocalService.getManager(managerId);
	}

	/**
	* Updates the manager in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param manager the manager
	* @return the manager that was updated
	*/
	@Override
	public it.smc.liferay.feedback.model.Manager updateManager(
		it.smc.liferay.feedback.model.Manager manager) {
		return _managerLocalService.updateManager(manager);
	}

	@Override
	public it.smc.liferay.feedback.model.Manager updateManager(long managerId,
		long plid, java.lang.String description, long userManagerId,
		int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.updateManager(managerId, plid, description,
			userManagerId, status, serviceContext);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _managerLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _managerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.smc.liferay.feedback.model.impl.ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _managerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.smc.liferay.feedback.model.impl.ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _managerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<it.smc.liferay.feedback.model.Manager> getByG_U(
		long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.getByG_U(groupId, userId);
	}

	@Override
	public java.util.List<it.smc.liferay.feedback.model.Manager> getCompanyEntries(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.getCompanyEntries(companyId, start, end);
	}

	@Override
	public java.util.List<it.smc.liferay.feedback.model.Manager> getCompanyEntries(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.getCompanyEntries(companyId, start, end, obc);
	}

	@Override
	public java.util.List<it.smc.liferay.feedback.model.Manager> getGroupEntries(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.getGroupEntries(groupId, start, end);
	}

	/**
	* Returns a range of all the managers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.smc.liferay.feedback.model.impl.ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @return the range of managers
	*/
	@Override
	public java.util.List<it.smc.liferay.feedback.model.Manager> getManagers(
		int start, int end) {
		return _managerLocalService.getManagers(start, end);
	}

	@Override
	public java.util.List<it.smc.liferay.feedback.model.Manager> search(
		long companyId, long groupId, long plid, java.lang.String description,
		long userManagerId, int status, boolean andOperator, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.search(companyId, groupId, plid,
			description, userManagerId, status, andOperator, start, end, obc);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _managerLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _managerLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public void deleteGroupEntries(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_managerLocalService.deleteGroupEntries(groupId);
	}

	@Override
	public ManagerLocalService getWrappedService() {
		return _managerLocalService;
	}

	@Override
	public void setWrappedService(ManagerLocalService managerLocalService) {
		_managerLocalService = managerLocalService;
	}

	private ManagerLocalService _managerLocalService;
}
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

package it.smc.liferay.feedback.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import it.smc.liferay.feedback.exception.NoSuchManagerException;
import it.smc.liferay.feedback.model.Manager;

/**
 * The persistence interface for the manager service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dbg
 * @see it.smc.liferay.feedback.service.persistence.impl.ManagerPersistenceImpl
 * @see ManagerUtil
 * @generated
 */
@ProviderType
public interface ManagerPersistence extends BasePersistence<Manager> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManagerUtil} to access the manager persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the managers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching managers
	*/
	public java.util.List<Manager> findByGroupId(long groupId);

	/**
	* Returns a range of all the managers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @return the range of matching managers
	*/
	public java.util.List<Manager> findByGroupId(long groupId, int start,
		int end);

	/**
	* Returns an ordered range of all the managers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching managers
	*/
	public java.util.List<Manager> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator);

	/**
	* Returns an ordered range of all the managers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching managers
	*/
	public java.util.List<Manager> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first manager in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching manager
	* @throws NoSuchManagerException if a matching manager could not be found
	*/
	public Manager findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator)
		throws NoSuchManagerException;

	/**
	* Returns the first manager in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching manager, or <code>null</code> if a matching manager could not be found
	*/
	public Manager fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator);

	/**
	* Returns the last manager in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching manager
	* @throws NoSuchManagerException if a matching manager could not be found
	*/
	public Manager findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator)
		throws NoSuchManagerException;

	/**
	* Returns the last manager in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching manager, or <code>null</code> if a matching manager could not be found
	*/
	public Manager fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator);

	/**
	* Returns the managers before and after the current manager in the ordered set where groupId = &#63;.
	*
	* @param managerId the primary key of the current manager
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next manager
	* @throws NoSuchManagerException if a manager with the primary key could not be found
	*/
	public Manager[] findByGroupId_PrevAndNext(long managerId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator)
		throws NoSuchManagerException;

	/**
	* Removes all the managers where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of managers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching managers
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the managers where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the matching managers
	*/
	public java.util.List<Manager> findByU_G(long userId, long groupId);

	/**
	* Returns a range of all the managers where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @return the range of matching managers
	*/
	public java.util.List<Manager> findByU_G(long userId, long groupId,
		int start, int end);

	/**
	* Returns an ordered range of all the managers where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching managers
	*/
	public java.util.List<Manager> findByU_G(long userId, long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator);

	/**
	* Returns an ordered range of all the managers where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching managers
	*/
	public java.util.List<Manager> findByU_G(long userId, long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first manager in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching manager
	* @throws NoSuchManagerException if a matching manager could not be found
	*/
	public Manager findByU_G_First(long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator)
		throws NoSuchManagerException;

	/**
	* Returns the first manager in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching manager, or <code>null</code> if a matching manager could not be found
	*/
	public Manager fetchByU_G_First(long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator);

	/**
	* Returns the last manager in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching manager
	* @throws NoSuchManagerException if a matching manager could not be found
	*/
	public Manager findByU_G_Last(long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator)
		throws NoSuchManagerException;

	/**
	* Returns the last manager in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching manager, or <code>null</code> if a matching manager could not be found
	*/
	public Manager fetchByU_G_Last(long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator);

	/**
	* Returns the managers before and after the current manager in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param managerId the primary key of the current manager
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next manager
	* @throws NoSuchManagerException if a manager with the primary key could not be found
	*/
	public Manager[] findByU_G_PrevAndNext(long managerId, long userId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator)
		throws NoSuchManagerException;

	/**
	* Removes all the managers where userId = &#63; and groupId = &#63; from the database.
	*
	* @param userId the user ID
	* @param groupId the group ID
	*/
	public void removeByU_G(long userId, long groupId);

	/**
	* Returns the number of managers where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the number of matching managers
	*/
	public int countByU_G(long userId, long groupId);

	/**
	* Returns all the managers where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching managers
	*/
	public java.util.List<Manager> findByUserId(long userId);

	/**
	* Returns a range of all the managers where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @return the range of matching managers
	*/
	public java.util.List<Manager> findByUserId(long userId, int start, int end);

	/**
	* Returns an ordered range of all the managers where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching managers
	*/
	public java.util.List<Manager> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator);

	/**
	* Returns an ordered range of all the managers where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching managers
	*/
	public java.util.List<Manager> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first manager in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching manager
	* @throws NoSuchManagerException if a matching manager could not be found
	*/
	public Manager findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator)
		throws NoSuchManagerException;

	/**
	* Returns the first manager in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching manager, or <code>null</code> if a matching manager could not be found
	*/
	public Manager fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator);

	/**
	* Returns the last manager in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching manager
	* @throws NoSuchManagerException if a matching manager could not be found
	*/
	public Manager findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator)
		throws NoSuchManagerException;

	/**
	* Returns the last manager in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching manager, or <code>null</code> if a matching manager could not be found
	*/
	public Manager fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator);

	/**
	* Returns the managers before and after the current manager in the ordered set where userId = &#63;.
	*
	* @param managerId the primary key of the current manager
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next manager
	* @throws NoSuchManagerException if a manager with the primary key could not be found
	*/
	public Manager[] findByUserId_PrevAndNext(long managerId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator)
		throws NoSuchManagerException;

	/**
	* Removes all the managers where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of managers where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching managers
	*/
	public int countByUserId(long userId);

	/**
	* Returns all the managers where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching managers
	*/
	public java.util.List<Manager> findByCompanyId(long companyId);

	/**
	* Returns a range of all the managers where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @return the range of matching managers
	*/
	public java.util.List<Manager> findByCompanyId(long companyId, int start,
		int end);

	/**
	* Returns an ordered range of all the managers where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching managers
	*/
	public java.util.List<Manager> findByCompanyId(long companyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator);

	/**
	* Returns an ordered range of all the managers where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching managers
	*/
	public java.util.List<Manager> findByCompanyId(long companyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first manager in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching manager
	* @throws NoSuchManagerException if a matching manager could not be found
	*/
	public Manager findByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator)
		throws NoSuchManagerException;

	/**
	* Returns the first manager in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching manager, or <code>null</code> if a matching manager could not be found
	*/
	public Manager fetchByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator);

	/**
	* Returns the last manager in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching manager
	* @throws NoSuchManagerException if a matching manager could not be found
	*/
	public Manager findByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator)
		throws NoSuchManagerException;

	/**
	* Returns the last manager in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching manager, or <code>null</code> if a matching manager could not be found
	*/
	public Manager fetchByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator);

	/**
	* Returns the managers before and after the current manager in the ordered set where companyId = &#63;.
	*
	* @param managerId the primary key of the current manager
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next manager
	* @throws NoSuchManagerException if a manager with the primary key could not be found
	*/
	public Manager[] findByCompanyId_PrevAndNext(long managerId,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator)
		throws NoSuchManagerException;

	/**
	* Removes all the managers where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	*/
	public void removeByCompanyId(long companyId);

	/**
	* Returns the number of managers where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching managers
	*/
	public int countByCompanyId(long companyId);

	/**
	* Caches the manager in the entity cache if it is enabled.
	*
	* @param manager the manager
	*/
	public void cacheResult(Manager manager);

	/**
	* Caches the managers in the entity cache if it is enabled.
	*
	* @param managers the managers
	*/
	public void cacheResult(java.util.List<Manager> managers);

	/**
	* Creates a new manager with the primary key. Does not add the manager to the database.
	*
	* @param managerId the primary key for the new manager
	* @return the new manager
	*/
	public Manager create(long managerId);

	/**
	* Removes the manager with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param managerId the primary key of the manager
	* @return the manager that was removed
	* @throws NoSuchManagerException if a manager with the primary key could not be found
	*/
	public Manager remove(long managerId) throws NoSuchManagerException;

	public Manager updateImpl(Manager manager);

	/**
	* Returns the manager with the primary key or throws a {@link NoSuchManagerException} if it could not be found.
	*
	* @param managerId the primary key of the manager
	* @return the manager
	* @throws NoSuchManagerException if a manager with the primary key could not be found
	*/
	public Manager findByPrimaryKey(long managerId)
		throws NoSuchManagerException;

	/**
	* Returns the manager with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param managerId the primary key of the manager
	* @return the manager, or <code>null</code> if a manager with the primary key could not be found
	*/
	public Manager fetchByPrimaryKey(long managerId);

	@Override
	public java.util.Map<java.io.Serializable, Manager> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the managers.
	*
	* @return the managers
	*/
	public java.util.List<Manager> findAll();

	/**
	* Returns a range of all the managers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @return the range of managers
	*/
	public java.util.List<Manager> findAll(int start, int end);

	/**
	* Returns an ordered range of all the managers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of managers
	*/
	public java.util.List<Manager> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator);

	/**
	* Returns an ordered range of all the managers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of managers
	*/
	public java.util.List<Manager> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Manager> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the managers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of managers.
	*
	* @return the number of managers
	*/
	public int countAll();
}
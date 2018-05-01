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

package it.smc.liferay.feedback.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import it.smc.liferay.feedback.model.Manager;
import it.smc.liferay.feedback.service.persistence.ManagerPersistence;

/**
 * @author dbg
 * @generated
 */
public class ManagerFinderBaseImpl extends BasePersistenceImpl<Manager> {
	/**
	 * Returns the manager persistence.
	 *
	 * @return the manager persistence
	 */
	public ManagerPersistence getManagerPersistence() {
		return managerPersistence;
	}

	/**
	 * Sets the manager persistence.
	 *
	 * @param managerPersistence the manager persistence
	 */
	public void setManagerPersistence(ManagerPersistence managerPersistence) {
		this.managerPersistence = managerPersistence;
	}

	@BeanReference(type = ManagerPersistence.class)
	protected ManagerPersistence managerPersistence;
}
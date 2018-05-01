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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Manager service. Represents a row in the &quot;feedback_Manager&quot; database table, with each column mapped to a property of this class.
 *
 * @author dbg
 * @see ManagerModel
 * @see it.smc.liferay.feedback.model.impl.ManagerImpl
 * @see it.smc.liferay.feedback.model.impl.ManagerModelImpl
 * @generated
 */
@ImplementationClassName("it.smc.liferay.feedback.model.impl.ManagerImpl")
@ProviderType
public interface Manager extends ManagerModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link it.smc.liferay.feedback.model.impl.ManagerImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Manager, Long> MANAGER_ID_ACCESSOR = new Accessor<Manager, Long>() {
			@Override
			public Long get(Manager manager) {
				return manager.getManagerId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Manager> getTypeClass() {
				return Manager.class;
			}
		};
}
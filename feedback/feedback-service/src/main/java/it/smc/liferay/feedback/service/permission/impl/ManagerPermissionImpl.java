package it.smc.liferay.feedback.service.permission.impl;

import it.smc.liferay.feedback.permission.TopLevelResourcePermission;

public class ManagerPermissionImpl extends TopLevelResourcePermission {

	@Override
	protected String getResourceName() {

		return TOP_LEVEL_RESOURCE;
	}

	private static final String TOP_LEVEL_RESOURCE =
		"it.smc.liferay.feedback.model.Manager";
}

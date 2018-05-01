package it.smc.liferay.feedback.permission;

import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

import it.smc.liferay.feedback.enums.ActionKeys;

public interface BaseResourcePermission {

	void checkTopLevel(
		PermissionChecker permissionChecker, long groupId,
		ActionKeys actionKeys)
		throws PrincipalException;

	boolean containsTopLevel(
		PermissionChecker permissionChecker, long groupId,
		ActionKeys actionKeys);

}
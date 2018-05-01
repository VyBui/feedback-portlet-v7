package it.smc.liferay.feedback.permission;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import it.smc.liferay.feedback.enums.ActionKeys;

import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

@Component(immediate = true, service = ManagerPermissionUtil.class)
public class ManagerPermissionUtil {
	public static void checkTopLevel(
			PermissionChecker permissionChecker, long groupId, ActionKeys actionKeys)
		throws PrincipalException {

		_baseResourcePermission.checkTopLevel(permissionChecker, groupId, actionKeys);
	}

	public static boolean containsTopLevel(
			PermissionChecker permissionChecker, long groupId, ActionKeys actionKeys) {

		return _baseResourcePermission.containsTopLevel(permissionChecker, groupId, actionKeys);
	}

	@Reference(target = "(resource.name=it.smc.liferay.feedback.model.Manager)", unbind = "-")
	protected void setBaseResourcePermission(
			BaseResourcePermission baseResourcePermission) {

		_baseResourcePermission = baseResourcePermission;
	}

	private static BaseResourcePermission _baseResourcePermission;
}

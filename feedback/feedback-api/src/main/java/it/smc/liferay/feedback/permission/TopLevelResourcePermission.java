package it.smc.liferay.feedback.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;

import it.smc.liferay.feedback.enums.ActionKeys;

public abstract class TopLevelResourcePermission implements BaseResourcePermission {
	public TopLevelResourcePermission() {
		super();
	}

	@Override
	public void checkTopLevel(
			PermissionChecker permissionChecker, long groupId,
			ActionKeys actionKeys)
		throws PrincipalException {

		if (!containsTopLevel(permissionChecker, groupId, actionKeys)) {

			if (_log.isDebugEnabled()) {
				_log.debug(
					String.format(
						"UserId=%s does not have %s permission to access resource %s",
						permissionChecker.getUserId(), actionKeys.getKey(),
						getResourceName()));
			}

			throw new PrincipalException.MustHavePermission(
				permissionChecker.getUserId(), getResourceName(), groupId,
				actionKeys.getKey());
		}
	}

	@Override
	public boolean containsTopLevel(
		PermissionChecker permissionChecker, long groupId,
		ActionKeys actionKeys) {

		boolean hasPermission = permissionChecker.hasPermission(
			groupId, getResourceName(), CLASS_PK, actionKeys.getKey());

		if (hasPermission) {
			return true;
		}

		try {
			Group group = GroupLocalServiceUtil.getGroup(groupId);

			return permissionChecker.hasPermission(
				group.getParentGroupId(), getResourceName(), CLASS_PK,
				actionKeys.getKey());
		}
		catch (PortalException e) {
			_log.warn(e.getMessage(), e);
		}

		return false;
	}

	protected abstract String getResourceName();

	private static final long CLASS_PK = 0;

	private Log _log = LogFactoryUtil.getLog(TopLevelResourcePermission.class);
}
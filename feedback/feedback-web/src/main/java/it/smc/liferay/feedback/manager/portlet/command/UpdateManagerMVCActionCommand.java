package it.smc.liferay.feedback.manager.portlet.command;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import it.smc.liferay.feedback.model.Manager;
import it.smc.liferay.feedback.service.ManagerLocalServiceUtil;

public class UpdateManagerMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);

		long managerId = ParamUtil.getLong(actionRequest, "managerId");

		long plid = ParamUtil.getLong(actionRequest, "plid");

		String description = ParamUtil.getString(actionRequest, "description");

		long userManagerId = ParamUtil.getLong(actionRequest, "userManagerId");
		int status = ParamUtil.getInteger(actionRequest, "status");

		ServiceContext serviceContext =
			ServiceContextFactory.getInstance(
				Manager.class.getName(), actionRequest);

		if (cmd.equals(Constants.UPDATE)) {

			ManagerLocalServiceUtil.updateManager(
				managerId, plid, description, userManagerId,
				status, serviceContext);
		}
	}

}

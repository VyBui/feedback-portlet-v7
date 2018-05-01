package it.smc.liferay.feedback.manager.portlet.command;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import it.smc.liferay.feedback.service.ManagerLocalServiceUtil;

public class DeleteManagerMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);
		long managerId = ParamUtil.getLong(actionRequest, "managerId");

		if (cmd.equals(Constants.DELETE)) {
			ManagerLocalServiceUtil.deleteManager(managerId);
		}
	}

}

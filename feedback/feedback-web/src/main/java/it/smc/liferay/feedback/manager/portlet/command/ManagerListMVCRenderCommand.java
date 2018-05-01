package it.smc.liferay.feedback.manager.portlet.command;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import it.smc.liferay.feedback.exception.ManagerException;
import it.smc.liferay.feedback.exception.NoSuchManagerException;
import it.smc.liferay.feedback.manager.constants.ManagerPortletKeys;
import it.smc.liferay.feedback.model.Manager;
import it.smc.liferay.feedback.service.ManagerLocalServiceUtil;
import it.smc.liferay.feedback.util.WebKeys;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + ManagerPortletKeys.MANAGER_LIST_PORTLET,
		"mvc.command.name=/",
		"mvc.command.name=/manager/view"
	},
	service = MVCRenderCommand.class)
public class ManagerListMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {

		try {
			Manager manager = null;

			long managerId = ParamUtil.getLong(renderRequest, "managerId");

			if (managerId > 0) {
				manager = ManagerLocalServiceUtil.getManager(managerId);
			}

			renderRequest.setAttribute(WebKeys.MANAGER, manager);
		}
		catch (Exception e) {
			if (e instanceof ManagerException ||
				e instanceof NoSuchManagerException ||
				e instanceof PrincipalException) {

				SessionErrors.add(renderRequest, e.getClass().getName());
			}
			else {
				throw new PortletException(e);
			}
		}
		return "manager/view.jsp";
	}

}

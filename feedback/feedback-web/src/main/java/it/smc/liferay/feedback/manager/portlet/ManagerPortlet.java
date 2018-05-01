package it.smc.liferay.feedback.manager.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import it.smc.liferay.feedback.manager.constants.ManagerPortletKeys;

/**
 * @author Vy Bui
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.feedback",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=test-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/html/manager/view.jsp",
		"javax.portlet.name=" + ManagerPortletKeys.MANAGER_PORTLET,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ManagerPortlet extends MVCPortlet {
}
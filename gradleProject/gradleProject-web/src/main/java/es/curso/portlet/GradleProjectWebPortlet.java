package es.curso.portlet;

import es.curso.constants.GradleProjectWebPortletKeys;
import es.curso.service.TareaLocalServiceUtil;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author emilio89
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + GradleProjectWebPortletKeys.GradleProjectWeb,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class GradleProjectWebPortlet extends MVCPortlet {
	
	
	public void render (RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {		
		System.out.println("ENTRA EN RENDER" );
		super.render(renderRequest, renderResponse);
	}

}
package com.sports.portlet.tournament;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.sports.portlet.tournament.model.Tournament;
import com.sports.portlet.tournament.model.impl.TournamentImpl;
import com.sports.portlet.tournament.service.TournamentLocalServiceUtil;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

/**
 * Portlet implementation class TournamentPortlet
 */
public class TournamentPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.doView(renderRequest, renderResponse);
	}

	@Override
	public void processAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		long tournamentId = ParamUtil.getLong(actionRequest, "tournamentId");
		String name = ParamUtil.getString(actionRequest, "name");
		String type = ParamUtil.getString(actionRequest, "type");
		Tournament tournament = new TournamentImpl();
		tournament.setName(name);
		tournament.setType(type);
		tournament.setCreateDate(new Date());
		tournament.setModifiedDate(new Date());
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		tournament.setCompanyId(themeDisplay.getCompanyId());
		tournament.setGroupId(themeDisplay.getScopeGroupId());
		tournament.setCreatedBy(themeDisplay.getUserId());
		tournament.setUpdatedBy(themeDisplay.getUserId());
		
		try {
			TournamentLocalServiceUtil.addTournament(tournament);
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		// TODO Auto-generated method stub
		super.serveResource(resourceRequest, resourceResponse);
	}
 

}

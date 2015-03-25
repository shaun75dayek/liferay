package com.sports.portlet.tournament;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.sports.portlet.team.model.Team;
import com.sports.portlet.team.model.impl.TeamImpl;
import com.sports.portlet.team.service.TeamLocalServiceUtil;
import com.sports.portlet.tournament.model.Tournament;
import com.sports.portlet.tournament.model.impl.TournamentImpl;
import com.sports.portlet.tournament.service.TournamentLocalServiceUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
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

	private final static String fileInputName = "logo1";
	long parentFolderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.doView(renderRequest, renderResponse);
	}

	@Override
	public void processAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		String cmd = ParamUtil.getString(actionRequest, "cmd");
		if(Validator.isNotNull(cmd)) {
			if(cmd.equalsIgnoreCase("deleteTournament")) {
				deleteTournament(actionRequest, actionResponse);
			} else if(cmd.equalsIgnoreCase("deleteTeam")) {
				deleteTeam(actionRequest, actionResponse);
			} else if(cmd.equalsIgnoreCase("editTeam")) {
				editTeam(actionRequest, actionResponse);
			}
		} else {
			try {
				editTournament(actionRequest, actionResponse);
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		// TODO Auto-generated method stub
		super.serveResource(resourceRequest, resourceResponse);
	}
 
	public void editTournament(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException, PortalException, SystemException {
		
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		System.out.println("called");
		long tournamentId = ParamUtil.getLong(uploadPortletRequest, "tournamentId");
		SimpleDateFormat dateFormat = new SimpleDateFormat("mmddyyyy");
		Date startDate = ParamUtil.getDate(uploadPortletRequest, "startDate", dateFormat);
		Date endDate = ParamUtil.getDate(uploadPortletRequest, "endDate", dateFormat);
		ThemeDisplay themeDisplay = (ThemeDisplay) uploadPortletRequest.getAttribute(WebKeys.THEME_DISPLAY);
		Tournament tournament = null;
		if(Validator.isNotNull(tournamentId)) {
			try {
				tournament  = TournamentLocalServiceUtil.fetchTournament(tournamentId);
			} catch (SystemException e) {
				e.printStackTrace();
			}
		} else {
			tournament = new TournamentImpl();
			tournament.setCreateDate(new Date());
			tournament.setCompanyId(themeDisplay.getCompanyId());
			tournament.setGroupId(themeDisplay.getScopeGroupId());
			tournament.setCreatedBy(themeDisplay.getUserId());
		}
		
		String name = ParamUtil.getString(uploadPortletRequest, "name");
		String type = ParamUtil.getString(uploadPortletRequest, "type");
		tournament.setStartDate(startDate);
		tournament.setEndDate(endDate);
		tournament.setName(name);
		tournament.setType(type);
		tournament.setModifiedDate(new Date());
		tournament.setUpdatedBy(themeDisplay.getUserId());
		
		long groupId = themeDisplay.getScopeGroupId();
		long companyId = themeDisplay.getCompanyId();
		long userId = themeDisplay.getUserId();
		File srcfile = uploadPortletRequest.getFile("logo1");
		String contentType = MimeTypesUtil.getContentType(srcfile);
		ServiceContext folderserviceContext = ServiceContextFactory
				.getInstance(DLFolder.class.getName(), uploadPortletRequest);
		InputStream inputStream = new FileInputStream(srcfile);
		String description = "fdsga";
		long length = srcfile.length();
		
		Folder f= DLAppLocalServiceUtil.addFolder(userId, groupId, parentFolderId, name, description, folderserviceContext);
		long folderId= f.getFolderId();
		
		FileEntry fileentry = DLAppLocalServiceUtil.addFileEntry(userId, groupId,
				folderId, srcfile.getName(), contentType, "fjd",
				"dkjfhals", "changeLog", inputStream, length,
				folderserviceContext);
		
		long logoId = fileentry.getFileEntryId();
		tournament.setLogo(logoId);
		if(Validator.isNotNull(tournamentId)) {
			try {
				TournamentLocalServiceUtil.updateTournament(tournament);
			} catch (SystemException e) {
				e.printStackTrace();
			}
		} else {
			try {
				tournamentId = CounterLocalServiceUtil.increment(Tournament.class.getName());
				tournament.setTournamentId(tournamentId);
				
				TournamentLocalServiceUtil.addTournament(tournament);
			} catch (SystemException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void deleteTournament(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		long tournamentId = ParamUtil.getLong(actionRequest, "tournamentId");
		if(Validator.isNotNull(tournamentId)) {
			try {
				TournamentLocalServiceUtil.deleteTournament(tournamentId);
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void editTeam(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		long teamId = ParamUtil.getLong(actionRequest, "teamId");
		long tournamentId = ParamUtil.getLong(actionRequest, "tournamentId");
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		Team team = null;
		if(Validator.isNotNull(teamId)) {
			try {
				team  = TeamLocalServiceUtil.fetchTeam(teamId);
			} catch (SystemException e) {
				e.printStackTrace();
			}
		} else {
			team = new TeamImpl();
			team.setTournamentId(tournamentId);
			team.setCreateDate(new Date());
			team.setCompanyId(themeDisplay.getCompanyId());
			team.setGroupId(themeDisplay.getScopeGroupId());
			team.setCreatedBy(themeDisplay.getUserId());
		}
		
		String name = ParamUtil.getString(actionRequest, "name");
		String color = ParamUtil.getString(actionRequest, "color");
		team.setName(name);
		team.setColor(color);
		team.setModifiedDate(new Date());
		team.setUpdatedBy(themeDisplay.getUserId());
		
		if(Validator.isNotNull(teamId)) {
			try {
				TeamLocalServiceUtil.updateTeam(team);
			} catch (SystemException e) {
				e.printStackTrace();
			}
		} else {
			try {
				teamId = CounterLocalServiceUtil.increment(Team.class.getName());
				team.setTeamId(teamId);
				TeamLocalServiceUtil.addTeam(team);
			} catch (SystemException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void deleteTeam(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		long teamId = ParamUtil.getLong(actionRequest, "teamId");
		if(Validator.isNotNull(teamId)) {
			try {
				TeamLocalServiceUtil.deleteTeam(teamId);
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}
	}
}

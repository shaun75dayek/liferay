/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.sports.portlet.team.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.service.TeamLocalServiceUtil;
import com.sports.portlet.team.model.Team;
import com.sports.portlet.team.service.base.TeamLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the team local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.sports.portlet.team.service.TeamLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author vijayan.chendrayan
 * @see com.sports.portlet.team.service.base.TeamLocalServiceBaseImpl
 * @see com.sports.portlet.team.service.TeamLocalServiceUtil
 */
public class TeamLocalServiceImpl extends TeamLocalServiceBaseImpl {
	public List<Team> findByTournamentId(long tournamentId, int start, int end) throws SystemException {
		return teamPersistence.findByTournamanetId(tournamentId, start, end);
	}
	
	public int countByTournamanetId(long tournamentId) throws SystemException {
		return teamPersistence.countByTournamanetId(tournamentId);
	}
	
	public List<Team> fetchTeamCustomList(int begin, int end) {
		return teamFinder.fetchTeamCustomList(begin, end);
	}
	
	public List<Team> fetchTeamByTournamentIdCustomList(long tournamentId, int begin, int end) {
		return teamFinder.fetchTeamByTournamentIdCustomList(tournamentId, begin, end);
	}
	
	public List<Team> fetchTeamByTournamentIdDynamicList(long tournamentId, int begin, int end) {
		 DynamicQuery teamQuery = DynamicQueryFactoryUtil.forClass(Team.class);
		 teamQuery.add(PropertyFactoryUtil.forName("tournamentId ").eq(tournamentId));
		 List<Team> studentList = null;
		try {
			studentList = TeamLocalServiceUtil.dynamicQuery(teamQuery, begin, end);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		 return studentList;
	}
}
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

package com.sports.portlet.team.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author vijayan.chendrayan
 */
public class TeamFinderUtil {
	public static java.util.List<com.sports.portlet.team.model.Team> fetchTeamCustomList(
		int begin, int end) {
		return getFinder().fetchTeamCustomList(begin, end);
	}

	public static java.util.List<com.sports.portlet.team.model.Team> fetchTeamByTournamentIdCustomList(
		long tournamentId, int begin, int end) {
		return getFinder()
				   .fetchTeamByTournamentIdCustomList(tournamentId, begin, end);
	}

	public static TeamFinder getFinder() {
		if (_finder == null) {
			_finder = (TeamFinder)PortletBeanLocatorUtil.locate(com.sports.portlet.team.service.ClpSerializer.getServletContextName(),
					TeamFinder.class.getName());

			ReferenceRegistry.registerReference(TeamFinderUtil.class, "_finder");
		}

		return _finder;
	}

	public void setFinder(TeamFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TeamFinderUtil.class, "_finder");
	}

	private static TeamFinder _finder;
}
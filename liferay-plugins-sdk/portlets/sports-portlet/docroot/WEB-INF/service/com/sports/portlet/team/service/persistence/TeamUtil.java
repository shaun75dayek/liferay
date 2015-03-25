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
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.sports.portlet.team.model.Team;

import java.util.List;

/**
 * The persistence utility for the team service. This utility wraps {@link TeamPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author vijayan.chendrayan
 * @see TeamPersistence
 * @see TeamPersistenceImpl
 * @generated
 */
public class TeamUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Team team) {
		getPersistence().clearCache(team);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Team> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Team> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Team> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Team update(Team team) throws SystemException {
		return getPersistence().update(team);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Team update(Team team, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(team, serviceContext);
	}

	/**
	* Returns all the teams where tournamentId = &#63;.
	*
	* @param tournamentId the tournament ID
	* @return the matching teams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.sports.portlet.team.model.Team> findByTournamanetId(
		long tournamentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTournamanetId(tournamentId);
	}

	/**
	* Returns a range of all the teams where tournamentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sports.portlet.team.model.impl.TeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tournamentId the tournament ID
	* @param start the lower bound of the range of teams
	* @param end the upper bound of the range of teams (not inclusive)
	* @return the range of matching teams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.sports.portlet.team.model.Team> findByTournamanetId(
		long tournamentId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTournamanetId(tournamentId, start, end);
	}

	/**
	* Returns an ordered range of all the teams where tournamentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sports.portlet.team.model.impl.TeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tournamentId the tournament ID
	* @param start the lower bound of the range of teams
	* @param end the upper bound of the range of teams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching teams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.sports.portlet.team.model.Team> findByTournamanetId(
		long tournamentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTournamanetId(tournamentId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first team in the ordered set where tournamentId = &#63;.
	*
	* @param tournamentId the tournament ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching team
	* @throws com.sports.portlet.team.NoSuchTeamException if a matching team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.sports.portlet.team.model.Team findByTournamanetId_First(
		long tournamentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.sports.portlet.team.NoSuchTeamException {
		return getPersistence()
				   .findByTournamanetId_First(tournamentId, orderByComparator);
	}

	/**
	* Returns the first team in the ordered set where tournamentId = &#63;.
	*
	* @param tournamentId the tournament ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching team, or <code>null</code> if a matching team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.sports.portlet.team.model.Team fetchByTournamanetId_First(
		long tournamentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTournamanetId_First(tournamentId, orderByComparator);
	}

	/**
	* Returns the last team in the ordered set where tournamentId = &#63;.
	*
	* @param tournamentId the tournament ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching team
	* @throws com.sports.portlet.team.NoSuchTeamException if a matching team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.sports.portlet.team.model.Team findByTournamanetId_Last(
		long tournamentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.sports.portlet.team.NoSuchTeamException {
		return getPersistence()
				   .findByTournamanetId_Last(tournamentId, orderByComparator);
	}

	/**
	* Returns the last team in the ordered set where tournamentId = &#63;.
	*
	* @param tournamentId the tournament ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching team, or <code>null</code> if a matching team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.sports.portlet.team.model.Team fetchByTournamanetId_Last(
		long tournamentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTournamanetId_Last(tournamentId, orderByComparator);
	}

	/**
	* Returns the teams before and after the current team in the ordered set where tournamentId = &#63;.
	*
	* @param teamId the primary key of the current team
	* @param tournamentId the tournament ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next team
	* @throws com.sports.portlet.team.NoSuchTeamException if a team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.sports.portlet.team.model.Team[] findByTournamanetId_PrevAndNext(
		long teamId, long tournamentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.sports.portlet.team.NoSuchTeamException {
		return getPersistence()
				   .findByTournamanetId_PrevAndNext(teamId, tournamentId,
			orderByComparator);
	}

	/**
	* Removes all the teams where tournamentId = &#63; from the database.
	*
	* @param tournamentId the tournament ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTournamanetId(long tournamentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTournamanetId(tournamentId);
	}

	/**
	* Returns the number of teams where tournamentId = &#63;.
	*
	* @param tournamentId the tournament ID
	* @return the number of matching teams
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTournamanetId(long tournamentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTournamanetId(tournamentId);
	}

	/**
	* Caches the team in the entity cache if it is enabled.
	*
	* @param team the team
	*/
	public static void cacheResult(com.sports.portlet.team.model.Team team) {
		getPersistence().cacheResult(team);
	}

	/**
	* Caches the teams in the entity cache if it is enabled.
	*
	* @param teams the teams
	*/
	public static void cacheResult(
		java.util.List<com.sports.portlet.team.model.Team> teams) {
		getPersistence().cacheResult(teams);
	}

	/**
	* Creates a new team with the primary key. Does not add the team to the database.
	*
	* @param teamId the primary key for the new team
	* @return the new team
	*/
	public static com.sports.portlet.team.model.Team create(long teamId) {
		return getPersistence().create(teamId);
	}

	/**
	* Removes the team with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param teamId the primary key of the team
	* @return the team that was removed
	* @throws com.sports.portlet.team.NoSuchTeamException if a team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.sports.portlet.team.model.Team remove(long teamId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.sports.portlet.team.NoSuchTeamException {
		return getPersistence().remove(teamId);
	}

	public static com.sports.portlet.team.model.Team updateImpl(
		com.sports.portlet.team.model.Team team)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(team);
	}

	/**
	* Returns the team with the primary key or throws a {@link com.sports.portlet.team.NoSuchTeamException} if it could not be found.
	*
	* @param teamId the primary key of the team
	* @return the team
	* @throws com.sports.portlet.team.NoSuchTeamException if a team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.sports.portlet.team.model.Team findByPrimaryKey(
		long teamId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.sports.portlet.team.NoSuchTeamException {
		return getPersistence().findByPrimaryKey(teamId);
	}

	/**
	* Returns the team with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param teamId the primary key of the team
	* @return the team, or <code>null</code> if a team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.sports.portlet.team.model.Team fetchByPrimaryKey(
		long teamId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(teamId);
	}

	/**
	* Returns all the teams.
	*
	* @return the teams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.sports.portlet.team.model.Team> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the teams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sports.portlet.team.model.impl.TeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of teams
	* @param end the upper bound of the range of teams (not inclusive)
	* @return the range of teams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.sports.portlet.team.model.Team> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the teams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sports.portlet.team.model.impl.TeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of teams
	* @param end the upper bound of the range of teams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of teams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.sports.portlet.team.model.Team> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the teams from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of teams.
	*
	* @return the number of teams
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TeamPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TeamPersistence)PortletBeanLocatorUtil.locate(com.sports.portlet.team.service.ClpSerializer.getServletContextName(),
					TeamPersistence.class.getName());

			ReferenceRegistry.registerReference(TeamUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TeamPersistence persistence) {
	}

	private static TeamPersistence _persistence;
}
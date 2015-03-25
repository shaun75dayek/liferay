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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.sports.portlet.team.NoSuchTeamException;
import com.sports.portlet.team.model.Team;
import com.sports.portlet.team.model.impl.TeamImpl;
import com.sports.portlet.team.model.impl.TeamModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the team service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author vijayan.chendrayan
 * @see TeamPersistence
 * @see TeamUtil
 * @generated
 */
public class TeamPersistenceImpl extends BasePersistenceImpl<Team>
	implements TeamPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TeamUtil} to access the team persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TeamImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
			TeamModelImpl.FINDER_CACHE_ENABLED, TeamImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
			TeamModelImpl.FINDER_CACHE_ENABLED, TeamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
			TeamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TOURNAMANETID =
		new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
			TeamModelImpl.FINDER_CACHE_ENABLED, TeamImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTournamanetId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOURNAMANETID =
		new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
			TeamModelImpl.FINDER_CACHE_ENABLED, TeamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTournamanetId",
			new String[] { Long.class.getName() },
			TeamModelImpl.TOURNAMENTID_COLUMN_BITMASK |
			TeamModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TOURNAMANETID = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
			TeamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTournamanetId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the teams where tournamentId = &#63;.
	 *
	 * @param tournamentId the tournament ID
	 * @return the matching teams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Team> findByTournamanetId(long tournamentId)
		throws SystemException {
		return findByTournamanetId(tournamentId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Team> findByTournamanetId(long tournamentId, int start, int end)
		throws SystemException {
		return findByTournamanetId(tournamentId, start, end, null);
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
	@Override
	public List<Team> findByTournamanetId(long tournamentId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOURNAMANETID;
			finderArgs = new Object[] { tournamentId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TOURNAMANETID;
			finderArgs = new Object[] {
					tournamentId,
					
					start, end, orderByComparator
				};
		}

		List<Team> list = (List<Team>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Team team : list) {
				if ((tournamentId != team.getTournamentId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TEAM_WHERE);

			query.append(_FINDER_COLUMN_TOURNAMANETID_TOURNAMENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TeamModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tournamentId);

				if (!pagination) {
					list = (List<Team>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Team>(list);
				}
				else {
					list = (List<Team>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Team findByTournamanetId_First(long tournamentId,
		OrderByComparator orderByComparator)
		throws NoSuchTeamException, SystemException {
		Team team = fetchByTournamanetId_First(tournamentId, orderByComparator);

		if (team != null) {
			return team;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tournamentId=");
		msg.append(tournamentId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTeamException(msg.toString());
	}

	/**
	 * Returns the first team in the ordered set where tournamentId = &#63;.
	 *
	 * @param tournamentId the tournament ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching team, or <code>null</code> if a matching team could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Team fetchByTournamanetId_First(long tournamentId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Team> list = findByTournamanetId(tournamentId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Team findByTournamanetId_Last(long tournamentId,
		OrderByComparator orderByComparator)
		throws NoSuchTeamException, SystemException {
		Team team = fetchByTournamanetId_Last(tournamentId, orderByComparator);

		if (team != null) {
			return team;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tournamentId=");
		msg.append(tournamentId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTeamException(msg.toString());
	}

	/**
	 * Returns the last team in the ordered set where tournamentId = &#63;.
	 *
	 * @param tournamentId the tournament ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching team, or <code>null</code> if a matching team could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Team fetchByTournamanetId_Last(long tournamentId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTournamanetId(tournamentId);

		if (count == 0) {
			return null;
		}

		List<Team> list = findByTournamanetId(tournamentId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Team[] findByTournamanetId_PrevAndNext(long teamId,
		long tournamentId, OrderByComparator orderByComparator)
		throws NoSuchTeamException, SystemException {
		Team team = findByPrimaryKey(teamId);

		Session session = null;

		try {
			session = openSession();

			Team[] array = new TeamImpl[3];

			array[0] = getByTournamanetId_PrevAndNext(session, team,
					tournamentId, orderByComparator, true);

			array[1] = team;

			array[2] = getByTournamanetId_PrevAndNext(session, team,
					tournamentId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Team getByTournamanetId_PrevAndNext(Session session, Team team,
		long tournamentId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEAM_WHERE);

		query.append(_FINDER_COLUMN_TOURNAMANETID_TOURNAMENTID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(TeamModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tournamentId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(team);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Team> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the teams where tournamentId = &#63; from the database.
	 *
	 * @param tournamentId the tournament ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTournamanetId(long tournamentId)
		throws SystemException {
		for (Team team : findByTournamanetId(tournamentId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(team);
		}
	}

	/**
	 * Returns the number of teams where tournamentId = &#63;.
	 *
	 * @param tournamentId the tournament ID
	 * @return the number of matching teams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTournamanetId(long tournamentId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TOURNAMANETID;

		Object[] finderArgs = new Object[] { tournamentId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEAM_WHERE);

			query.append(_FINDER_COLUMN_TOURNAMANETID_TOURNAMENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tournamentId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_TOURNAMANETID_TOURNAMENTID_2 = "team.tournamentId = ?";

	public TeamPersistenceImpl() {
		setModelClass(Team.class);
	}

	/**
	 * Caches the team in the entity cache if it is enabled.
	 *
	 * @param team the team
	 */
	@Override
	public void cacheResult(Team team) {
		EntityCacheUtil.putResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
			TeamImpl.class, team.getPrimaryKey(), team);

		team.resetOriginalValues();
	}

	/**
	 * Caches the teams in the entity cache if it is enabled.
	 *
	 * @param teams the teams
	 */
	@Override
	public void cacheResult(List<Team> teams) {
		for (Team team : teams) {
			if (EntityCacheUtil.getResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
						TeamImpl.class, team.getPrimaryKey()) == null) {
				cacheResult(team);
			}
			else {
				team.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all teams.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TeamImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TeamImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the team.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Team team) {
		EntityCacheUtil.removeResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
			TeamImpl.class, team.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Team> teams) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Team team : teams) {
			EntityCacheUtil.removeResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
				TeamImpl.class, team.getPrimaryKey());
		}
	}

	/**
	 * Creates a new team with the primary key. Does not add the team to the database.
	 *
	 * @param teamId the primary key for the new team
	 * @return the new team
	 */
	@Override
	public Team create(long teamId) {
		Team team = new TeamImpl();

		team.setNew(true);
		team.setPrimaryKey(teamId);

		return team;
	}

	/**
	 * Removes the team with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param teamId the primary key of the team
	 * @return the team that was removed
	 * @throws com.sports.portlet.team.NoSuchTeamException if a team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Team remove(long teamId) throws NoSuchTeamException, SystemException {
		return remove((Serializable)teamId);
	}

	/**
	 * Removes the team with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the team
	 * @return the team that was removed
	 * @throws com.sports.portlet.team.NoSuchTeamException if a team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Team remove(Serializable primaryKey)
		throws NoSuchTeamException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Team team = (Team)session.get(TeamImpl.class, primaryKey);

			if (team == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTeamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(team);
		}
		catch (NoSuchTeamException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Team removeImpl(Team team) throws SystemException {
		team = toUnwrappedModel(team);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(team)) {
				team = (Team)session.get(TeamImpl.class, team.getPrimaryKeyObj());
			}

			if (team != null) {
				session.delete(team);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (team != null) {
			clearCache(team);
		}

		return team;
	}

	@Override
	public Team updateImpl(com.sports.portlet.team.model.Team team)
		throws SystemException {
		team = toUnwrappedModel(team);

		boolean isNew = team.isNew();

		TeamModelImpl teamModelImpl = (TeamModelImpl)team;

		Session session = null;

		try {
			session = openSession();

			if (team.isNew()) {
				session.save(team);

				team.setNew(false);
			}
			else {
				session.merge(team);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TeamModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((teamModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOURNAMANETID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						teamModelImpl.getOriginalTournamentId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOURNAMANETID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOURNAMANETID,
					args);

				args = new Object[] { teamModelImpl.getTournamentId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOURNAMANETID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOURNAMANETID,
					args);
			}
		}

		EntityCacheUtil.putResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
			TeamImpl.class, team.getPrimaryKey(), team);

		return team;
	}

	protected Team toUnwrappedModel(Team team) {
		if (team instanceof TeamImpl) {
			return team;
		}

		TeamImpl teamImpl = new TeamImpl();

		teamImpl.setNew(team.isNew());
		teamImpl.setPrimaryKey(team.getPrimaryKey());

		teamImpl.setTeamId(team.getTeamId());
		teamImpl.setTournamentId(team.getTournamentId());
		teamImpl.setCompanyId(team.getCompanyId());
		teamImpl.setGroupId(team.getGroupId());
		teamImpl.setCreatedBy(team.getCreatedBy());
		teamImpl.setUpdatedBy(team.getUpdatedBy());
		teamImpl.setCreateDate(team.getCreateDate());
		teamImpl.setModifiedDate(team.getModifiedDate());
		teamImpl.setName(team.getName());
		teamImpl.setNoOfPlayers(team.getNoOfPlayers());
		teamImpl.setPriceMoney(team.getPriceMoney());
		teamImpl.setLocation(team.getLocation());
		teamImpl.setSponsors(team.getSponsors());
		teamImpl.setLogo(team.getLogo());
		teamImpl.setColor(team.getColor());

		return teamImpl;
	}

	/**
	 * Returns the team with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the team
	 * @return the team
	 * @throws com.sports.portlet.team.NoSuchTeamException if a team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Team findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTeamException, SystemException {
		Team team = fetchByPrimaryKey(primaryKey);

		if (team == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTeamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return team;
	}

	/**
	 * Returns the team with the primary key or throws a {@link com.sports.portlet.team.NoSuchTeamException} if it could not be found.
	 *
	 * @param teamId the primary key of the team
	 * @return the team
	 * @throws com.sports.portlet.team.NoSuchTeamException if a team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Team findByPrimaryKey(long teamId)
		throws NoSuchTeamException, SystemException {
		return findByPrimaryKey((Serializable)teamId);
	}

	/**
	 * Returns the team with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the team
	 * @return the team, or <code>null</code> if a team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Team fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Team team = (Team)EntityCacheUtil.getResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
				TeamImpl.class, primaryKey);

		if (team == _nullTeam) {
			return null;
		}

		if (team == null) {
			Session session = null;

			try {
				session = openSession();

				team = (Team)session.get(TeamImpl.class, primaryKey);

				if (team != null) {
					cacheResult(team);
				}
				else {
					EntityCacheUtil.putResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
						TeamImpl.class, primaryKey, _nullTeam);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
					TeamImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return team;
	}

	/**
	 * Returns the team with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param teamId the primary key of the team
	 * @return the team, or <code>null</code> if a team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Team fetchByPrimaryKey(long teamId) throws SystemException {
		return fetchByPrimaryKey((Serializable)teamId);
	}

	/**
	 * Returns all the teams.
	 *
	 * @return the teams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Team> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Team> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Team> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Team> list = (List<Team>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEAM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEAM;

				if (pagination) {
					sql = sql.concat(TeamModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Team>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Team>(list);
				}
				else {
					list = (List<Team>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the teams from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Team team : findAll()) {
			remove(team);
		}
	}

	/**
	 * Returns the number of teams.
	 *
	 * @return the number of teams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TEAM);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the team persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.sports.portlet.team.model.Team")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Team>> listenersList = new ArrayList<ModelListener<Team>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Team>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(TeamImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEAM = "SELECT team FROM Team team";
	private static final String _SQL_SELECT_TEAM_WHERE = "SELECT team FROM Team team WHERE ";
	private static final String _SQL_COUNT_TEAM = "SELECT COUNT(team) FROM Team team";
	private static final String _SQL_COUNT_TEAM_WHERE = "SELECT COUNT(team) FROM Team team WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "team.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Team exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Team exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TeamPersistenceImpl.class);
	private static Team _nullTeam = new TeamImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Team> toCacheModel() {
				return _nullTeamCacheModel;
			}
		};

	private static CacheModel<Team> _nullTeamCacheModel = new CacheModel<Team>() {
			@Override
			public Team toEntityModel() {
				return _nullTeam;
			}
		};
}
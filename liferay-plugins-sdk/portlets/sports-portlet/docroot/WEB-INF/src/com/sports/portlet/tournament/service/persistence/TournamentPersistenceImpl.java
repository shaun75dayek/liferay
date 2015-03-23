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

package com.sports.portlet.tournament.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.sports.portlet.tournament.NoSuchTournamentException;
import com.sports.portlet.tournament.model.Tournament;
import com.sports.portlet.tournament.model.impl.TournamentImpl;
import com.sports.portlet.tournament.model.impl.TournamentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tournament service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author vijayan.chendrayan
 * @see TournamentPersistence
 * @see TournamentUtil
 * @generated
 */
public class TournamentPersistenceImpl extends BasePersistenceImpl<Tournament>
	implements TournamentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TournamentUtil} to access the tournament persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TournamentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TournamentModelImpl.ENTITY_CACHE_ENABLED,
			TournamentModelImpl.FINDER_CACHE_ENABLED, TournamentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TournamentModelImpl.ENTITY_CACHE_ENABLED,
			TournamentModelImpl.FINDER_CACHE_ENABLED, TournamentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TournamentModelImpl.ENTITY_CACHE_ENABLED,
			TournamentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TournamentPersistenceImpl() {
		setModelClass(Tournament.class);
	}

	/**
	 * Caches the tournament in the entity cache if it is enabled.
	 *
	 * @param tournament the tournament
	 */
	@Override
	public void cacheResult(Tournament tournament) {
		EntityCacheUtil.putResult(TournamentModelImpl.ENTITY_CACHE_ENABLED,
			TournamentImpl.class, tournament.getPrimaryKey(), tournament);

		tournament.resetOriginalValues();
	}

	/**
	 * Caches the tournaments in the entity cache if it is enabled.
	 *
	 * @param tournaments the tournaments
	 */
	@Override
	public void cacheResult(List<Tournament> tournaments) {
		for (Tournament tournament : tournaments) {
			if (EntityCacheUtil.getResult(
						TournamentModelImpl.ENTITY_CACHE_ENABLED,
						TournamentImpl.class, tournament.getPrimaryKey()) == null) {
				cacheResult(tournament);
			}
			else {
				tournament.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tournaments.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TournamentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TournamentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tournament.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Tournament tournament) {
		EntityCacheUtil.removeResult(TournamentModelImpl.ENTITY_CACHE_ENABLED,
			TournamentImpl.class, tournament.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Tournament> tournaments) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Tournament tournament : tournaments) {
			EntityCacheUtil.removeResult(TournamentModelImpl.ENTITY_CACHE_ENABLED,
				TournamentImpl.class, tournament.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tournament with the primary key. Does not add the tournament to the database.
	 *
	 * @param tournamentId the primary key for the new tournament
	 * @return the new tournament
	 */
	@Override
	public Tournament create(long tournamentId) {
		Tournament tournament = new TournamentImpl();

		tournament.setNew(true);
		tournament.setPrimaryKey(tournamentId);

		return tournament;
	}

	/**
	 * Removes the tournament with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tournamentId the primary key of the tournament
	 * @return the tournament that was removed
	 * @throws com.sports.portlet.tournament.NoSuchTournamentException if a tournament with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tournament remove(long tournamentId)
		throws NoSuchTournamentException, SystemException {
		return remove((Serializable)tournamentId);
	}

	/**
	 * Removes the tournament with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tournament
	 * @return the tournament that was removed
	 * @throws com.sports.portlet.tournament.NoSuchTournamentException if a tournament with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tournament remove(Serializable primaryKey)
		throws NoSuchTournamentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Tournament tournament = (Tournament)session.get(TournamentImpl.class,
					primaryKey);

			if (tournament == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTournamentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tournament);
		}
		catch (NoSuchTournamentException nsee) {
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
	protected Tournament removeImpl(Tournament tournament)
		throws SystemException {
		tournament = toUnwrappedModel(tournament);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tournament)) {
				tournament = (Tournament)session.get(TournamentImpl.class,
						tournament.getPrimaryKeyObj());
			}

			if (tournament != null) {
				session.delete(tournament);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tournament != null) {
			clearCache(tournament);
		}

		return tournament;
	}

	@Override
	public Tournament updateImpl(
		com.sports.portlet.tournament.model.Tournament tournament)
		throws SystemException {
		tournament = toUnwrappedModel(tournament);

		boolean isNew = tournament.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tournament.isNew()) {
				session.save(tournament);

				tournament.setNew(false);
			}
			else {
				session.merge(tournament);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(TournamentModelImpl.ENTITY_CACHE_ENABLED,
			TournamentImpl.class, tournament.getPrimaryKey(), tournament);

		return tournament;
	}

	protected Tournament toUnwrappedModel(Tournament tournament) {
		if (tournament instanceof TournamentImpl) {
			return tournament;
		}

		TournamentImpl tournamentImpl = new TournamentImpl();

		tournamentImpl.setNew(tournament.isNew());
		tournamentImpl.setPrimaryKey(tournament.getPrimaryKey());

		tournamentImpl.setTournamentId(tournament.getTournamentId());
		tournamentImpl.setCompanyId(tournament.getCompanyId());
		tournamentImpl.setGroupId(tournament.getGroupId());
		tournamentImpl.setCreatedBy(tournament.getCreatedBy());
		tournamentImpl.setUpdatedBy(tournament.getUpdatedBy());
		tournamentImpl.setCreateDate(tournament.getCreateDate());
		tournamentImpl.setModifiedDate(tournament.getModifiedDate());
		tournamentImpl.setName(tournament.getName());
		tournamentImpl.setType(tournament.getType());
		tournamentImpl.setNoOfTeams(tournament.getNoOfTeams());
		tournamentImpl.setStartDate(tournament.getStartDate());
		tournamentImpl.setEndDate(tournament.getEndDate());
		tournamentImpl.setPriceMoney(tournament.getPriceMoney());
		tournamentImpl.setLocation(tournament.getLocation());
		tournamentImpl.setSponsors(tournament.getSponsors());
		tournamentImpl.setLogo(tournament.getLogo());

		return tournamentImpl;
	}

	/**
	 * Returns the tournament with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tournament
	 * @return the tournament
	 * @throws com.sports.portlet.tournament.NoSuchTournamentException if a tournament with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tournament findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTournamentException, SystemException {
		Tournament tournament = fetchByPrimaryKey(primaryKey);

		if (tournament == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTournamentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tournament;
	}

	/**
	 * Returns the tournament with the primary key or throws a {@link com.sports.portlet.tournament.NoSuchTournamentException} if it could not be found.
	 *
	 * @param tournamentId the primary key of the tournament
	 * @return the tournament
	 * @throws com.sports.portlet.tournament.NoSuchTournamentException if a tournament with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tournament findByPrimaryKey(long tournamentId)
		throws NoSuchTournamentException, SystemException {
		return findByPrimaryKey((Serializable)tournamentId);
	}

	/**
	 * Returns the tournament with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tournament
	 * @return the tournament, or <code>null</code> if a tournament with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tournament fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Tournament tournament = (Tournament)EntityCacheUtil.getResult(TournamentModelImpl.ENTITY_CACHE_ENABLED,
				TournamentImpl.class, primaryKey);

		if (tournament == _nullTournament) {
			return null;
		}

		if (tournament == null) {
			Session session = null;

			try {
				session = openSession();

				tournament = (Tournament)session.get(TournamentImpl.class,
						primaryKey);

				if (tournament != null) {
					cacheResult(tournament);
				}
				else {
					EntityCacheUtil.putResult(TournamentModelImpl.ENTITY_CACHE_ENABLED,
						TournamentImpl.class, primaryKey, _nullTournament);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TournamentModelImpl.ENTITY_CACHE_ENABLED,
					TournamentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tournament;
	}

	/**
	 * Returns the tournament with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tournamentId the primary key of the tournament
	 * @return the tournament, or <code>null</code> if a tournament with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tournament fetchByPrimaryKey(long tournamentId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)tournamentId);
	}

	/**
	 * Returns all the tournaments.
	 *
	 * @return the tournaments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Tournament> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tournaments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sports.portlet.tournament.model.impl.TournamentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tournaments
	 * @param end the upper bound of the range of tournaments (not inclusive)
	 * @return the range of tournaments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Tournament> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tournaments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sports.portlet.tournament.model.impl.TournamentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tournaments
	 * @param end the upper bound of the range of tournaments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tournaments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Tournament> findAll(int start, int end,
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

		List<Tournament> list = (List<Tournament>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TOURNAMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TOURNAMENT;

				if (pagination) {
					sql = sql.concat(TournamentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Tournament>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Tournament>(list);
				}
				else {
					list = (List<Tournament>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the tournaments from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Tournament tournament : findAll()) {
			remove(tournament);
		}
	}

	/**
	 * Returns the number of tournaments.
	 *
	 * @return the number of tournaments
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

				Query q = session.createQuery(_SQL_COUNT_TOURNAMENT);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the tournament persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.sports.portlet.tournament.model.Tournament")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Tournament>> listenersList = new ArrayList<ModelListener<Tournament>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Tournament>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TournamentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TOURNAMENT = "SELECT tournament FROM Tournament tournament";
	private static final String _SQL_COUNT_TOURNAMENT = "SELECT COUNT(tournament) FROM Tournament tournament";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tournament.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Tournament exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TournamentPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"type"
			});
	private static Tournament _nullTournament = new TournamentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Tournament> toCacheModel() {
				return _nullTournamentCacheModel;
			}
		};

	private static CacheModel<Tournament> _nullTournamentCacheModel = new CacheModel<Tournament>() {
			@Override
			public Tournament toEntityModel() {
				return _nullTournament;
			}
		};
}
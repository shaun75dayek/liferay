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

import com.liferay.portal.service.persistence.BasePersistence;

import com.sports.portlet.tournament.model.Tournament;

/**
 * The persistence interface for the tournament service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author vijayan.chendrayan
 * @see TournamentPersistenceImpl
 * @see TournamentUtil
 * @generated
 */
public interface TournamentPersistence extends BasePersistence<Tournament> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TournamentUtil} to access the tournament persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the tournament in the entity cache if it is enabled.
	*
	* @param tournament the tournament
	*/
	public void cacheResult(
		com.sports.portlet.tournament.model.Tournament tournament);

	/**
	* Caches the tournaments in the entity cache if it is enabled.
	*
	* @param tournaments the tournaments
	*/
	public void cacheResult(
		java.util.List<com.sports.portlet.tournament.model.Tournament> tournaments);

	/**
	* Creates a new tournament with the primary key. Does not add the tournament to the database.
	*
	* @param tournamentId the primary key for the new tournament
	* @return the new tournament
	*/
	public com.sports.portlet.tournament.model.Tournament create(
		long tournamentId);

	/**
	* Removes the tournament with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tournamentId the primary key of the tournament
	* @return the tournament that was removed
	* @throws com.sports.portlet.tournament.NoSuchTournamentException if a tournament with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.sports.portlet.tournament.model.Tournament remove(
		long tournamentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.sports.portlet.tournament.NoSuchTournamentException;

	public com.sports.portlet.tournament.model.Tournament updateImpl(
		com.sports.portlet.tournament.model.Tournament tournament)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tournament with the primary key or throws a {@link com.sports.portlet.tournament.NoSuchTournamentException} if it could not be found.
	*
	* @param tournamentId the primary key of the tournament
	* @return the tournament
	* @throws com.sports.portlet.tournament.NoSuchTournamentException if a tournament with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.sports.portlet.tournament.model.Tournament findByPrimaryKey(
		long tournamentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.sports.portlet.tournament.NoSuchTournamentException;

	/**
	* Returns the tournament with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tournamentId the primary key of the tournament
	* @return the tournament, or <code>null</code> if a tournament with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.sports.portlet.tournament.model.Tournament fetchByPrimaryKey(
		long tournamentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tournaments.
	*
	* @return the tournaments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.sports.portlet.tournament.model.Tournament> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.sports.portlet.tournament.model.Tournament> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.sports.portlet.tournament.model.Tournament> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tournaments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tournaments.
	*
	* @return the number of tournaments
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
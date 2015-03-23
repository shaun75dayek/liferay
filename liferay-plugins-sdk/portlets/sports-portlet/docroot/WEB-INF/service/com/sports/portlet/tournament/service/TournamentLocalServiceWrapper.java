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

package com.sports.portlet.tournament.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TournamentLocalService}.
 *
 * @author vijayan.chendrayan
 * @see TournamentLocalService
 * @generated
 */
public class TournamentLocalServiceWrapper implements TournamentLocalService,
	ServiceWrapper<TournamentLocalService> {
	public TournamentLocalServiceWrapper(
		TournamentLocalService tournamentLocalService) {
		_tournamentLocalService = tournamentLocalService;
	}

	/**
	* Adds the tournament to the database. Also notifies the appropriate model listeners.
	*
	* @param tournament the tournament
	* @return the tournament that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.sports.portlet.tournament.model.Tournament addTournament(
		com.sports.portlet.tournament.model.Tournament tournament)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tournamentLocalService.addTournament(tournament);
	}

	/**
	* Creates a new tournament with the primary key. Does not add the tournament to the database.
	*
	* @param tournamentId the primary key for the new tournament
	* @return the new tournament
	*/
	@Override
	public com.sports.portlet.tournament.model.Tournament createTournament(
		long tournamentId) {
		return _tournamentLocalService.createTournament(tournamentId);
	}

	/**
	* Deletes the tournament with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tournamentId the primary key of the tournament
	* @return the tournament that was removed
	* @throws PortalException if a tournament with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.sports.portlet.tournament.model.Tournament deleteTournament(
		long tournamentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tournamentLocalService.deleteTournament(tournamentId);
	}

	/**
	* Deletes the tournament from the database. Also notifies the appropriate model listeners.
	*
	* @param tournament the tournament
	* @return the tournament that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.sports.portlet.tournament.model.Tournament deleteTournament(
		com.sports.portlet.tournament.model.Tournament tournament)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tournamentLocalService.deleteTournament(tournament);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tournamentLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tournamentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sports.portlet.tournament.model.impl.TournamentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _tournamentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sports.portlet.tournament.model.impl.TournamentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tournamentLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tournamentLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tournamentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.sports.portlet.tournament.model.Tournament fetchTournament(
		long tournamentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tournamentLocalService.fetchTournament(tournamentId);
	}

	/**
	* Returns the tournament with the primary key.
	*
	* @param tournamentId the primary key of the tournament
	* @return the tournament
	* @throws PortalException if a tournament with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.sports.portlet.tournament.model.Tournament getTournament(
		long tournamentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tournamentLocalService.getTournament(tournamentId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tournamentLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.sports.portlet.tournament.model.Tournament> getTournaments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tournamentLocalService.getTournaments(start, end);
	}

	/**
	* Returns the number of tournaments.
	*
	* @return the number of tournaments
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTournamentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tournamentLocalService.getTournamentsCount();
	}

	/**
	* Updates the tournament in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tournament the tournament
	* @return the tournament that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.sports.portlet.tournament.model.Tournament updateTournament(
		com.sports.portlet.tournament.model.Tournament tournament)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tournamentLocalService.updateTournament(tournament);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tournamentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tournamentLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tournamentLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TournamentLocalService getWrappedTournamentLocalService() {
		return _tournamentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTournamentLocalService(
		TournamentLocalService tournamentLocalService) {
		_tournamentLocalService = tournamentLocalService;
	}

	@Override
	public TournamentLocalService getWrappedService() {
		return _tournamentLocalService;
	}

	@Override
	public void setWrappedService(TournamentLocalService tournamentLocalService) {
		_tournamentLocalService = tournamentLocalService;
	}

	private TournamentLocalService _tournamentLocalService;
}
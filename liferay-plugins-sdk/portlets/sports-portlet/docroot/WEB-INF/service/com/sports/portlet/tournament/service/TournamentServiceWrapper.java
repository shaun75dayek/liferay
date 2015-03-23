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
 * Provides a wrapper for {@link TournamentService}.
 *
 * @author vijayan.chendrayan
 * @see TournamentService
 * @generated
 */
public class TournamentServiceWrapper implements TournamentService,
	ServiceWrapper<TournamentService> {
	public TournamentServiceWrapper(TournamentService tournamentService) {
		_tournamentService = tournamentService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tournamentService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tournamentService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tournamentService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TournamentService getWrappedTournamentService() {
		return _tournamentService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTournamentService(TournamentService tournamentService) {
		_tournamentService = tournamentService;
	}

	@Override
	public TournamentService getWrappedService() {
		return _tournamentService;
	}

	@Override
	public void setWrappedService(TournamentService tournamentService) {
		_tournamentService = tournamentService;
	}

	private TournamentService _tournamentService;
}
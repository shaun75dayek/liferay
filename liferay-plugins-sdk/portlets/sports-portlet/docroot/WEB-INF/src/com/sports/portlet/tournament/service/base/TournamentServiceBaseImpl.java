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

package com.sports.portlet.tournament.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.sports.portlet.tournament.model.Tournament;
import com.sports.portlet.tournament.service.TournamentService;
import com.sports.portlet.tournament.service.persistence.TournamentPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the tournament remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.sports.portlet.tournament.service.impl.TournamentServiceImpl}.
 * </p>
 *
 * @author vijayan.chendrayan
 * @see com.sports.portlet.tournament.service.impl.TournamentServiceImpl
 * @see com.sports.portlet.tournament.service.TournamentServiceUtil
 * @generated
 */
public abstract class TournamentServiceBaseImpl extends BaseServiceImpl
	implements TournamentService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.sports.portlet.tournament.service.TournamentServiceUtil} to access the tournament remote service.
	 */

	/**
	 * Returns the tournament local service.
	 *
	 * @return the tournament local service
	 */
	public com.sports.portlet.tournament.service.TournamentLocalService getTournamentLocalService() {
		return tournamentLocalService;
	}

	/**
	 * Sets the tournament local service.
	 *
	 * @param tournamentLocalService the tournament local service
	 */
	public void setTournamentLocalService(
		com.sports.portlet.tournament.service.TournamentLocalService tournamentLocalService) {
		this.tournamentLocalService = tournamentLocalService;
	}

	/**
	 * Returns the tournament remote service.
	 *
	 * @return the tournament remote service
	 */
	public com.sports.portlet.tournament.service.TournamentService getTournamentService() {
		return tournamentService;
	}

	/**
	 * Sets the tournament remote service.
	 *
	 * @param tournamentService the tournament remote service
	 */
	public void setTournamentService(
		com.sports.portlet.tournament.service.TournamentService tournamentService) {
		this.tournamentService = tournamentService;
	}

	/**
	 * Returns the tournament persistence.
	 *
	 * @return the tournament persistence
	 */
	public TournamentPersistence getTournamentPersistence() {
		return tournamentPersistence;
	}

	/**
	 * Sets the tournament persistence.
	 *
	 * @param tournamentPersistence the tournament persistence
	 */
	public void setTournamentPersistence(
		TournamentPersistence tournamentPersistence) {
		this.tournamentPersistence = tournamentPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Tournament.class;
	}

	protected String getModelClassName() {
		return Tournament.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = tournamentPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.sports.portlet.tournament.service.TournamentLocalService.class)
	protected com.sports.portlet.tournament.service.TournamentLocalService tournamentLocalService;
	@BeanReference(type = com.sports.portlet.tournament.service.TournamentService.class)
	protected com.sports.portlet.tournament.service.TournamentService tournamentService;
	@BeanReference(type = TournamentPersistence.class)
	protected TournamentPersistence tournamentPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private TournamentServiceClpInvoker _clpInvoker = new TournamentServiceClpInvoker();
}
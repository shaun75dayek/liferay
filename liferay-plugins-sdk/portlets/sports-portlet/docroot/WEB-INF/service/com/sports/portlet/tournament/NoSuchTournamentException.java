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

package com.sports.portlet.tournament;

import com.liferay.portal.NoSuchModelException;

/**
 * @author vijayan.chendrayan
 */
public class NoSuchTournamentException extends NoSuchModelException {

	public NoSuchTournamentException() {
		super();
	}

	public NoSuchTournamentException(String msg) {
		super(msg);
	}

	public NoSuchTournamentException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchTournamentException(Throwable cause) {
		super(cause);
	}

}
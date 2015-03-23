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

package com.sports.portlet.tournament.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.sports.portlet.tournament.service.http.TournamentServiceSoap}.
 *
 * @author vijayan.chendrayan
 * @see com.sports.portlet.tournament.service.http.TournamentServiceSoap
 * @generated
 */
public class TournamentSoap implements Serializable {
	public static TournamentSoap toSoapModel(Tournament model) {
		TournamentSoap soapModel = new TournamentSoap();

		soapModel.setTournamentId(model.getTournamentId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedBy(model.getUpdatedBy());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setType(model.getType());
		soapModel.setNoOfTeams(model.getNoOfTeams());
		soapModel.setStartDate(model.getStartDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setPriceMoney(model.getPriceMoney());
		soapModel.setLocation(model.getLocation());
		soapModel.setSponsors(model.getSponsors());
		soapModel.setLogo(model.getLogo());

		return soapModel;
	}

	public static TournamentSoap[] toSoapModels(Tournament[] models) {
		TournamentSoap[] soapModels = new TournamentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TournamentSoap[][] toSoapModels(Tournament[][] models) {
		TournamentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TournamentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TournamentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TournamentSoap[] toSoapModels(List<Tournament> models) {
		List<TournamentSoap> soapModels = new ArrayList<TournamentSoap>(models.size());

		for (Tournament model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TournamentSoap[soapModels.size()]);
	}

	public TournamentSoap() {
	}

	public long getPrimaryKey() {
		return _tournamentId;
	}

	public void setPrimaryKey(long pk) {
		setTournamentId(pk);
	}

	public long getTournamentId() {
		return _tournamentId;
	}

	public void setTournamentId(long tournamentId) {
		_tournamentId = tournamentId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;
	}

	public long getUpdatedBy() {
		return _updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		_updatedBy = updatedBy;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public int getNoOfTeams() {
		return _noOfTeams;
	}

	public void setNoOfTeams(int noOfTeams) {
		_noOfTeams = noOfTeams;
	}

	public Date getStartDate() {
		return _startDate;
	}

	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	public Date getEndDate() {
		return _endDate;
	}

	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	public String getPriceMoney() {
		return _priceMoney;
	}

	public void setPriceMoney(String priceMoney) {
		_priceMoney = priceMoney;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	public String getSponsors() {
		return _sponsors;
	}

	public void setSponsors(String sponsors) {
		_sponsors = sponsors;
	}

	public long getLogo() {
		return _logo;
	}

	public void setLogo(long logo) {
		_logo = logo;
	}

	private long _tournamentId;
	private long _companyId;
	private long _groupId;
	private long _createdBy;
	private long _updatedBy;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _type;
	private int _noOfTeams;
	private Date _startDate;
	private Date _endDate;
	private String _priceMoney;
	private String _location;
	private String _sponsors;
	private long _logo;
}
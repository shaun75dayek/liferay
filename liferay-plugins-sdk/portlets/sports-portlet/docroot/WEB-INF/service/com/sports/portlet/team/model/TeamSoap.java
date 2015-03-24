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

package com.sports.portlet.team.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.sports.portlet.team.service.http.TeamServiceSoap}.
 *
 * @author vijayan.chendrayan
 * @see com.sports.portlet.team.service.http.TeamServiceSoap
 * @generated
 */
public class TeamSoap implements Serializable {
	public static TeamSoap toSoapModel(Team model) {
		TeamSoap soapModel = new TeamSoap();

		soapModel.setTeamId(model.getTeamId());
		soapModel.setTournamentId(model.getTournamentId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedBy(model.getUpdatedBy());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setNoOfPlayers(model.getNoOfPlayers());
		soapModel.setPriceMoney(model.getPriceMoney());
		soapModel.setLocation(model.getLocation());
		soapModel.setSponsors(model.getSponsors());
		soapModel.setLogo(model.getLogo());
		soapModel.setColor(model.getColor());

		return soapModel;
	}

	public static TeamSoap[] toSoapModels(Team[] models) {
		TeamSoap[] soapModels = new TeamSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TeamSoap[][] toSoapModels(Team[][] models) {
		TeamSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TeamSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TeamSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TeamSoap[] toSoapModels(List<Team> models) {
		List<TeamSoap> soapModels = new ArrayList<TeamSoap>(models.size());

		for (Team model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TeamSoap[soapModels.size()]);
	}

	public TeamSoap() {
	}

	public long getPrimaryKey() {
		return _teamId;
	}

	public void setPrimaryKey(long pk) {
		setTeamId(pk);
	}

	public long getTeamId() {
		return _teamId;
	}

	public void setTeamId(long teamId) {
		_teamId = teamId;
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

	public int getNoOfPlayers() {
		return _noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		_noOfPlayers = noOfPlayers;
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

	public String getColor() {
		return _color;
	}

	public void setColor(String color) {
		_color = color;
	}

	private long _teamId;
	private long _tournamentId;
	private long _companyId;
	private long _groupId;
	private long _createdBy;
	private long _updatedBy;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private int _noOfPlayers;
	private String _priceMoney;
	private String _location;
	private String _sponsors;
	private long _logo;
	private String _color;
}
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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Team}.
 * </p>
 *
 * @author vijayan.chendrayan
 * @see Team
 * @generated
 */
public class TeamWrapper implements Team, ModelWrapper<Team> {
	public TeamWrapper(Team team) {
		_team = team;
	}

	@Override
	public Class<?> getModelClass() {
		return Team.class;
	}

	@Override
	public String getModelClassName() {
		return Team.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("teamId", getTeamId());
		attributes.put("tournamentId", getTournamentId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedBy", getUpdatedBy());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("noOfPlayers", getNoOfPlayers());
		attributes.put("priceMoney", getPriceMoney());
		attributes.put("location", getLocation());
		attributes.put("sponsors", getSponsors());
		attributes.put("logo", getLogo());
		attributes.put("color", getColor());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long teamId = (Long)attributes.get("teamId");

		if (teamId != null) {
			setTeamId(teamId);
		}

		Long tournamentId = (Long)attributes.get("tournamentId");

		if (tournamentId != null) {
			setTournamentId(tournamentId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Long updatedBy = (Long)attributes.get("updatedBy");

		if (updatedBy != null) {
			setUpdatedBy(updatedBy);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer noOfPlayers = (Integer)attributes.get("noOfPlayers");

		if (noOfPlayers != null) {
			setNoOfPlayers(noOfPlayers);
		}

		String priceMoney = (String)attributes.get("priceMoney");

		if (priceMoney != null) {
			setPriceMoney(priceMoney);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String sponsors = (String)attributes.get("sponsors");

		if (sponsors != null) {
			setSponsors(sponsors);
		}

		Long logo = (Long)attributes.get("logo");

		if (logo != null) {
			setLogo(logo);
		}

		String color = (String)attributes.get("color");

		if (color != null) {
			setColor(color);
		}
	}

	/**
	* Returns the primary key of this team.
	*
	* @return the primary key of this team
	*/
	@Override
	public long getPrimaryKey() {
		return _team.getPrimaryKey();
	}

	/**
	* Sets the primary key of this team.
	*
	* @param primaryKey the primary key of this team
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_team.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the team ID of this team.
	*
	* @return the team ID of this team
	*/
	@Override
	public long getTeamId() {
		return _team.getTeamId();
	}

	/**
	* Sets the team ID of this team.
	*
	* @param teamId the team ID of this team
	*/
	@Override
	public void setTeamId(long teamId) {
		_team.setTeamId(teamId);
	}

	/**
	* Returns the tournament ID of this team.
	*
	* @return the tournament ID of this team
	*/
	@Override
	public long getTournamentId() {
		return _team.getTournamentId();
	}

	/**
	* Sets the tournament ID of this team.
	*
	* @param tournamentId the tournament ID of this team
	*/
	@Override
	public void setTournamentId(long tournamentId) {
		_team.setTournamentId(tournamentId);
	}

	/**
	* Returns the company ID of this team.
	*
	* @return the company ID of this team
	*/
	@Override
	public long getCompanyId() {
		return _team.getCompanyId();
	}

	/**
	* Sets the company ID of this team.
	*
	* @param companyId the company ID of this team
	*/
	@Override
	public void setCompanyId(long companyId) {
		_team.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this team.
	*
	* @return the group ID of this team
	*/
	@Override
	public long getGroupId() {
		return _team.getGroupId();
	}

	/**
	* Sets the group ID of this team.
	*
	* @param groupId the group ID of this team
	*/
	@Override
	public void setGroupId(long groupId) {
		_team.setGroupId(groupId);
	}

	/**
	* Returns the created by of this team.
	*
	* @return the created by of this team
	*/
	@Override
	public long getCreatedBy() {
		return _team.getCreatedBy();
	}

	/**
	* Sets the created by of this team.
	*
	* @param createdBy the created by of this team
	*/
	@Override
	public void setCreatedBy(long createdBy) {
		_team.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated by of this team.
	*
	* @return the updated by of this team
	*/
	@Override
	public long getUpdatedBy() {
		return _team.getUpdatedBy();
	}

	/**
	* Sets the updated by of this team.
	*
	* @param updatedBy the updated by of this team
	*/
	@Override
	public void setUpdatedBy(long updatedBy) {
		_team.setUpdatedBy(updatedBy);
	}

	/**
	* Returns the create date of this team.
	*
	* @return the create date of this team
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _team.getCreateDate();
	}

	/**
	* Sets the create date of this team.
	*
	* @param createDate the create date of this team
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_team.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this team.
	*
	* @return the modified date of this team
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _team.getModifiedDate();
	}

	/**
	* Sets the modified date of this team.
	*
	* @param modifiedDate the modified date of this team
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_team.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this team.
	*
	* @return the name of this team
	*/
	@Override
	public java.lang.String getName() {
		return _team.getName();
	}

	/**
	* Sets the name of this team.
	*
	* @param name the name of this team
	*/
	@Override
	public void setName(java.lang.String name) {
		_team.setName(name);
	}

	/**
	* Returns the no of players of this team.
	*
	* @return the no of players of this team
	*/
	@Override
	public int getNoOfPlayers() {
		return _team.getNoOfPlayers();
	}

	/**
	* Sets the no of players of this team.
	*
	* @param noOfPlayers the no of players of this team
	*/
	@Override
	public void setNoOfPlayers(int noOfPlayers) {
		_team.setNoOfPlayers(noOfPlayers);
	}

	/**
	* Returns the price money of this team.
	*
	* @return the price money of this team
	*/
	@Override
	public java.lang.String getPriceMoney() {
		return _team.getPriceMoney();
	}

	/**
	* Sets the price money of this team.
	*
	* @param priceMoney the price money of this team
	*/
	@Override
	public void setPriceMoney(java.lang.String priceMoney) {
		_team.setPriceMoney(priceMoney);
	}

	/**
	* Returns the location of this team.
	*
	* @return the location of this team
	*/
	@Override
	public java.lang.String getLocation() {
		return _team.getLocation();
	}

	/**
	* Sets the location of this team.
	*
	* @param location the location of this team
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_team.setLocation(location);
	}

	/**
	* Returns the sponsors of this team.
	*
	* @return the sponsors of this team
	*/
	@Override
	public java.lang.String getSponsors() {
		return _team.getSponsors();
	}

	/**
	* Sets the sponsors of this team.
	*
	* @param sponsors the sponsors of this team
	*/
	@Override
	public void setSponsors(java.lang.String sponsors) {
		_team.setSponsors(sponsors);
	}

	/**
	* Returns the logo of this team.
	*
	* @return the logo of this team
	*/
	@Override
	public long getLogo() {
		return _team.getLogo();
	}

	/**
	* Sets the logo of this team.
	*
	* @param logo the logo of this team
	*/
	@Override
	public void setLogo(long logo) {
		_team.setLogo(logo);
	}

	/**
	* Returns the color of this team.
	*
	* @return the color of this team
	*/
	@Override
	public java.lang.String getColor() {
		return _team.getColor();
	}

	/**
	* Sets the color of this team.
	*
	* @param color the color of this team
	*/
	@Override
	public void setColor(java.lang.String color) {
		_team.setColor(color);
	}

	@Override
	public boolean isNew() {
		return _team.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_team.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _team.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_team.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _team.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _team.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_team.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _team.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_team.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_team.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_team.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TeamWrapper((Team)_team.clone());
	}

	@Override
	public int compareTo(Team team) {
		return _team.compareTo(team);
	}

	@Override
	public int hashCode() {
		return _team.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Team> toCacheModel() {
		return _team.toCacheModel();
	}

	@Override
	public Team toEscapedModel() {
		return new TeamWrapper(_team.toEscapedModel());
	}

	@Override
	public Team toUnescapedModel() {
		return new TeamWrapper(_team.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _team.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _team.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_team.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TeamWrapper)) {
			return false;
		}

		TeamWrapper teamWrapper = (TeamWrapper)obj;

		if (Validator.equals(_team, teamWrapper._team)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Team getWrappedTeam() {
		return _team;
	}

	@Override
	public Team getWrappedModel() {
		return _team;
	}

	@Override
	public void resetOriginalValues() {
		_team.resetOriginalValues();
	}

	private Team _team;
}
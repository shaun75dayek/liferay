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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Tournament}.
 * </p>
 *
 * @author vijayan.chendrayan
 * @see Tournament
 * @generated
 */
public class TournamentWrapper implements Tournament, ModelWrapper<Tournament> {
	public TournamentWrapper(Tournament tournament) {
		_tournament = tournament;
	}

	@Override
	public Class<?> getModelClass() {
		return Tournament.class;
	}

	@Override
	public String getModelClassName() {
		return Tournament.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tournamentId", getTournamentId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedBy", getUpdatedBy());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("type", getType());
		attributes.put("noOfTeams", getNoOfTeams());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("priceMoney", getPriceMoney());
		attributes.put("location", getLocation());
		attributes.put("sponsors", getSponsors());
		attributes.put("logo", getLogo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
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

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Integer noOfTeams = (Integer)attributes.get("noOfTeams");

		if (noOfTeams != null) {
			setNoOfTeams(noOfTeams);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
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
	}

	/**
	* Returns the primary key of this tournament.
	*
	* @return the primary key of this tournament
	*/
	@Override
	public long getPrimaryKey() {
		return _tournament.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tournament.
	*
	* @param primaryKey the primary key of this tournament
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tournament.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the tournament ID of this tournament.
	*
	* @return the tournament ID of this tournament
	*/
	@Override
	public long getTournamentId() {
		return _tournament.getTournamentId();
	}

	/**
	* Sets the tournament ID of this tournament.
	*
	* @param tournamentId the tournament ID of this tournament
	*/
	@Override
	public void setTournamentId(long tournamentId) {
		_tournament.setTournamentId(tournamentId);
	}

	/**
	* Returns the company ID of this tournament.
	*
	* @return the company ID of this tournament
	*/
	@Override
	public long getCompanyId() {
		return _tournament.getCompanyId();
	}

	/**
	* Sets the company ID of this tournament.
	*
	* @param companyId the company ID of this tournament
	*/
	@Override
	public void setCompanyId(long companyId) {
		_tournament.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this tournament.
	*
	* @return the group ID of this tournament
	*/
	@Override
	public long getGroupId() {
		return _tournament.getGroupId();
	}

	/**
	* Sets the group ID of this tournament.
	*
	* @param groupId the group ID of this tournament
	*/
	@Override
	public void setGroupId(long groupId) {
		_tournament.setGroupId(groupId);
	}

	/**
	* Returns the created by of this tournament.
	*
	* @return the created by of this tournament
	*/
	@Override
	public long getCreatedBy() {
		return _tournament.getCreatedBy();
	}

	/**
	* Sets the created by of this tournament.
	*
	* @param createdBy the created by of this tournament
	*/
	@Override
	public void setCreatedBy(long createdBy) {
		_tournament.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated by of this tournament.
	*
	* @return the updated by of this tournament
	*/
	@Override
	public long getUpdatedBy() {
		return _tournament.getUpdatedBy();
	}

	/**
	* Sets the updated by of this tournament.
	*
	* @param updatedBy the updated by of this tournament
	*/
	@Override
	public void setUpdatedBy(long updatedBy) {
		_tournament.setUpdatedBy(updatedBy);
	}

	/**
	* Returns the create date of this tournament.
	*
	* @return the create date of this tournament
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _tournament.getCreateDate();
	}

	/**
	* Sets the create date of this tournament.
	*
	* @param createDate the create date of this tournament
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_tournament.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this tournament.
	*
	* @return the modified date of this tournament
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _tournament.getModifiedDate();
	}

	/**
	* Sets the modified date of this tournament.
	*
	* @param modifiedDate the modified date of this tournament
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_tournament.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this tournament.
	*
	* @return the name of this tournament
	*/
	@Override
	public java.lang.String getName() {
		return _tournament.getName();
	}

	/**
	* Sets the name of this tournament.
	*
	* @param name the name of this tournament
	*/
	@Override
	public void setName(java.lang.String name) {
		_tournament.setName(name);
	}

	/**
	* Returns the type of this tournament.
	*
	* @return the type of this tournament
	*/
	@Override
	public java.lang.String getType() {
		return _tournament.getType();
	}

	/**
	* Sets the type of this tournament.
	*
	* @param type the type of this tournament
	*/
	@Override
	public void setType(java.lang.String type) {
		_tournament.setType(type);
	}

	/**
	* Returns the no of teams of this tournament.
	*
	* @return the no of teams of this tournament
	*/
	@Override
	public int getNoOfTeams() {
		return _tournament.getNoOfTeams();
	}

	/**
	* Sets the no of teams of this tournament.
	*
	* @param noOfTeams the no of teams of this tournament
	*/
	@Override
	public void setNoOfTeams(int noOfTeams) {
		_tournament.setNoOfTeams(noOfTeams);
	}

	/**
	* Returns the start date of this tournament.
	*
	* @return the start date of this tournament
	*/
	@Override
	public java.util.Date getStartDate() {
		return _tournament.getStartDate();
	}

	/**
	* Sets the start date of this tournament.
	*
	* @param startDate the start date of this tournament
	*/
	@Override
	public void setStartDate(java.util.Date startDate) {
		_tournament.setStartDate(startDate);
	}

	/**
	* Returns the end date of this tournament.
	*
	* @return the end date of this tournament
	*/
	@Override
	public java.util.Date getEndDate() {
		return _tournament.getEndDate();
	}

	/**
	* Sets the end date of this tournament.
	*
	* @param endDate the end date of this tournament
	*/
	@Override
	public void setEndDate(java.util.Date endDate) {
		_tournament.setEndDate(endDate);
	}

	/**
	* Returns the price money of this tournament.
	*
	* @return the price money of this tournament
	*/
	@Override
	public java.lang.String getPriceMoney() {
		return _tournament.getPriceMoney();
	}

	/**
	* Sets the price money of this tournament.
	*
	* @param priceMoney the price money of this tournament
	*/
	@Override
	public void setPriceMoney(java.lang.String priceMoney) {
		_tournament.setPriceMoney(priceMoney);
	}

	/**
	* Returns the location of this tournament.
	*
	* @return the location of this tournament
	*/
	@Override
	public java.lang.String getLocation() {
		return _tournament.getLocation();
	}

	/**
	* Sets the location of this tournament.
	*
	* @param location the location of this tournament
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_tournament.setLocation(location);
	}

	/**
	* Returns the sponsors of this tournament.
	*
	* @return the sponsors of this tournament
	*/
	@Override
	public java.lang.String getSponsors() {
		return _tournament.getSponsors();
	}

	/**
	* Sets the sponsors of this tournament.
	*
	* @param sponsors the sponsors of this tournament
	*/
	@Override
	public void setSponsors(java.lang.String sponsors) {
		_tournament.setSponsors(sponsors);
	}

	/**
	* Returns the logo of this tournament.
	*
	* @return the logo of this tournament
	*/
	@Override
	public long getLogo() {
		return _tournament.getLogo();
	}

	/**
	* Sets the logo of this tournament.
	*
	* @param logo the logo of this tournament
	*/
	@Override
	public void setLogo(long logo) {
		_tournament.setLogo(logo);
	}

	@Override
	public boolean isNew() {
		return _tournament.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tournament.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tournament.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tournament.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tournament.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tournament.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tournament.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tournament.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tournament.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tournament.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tournament.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TournamentWrapper((Tournament)_tournament.clone());
	}

	@Override
	public int compareTo(
		com.sports.portlet.tournament.model.Tournament tournament) {
		return _tournament.compareTo(tournament);
	}

	@Override
	public int hashCode() {
		return _tournament.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.sports.portlet.tournament.model.Tournament> toCacheModel() {
		return _tournament.toCacheModel();
	}

	@Override
	public com.sports.portlet.tournament.model.Tournament toEscapedModel() {
		return new TournamentWrapper(_tournament.toEscapedModel());
	}

	@Override
	public com.sports.portlet.tournament.model.Tournament toUnescapedModel() {
		return new TournamentWrapper(_tournament.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tournament.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tournament.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tournament.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TournamentWrapper)) {
			return false;
		}

		TournamentWrapper tournamentWrapper = (TournamentWrapper)obj;

		if (Validator.equals(_tournament, tournamentWrapper._tournament)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Tournament getWrappedTournament() {
		return _tournament;
	}

	@Override
	public Tournament getWrappedModel() {
		return _tournament;
	}

	@Override
	public void resetOriginalValues() {
		_tournament.resetOriginalValues();
	}

	private Tournament _tournament;
}
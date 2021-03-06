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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Team service. Represents a row in the &quot;sports_team&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.sports.portlet.team.model.impl.TeamModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.sports.portlet.team.model.impl.TeamImpl}.
 * </p>
 *
 * @author vijayan.chendrayan
 * @see Team
 * @see com.sports.portlet.team.model.impl.TeamImpl
 * @see com.sports.portlet.team.model.impl.TeamModelImpl
 * @generated
 */
public interface TeamModel extends BaseModel<Team> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a team model instance should use the {@link Team} interface instead.
	 */

	/**
	 * Returns the primary key of this team.
	 *
	 * @return the primary key of this team
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this team.
	 *
	 * @param primaryKey the primary key of this team
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the team ID of this team.
	 *
	 * @return the team ID of this team
	 */
	public long getTeamId();

	/**
	 * Sets the team ID of this team.
	 *
	 * @param teamId the team ID of this team
	 */
	public void setTeamId(long teamId);

	/**
	 * Returns the tournament ID of this team.
	 *
	 * @return the tournament ID of this team
	 */
	public long getTournamentId();

	/**
	 * Sets the tournament ID of this team.
	 *
	 * @param tournamentId the tournament ID of this team
	 */
	public void setTournamentId(long tournamentId);

	/**
	 * Returns the company ID of this team.
	 *
	 * @return the company ID of this team
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this team.
	 *
	 * @param companyId the company ID of this team
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this team.
	 *
	 * @return the group ID of this team
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this team.
	 *
	 * @param groupId the group ID of this team
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the created by of this team.
	 *
	 * @return the created by of this team
	 */
	public long getCreatedBy();

	/**
	 * Sets the created by of this team.
	 *
	 * @param createdBy the created by of this team
	 */
	public void setCreatedBy(long createdBy);

	/**
	 * Returns the updated by of this team.
	 *
	 * @return the updated by of this team
	 */
	public long getUpdatedBy();

	/**
	 * Sets the updated by of this team.
	 *
	 * @param updatedBy the updated by of this team
	 */
	public void setUpdatedBy(long updatedBy);

	/**
	 * Returns the create date of this team.
	 *
	 * @return the create date of this team
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this team.
	 *
	 * @param createDate the create date of this team
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this team.
	 *
	 * @return the modified date of this team
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this team.
	 *
	 * @param modifiedDate the modified date of this team
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this team.
	 *
	 * @return the name of this team
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this team.
	 *
	 * @param name the name of this team
	 */
	public void setName(String name);

	/**
	 * Returns the no of players of this team.
	 *
	 * @return the no of players of this team
	 */
	public int getNoOfPlayers();

	/**
	 * Sets the no of players of this team.
	 *
	 * @param noOfPlayers the no of players of this team
	 */
	public void setNoOfPlayers(int noOfPlayers);

	/**
	 * Returns the price money of this team.
	 *
	 * @return the price money of this team
	 */
	@AutoEscape
	public String getPriceMoney();

	/**
	 * Sets the price money of this team.
	 *
	 * @param priceMoney the price money of this team
	 */
	public void setPriceMoney(String priceMoney);

	/**
	 * Returns the location of this team.
	 *
	 * @return the location of this team
	 */
	@AutoEscape
	public String getLocation();

	/**
	 * Sets the location of this team.
	 *
	 * @param location the location of this team
	 */
	public void setLocation(String location);

	/**
	 * Returns the sponsors of this team.
	 *
	 * @return the sponsors of this team
	 */
	@AutoEscape
	public String getSponsors();

	/**
	 * Sets the sponsors of this team.
	 *
	 * @param sponsors the sponsors of this team
	 */
	public void setSponsors(String sponsors);

	/**
	 * Returns the logo of this team.
	 *
	 * @return the logo of this team
	 */
	public long getLogo();

	/**
	 * Sets the logo of this team.
	 *
	 * @param logo the logo of this team
	 */
	public void setLogo(long logo);

	/**
	 * Returns the color of this team.
	 *
	 * @return the color of this team
	 */
	@AutoEscape
	public String getColor();

	/**
	 * Sets the color of this team.
	 *
	 * @param color the color of this team
	 */
	public void setColor(String color);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Team team);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Team> toCacheModel();

	@Override
	public Team toEscapedModel();

	@Override
	public Team toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
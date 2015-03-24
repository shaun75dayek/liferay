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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.sports.portlet.team.service.ClpSerializer;
import com.sports.portlet.team.service.TeamLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author vijayan.chendrayan
 */
public class TeamClp extends BaseModelImpl<Team> implements Team {
	public TeamClp() {
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
	public long getPrimaryKey() {
		return _teamId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTeamId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _teamId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getTeamId() {
		return _teamId;
	}

	@Override
	public void setTeamId(long teamId) {
		_teamId = teamId;

		if (_teamRemoteModel != null) {
			try {
				Class<?> clazz = _teamRemoteModel.getClass();

				Method method = clazz.getMethod("setTeamId", long.class);

				method.invoke(_teamRemoteModel, teamId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTournamentId() {
		return _tournamentId;
	}

	@Override
	public void setTournamentId(long tournamentId) {
		_tournamentId = tournamentId;

		if (_teamRemoteModel != null) {
			try {
				Class<?> clazz = _teamRemoteModel.getClass();

				Method method = clazz.getMethod("setTournamentId", long.class);

				method.invoke(_teamRemoteModel, tournamentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_teamRemoteModel != null) {
			try {
				Class<?> clazz = _teamRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_teamRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_teamRemoteModel != null) {
			try {
				Class<?> clazz = _teamRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_teamRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreatedBy() {
		return _createdBy;
	}

	@Override
	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;

		if (_teamRemoteModel != null) {
			try {
				Class<?> clazz = _teamRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", long.class);

				method.invoke(_teamRemoteModel, createdBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUpdatedBy() {
		return _updatedBy;
	}

	@Override
	public void setUpdatedBy(long updatedBy) {
		_updatedBy = updatedBy;

		if (_teamRemoteModel != null) {
			try {
				Class<?> clazz = _teamRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdatedBy", long.class);

				method.invoke(_teamRemoteModel, updatedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_teamRemoteModel != null) {
			try {
				Class<?> clazz = _teamRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_teamRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_teamRemoteModel != null) {
			try {
				Class<?> clazz = _teamRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_teamRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_teamRemoteModel != null) {
			try {
				Class<?> clazz = _teamRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_teamRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNoOfPlayers() {
		return _noOfPlayers;
	}

	@Override
	public void setNoOfPlayers(int noOfPlayers) {
		_noOfPlayers = noOfPlayers;

		if (_teamRemoteModel != null) {
			try {
				Class<?> clazz = _teamRemoteModel.getClass();

				Method method = clazz.getMethod("setNoOfPlayers", int.class);

				method.invoke(_teamRemoteModel, noOfPlayers);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPriceMoney() {
		return _priceMoney;
	}

	@Override
	public void setPriceMoney(String priceMoney) {
		_priceMoney = priceMoney;

		if (_teamRemoteModel != null) {
			try {
				Class<?> clazz = _teamRemoteModel.getClass();

				Method method = clazz.getMethod("setPriceMoney", String.class);

				method.invoke(_teamRemoteModel, priceMoney);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLocation() {
		return _location;
	}

	@Override
	public void setLocation(String location) {
		_location = location;

		if (_teamRemoteModel != null) {
			try {
				Class<?> clazz = _teamRemoteModel.getClass();

				Method method = clazz.getMethod("setLocation", String.class);

				method.invoke(_teamRemoteModel, location);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSponsors() {
		return _sponsors;
	}

	@Override
	public void setSponsors(String sponsors) {
		_sponsors = sponsors;

		if (_teamRemoteModel != null) {
			try {
				Class<?> clazz = _teamRemoteModel.getClass();

				Method method = clazz.getMethod("setSponsors", String.class);

				method.invoke(_teamRemoteModel, sponsors);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLogo() {
		return _logo;
	}

	@Override
	public void setLogo(long logo) {
		_logo = logo;

		if (_teamRemoteModel != null) {
			try {
				Class<?> clazz = _teamRemoteModel.getClass();

				Method method = clazz.getMethod("setLogo", long.class);

				method.invoke(_teamRemoteModel, logo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getColor() {
		return _color;
	}

	@Override
	public void setColor(String color) {
		_color = color;

		if (_teamRemoteModel != null) {
			try {
				Class<?> clazz = _teamRemoteModel.getClass();

				Method method = clazz.getMethod("setColor", String.class);

				method.invoke(_teamRemoteModel, color);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTeamRemoteModel() {
		return _teamRemoteModel;
	}

	public void setTeamRemoteModel(BaseModel<?> teamRemoteModel) {
		_teamRemoteModel = teamRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _teamRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_teamRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TeamLocalServiceUtil.addTeam(this);
		}
		else {
			TeamLocalServiceUtil.updateTeam(this);
		}
	}

	@Override
	public Team toEscapedModel() {
		return (Team)ProxyUtil.newProxyInstance(Team.class.getClassLoader(),
			new Class[] { Team.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TeamClp clone = new TeamClp();

		clone.setTeamId(getTeamId());
		clone.setTournamentId(getTournamentId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setCreatedBy(getCreatedBy());
		clone.setUpdatedBy(getUpdatedBy());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setName(getName());
		clone.setNoOfPlayers(getNoOfPlayers());
		clone.setPriceMoney(getPriceMoney());
		clone.setLocation(getLocation());
		clone.setSponsors(getSponsors());
		clone.setLogo(getLogo());
		clone.setColor(getColor());

		return clone;
	}

	@Override
	public int compareTo(Team team) {
		int value = 0;

		value = DateUtil.compareTo(getModifiedDate(), team.getModifiedDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TeamClp)) {
			return false;
		}

		TeamClp team = (TeamClp)obj;

		long primaryKey = team.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{teamId=");
		sb.append(getTeamId());
		sb.append(", tournamentId=");
		sb.append(getTournamentId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", updatedBy=");
		sb.append(getUpdatedBy());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", noOfPlayers=");
		sb.append(getNoOfPlayers());
		sb.append(", priceMoney=");
		sb.append(getPriceMoney());
		sb.append(", location=");
		sb.append(getLocation());
		sb.append(", sponsors=");
		sb.append(getSponsors());
		sb.append(", logo=");
		sb.append(getLogo());
		sb.append(", color=");
		sb.append(getColor());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.sports.portlet.team.model.Team");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>teamId</column-name><column-value><![CDATA[");
		sb.append(getTeamId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tournamentId</column-name><column-value><![CDATA[");
		sb.append(getTournamentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedBy</column-name><column-value><![CDATA[");
		sb.append(getUpdatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noOfPlayers</column-name><column-value><![CDATA[");
		sb.append(getNoOfPlayers());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>priceMoney</column-name><column-value><![CDATA[");
		sb.append(getPriceMoney());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location</column-name><column-value><![CDATA[");
		sb.append(getLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sponsors</column-name><column-value><![CDATA[");
		sb.append(getSponsors());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>logo</column-name><column-value><![CDATA[");
		sb.append(getLogo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>color</column-name><column-value><![CDATA[");
		sb.append(getColor());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _teamRemoteModel;
}
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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.sports.portlet.tournament.service.ClpSerializer;
import com.sports.portlet.tournament.service.TournamentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author vijayan.chendrayan
 */
public class TournamentClp extends BaseModelImpl<Tournament>
	implements Tournament {
	public TournamentClp() {
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
	public long getPrimaryKey() {
		return _tournamentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTournamentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tournamentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getTournamentId() {
		return _tournamentId;
	}

	@Override
	public void setTournamentId(long tournamentId) {
		_tournamentId = tournamentId;

		if (_tournamentRemoteModel != null) {
			try {
				Class<?> clazz = _tournamentRemoteModel.getClass();

				Method method = clazz.getMethod("setTournamentId", long.class);

				method.invoke(_tournamentRemoteModel, tournamentId);
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

		if (_tournamentRemoteModel != null) {
			try {
				Class<?> clazz = _tournamentRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_tournamentRemoteModel, companyId);
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

		if (_tournamentRemoteModel != null) {
			try {
				Class<?> clazz = _tournamentRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_tournamentRemoteModel, groupId);
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

		if (_tournamentRemoteModel != null) {
			try {
				Class<?> clazz = _tournamentRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", long.class);

				method.invoke(_tournamentRemoteModel, createdBy);
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

		if (_tournamentRemoteModel != null) {
			try {
				Class<?> clazz = _tournamentRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdatedBy", long.class);

				method.invoke(_tournamentRemoteModel, updatedBy);
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

		if (_tournamentRemoteModel != null) {
			try {
				Class<?> clazz = _tournamentRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_tournamentRemoteModel, createDate);
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

		if (_tournamentRemoteModel != null) {
			try {
				Class<?> clazz = _tournamentRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_tournamentRemoteModel, modifiedDate);
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

		if (_tournamentRemoteModel != null) {
			try {
				Class<?> clazz = _tournamentRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_tournamentRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getType() {
		return _type;
	}

	@Override
	public void setType(String type) {
		_type = type;

		if (_tournamentRemoteModel != null) {
			try {
				Class<?> clazz = _tournamentRemoteModel.getClass();

				Method method = clazz.getMethod("setType", String.class);

				method.invoke(_tournamentRemoteModel, type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNoOfTeams() {
		return _noOfTeams;
	}

	@Override
	public void setNoOfTeams(int noOfTeams) {
		_noOfTeams = noOfTeams;

		if (_tournamentRemoteModel != null) {
			try {
				Class<?> clazz = _tournamentRemoteModel.getClass();

				Method method = clazz.getMethod("setNoOfTeams", int.class);

				method.invoke(_tournamentRemoteModel, noOfTeams);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStartDate() {
		return _startDate;
	}

	@Override
	public void setStartDate(Date startDate) {
		_startDate = startDate;

		if (_tournamentRemoteModel != null) {
			try {
				Class<?> clazz = _tournamentRemoteModel.getClass();

				Method method = clazz.getMethod("setStartDate", Date.class);

				method.invoke(_tournamentRemoteModel, startDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getEndDate() {
		return _endDate;
	}

	@Override
	public void setEndDate(Date endDate) {
		_endDate = endDate;

		if (_tournamentRemoteModel != null) {
			try {
				Class<?> clazz = _tournamentRemoteModel.getClass();

				Method method = clazz.getMethod("setEndDate", Date.class);

				method.invoke(_tournamentRemoteModel, endDate);
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

		if (_tournamentRemoteModel != null) {
			try {
				Class<?> clazz = _tournamentRemoteModel.getClass();

				Method method = clazz.getMethod("setPriceMoney", String.class);

				method.invoke(_tournamentRemoteModel, priceMoney);
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

		if (_tournamentRemoteModel != null) {
			try {
				Class<?> clazz = _tournamentRemoteModel.getClass();

				Method method = clazz.getMethod("setLocation", String.class);

				method.invoke(_tournamentRemoteModel, location);
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

		if (_tournamentRemoteModel != null) {
			try {
				Class<?> clazz = _tournamentRemoteModel.getClass();

				Method method = clazz.getMethod("setSponsors", String.class);

				method.invoke(_tournamentRemoteModel, sponsors);
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

		if (_tournamentRemoteModel != null) {
			try {
				Class<?> clazz = _tournamentRemoteModel.getClass();

				Method method = clazz.getMethod("setLogo", long.class);

				method.invoke(_tournamentRemoteModel, logo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTournamentRemoteModel() {
		return _tournamentRemoteModel;
	}

	public void setTournamentRemoteModel(BaseModel<?> tournamentRemoteModel) {
		_tournamentRemoteModel = tournamentRemoteModel;
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

		Class<?> remoteModelClass = _tournamentRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tournamentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TournamentLocalServiceUtil.addTournament(this);
		}
		else {
			TournamentLocalServiceUtil.updateTournament(this);
		}
	}

	@Override
	public Tournament toEscapedModel() {
		return (Tournament)ProxyUtil.newProxyInstance(Tournament.class.getClassLoader(),
			new Class[] { Tournament.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TournamentClp clone = new TournamentClp();

		clone.setTournamentId(getTournamentId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setCreatedBy(getCreatedBy());
		clone.setUpdatedBy(getUpdatedBy());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setName(getName());
		clone.setType(getType());
		clone.setNoOfTeams(getNoOfTeams());
		clone.setStartDate(getStartDate());
		clone.setEndDate(getEndDate());
		clone.setPriceMoney(getPriceMoney());
		clone.setLocation(getLocation());
		clone.setSponsors(getSponsors());
		clone.setLogo(getLogo());

		return clone;
	}

	@Override
	public int compareTo(Tournament tournament) {
		int value = 0;

		value = DateUtil.compareTo(getModifiedDate(),
				tournament.getModifiedDate());

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

		if (!(obj instanceof TournamentClp)) {
			return false;
		}

		TournamentClp tournament = (TournamentClp)obj;

		long primaryKey = tournament.getPrimaryKey();

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
		StringBundler sb = new StringBundler(33);

		sb.append("{tournamentId=");
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
		sb.append(", type=");
		sb.append(getType());
		sb.append(", noOfTeams=");
		sb.append(getNoOfTeams());
		sb.append(", startDate=");
		sb.append(getStartDate());
		sb.append(", endDate=");
		sb.append(getEndDate());
		sb.append(", priceMoney=");
		sb.append(getPriceMoney());
		sb.append(", location=");
		sb.append(getLocation());
		sb.append(", sponsors=");
		sb.append(getSponsors());
		sb.append(", logo=");
		sb.append(getLogo());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.sports.portlet.tournament.model.Tournament");
		sb.append("</model-name>");

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
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noOfTeams</column-name><column-value><![CDATA[");
		sb.append(getNoOfTeams());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startDate</column-name><column-value><![CDATA[");
		sb.append(getStartDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endDate</column-name><column-value><![CDATA[");
		sb.append(getEndDate());
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

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _tournamentRemoteModel;
}
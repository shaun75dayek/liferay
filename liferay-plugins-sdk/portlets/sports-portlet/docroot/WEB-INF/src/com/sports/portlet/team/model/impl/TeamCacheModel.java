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

package com.sports.portlet.team.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.sports.portlet.team.model.Team;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Team in entity cache.
 *
 * @author vijayan.chendrayan
 * @see Team
 * @generated
 */
public class TeamCacheModel implements CacheModel<Team>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{teamId=");
		sb.append(teamId);
		sb.append(", tournamentId=");
		sb.append(tournamentId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", updatedBy=");
		sb.append(updatedBy);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", noOfPlayers=");
		sb.append(noOfPlayers);
		sb.append(", priceMoney=");
		sb.append(priceMoney);
		sb.append(", location=");
		sb.append(location);
		sb.append(", sponsors=");
		sb.append(sponsors);
		sb.append(", logo=");
		sb.append(logo);
		sb.append(", color=");
		sb.append(color);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Team toEntityModel() {
		TeamImpl teamImpl = new TeamImpl();

		teamImpl.setTeamId(teamId);
		teamImpl.setTournamentId(tournamentId);
		teamImpl.setCompanyId(companyId);
		teamImpl.setGroupId(groupId);
		teamImpl.setCreatedBy(createdBy);
		teamImpl.setUpdatedBy(updatedBy);

		if (createDate == Long.MIN_VALUE) {
			teamImpl.setCreateDate(null);
		}
		else {
			teamImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			teamImpl.setModifiedDate(null);
		}
		else {
			teamImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			teamImpl.setName(StringPool.BLANK);
		}
		else {
			teamImpl.setName(name);
		}

		teamImpl.setNoOfPlayers(noOfPlayers);

		if (priceMoney == null) {
			teamImpl.setPriceMoney(StringPool.BLANK);
		}
		else {
			teamImpl.setPriceMoney(priceMoney);
		}

		if (location == null) {
			teamImpl.setLocation(StringPool.BLANK);
		}
		else {
			teamImpl.setLocation(location);
		}

		if (sponsors == null) {
			teamImpl.setSponsors(StringPool.BLANK);
		}
		else {
			teamImpl.setSponsors(sponsors);
		}

		teamImpl.setLogo(logo);

		if (color == null) {
			teamImpl.setColor(StringPool.BLANK);
		}
		else {
			teamImpl.setColor(color);
		}

		teamImpl.resetOriginalValues();

		return teamImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		teamId = objectInput.readLong();
		tournamentId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		createdBy = objectInput.readLong();
		updatedBy = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		noOfPlayers = objectInput.readInt();
		priceMoney = objectInput.readUTF();
		location = objectInput.readUTF();
		sponsors = objectInput.readUTF();
		logo = objectInput.readLong();
		color = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(teamId);
		objectOutput.writeLong(tournamentId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(createdBy);
		objectOutput.writeLong(updatedBy);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeInt(noOfPlayers);

		if (priceMoney == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(priceMoney);
		}

		if (location == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (sponsors == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sponsors);
		}

		objectOutput.writeLong(logo);

		if (color == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(color);
		}
	}

	public long teamId;
	public long tournamentId;
	public long companyId;
	public long groupId;
	public long createdBy;
	public long updatedBy;
	public long createDate;
	public long modifiedDate;
	public String name;
	public int noOfPlayers;
	public String priceMoney;
	public String location;
	public String sponsors;
	public long logo;
	public String color;
}
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

package com.sports.portlet.tournament.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.sports.portlet.tournament.model.Tournament;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Tournament in entity cache.
 *
 * @author vijayan.chendrayan
 * @see Tournament
 * @generated
 */
public class TournamentCacheModel implements CacheModel<Tournament>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{tournamentId=");
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
		sb.append(", type=");
		sb.append(type);
		sb.append(", noOfTeams=");
		sb.append(noOfTeams);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", priceMoney=");
		sb.append(priceMoney);
		sb.append(", location=");
		sb.append(location);
		sb.append(", sponsors=");
		sb.append(sponsors);
		sb.append(", logo=");
		sb.append(logo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Tournament toEntityModel() {
		TournamentImpl tournamentImpl = new TournamentImpl();

		tournamentImpl.setTournamentId(tournamentId);
		tournamentImpl.setCompanyId(companyId);
		tournamentImpl.setGroupId(groupId);
		tournamentImpl.setCreatedBy(createdBy);
		tournamentImpl.setUpdatedBy(updatedBy);

		if (createDate == Long.MIN_VALUE) {
			tournamentImpl.setCreateDate(null);
		}
		else {
			tournamentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tournamentImpl.setModifiedDate(null);
		}
		else {
			tournamentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			tournamentImpl.setName(StringPool.BLANK);
		}
		else {
			tournamentImpl.setName(name);
		}

		if (type == null) {
			tournamentImpl.setType(StringPool.BLANK);
		}
		else {
			tournamentImpl.setType(type);
		}

		tournamentImpl.setNoOfTeams(noOfTeams);

		if (startDate == Long.MIN_VALUE) {
			tournamentImpl.setStartDate(null);
		}
		else {
			tournamentImpl.setStartDate(new Date(startDate));
		}

		if (endDate == Long.MIN_VALUE) {
			tournamentImpl.setEndDate(null);
		}
		else {
			tournamentImpl.setEndDate(new Date(endDate));
		}

		if (priceMoney == null) {
			tournamentImpl.setPriceMoney(StringPool.BLANK);
		}
		else {
			tournamentImpl.setPriceMoney(priceMoney);
		}

		if (location == null) {
			tournamentImpl.setLocation(StringPool.BLANK);
		}
		else {
			tournamentImpl.setLocation(location);
		}

		if (sponsors == null) {
			tournamentImpl.setSponsors(StringPool.BLANK);
		}
		else {
			tournamentImpl.setSponsors(sponsors);
		}

		tournamentImpl.setLogo(logo);

		tournamentImpl.resetOriginalValues();

		return tournamentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tournamentId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		createdBy = objectInput.readLong();
		updatedBy = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		type = objectInput.readUTF();
		noOfTeams = objectInput.readInt();
		startDate = objectInput.readLong();
		endDate = objectInput.readLong();
		priceMoney = objectInput.readUTF();
		location = objectInput.readUTF();
		sponsors = objectInput.readUTF();
		logo = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
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

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}

		objectOutput.writeInt(noOfTeams);
		objectOutput.writeLong(startDate);
		objectOutput.writeLong(endDate);

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
	}

	public long tournamentId;
	public long companyId;
	public long groupId;
	public long createdBy;
	public long updatedBy;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String type;
	public int noOfTeams;
	public long startDate;
	public long endDate;
	public String priceMoney;
	public String location;
	public String sponsors;
	public long logo;
}
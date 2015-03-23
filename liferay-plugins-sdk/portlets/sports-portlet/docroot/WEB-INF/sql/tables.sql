create table sports_tournament (
	tournamentId LONG not null primary key IDENTITY,
	companyId LONG,
	groupId LONG,
	createdBy LONG,
	updatedBy LONG,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	type_ VARCHAR(75) null,
	noOfTeams INTEGER,
	startDate DATE null,
	endDate DATE null,
	priceMoney VARCHAR(75) null,
	location VARCHAR(75) null,
	sponsors VARCHAR(75) null,
	logo LONG
);
create table sports_team (
	teamId LONG not null primary key,
	tournamentId LONG,
	companyId LONG,
	groupId LONG,
	createdBy LONG,
	updatedBy LONG,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	noOfPlayers INTEGER,
	priceMoney VARCHAR(75) null,
	location VARCHAR(75) null,
	sponsors VARCHAR(75) null,
	logo LONG,
	color VARCHAR(75) null
);

create table sports_tournament (
	tournamentId LONG not null primary key,
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
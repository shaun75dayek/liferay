<%@include file="init.jsp" %>

<portlet:renderURL var="viewEditTournamentPageURL">
	<portlet:param name="jspPage" value="/html/sports/tournament/edit.jsp"/>
</portlet:renderURL>

<a href="<%= viewEditTournamentPageURL %>">Add Tournament</a><br/>

<liferay-ui:search-container>
	<liferay-ui:search-container-results
		results="<%= TournamentLocalServiceUtil.getTournaments(searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= TournamentLocalServiceUtil.getTournamentsCount() %>"
	/>

	<liferay-ui:search-container-row
		className="com.sports.portlet.tournament.model.Tournament"
		modelVar="aTournament"
	>
		<liferay-ui:search-container-column-text property="name" />

		<liferay-ui:search-container-column-text property="startDate" />

		<liferay-ui:search-container-column-text property="endDate" />

		<liferay-ui:search-container-column-text property="noOfTeams" />

		<liferay-ui:search-container-column-text property="type" />
		
		<liferay-ui:search-container-column-text name="Action">
			<portlet:renderURL var="viewEditPageURL">
				<portlet:param name="jspPage" value="/html/sports/tournament/edit.jsp"/>
				<portlet:param name="tournamentId" value="<%= String.valueOf(aTournament.getTournamentId()) %>"/>
			</portlet:renderURL>
			<portlet:renderURL var="addTeamPageURL">
				<portlet:param name="jspPage" value="/html/sports/team/dashboard.jsp"/>
				<portlet:param name="tournamentId" value="<%= String.valueOf(aTournament.getTournamentId()) %>"/>
			</portlet:renderURL>
			<portlet:actionURL var="deleteURL">
				<portlet:param name="tournamentId" value="<%= String.valueOf(aTournament.getTournamentId()) %>"/>
				<portlet:param name="cmd" value="delete"/>
			</portlet:actionURL>
			<liferay-ui:icon-menu>
				<liferay-ui:icon-delete url="<%= deleteURL %>"></liferay-ui:icon-delete>
				<liferay-ui:icon image="Edit" label="Edit" url="<%= viewEditPageURL %>" />
				<liferay-ui:icon image="Add" label="Add Team" url="<%= addTeamPageURL %>" />
			</liferay-ui:icon-menu>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
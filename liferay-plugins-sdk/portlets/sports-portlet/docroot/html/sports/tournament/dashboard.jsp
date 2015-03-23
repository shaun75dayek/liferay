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

		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
<%@include file="../tournament/init.jsp" %>

<%
	long tournamentId = ParamUtil.getLong(request, "tournamentId");
%>
<portlet:renderURL var="viewEditTeamPageURL">
	<portlet:param name="jspPage" value="/html/sports/team/edit.jsp"/>
	<portlet:param name="tournamentId" value="<%= String.valueOf(tournamentId) %>"/>
</portlet:renderURL>

<a href="<%= viewEditTeamPageURL %>">Add Team</a><br/>

<liferay-ui:search-container>
	<liferay-ui:search-container-results
		results="<%= TeamLocalServiceUtil.findByTournamentId(tournamentId, searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= TeamLocalServiceUtil.countByTournamanetId(tournamentId) %>"
	/>

	<liferay-ui:search-container-row
		className="com.sports.portlet.team.model.Team"
		modelVar="team"
	>
		<liferay-ui:search-container-column-text property="name" />

		<liferay-ui:search-container-column-text property="color" />

		<liferay-ui:search-container-column-text name="Action">
			<portlet:renderURL var="viewEditPageURL">
				<portlet:param name="jspPage" value="/html/sports/team/edit.jsp"/>
				<portlet:param name="teamId" value="<%= String.valueOf(team.getTeamId()) %>"/>
				<portlet:param name="cmd" value="editTeam"/>
			</portlet:renderURL>
			<portlet:actionURL var="deleteURL">
				<portlet:param name="teamId" value="<%= String.valueOf(team.getTeamId()) %>"/>
				<portlet:param name="cmd" value="deleteTeam"/>
			</portlet:actionURL>
			<liferay-ui:icon-menu>
				<liferay-ui:icon-delete url="<%= deleteURL %>"></liferay-ui:icon-delete>
				<liferay-ui:icon image="Edit" label="Edit" url="<%= viewEditPageURL %>" />
			</liferay-ui:icon-menu>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
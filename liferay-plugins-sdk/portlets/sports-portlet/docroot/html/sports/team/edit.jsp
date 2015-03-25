<%@include file="../tournament/init.jsp" %>

<%
	long tournamentId = ParamUtil.getLong(request, "tournamentId");
	long teamId = ParamUtil.getLong(request, "teamId");
	Team team = null;
	if(Validator.isNotNull(teamId)) {
		team  = TeamLocalServiceUtil.fetchTeam(teamId);
	} else {
		team = new TeamImpl();
	}
%>

<portlet:actionURL var="editTeamURL">
	<portlet:param name="cmd" value="editTeam"/>
</portlet:actionURL>

<aui:form action="<%= editTeamURL %>" name="fm" method="post">
	<aui:model-context bean="<%= team %>" model="<%= Team.class %>" />
	<aui:input type="hidden" name="teamId"/>
	<aui:input type="hidden" name="tournamentId" value="<%= tournamentId %>"/>
	<aui:input type="text" name="name"/>
	<aui:input type="text" name="color" />
	<aui:button type="submit" value="Save" />
</aui:form>

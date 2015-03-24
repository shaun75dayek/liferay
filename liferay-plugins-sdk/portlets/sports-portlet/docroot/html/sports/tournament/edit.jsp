<%@page import="com.sports.portlet.tournament.model.impl.TournamentImpl"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.sports.portlet.tournament.model.Tournament"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@include file="init.jsp" %>


<%
	long tournamentId = ParamUtil.getLong(request, "tournamentId");
	Tournament tournament = null;
	if(Validator.isNotNull(tournamentId)) {
		tournament  = TournamentLocalServiceUtil.fetchTournament(tournamentId);
	} else {
		tournament = new TournamentImpl();
	}
%>

<portlet:actionURL var="editTournamentURL"></portlet:actionURL>

<aui:form action="<%= editTournamentURL %>" name="fm" method="post">
	<aui:model-context bean="<%= tournament %>" model="<%= Tournament.class %>" />
	<aui:input type="hidden" name="tournamentId"/>
	<aui:input type="text" name="name"/>
	<aui:input type="text" name="type" />
	<aui:button type="submit" value="Save" />
</aui:form>

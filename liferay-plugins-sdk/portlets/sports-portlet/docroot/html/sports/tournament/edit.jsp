<%@include file="init.jsp" %>


This is the <b>Tournament</b> Add Page.

<portlet:actionURL var="editTournamentURL"></portlet:actionURL>

<aui:form action="<%= editTournamentURL %>" name="fm" method="post">
	<aui:input type="text" name="name"/>
	<aui:input type="text" name="type" />
	<aui:button type="submit" value="Save" />
</aui:form>

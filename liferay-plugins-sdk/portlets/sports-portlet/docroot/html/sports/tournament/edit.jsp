<%@include file="init.jsp" %>


This is the <b>Tournament</b> Add Page.

<portlet:actionURL var="editTournamentURL"></portlet:actionURL>

<form action="<%= editTournamentURL %>" name="fm" method="post">
	<input type="text" name="name"/>
	<input type="text" name="type" />
	<input type="submit" value="Save" />
</form>

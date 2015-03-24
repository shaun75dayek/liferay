<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@page import="com.sports.portlet.tournament.model.impl.TournamentImpl"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.sports.portlet.tournament.model.Tournament"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.sports.portlet.team.model.impl.TeamImpl"%>
<%@page import="com.sports.portlet.team.service.TeamLocalServiceUtil"%>
<%@page import="com.sports.portlet.team.model.Team"%>
<%@page import="com.sports.portlet.tournament.service.TournamentLocalServiceUtil"%>

<portlet:defineObjects />
<theme:defineObjects/>

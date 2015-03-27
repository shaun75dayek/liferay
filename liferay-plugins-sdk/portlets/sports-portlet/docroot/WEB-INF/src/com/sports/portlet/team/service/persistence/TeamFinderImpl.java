package com.sports.portlet.team.service.persistence;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.sports.portlet.team.model.Team;
import com.sports.portlet.team.model.impl.TeamImpl;

import java.util.List;

public class TeamFinderImpl extends BasePersistenceImpl<Team> implements TeamFinder{
	
	public static final String FETCH_ALL_ITEMS = "team-list";
	
	public List<Team> fetchTeamCustomList(int begin, int end) {
		    Session session = null;
		    try {
		        session = openSession();

		        String sql = CustomSQLUtil.get(FETCH_ALL_ITEMS);

		        SQLQuery q = session.createSQLQuery(sql);
		        q.setCacheable(false);
		        q.addEntity("Team", TeamImpl.class);

		        return (List<Team>) QueryUtil.list(q, getDialect(), begin, end);
		    } catch (Exception e) {
		        try {
		            throw new SystemException(e);
		        } catch (SystemException se) {
		            se.printStackTrace();
		        }
		    } finally {
		        closeSession(session);
		    }

		    return null;
		}
	
	public List<Team> fetchTeamByTournamentIdCustomList(long tournamentId, int begin, int end) {
	    Session session = null;
	    try {
	        session = openSession();

	        String sql = CustomSQLUtil.get("team-list-by-touranamentId");

	        SQLQuery q = session.createSQLQuery(sql);
	        q.setCacheable(false);
	        q.addEntity("Team", TeamImpl.class);
	        
	        QueryPos qPos = QueryPos.getInstance(q);
	        qPos.add(tournamentId);
	        
	        return (List<Team>) QueryUtil.list(q, getDialect(), begin, end);
	    } catch (Exception e) {
	        try {
	            throw new SystemException(e);
	        } catch (SystemException se) {
	            se.printStackTrace();
	        }
	    } finally {
	        closeSession(session);
	    }

	    return null;
	}

}

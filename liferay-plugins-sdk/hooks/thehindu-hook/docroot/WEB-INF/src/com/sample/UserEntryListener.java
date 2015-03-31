package com.sample;

import com.liferay.portal.ModelListenerException;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.model.User;

public class UserEntryListener implements ModelListener<User>{

	@Override
	public void onAfterAddAssociation(Object arg0, String arg1, Object arg2)
			throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAfterCreate(User user) throws ModelListenerException {
		System.out.println("User Id:" + user.getUserId());
		System.out.println("User Name:" + user.getFirstName());
		
	}

	@Override
	public void onAfterRemove(User arg0) throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAfterRemoveAssociation(Object arg0, String arg1, Object arg2)
			throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAfterUpdate(User arg0) throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBeforeAddAssociation(Object arg0, String arg1, Object arg2)
			throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBeforeCreate(User arg0) throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBeforeRemove(User arg0) throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBeforeRemoveAssociation(Object arg0, String arg1, Object arg2)
			throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBeforeUpdate(User arg0) throws ModelListenerException {
		// TODO Auto-generated method stub
		
	}

}

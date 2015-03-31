package com.sample;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCustom extends Action {

	@Override
	public void run(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ActionException {
		ThemeDisplay themeDisplay = (ThemeDisplay) arg0.getAttribute(WebKeys.THEME_DISPLAY);
		if(Validator.isNotNull(themeDisplay)) {
			System.out.println("User Name===>>" + themeDisplay.getUser().getFullName()); 
		}
			System.out.println("After login ===>>");
	}

	@Override
	public void run(RenderRequest renderRequest, RenderResponse renderResponse)
			throws ActionException {
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		if(Validator.isNotNull(themeDisplay)) {
			System.out.println("User Name===>>" + themeDisplay.getUser().getFullName()); 
		}
	}

}
package com.commercecontent.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.commercecontent.dao.ContentPageDao;
import com.commercecontent.model.ContentPageModel;

public class DefaultContentPageDao implements ContentPageDao
{
	private SessionFactory session;
	
	public SessionFactory getSession() {
		return session;
	}

	public void setSession(SessionFactory session) {
		this.session = session;
	}

	public ContentPageModel getModel(int id)
	{
		return null;
	}

	public void saveModel(ContentPageModel model)
	{
		
	}

	public void updateModel(ContentPageModel model)
	{
		
	}

	public void deleteModel(ContentPageModel model)
	{
		
	}

	public List<ContentPageModel> getModels()
	{
		return null;
	}

	public ContentPageModel getPageForCode(String code)
	{
		return null;
	}

	

	public ContentPageModel getDefaultPage(String pageCode) 
	{
		return (ContentPageModel) getSession().getCurrentSession().createQuery("From ContentPageModel where pageCode=:pageCode and isDefault=:default").setParameter("pageCode", pageCode).setParameter("isDefault", true).list().get(0);
	}

}

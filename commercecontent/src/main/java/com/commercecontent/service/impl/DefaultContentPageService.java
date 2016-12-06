package com.commercecontent.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.commercecontent.dao.ContentPageDao;
import com.commercecontent.model.ContentPageModel;
import com.commercecontent.service.ContentPageService;

@Transactional
public class DefaultContentPageService implements ContentPageService
{
	private ContentPageDao contentPageDao;
	
	public ContentPageDao getContentPageDao() {
		return contentPageDao;
	}

	public void setContentPageDao(ContentPageDao contentPageDao) {
		this.contentPageDao = contentPageDao;
	}

	public void saveModel(ContentPageModel model) 
	{
		getContentPageDao().saveModel(model);
	}

	public ContentPageModel getModel(int id) 
	{
		return getContentPageDao().getModel(id);
	}

	public void deleteMOdel(ContentPageModel model) 
	{
		getContentPageDao().deleteModel(model);
	}

	public void updateModel(ContentPageModel model) 
	{
		getContentPageDao().updateModel(model);
	}

	public List<ContentPageModel> getModels() 
	{
		return null;
	}

	public ContentPageModel getContentPageForCode(String code) 
	{
		return contentPageDao.getPageForCode(code);
	}

}

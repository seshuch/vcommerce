package com.commercecontent.dao;

import java.util.List;

import com.commercecontent.model.ContentPageModel;
import com.commercecontent.model.PageTemplateModel;

public interface ContentPageDao
{
	void saveModel(ContentPageModel model);
	ContentPageModel getModel(int id);
	void deleteModel(ContentPageModel model);
	void updateModel(ContentPageModel model);
	List<ContentPageModel> getModels();
	ContentPageModel getPageForCode(String code);
	PageTemplateModel getViewForTemplate(String code);
	ContentPageModel getDefaultPage(String pageCode);
}

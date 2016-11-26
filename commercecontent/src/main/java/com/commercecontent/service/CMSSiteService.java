package com.commercecontent.service;

import java.util.List;

import com.commercecontent.model.ContentPageModel;
import com.commercecontent.model.PageTemplateModel;

public interface CMSSiteService
{
	void updateModel(ContentPageModel model);
	void deleteMOdel(ContentPageModel model);
	ContentPageModel getModel(int id);
	void saveModel(ContentPageModel model);
	ContentPageModel getPageForCode(String code);
	PageTemplateModel getViewForTemplate(String code);
	ContentPageModel getDefaultPage(String pageCode);
	List<ContentPageModel> getModels();
}

package com.commercefacades.facades.impl;

import com.commercecontent.service.ContentPageService;
import com.commercefacades.data.ContentPageData;
import com.commercefacades.facades.ContentPageFacade;

public class DefaultContentPageFacade implements ContentPageFacade
{
	private ContentPageService contantPageService;
	
	public ContentPageService getContantPageService() {
		return contantPageService;
	}

	public void setContantPageService(ContentPageService contantPageService) {
		this.contantPageService = contantPageService;
	}

	public ContentPageData getSite(int id) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void save(ContentPageData contentPage) 
	{
		// TODO Auto-generated method stub
		
	}
	
}

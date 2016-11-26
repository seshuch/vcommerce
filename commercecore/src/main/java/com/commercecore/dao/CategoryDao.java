package com.commercecore.dao;


import java.util.List;

import com.commercecore.model.CategoryModel;


public interface CategoryDao
{
	Object getModel(int id);
	void saveModel(CategoryModel model);
	void updateModel(CategoryModel model);
	void deleteModel(CategoryModel model);
	List<CategoryModel> getModels();
}

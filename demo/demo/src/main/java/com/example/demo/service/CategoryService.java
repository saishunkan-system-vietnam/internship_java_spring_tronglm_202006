package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mapping.MapperCategoryList;
import com.example.demo.model.CategoryBrand;

@Service
@Transactional
public class CategoryService {
	
	@Autowired
	private MapperCategoryList mapperCategoryList;
	
	public List<CategoryBrand> getAll(CategoryBrand categoryBrand) {
		return mapperCategoryList.getAll(categoryBrand);
	}
	
	public int getTotal(CategoryBrand categoryBrand) { 
		return mapperCategoryList.getTotalCategory(categoryBrand).intValue();
	}
	
	public void addCategory(CategoryBrand categoryBrand) {
		categoryBrand.setCreatDate(LocalDate.now());
		mapperCategoryList.insert(categoryBrand);
	}
	
	public void upDate(CategoryBrand categoryBrand) {
		categoryBrand.setUpDateDate(LocalDate.now());
		mapperCategoryList.update(categoryBrand);
	}

	public boolean isDelete(int id) { 
		int count =  mapperCategoryList.countCategory(id);
		if(count > 0) {
			return false;
		}
		return true;

	}
}

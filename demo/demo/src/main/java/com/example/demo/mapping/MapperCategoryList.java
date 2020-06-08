package com.example.demo.mapping;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.CategoryBrand;


@Repository
public interface MapperCategoryList {
	
	public BigInteger getTotalCategory(CategoryBrand categoryBrand);
	
	public List<CategoryBrand> getAll(CategoryBrand categoryBrand);
	
	public List<CategoryBrand> getAllParent();
	
	public void insert(CategoryBrand categoryBrand);
	
	public void update(CategoryBrand categoryBrand);
	
	public int countCategory(int id);
	
}

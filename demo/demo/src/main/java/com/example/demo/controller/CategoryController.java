package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapping.MapperCategoryList;
import com.example.demo.model.CategoryBrand;
import com.example.demo.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private MapperCategoryList mapperCategoryList;
	
	@GetMapping("/getall")
	public ResponseEntity<CategoryBrand> getAll(@RequestParam Optional<Integer> page, @RequestParam Optional<Integer> idParent) {
		CategoryBrand categoryBrand = new CategoryBrand();
		if(page.isPresent()) {
			categoryBrand.setPage(page.get());
		}else {
			categoryBrand.setPage(1);
		}	
		if(idParent.isPresent()) {
			categoryBrand.setIdParent(idParent.get());
		} else {
			categoryBrand.setIdParent(1);
		}
		
		categoryBrand.setOffset((categoryBrand.getPage() - 1) * categoryBrand.getMaxPageItem());
		categoryBrand.setResults(categoryService.getAll(categoryBrand));
		categoryBrand.setTotalItem(categoryService.getTotal(categoryBrand));
		return ResponseEntity.ok().body(categoryBrand);
	}
	
	@GetMapping("/getparent")
	public ResponseEntity<List<CategoryBrand>> getParent(){	
		List<CategoryBrand> listParent = mapperCategoryList.getAllParent();		
		return ResponseEntity.ok().body(listParent);
	}
	
	@PostMapping("/create")
	public ResponseEntity<CategoryBrand> creatCategory(@RequestBody CategoryBrand categoryBrand) {
		categoryService.addCategory(categoryBrand);
		return ResponseEntity.ok().body(categoryBrand);
	}
	
	@PutMapping("/update")
	public ResponseEntity<CategoryBrand> updaetCategory( @RequestBody CategoryBrand categoryBrand) {
		categoryService.upDate(categoryBrand);
		return ResponseEntity.ok().body(categoryBrand);
	}

}

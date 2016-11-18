package com.jeya.product.business;

import java.util.ArrayList;
import java.util.List;

import com.jeya.product.model.Product;

public class ProductServiceImpl {
	private List<String>bookList = new ArrayList<String>();
	private List<String>musicList = new ArrayList<String>();
	private List<String>moviesList = new ArrayList<String>();
	
	public ProductServiceImpl()
	{
		bookList.add("Book1");
		bookList.add("Book2");
		bookList.add("Book3");
		
		musicList.add("Music1");
		musicList.add("Music2");
		musicList.add("Music3");
		
		moviesList.add("Movie1");
		moviesList.add("Movie2");
		moviesList.add("Movie3");
	}
	
	public List<String> getProductCategories()
	{
		List<String>categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String>getProducts(String category)
	{
		switch(category.toLowerCase())
		{
			case "books": return bookList;
			case "music": return musicList;
			case "movies": return moviesList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product)
	{
		switch(category.toLowerCase())
		{
			case "books": bookList.add(product);	break;
			case "music": musicList.add(product);	break;
			case "movies": moviesList.add(product);	break;
			default: return false;
		}
		return true;
	}

	public List<Product> getProductsV2(String category) {
		List<Product>productList = new ArrayList<>();
		productList.add(new Product("Book1", "1234", 1111.11));
		productList.add(new Product("Book2", "1235", 2222.22));
		return productList;
	}
}
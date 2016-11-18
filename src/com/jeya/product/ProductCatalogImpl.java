package com.jeya.product;

import java.util.List;

import javax.jws.WebService;

import com.jeya.product.business.ProductServiceImpl;
import com.jeya.product.model.Product;
@WebService(endpointInterface="com.jeya.product.ProductCatalog", portName="TestSOAPCatalogPort"
,serviceName="TestSOAPCatalogService")
public class ProductCatalogImpl implements ProductCatalog {
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@Override
	public List<String> getProductCategories()
	{
		return productService.getProductCategories();
	}
	
	@Override
	public List<String>getProductsCopy(String category)
	{
		return productService.getProducts(category);
	}
	
	@Override
	public List<String>getProducts(String category)
	{
		return productService.getProducts(category);
	}
	
	@Override
	public boolean addProduct(String category, String product)
	{
		return productService.addProduct(category, product);
	}
	
	@Override
	public List<Product>getProductsV2(String category)
	{
		return productService.getProductsV2(category);
	}
}
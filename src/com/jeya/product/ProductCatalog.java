package com.jeya.product;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.jeya.product.model.Product;

@WebService/** parameters are optional*/(name="TestSOAPCatalog", targetNamespace="http://www.testmart.com")
// name - value of the portType
// doesn't change in wsdl even if the name of the class is changed by specifying this
public interface ProductCatalog {

	//@WebMethod // this is optional. Once class is annotated with WebService, by default all the public methods in that class are web method
	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public abstract List<String> getProductCategories();

	// exclude from publishing as service of this method
	@WebMethod(exclude = true) // exclude this method when generating WSDL file:
	// exclude from publishing as service of this method
	public abstract List<String> getProductsCopy(String category);

	@WebMethod
	public abstract List<String> getProducts(String category);

	@WebMethod
	public abstract boolean addProduct(String category, String product);

	@WebMethod
	@WebResult(name="Product") // root of the result in xml - <Product>
	// if it doesn't exist root will be <return>
	public abstract List<Product> getProductsV2(String category);
}
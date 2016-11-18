package com.jeya.product;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
// Document is default.
// for rpc: schema (type) is not separated in another file
// for document: schema (type) is separated in another file
// document is good when there is a need to validate
public class ShopInfo {
	
	/*
	 * To test the exception, we need SoaPUI
	 * Eclipse update site: https://www.soapui.org/eclipse/update
	 */
	@WebMethod
	@WebResult(partName="lookupOutput")
	public String getShopInfo(@WebParam(partName="lookupInput") String property) throws InvalidInputException
	{
		String response = null;
		if(property.equals("shopName"))
		{
			response = "Test Mart";
		}
		else if(property.equals("since"))
		{
			response = "since 2012";
		}
		else
		{
			throw new InvalidInputException("Invalid Input", property + " is not a valid input");
		}
		return response;
	}
}
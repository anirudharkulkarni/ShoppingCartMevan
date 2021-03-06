package test;

import org.testng.annotations.Test;

import Pages.CartPage;
import Pages.LoginPage;
import Pages.ProductPage;

public class ProductSelection extends BaseClass {
	
	
		
		@Test
		public void testcase1() {
			
			LoginPage objLogin = new LoginPage();
			ProductPage objProduct = new ProductPage();
			CartPage objCart = new CartPage();
			
			String uname = sheet.getRow(1).getCell(0).getStringCellValue();
			String pass = sheet.getRow(1).getCell(1).getStringCellValue();
			String product = sheet.getRow(1).getCell(2).getStringCellValue();
			
			objLogin.Login(uname, pass);
			objProduct.SelectProduct(product);
			objProduct.GotoCart();
			objCart.verifyProduct(product);
			
		}

	}

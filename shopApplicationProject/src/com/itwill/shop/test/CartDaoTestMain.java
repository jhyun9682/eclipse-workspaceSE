package com.itwill.shop.test;

import java.util.List;

import com.itwill.shop.dao.CartDao;

import com.itwill.shop.dto.CartItem;
import com.itwill.shop.dto.Product;
import com.itwill.shop.dto.User;

public class CartDaoTestMain {

	public static void main(String[] args) throws Exception {
		CartDao cartDao=new CartDao();
		System.out.println("1.add(insert)");
		
		int rowCount=-999;
		/*
		rowCount = cartDao.add(addCart);
		System.out.println(">> "+rowCount);
		*/
		System.out.println("2.updateByCartNo");
		rowCount=cartDao.update(8,5);
		System.out.println(">> "+rowCount);
		
		System.out.println("2.updateByProductNoAndUserId");
		rowCount=cartDao.update("guard1",3,2);
		System.out.println(">> "+rowCount);
		
		System.out.println("3.delete");
		rowCount=cartDao.deleteCartByNo(8);
		System.out.println(">> "+rowCount);
		System.out.println("4.cartList[select]");
		List<CartItem> cartList1=cartDao.getCartList("guard1");
		System.out.println("guard1-->"+cartList1);
		List<CartItem> cartList2=cartDao.getCartList("guard2");
		System.out.println("guard2-->"+cartList2);
		List<CartItem> cartList3=cartDao.getCartList("guard3");
		System.out.println("guard3-->"+cartList3);
		System.out.println("5.selectProductCount");
		int productCount1=cartDao.selectProductCount("guard1",8 );
		System.out.println(">> "+productCount1);
		int productCount2=cartDao.selectProductCount("guard1",3 );
		System.out.println(">> "+productCount2);
		
	}
}

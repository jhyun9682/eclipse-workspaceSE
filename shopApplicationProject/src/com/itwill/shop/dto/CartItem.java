package com.itwill.shop.dto;

public class CartItem {
	private int cart_no;
	/******User************/
	private String userId;
	/****Product**********/
	private int p_no;
	private int cart_qty;
	public CartItem() {
		// TODO Auto-generated constructor stub
	}
	public CartItem(int cart_no, String userId, int p_no, int cart_qty) {
		super();
		this.cart_no = cart_no;
		this.userId = userId;
		this.p_no = p_no;
		this.cart_qty = cart_qty;
	}
	public int getCart_no() {
		return cart_no;
	}
	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getP_no() {
		return p_no;
	}
	public void setP_no(int p_no) {
		this.p_no = p_no;
	}
	public int getCart_qty() {
		return cart_qty;
	}
	public void setCart_qty(int cart_qty) {
		this.cart_qty = cart_qty;
	}
	
	
	
}
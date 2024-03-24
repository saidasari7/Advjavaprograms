package com.sai.jdbc;

public class product1 {
	
		 int proId;
		 String proName;
		 double proPrice;
		 public product1(int proId, String proName, double proPrice) {
		  this.proId = proId;
		  this.proName = proName;
		  this.proPrice = proPrice;
		 }
		 public product1() {
		  super();
		  
		 }
		 public int getProId() {
		  return proId;
		 }
		 public void setProId(int proId) {
		  this.proId = proId;
		 }
		 public String getProName() {
		  return proName;
		 }
		 public void setProName(String proName) {
		  this.proName = proName;
		 }
		 public double getProPrice() {
		  return proPrice;
		 }
		 public void setProPrice(double proPrice) {
		  this.proPrice = proPrice;
		 }
		 @Override
		 public String toString() {
		  return "Product1 [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + "]";
		 }
		 
		 
		 
		}
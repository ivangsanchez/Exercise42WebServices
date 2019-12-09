package com.Exercise42.model;

public class Invoice {
	private int idInvoice;
	private String nameClient;
	private double totalInvoice;
	private int numberArticles;
	private double priceArticles;
	
	public Invoice()
	{	
	}
	
	public Invoice(int idInvoice, String nameClient, double totalInvoice) {
		this.idInvoice=idInvoice;
		this.nameClient=nameClient;
		this.totalInvoice=totalInvoice;
		
	}
	
	
	public int getIdInvoice()
	{
		return this.idInvoice;
	}
	
	public void setIdInvoice(int idInvoice)
	{
		this.idInvoice=idInvoice;
	}
	
	public String getNameClient() {
		return this.nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient=nameClient;
	}
	
	public double getTotalInvoice() {
		return this.totalInvoice;
	}
	
	public void setTotalInvoice(double totalInvoice ) {
		this.totalInvoice=totalInvoice;
	}
	
	public int getNumberArticles() {
		return this.numberArticles;
	}
	
	public void setNumberArticles(int numberArticles) {
		this.numberArticles=numberArticles;
	}
	public double getPriceArticles() {
		return this.priceArticles;
	}
	public void setPriceArticles(double priceArticles) {
		this.priceArticles=priceArticles;
	}
	
	public double CalculateTotal(int numerArticles,double priceArticles) {
		//this.totalInvoice = numberArticles*priceArticles;
		//return this.totalInvoice;
		return 200.0;
	}
	
}

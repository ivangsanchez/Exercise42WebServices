package com.Exercise42.model;
import com.Exercise42.model.Invoice;

public class InvoiceOperations {

	public double CalculateInvoiceTotal(Invoice myInvoice) {
		myInvoice.setTotalInvoice(myInvoice.getNumberArticles()*myInvoice.getPriceArticles());
		return myInvoice.getTotalInvoice();
	}

}

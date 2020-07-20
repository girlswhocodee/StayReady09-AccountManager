package com.codedifferently.bankaccountlab;
public class BusinessAccount extends SavingsAccount{
    private Integer taxId;
    private String company; 

    BusinessAccount()
    {
        super();
        taxId = 1;
        company = "random company";
    }
    BusinessAccount(Integer accountNum, String name, Integer pin, Integer taxId, String companyName)
    {
        super(accountNum, name, pin);
        this.setRate(1.00);
        this.taxId = taxId;
        this.company = companyName;
    }
    public BusinessAccount(Integer accountNum, String name, Double fees, Integer pin, Double balance, Integer taxId2,
			String company2) {
	}
	public Integer getTaxId(){
        return this.taxId;
    }
    public void setTaxId(Integer tI){
        this.taxId = tI;
    }
    public String getCompany(){
        return this.company;
    }
    public void setCompany(String cn) {
        this.company = cn;
    }
  
    
}
package com.designPattern.proxy;

public class AdminPoly implements Manager{  
    private Admin admin;  
     
    public AdminPoly(Admin admin) {  
        super();  
        this.admin = admin;  
    }  
   
	public void doSomething() {
		System.out.println("Log:admin操作开始");  
        admin.doSomething();  
        System.out.println("Log:admin操作结束");  
		
	}  
}  

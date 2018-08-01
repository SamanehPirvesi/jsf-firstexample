package com.example.managedBean;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;


@ManagedBean()
//@ViewScoped
@SessionScoped
//@ApplicationScoped
public class Counter implements Serializable{
	
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
private int cnt=5;

public Counter() {
	
}
public int getCnt() {
	return cnt;
}

public void setCnt(int cnt) {
	this.cnt = cnt;
}

public String increment() {
	cnt++;
	System.out.println(cnt);
	return "secondPage?faces-redirect=true";
	}

}

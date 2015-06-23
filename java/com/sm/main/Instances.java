package com.sm.main;

import com.sm.ench.EnchEventHandler;
import com.sm.ench.Index;

public class Instances {
	private static Instances instance;
	private static SM sminst;
	private static EnchEventHandler ehinst;
	private static Index ininst;
	
	
	public Instances(){
		instance=this;
	}
	
	//SETTERS
	public static void setSM(SM sm){
		Instances.sminst=sm;
	}
	
	public static void setEnchEH(EnchEventHandler eh){
		Instances.ehinst=eh;
	}
	
	public static void setIndex(Index in){
		Instances.ininst=in;
	}
	
	
	//GETTERS
	public static Instances getInstance(){
		return Instances.instance;
	}
	
	public static SM getSM(){
		try{
			return Instances.sminst;
		}catch(Exception e){
			return null;
		}
	}
	
	public static EnchEventHandler getEnchEH(){
		try{
			return Instances.ehinst;
		}catch(Exception e){
			return null;
		}
	}
	
	public static Index getIndex(){
		try{
			return Instances.ininst;
		}catch(Exception e){
			return null;
		}
	}
}
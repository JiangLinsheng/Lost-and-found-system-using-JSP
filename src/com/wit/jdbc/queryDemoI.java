package com.wit.jdbc;

import java.util.ArrayList;
import java.util.List;

import com.wit.beans.Information;
import com.wit.dao.InfoDAO;

public class queryDemoI {
	public static void main(String[] args){
		/*InfoDAO idao = new InfoDAO();
		List<Information> infos = new ArrayList<Information>();
		infos = idao.listInfos();
		for(int i=0;i<infos.size();i++){
			System.out.println(infos.get(i).toString());
		}*/
		
		/*InfoDAO idao = new InfoDAO();
		Information i = new Information();
		i = idao.queryInfo(1);
		System.out.println(i.toString());*/
		
		/*InfoDAO idao = new InfoDAO();
		List<Information> infos = new ArrayList<Information>();
		infos = idao.listInfos("电子产品");
		for(int i=0;i<infos.size();i++){
			System.out.println(infos.get(i).toString());
		}*/
		
		InfoDAO idao = new InfoDAO();
		List<Information> infos = new ArrayList<Information>();
		infos = idao.listInfos(-1);
		for(int i=0;i<infos.size();i++){
			System.out.println(infos.get(i).toString());
		}
	}

}

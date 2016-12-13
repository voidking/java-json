package com.voidking.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

public class GetJson extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setCharacterEncoding("utf8");
		PrintWriter pw = res.getWriter();
		JSONObject jsonobj = new JSONObject("{'code':'0','ext':'success'}");
		pw.println(jsonobj);
		
		// 构造
		JSONObject jsonobj1 = new JSONObject("{'name':'郝锦','age':'24'}");
	    pw.println(jsonobj1);
		
	    // 添加属性
		JSONObject jsonobj2 = new JSONObject();
	    jsonobj2.put("name", "haojin").put("age", "24");
	    pw.println(jsonobj2);
	    
	    // 数组
	    JSONArray jsonarr = new JSONArray();
	    jsonarr.put(jsonobj1).put(jsonobj2);
	    pw.println(jsonarr);
	    
	    // 嵌套
	    JSONObject jsonobj3 = new JSONObject();
	    jsonobj3.put("author",jsonobj2);
	    pw.println(jsonobj3);
	}

}

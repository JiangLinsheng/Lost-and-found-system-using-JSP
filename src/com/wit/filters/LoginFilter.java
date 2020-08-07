package com.wit.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
			HttpServletRequest req = (HttpServletRequest) request;
			HttpServletResponse resp = (HttpServletResponse) response;
			HttpSession session = req.getSession();
			String Actor = (String) session.getAttribute("Actor");
			String path = req.getServletPath();
			int m = 0;
			String n[] = {"/index.jsp","/login.jsp","/sregister.jsp","/findbackpw.jsp","/privacy.jsp","/table_1.jsp","/prompt_2.jsp","/prompt_8.jsp"};
			String s[] = {"/index.jsp","/login.jsp","/sregister.jsp","/findbackpw.jsp","/privacy.jsp","/table_1.jsp","/prompt_2.jsp","/prompt_8.jsp","/prompt_1.jsp","/pinformation.jsp","/prompt_3.jsp","/logout.jsp"};
			
			if(Actor == null){
				for(int i=0;i<n.length;i++)
					if(n[i].equals(path))
						m = 1;
			}
			else if(Actor.equals("student")){
				for(int j=0;j<s.length;j++)
					if(s[j].equals(path))
						m = 1;
			}
			else if(Actor.equals("admin")){
				m = 1;
			}
			
			if(m ==1)
				chain.doFilter(request, response);
			else
				resp.sendRedirect("/swzl/login.jsp");
		// pass the request along the filter chain
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

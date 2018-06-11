/*
*检查用户是否登录的拦截器
*/

package rsgl.tool;

import java.util.Map;

import rsgl.vo.Users;

import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginFilter extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		Map session = arg0.getInvocationContext().getSession();
		Users user = (Users)session.get("user");
		if(user == null)
			return Action.LOGIN;
		return arg0.invoke();
	}
	
}
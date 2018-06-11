/*
*检查用户权限
*/

package rsgl.tool;

import java.util.Map;

import rsgl.vo.Users;

import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorityFilter extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		Map session = arg0.getInvocationContext().getSession();
		Users user = (Users)session.get("user");
		if(user.getUsertype().compareTo("系统管理员") != 0)
			return Action.NONE;
		return arg0.invoke();
	}
	
}
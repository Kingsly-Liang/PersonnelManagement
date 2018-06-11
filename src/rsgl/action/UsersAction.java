package rsgl.action;

import com.opensymphony.xwork2.*;
import rsgl.vo.Users;
import rsgl.service.IUsersService;
import java.util.Map;
import rsgl.tool.Pager;
import java.util.List;

public class UsersAction extends ActionSupport{
	private Users users;
	private IUsersService usersService;
	private int pageNow = 1;
	private int pageSize = 10;  //通常设置为10
	
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public IUsersService getUsersService() {
		return usersService;
	}
	public void setUsersService(IUsersService usersService) {
		this.usersService = usersService;
	}
	
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	@Override
	public String execute() throws Exception{
		return SUCCESS;
		
	}
	
	public String login() throws Exception{
		Users user = usersService.check(users.getUsername(), users.getPassword());
		if(user != null)
		{
			Map session = ActionContext.getContext().getSession();
			session.put("user", user);
			this.users = null;
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	//实现密码设置功能
	public String usersSetPwdView() throws Exception{
		Map session = ActionContext.getContext().getSession();
		
		users = usersService.find(((Users)session.get("user")).getUsername());
		//System.out.println(users.getUsername());
		
		return SUCCESS;
	}
	public String usersSetPwd() throws Exception{
		if(users.getPassword().length() != 0){
			//System.out.println(users.getUsername());
			//System.out.println(users.getPassword());
			//System.out.println(users.getUsertype());
			usersService.update(users);
			Users user = usersService.check(users.getUsername(), users.getPassword());
			Map session = ActionContext.getContext().getSession();
			session.put("user", user);
			this.users = null;
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	//实现退出功能
	public String logout() throws Exception{
		Map session = ActionContext.getContext().getSession();
		session.remove("user");
		this.users = null;
		return SUCCESS;
	}
	
	public String usersList() throws Exception{
		List list = usersService.findAll(pageNow, pageSize, users);
		Map request = (Map)ActionContext.getContext().get("request");
		Pager page = new Pager(pageNow, pageSize,usersService.findAllSize(users));
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	}
	
	public String usersAddView() throws Exception{
		return SUCCESS;
	}
	
	public String usersAdd() throws Exception{
		if(users.getUsername().length() != 0 && usersService.find(users.getUsername()) == null){
			users.setPassword(users.getUsername());
			usersService.save(users);
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	//删除功能
	public String usersDelete() throws Exception{
		Map session = ActionContext.getContext().getSession();
		if(users.getUsername().compareTo("admin") != 0 && users.getUsername().compareTo(((Users)session.get("user")).getUsername().trim()) != 0){
			usersService.delete(users.getUsername());
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	//修改功能
	public String usersUpdateView() throws Exception{
		//System.out.println(users);
		users = usersService.find(users.getUsername());
		return SUCCESS;
	}
	
	public String usersUpdate() throws Exception{
		if(users.getUsername().trim().compareTo("admin") != 0){
			usersService.update(users);
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	//重置密码
	public String usersResetPwd() throws Exception{
		users = usersService.find(users.getUsername());
		users.setPassword(users.getUsername());
		usersService.update(users);
		Map session = ActionContext.getContext().getSession();
		if(users.getUsername().compareTo(((Users)session.get("user")).getUsername()) == 0){
			Users user = usersService.check(users.getUsername(), users.getPassword());
			session.put("user", user);
		}
		return SUCCESS;
	}
	
}
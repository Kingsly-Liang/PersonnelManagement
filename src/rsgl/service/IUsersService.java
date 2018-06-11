package rsgl.service;

import rsgl.vo.Users;
import java.util.List;

public interface IUsersService{
	//增加用户
	public void save(Users users);
		
	//删除用户
	public void delete(String username);
		
	//修改用户
	public void update(Users users);
		
	//查询用户
	public Users find(String username);
		
	//分页查询用户
	public List findAll(int pageNow, int pageSize, Users users);
		
	//查询用户总数
	public int findAllSize(Users users);
		
	//检查用户
	public Users check(String username, String password);
		
	//是否存在用户
	public boolean exist(String username);
}
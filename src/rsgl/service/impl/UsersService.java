package rsgl.service.impl;

import rsgl.dao.IUsersDAO;
import rsgl.vo.Users;
import rsgl.service.IUsersService;
import java.util.List;

public class UsersService implements IUsersService{
	
	private IUsersDAO usersDAO;
	
	public void setUsersDAO(IUsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}
	
	@Override
	public void save(Users users) {
		// TODO Auto-generated method stub
		usersDAO.save(users);
	}

	@Override
	public void delete(String username) {
		// TODO Auto-generated method stub
		usersDAO.delete(username);
	}

	@Override
	public void update(Users users) {
		// TODO Auto-generated method stub
		usersDAO.update(users);
	}

	@Override
	public Users find(String username) {
		// TODO Auto-generated method stub
		return usersDAO.find(username);
	}

	@Override
	public List findAll(int pageNow, int pageSize, Users users) {
		// TODO Auto-generated method stub
		return usersDAO.findAll(pageNow, pageSize, users);
	}

	@Override
	public int findAllSize(Users users) {
		// TODO Auto-generated method stub
		return usersDAO.findAllSize(users);
	}

	@Override
	public Users check(String username, String password) {
		// TODO Auto-generated method stub
		return usersDAO.check(username, password);
	}

	@Override
	public boolean exist(String username) {
		// TODO Auto-generated method stub
		return usersDAO.exist(username);
	}
	
}
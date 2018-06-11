package rsgl.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import rsgl.dao.IUsersDAO;
import rsgl.vo.Users;
import org.hibernate.*;
import java.util.List;

public class UsersDAO extends HibernateDaoSupport implements IUsersDAO{

	@Override
	public void save(Users users) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(users);
	}

	@Override
	public void delete(String username) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(find(username));
	}

	@Override
	public void update(Users users) {
		// TODO Auto-generated method stub
		//getHibernateTemplate().update(users);
		String hql = "update users set password = '" + users.getPassword() + "' , usertype = '" + users.getUsertype() + "' where username = '" + users.getUsername() + "'";
		//String hql = "update users set password = '" + users.getPassword() + "' where username = '" + users.getUsername() + "'";
		getSession().createSQLQuery(hql).executeUpdate();
	}

	@Override
	public Users find(String username) {
		// TODO Auto-generated method stub
		List list = getHibernateTemplate().find("from Users where username = ?", username);
		if(list.size() > 0)
			return (Users)list.get(0);
		else
			return null;
	}

	@Override
	public List findAll(int pageNow, int pageSize, Users users) {
		// TODO Auto-generated method stub
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		String hql = "";
		if(users == null)
			hql = "from Users order by username";
		else{
			hql = "from Users where username like '%"+users.getUsername().trim()+"%' order by username";
		}
		Query query = session.createQuery(hql);
		int firstResult = (pageNow - 1)*pageSize;
		query.setFirstResult(firstResult);
		query.setMaxResults(pageSize);
		List list = query.list();
		ts.commit();
		session.close();
		session = null;
		return list;
	}

	@Override
	public int findAllSize(Users users) {
		// TODO Auto-generated method stub
		String hql = "";
		if(users == null)
			hql = "from Users";
		else
			hql = "from Users where username like '%"+users.getUsername().trim()+"%'";
		
		return getHibernateTemplate().find(hql).size();
	}

	@Override
	public Users check(String username, String password) {
		// TODO Auto-generated method stub
		List list = getHibernateTemplate().find("from Users where username = ? and password = ?",username,password);
		if(list.size()>0)
			return (Users)list.get(0);
		else
			return null;
	}

	@Override
	public boolean exist(String username) {
		// TODO Auto-generated method stub
		List list = getHibernateTemplate().find("from Users where username = ?",username);
		if(list.size()>0)
			return true;
		else
			return false;
	}
	
}
package rsgl.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import rsgl.dao.IBmbDAO;
import rsgl.vo.Bmb;
import org.hibernate.*;
import java.util.List;

public class BmbDAO extends HibernateDaoSupport implements IBmbDAO{

	@Override
	public void save(Bmb bmb) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(bmb);
	}

	@Override
	public void delete(String bmbh) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(find(bmbh));
	}

	@Override
	public void update(Bmb bmb) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(bmb);
	}

	@Override
	public Bmb find(String bmbh) {
		// TODO Auto-generated method stub
		List list = getHibernateTemplate().find("from Bmb where bmbh = ?", bmbh);
		if(list.size() > 0)
			return (Bmb)list.get(0);
		else
			return null;
	}

	@Override
	public List findAll(int pageNow, int pageSize, Bmb bmb) {
		// TODO Auto-generated method stub
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		String hql = "";
		if(bmb == null)
			hql = "from Bmb order by bmbh";
		else{
			hql = "from Bmb where bmbh like '%"+bmb.getBmbh()+"%' order by bmbh";
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
	public int findAllSize(Bmb bmb) {
		// TODO Auto-generated method stub
		String hql = "";
		if(bmb == null)
			hql = "from Bmb";
		else
			hql = "from Bmb where bmbh like '%"+bmb.getBmbh()+"%'";
		
		return getHibernateTemplate().find(hql).size();
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Bmb order by bmbh");
	}

	@Override
	public boolean exist(String bmbh) {
		// TODO Auto-generated method stub
		List list = getHibernateTemplate().find("from Bmb where bmbh = ?",bmbh);
		if(list.size() > 0)
			return true;
		else
			return false;
	}
	
}

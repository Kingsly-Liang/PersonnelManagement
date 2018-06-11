package rsgl.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import rsgl.dao.IZgbDAO;
import rsgl.vo.Zgb;
import org.hibernate.*;

import java.util.List;

public class ZgbDAO extends HibernateDaoSupport implements IZgbDAO{

	@Override
	public void save(Zgb zgb) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(zgb);
	}

	@Override
	public void delete(String bh) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(find(bh));
	}

	@Override
	public void update(Zgb zgb) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(zgb);
	}

	@Override
	public Zgb find(String bh) {
		// TODO Auto-generated method stub
		List list = getHibernateTemplate().find("from Zgb where bh = ?", bh);
		if(list.size() > 0)
			return (Zgb)list.get(0);
		else
			return null;
	}

	@Override
	public List findAll(int pageNow, int pageSize, Zgb zgb) {
		// TODO Auto-generated method stub
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		String hql = "";
		if(zgb == null)
			hql = "from Zgb order by bh";
		else{
			hql = "from Zgb where bh like '%"+zgb.getBh()+"%' and bm like '%" + zgb.getBm() + "%' order by bh";
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
	public int findAllSize(Zgb zgb) {
		// TODO Auto-generated method stub
		String hql = "";
		if(zgb == null)
			hql = "from Zgb";
		else
			hql = "from Zgb where bh like '%"+zgb.getBh()+"%'and bm like '%" + zgb.getBm() + "%'";
		
		return getHibernateTemplate().find(hql).size();
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Zgb order by bh");
	}

	@Override
	public boolean exist(String bh) {
		// TODO Auto-generated method stub
		List list = getHibernateTemplate().find("from Zgb where bh = ?",bh);
		if(list.size() > 0)
			return true;
		else
			return false;
	}

	@Override
	public List getAllByBmbh(String bmbh) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Zgb order by bm = '"+bmbh+"' order by bh");
	}
	
	
	
}
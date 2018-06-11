package rsgl.service.impl;

import rsgl.dao.IBmbDAO;
import rsgl.vo.Bmb;
import rsgl.service.IBmbService;
import java.util.List;

public class BmbService implements IBmbService{

	private IBmbDAO bmbDAO;
	public void setBmbDAO(IBmbDAO bmbDAO) {
		this.bmbDAO = bmbDAO;
	}

	@Override
	public void save(Bmb bmb) {
		// TODO Auto-generated method stub
		bmbDAO.save(bmb);
	}

	@Override
	public void delete(String bmbh) {
		// TODO Auto-generated method stub
		bmbDAO.delete(bmbh);
	}

	@Override
	public void update(Bmb bmb) {
		// TODO Auto-generated method stub
		bmbDAO.update(bmb);
	}

	@Override
	public Bmb find(String bmbh) {
		// TODO Auto-generated method stub
		return bmbDAO.find(bmbh);
	}

	@Override
	public List findAll(int pageNow, int pageSize, Bmb bmb) {
		// TODO Auto-generated method stub
		return bmbDAO.findAll(pageNow, pageSize, bmb);
	}

	@Override
	public int findAllSize(Bmb bmb) {
		// TODO Auto-generated method stub
		return bmbDAO.findAllSize(bmb);
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return bmbDAO.getAll();
	}

	@Override
	public boolean exist(String bmbh) {
		// TODO Auto-generated method stub
		return bmbDAO.exist(bmbh);
	}
	
}
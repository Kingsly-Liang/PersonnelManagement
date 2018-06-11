package rsgl.service.impl;

import rsgl.dao.IZgbDAO;
import rsgl.vo.Zgb;
import rsgl.service.IZgbService;
import java.util.List;

public class ZgbService implements IZgbService{
	private IZgbDAO zgbDAO;
	
	public void setZgbDAO(IZgbDAO zgbDAO) {
		this.zgbDAO = zgbDAO;
	}

	@Override
	public void save(Zgb zgb) {
		// TODO Auto-generated method stub
		zgbDAO.save(zgb);
	}

	@Override
	public void delete(String bh) {
		// TODO Auto-generated method stub
		zgbDAO.delete(bh);
	}

	@Override
	public void update(Zgb zgb) {
		// TODO Auto-generated method stub
		zgbDAO.update(zgb);
	}

	@Override
	public Zgb find(String bh) {
		// TODO Auto-generated method stub
		return zgbDAO.find(bh);
	}

	@Override
	public List findAll(int pageNow, int pageSize, Zgb zgb) {
		// TODO Auto-generated method stub
		return zgbDAO.findAll(pageNow, pageSize, zgb);
	}

	@Override
	public int findAllSize(Zgb zgb) {
		// TODO Auto-generated method stub
		return zgbDAO.findAllSize(zgb);
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return zgbDAO.getAll();
	}

	@Override
	public List getAllByBmbh(String bmbh) {
		// TODO Auto-generated method stub
		return zgbDAO.getAllByBmbh(bmbh);
	}

	@Override
	public boolean exist(String bh) {
		// TODO Auto-generated method stub
		return zgbDAO.exist(bh);
	}
	
	
}

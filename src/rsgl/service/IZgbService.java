package rsgl.service;

import rsgl.vo.Zgb;
import java.util.List;

public interface IZgbService{
	//增加职工
	public void save(Zgb zgb);
	
	//删除职工
	public void delete(String bh);
	
	//修改职工
	public void update(Zgb zgb);
	
	//查询职工
	public Zgb find(String bh);
	
	//分页查询职工
	public List findAll(int pageNow, int pageSize, Zgb zgb);
	
	//查询职工总数
	public int findAllSize(Zgb zgb);
	
	//获取所有职工
	public List getAll();
	
	//获取指定部门的职工
	public List getAllByBmbh(String bmbh);
	
	//是否存在职工
	public boolean exist(String bh);
	
}

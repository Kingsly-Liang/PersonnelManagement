package rsgl.dao;
import rsgl.vo.Bmb;
import java.util.List;

public interface IBmbDAO{
	//增加部门
	public void save(Bmb bmb);
	
	//删除部门
	public void delete(String bmbh);
	
	//修改部门
	public void update(Bmb bmb);
	
	//查询部门
	public Bmb find(String bmbh);
	
	//分页查询部门
	public List findAll(int pageNow, int pageSize, Bmb bmb);
	
	//查询部门总数
	public int findAllSize(Bmb bmb);
	
	//获取所有部门
	public List getAll();
	
	//是否存在部门
	public boolean exist(String bmbh);
}
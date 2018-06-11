package rsgl.dao;
import rsgl.vo.Bmb;
import java.util.List;

public interface IBmbDAO{
	//���Ӳ���
	public void save(Bmb bmb);
	
	//ɾ������
	public void delete(String bmbh);
	
	//�޸Ĳ���
	public void update(Bmb bmb);
	
	//��ѯ����
	public Bmb find(String bmbh);
	
	//��ҳ��ѯ����
	public List findAll(int pageNow, int pageSize, Bmb bmb);
	
	//��ѯ��������
	public int findAllSize(Bmb bmb);
	
	//��ȡ���в���
	public List getAll();
	
	//�Ƿ���ڲ���
	public boolean exist(String bmbh);
}
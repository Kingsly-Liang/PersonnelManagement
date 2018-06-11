package rsgl.service;

import rsgl.vo.Zgb;
import java.util.List;

public interface IZgbService{
	//����ְ��
	public void save(Zgb zgb);
	
	//ɾ��ְ��
	public void delete(String bh);
	
	//�޸�ְ��
	public void update(Zgb zgb);
	
	//��ѯְ��
	public Zgb find(String bh);
	
	//��ҳ��ѯְ��
	public List findAll(int pageNow, int pageSize, Zgb zgb);
	
	//��ѯְ������
	public int findAllSize(Zgb zgb);
	
	//��ȡ����ְ��
	public List getAll();
	
	//��ȡָ�����ŵ�ְ��
	public List getAllByBmbh(String bmbh);
	
	//�Ƿ����ְ��
	public boolean exist(String bh);
	
}

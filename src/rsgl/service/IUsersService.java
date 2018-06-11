package rsgl.service;

import rsgl.vo.Users;
import java.util.List;

public interface IUsersService{
	//�����û�
	public void save(Users users);
		
	//ɾ���û�
	public void delete(String username);
		
	//�޸��û�
	public void update(Users users);
		
	//��ѯ�û�
	public Users find(String username);
		
	//��ҳ��ѯ�û�
	public List findAll(int pageNow, int pageSize, Users users);
		
	//��ѯ�û�����
	public int findAllSize(Users users);
		
	//����û�
	public Users check(String username, String password);
		
	//�Ƿ�����û�
	public boolean exist(String username);
}
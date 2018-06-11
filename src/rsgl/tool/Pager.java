package rsgl.tool;

public class Pager{
	private int pageNow;        //��ǰҳ��
	private int pageSize;       //ÿҳ��ʾ�ļ�¼��
	private int totalPage;      //��ҳ��
	private int totalSize;      //��¼����
	private boolean hasFirst;   //�Ƿ�����ҳ
	private boolean hasPre;     //�Ƿ��е�ǰҳ
	private boolean hasNext;    //�Ƿ�����һҳ
	private boolean hasLast;    //�Ƿ������һҳ
	
	//���췽��(����)
	public Pager(int pageNow, int pageSize, int totalSize){
		this.pageNow = pageNow;
		this.pageSize = pageSize;
		this.totalSize = totalSize;
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		totalPage = totalSize/pageSize;
		if(totalSize%pageSize != 0)
			totalPage++;
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public boolean isHasFirst() {
		//����ǰҳΪ��һҳ��������ҳ
		if(pageNow == 1)
			return false;
		else
			return true;
	}

	public void setHasFirst(boolean hasFirst) {
		this.hasFirst = hasFirst;
	}

	public boolean isHasPre() {
		//������ҳ����ǰҳ���ǵ�һҳ�������ǰһҳ
		if(this.isHasFirst())
			return true;
		else
			return false;
	}

	public void setHasPre(boolean hasPre) {
		this.hasPre = hasPre;
	}

	public boolean isHasNext() {
		//����βҳ����ǰҳ���ǵ����һҳ���������һҳ
		if(this.isHasLast())
			return true;
		else
			return false;
	}

	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}

	public boolean isHasLast() {
		//����ǰҳΪ���һҳ������ҳ��Ϊ0������βҳ
		if(pageNow == this.getTotalPage()||this.getTotalPage()==0)
			return false;
		else
			return true;
	}

	public void setHasLast(boolean hasLast) {
		this.hasLast = hasLast;
	}
	
}
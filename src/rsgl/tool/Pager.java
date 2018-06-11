package rsgl.tool;

public class Pager{
	private int pageNow;        //当前页码
	private int pageSize;       //每页显示的记录数
	private int totalPage;      //总页数
	private int totalSize;      //记录总数
	private boolean hasFirst;   //是否有首页
	private boolean hasPre;     //是否有当前页
	private boolean hasNext;    //是否有下一页
	private boolean hasLast;    //是否有最后一页
	
	//构造方法(函数)
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
		//若当前页为第一页，则无首页
		if(pageNow == 1)
			return false;
		else
			return true;
	}

	public void setHasFirst(boolean hasFirst) {
		this.hasFirst = hasFirst;
	}

	public boolean isHasPre() {
		//若有首页，则当前页不是第一页，因此有前一页
		if(this.isHasFirst())
			return true;
		else
			return false;
	}

	public void setHasPre(boolean hasPre) {
		this.hasPre = hasPre;
	}

	public boolean isHasNext() {
		//若有尾页，则当前页不是第最后一页，因此有下一页
		if(this.isHasLast())
			return true;
		else
			return false;
	}

	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}

	public boolean isHasLast() {
		//若当前页为最后一页，或总页数为0，则无尾页
		if(pageNow == this.getTotalPage()||this.getTotalPage()==0)
			return false;
		else
			return true;
	}

	public void setHasLast(boolean hasLast) {
		this.hasLast = hasLast;
	}
	
}
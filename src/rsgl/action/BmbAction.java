package rsgl.action;

import com.opensymphony.xwork2.*;

import java.util.List;
import java.util.Map;
import rsgl.vo.Bmb;
import rsgl.service.IBmbService;
import rsgl.service.IZgbService;
import rsgl.tool.Pager;

public class BmbAction extends ActionSupport{
	private Bmb bmb;
	private IBmbService bmbService;
	private IZgbService zgbService;
	private int pageNow = 1;
	private int pageSize = 8;   //通常设为10
	
	public Bmb getBmb() {
		return bmb;
	}
	public void setBmb(Bmb bmb) {
		this.bmb = bmb;
	}
	public IBmbService getBmbService() {
		return bmbService;
	}
	public void setBmbService(IBmbService bmbService) {
		this.bmbService = bmbService;
	}
	public IZgbService getZgbService() {
		return zgbService;
	}
	public void setZgbService(IZgbService zgbService) {
		this.zgbService = zgbService;
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
	
	@Override
	public String execute() throws Exception{
		return SUCCESS;
	}
	
	public String bmbList() throws Exception{
		List list = bmbService.findAll(pageNow, pageSize, bmb);
		Map request = (Map)ActionContext.getContext().get("request");
		Pager page = new Pager(pageNow,pageSize,bmbService.findAllSize(bmb));
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	}
	
	public String bmbAddView() throws Exception{
		return SUCCESS;
	}
	
	public String bmbAdd() throws Exception{
		if(bmb.getBmbh().length()!=0 && bmbService.find(bmb.getBmbh()) == null){
			bmbService.save(bmb);
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	//删除功能
		public String bmbDelete() throws Exception{
			//List list = zgbService.getAllByBmbh(bmb.getBmbh());
			//if(list.size() == 0){
				bmbService.delete(bmb.getBmbh());
				return SUCCESS;
			//}else{
				//return ERROR;
			//}
		}
		
		//更新
		public String bmbUpdateView() throws Exception{
			//System.out.println(users);
			this.bmb =  bmbService.find(bmb.getBmbh());
			return SUCCESS;
		}
		public String bmbUpdate() throws Exception{
			bmbService.update(bmb);
			return SUCCESS;
		}
}

package rsgl.action;
import com.opensymphony.xwork2.*;

import java.util.*;

import rsgl.vo.Zgb;
import rsgl.service.IZgbService;
import rsgl.service.IBmbService;
import rsgl.tool.Pager;

public class ZgbAction extends ActionSupport{
	private Zgb zgb;
	private IZgbService zgbService;
	private IBmbService bmbService;
	private int pageNow = 1;
	private int pageSize = 8;   //通常设为10
	private List bmb;
	
	public Zgb getZgb() {
		return zgb;
	}
	public void setZgb(Zgb zgb) {
		this.zgb = zgb;
	}
	public IZgbService getZgbService() {
		return zgbService;
	}
	public void setZgbService(IZgbService zgbService) {
		this.zgbService = zgbService;
	}
	public IBmbService getBmbService() {
		return bmbService;
	}
	public void setBmbService(IBmbService bmbService) {
		this.bmbService = bmbService;
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
	public List getBmb() {
		return bmb;
	}
	public void setBmb(List bmb) {
		this.bmb = bmb;
	}
	
	@Override
	public String execute() throws Exception{
		return SUCCESS;
	}
	
	public String zgbList() throws Exception{
		List list = zgbService.findAll(pageNow, pageSize, zgb);
		Map request = (Map)ActionContext.getContext().get("request");
		Pager page = new Pager(pageNow,pageSize,zgbService.findAllSize(zgb));
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	}
	
	public String zgbAddView() throws Exception{
		return SUCCESS;
	}
	
	public String zgbAdd() throws Exception{
		if(zgb.getBh().length()!=0 && zgbService.find(zgb.getBh()) == null){
			zgbService.save(zgb);
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	//删除功能
	public String bmbDelete() throws Exception{
	
			zgbService.delete(zgb.getBh());
			return SUCCESS;
		}
}

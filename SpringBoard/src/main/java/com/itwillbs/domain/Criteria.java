package com.itwillbs.domain;

/**
 * 
 * 페이지 처리 위해 생성한 객체
 *
 */

public class Criteria {
	
	private int page; 
	private int pageSize;
	
	public Criteria() {
		this.page = 1;
		this.pageSize = 10;
	}
	
	public void setPage(int page) {
		if(page <= 0) {
			this.page = 1;
			return;
		}
		this.page = page;
	}
	public void setPageSize(int pageSize) {
		
		if(pageSize <= 0 || pageSize >= 100) {
			this.pageSize = 10;
			return;
		}
		
		this.pageSize = pageSize;
	}
	
	public int getStartPage(){
		// 페이지 정보를 받아서 limit 실행에 필요한 인덱스로 변환
		this.page = (this.page - 1) * this.pageSize;
		
		return page;
	}
	
	public int getPage() {
		return page;
	}
	public int getPageSize() {
		return pageSize;
	}
	
	@Override
	public String toString() {
		return "Criteria [page=" + page + ", pageSize=" + pageSize + "]";
	}
	
}

package com.study.mybatis.common.vo;

public class PageInfo {
	/*
	int totalRecord = 0;	// 전체 레코드 수(board테이블의 전체 행의 수)
	int numPerPage = 10;	// 1page에 보여줄 레코드 수
	int pagePerBlock = 5;	// 블록당 페이지 수 = [1][2][3][4][5] 
			
	int totalPage = 0;		// 전체 페이지 : 레코드수 67개라면, totalPage=7  [1][2][3][4][5][6][7]
	int totalBlock = 0;		// 전체 블록 수 : 레코드수 67개라면, totalBlock=2
	
	int nowPage = 1;		// 현재 해당하는 페이지
	int nowBlock = 1;		// 현재 해당하는 블록
	
	int start = 0;			// board테이블의 select시 시작번호(한페이지에 필요한 만큼 게시물만 가져오려고)
	int end = 0;			// 1page에 보여줄 레코드의 갯수(보통은 10개, 맨 마지막page는 전체레코드수에 따라 달라짐)
	int listSize = 0;		// 현재 읽어온 게시물의 수
	*/
	 public int totalRecord;	
	 public int numPerPage;
	 public int pagePerBlock;	
	 public int nowPage;
 
	 public int totalPage;	
	 public int startPage;	
	 public int endPage;
	 
	public PageInfo() {
		super();
	}
	public PageInfo(int totalRecord, int numPerPage, int pagePerBlock, int nowPage, int totalPage, int startPage,
			int endPage) {
		super();
		this.totalRecord = totalRecord;
		this.numPerPage = numPerPage;
		this.pagePerBlock = pagePerBlock;
		this.nowPage = nowPage;
		this.totalPage = totalPage;
		this.startPage = startPage;
		this.endPage = endPage;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getNumPerPage() {
		return numPerPage;
	}
	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}
	public int getPagePerBlock() {
		return pagePerBlock;
	}
	public void setPagePerBlock(int pagePerBlock) {
		this.pagePerBlock = pagePerBlock;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	@Override
	public String toString() {
		return "PageInfo [totalRecord=" + totalRecord + ", numPerPage=" + numPerPage + ", pagePerBlock=" + pagePerBlock
				+ ", nowPage=" + nowPage + ", totalPage=" + totalPage + ", startPage=" + startPage + ", endPage="
				+ endPage + "]";
	}
	 
	
	 

}
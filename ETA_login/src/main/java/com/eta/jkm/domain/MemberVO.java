package com.eta.jkm.domain;

public class MemberVO {
	private int seq;
	private String id;
	private String pw;

	public MemberVO() {
	}

	public MemberVO(int seq, String id, String pw) {
		super();
		this.seq = seq;
		this.id = id;
		this.pw = pw;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "MemberVO [seq=" + seq + ", id=" + id + ", pw=" + pw + "]";
	}

}

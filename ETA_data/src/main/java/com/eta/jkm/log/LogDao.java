package com.eta.jkm.log;

public interface LogDao {

	void addLog(String method, String sqlstring, boolean success);

}
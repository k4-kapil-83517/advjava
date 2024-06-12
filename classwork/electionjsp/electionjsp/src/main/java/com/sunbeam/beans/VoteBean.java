package com.sunbeam.beans;

import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;
import com.sunbeam.daos.UserDao;
import com.sunbeam.daos.UserDaoImpl;

public class VoteBean {
	 private int candId;
	 private int userId;
	public VoteBean() {
	}
	public int getCandId() {
		return candId;
	}
	public void setCandId(int candId) {
		this.candId = candId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public void vote() {
		try(UserDao userDao = new UserDaoImpl()) {
			userDao.updateStatus(userId, true);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		try(CandidateDao candDao =new CandidateDaoImpl()){
			candDao.incrementVote(candId);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	}


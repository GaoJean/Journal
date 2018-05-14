package com.journal.web.entity.response.user;

import com.journal.web.entity.BaseResponse;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author: GaoJean
 * @ClassName: GetRegisterListResponse
 * @Description: TODO
 * @date: 2017/11/2
 */
@Setter
@Getter
public class GetRegisterListResponse extends BaseResponse implements Serializable{

	private static final long serialVersionUID = -3063197189575421400L;

	// 单例模式 利用了classloader的机制来保证初始化instance时只有一个线程，所以也是线程安全的，同时没有性能损耗
	private GetRegisterListResponse() {
	}

	private static class LazyHolder {
		private static final GetRegisterListResponse INSTANCE = new GetRegisterListResponse();
	}

	public static final GetRegisterListResponse getInstance() {
		return LazyHolder.INSTANCE;
	}

	private List<RegisterModel> registerList;

	public static class RegisterModel {
		private String rehisterId;

		private String roleId;

		private String userAccount;

		private String userPassword;

		private String userTel;

		private String registerStatus;

		private Date createTime;

	}

}

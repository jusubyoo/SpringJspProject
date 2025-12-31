package com.sist.web.vo;

import lombok.Data;

/*
 *   com.sist.web.interceptor : 자동 로그인
 *   com.sist.web.security : 인가/인증 => 권한부여
 *   com.sist.web.task : batck => 실시간 처리
 *   com.sist.web.manager : websocket / kafka
 */
@Data
public class MemberVO {
	private String id,pwd,name,sex,address,msg;
}

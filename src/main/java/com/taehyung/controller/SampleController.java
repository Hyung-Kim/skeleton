package com.taehyung.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taehyung.domain.SampleVO;

//JSP와 같은 뷰를 만들어 내지 않는 대신에 데이터 자체를 반환한다. 이 때 사용하는 것이 JSON, XML 등이다.
//RestController에서 문자열 데이터는 기본적으로 브라우저에서 text/html타입으로 처리된다.
@RestController   // RestController가 선언되어있으면, ResponseBody가 없어도 모든 메소드가 ResponseBody로 작동함.
@RequestMapping("/sample")
public class SampleController {

	@RequestMapping("/hello")
	public SampleVO sayHello() {
		SampleVO vo = new SampleVO();
		vo.setFirstName("홍");
		vo.setLastName("길동");
		vo.setMno(123);
		return vo;
	}
	
	@RequestMapping("/sendVO")
	public SampleVO sendVO() {
		SampleVO vo = new SampleVO();
		vo.setFirstName("홍");
		vo.setLastName("길동");
		vo.setMno(123);
		return vo;
	}
}

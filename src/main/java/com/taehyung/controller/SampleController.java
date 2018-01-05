package com.taehyung.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taehyung.domain.SampleVO;

//JSP�� ���� �並 ����� ���� �ʴ� ��ſ� ������ ��ü�� ��ȯ�Ѵ�. �� �� ����ϴ� ���� JSON, XML ���̴�.
//RestController���� ���ڿ� �����ʹ� �⺻������ ���������� text/htmlŸ������ ó���ȴ�.
@RestController   // RestController�� ����Ǿ�������, ResponseBody�� ��� ��� �޼ҵ尡 ResponseBody�� �۵���.
@RequestMapping("/sample")
public class SampleController {

	@RequestMapping("/hello")
	public SampleVO sayHello() {
		SampleVO vo = new SampleVO();
		vo.setFirstName("ȫ");
		vo.setLastName("�浿");
		vo.setMno(123);
		return vo;
	}
	
	@RequestMapping("/sendVO")
	public SampleVO sendVO() {
		SampleVO vo = new SampleVO();
		vo.setFirstName("ȫ");
		vo.setLastName("�浿");
		vo.setMno(123);
		return vo;
	}
}

1.搭建开发环境
	1.1 导入开发包
		jstl开发包
		mysql驱动
		beanutils开发包
		log4j
	
	1.2 建立程序包
		cn.itcast.domain
		cn.itcast.dao
		cn.itcast.dao.impl
		cn.itcast.serivce
		cn.itcast.service.impl
		cn.itcast.web.controller
		cn.itcast.web.UI
		cn.itcast.utils
		web-inf\jsp保存网站jsp页面
		
	
	1.3 创建数据库和表
		create database day14_customer;
		use day14_customer;
		create table customer
		(
			id varchar(40) primary key,
			name varchar(40) not null,
			gender varchar(4) not null,
			birthday date,
			cellphone varchar(20) not null,
			email varchar(40),
			preference varchar(200),
			type varchar(100),
			description varchar(255)
		);
		
		
2、设计实体

3。写dao

4.写service

5.写web层
		
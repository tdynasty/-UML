1.���������
	1.1 ���뿪����
		jstl������
		mysql����
		beanutils������
		log4j
	
	1.2 ���������
		cn.itcast.domain
		cn.itcast.dao
		cn.itcast.dao.impl
		cn.itcast.serivce
		cn.itcast.service.impl
		cn.itcast.web.controller
		cn.itcast.web.UI
		cn.itcast.utils
		web-inf\jsp������վjspҳ��
		
	
	1.3 �������ݿ�ͱ�
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
		
		
2�����ʵ��

3��дdao

4.дservice

5.дweb��
		
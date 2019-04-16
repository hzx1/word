package com.service.dispensingmanage;

import java.util.List;

import com.po.Drug;

public interface DrugService {
	//模糊查询
	public List<Drug> listD(String contant);
}

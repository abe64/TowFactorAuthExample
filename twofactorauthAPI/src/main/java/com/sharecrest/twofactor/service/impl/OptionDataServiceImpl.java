package com.sharecrest.twofactor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharecrest.twofactor.dbflute.exbhv.TblOptionDataBhv;
import com.sharecrest.twofactor.service.OptionDataService;

@Service
public class OptionDataServiceImpl implements OptionDataService {

	@Autowired
	TblOptionDataBhv optionDataBhv;
	
	@Override
	public String getValue(KeyCode keyCode) {
		return optionDataBhv.selectEntity(cb -> cb.query().setKeyCode_Equal(keyCode.name())).get().getValue();
	}
}

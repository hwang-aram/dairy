package com.inc.dairy.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inc.dairy.domain.Dairy;
import com.inc.dairy.repository.DairyDao;

@Service
public class DairyServiceImpl implements DairyService {

	@Autowired
	private DairyDao dairyDao;

	@Override
	public List<Dairy> list() {
		// TODO Auto-generated method stub
		return dairyDao.list();
	}

	

}

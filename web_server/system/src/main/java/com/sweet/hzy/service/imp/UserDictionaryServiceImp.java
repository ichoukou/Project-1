package com.sweet.hzy.service.imp;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.sweet.bean.UserDictionary;
import com.sweet.hzy.mapper.UserDictionaryMapper;
import com.sweet.hzy.service.UserDictionaryService;
@Service
public class UserDictionaryServiceImp implements UserDictionaryService {

	@Resource
	private UserDictionaryMapper userDictionaryMapper;
	
	public List<UserDictionary>getDictionaryList(){
		return userDictionaryMapper.getDictionaryList();
	}
	
	public int insertDictionary(UserDictionary dic) {
		return userDictionaryMapper.insertDictionary(dic);
	}
	
	public int updateDictionary(UserDictionary dic) {
		return userDictionaryMapper.updateDictionary(dic);
	}
	
	public int deleteDictionaryById(Integer id) {
		return userDictionaryMapper.deleteDictionaryById(id);
	}
}
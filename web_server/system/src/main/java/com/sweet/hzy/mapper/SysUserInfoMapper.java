package com.sweet.hzy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sweet.bean.SysUserInfo;

public interface SysUserInfoMapper {
	
	//查询所有用户
	@Select("SELECT * FROM SYS_USERINFO ")
	List<SysUserInfo> findUserList();
	
	//添加用户
	@Insert("INSERT INTO SYS_USERINFO(loginid, password,phone,sex) VALUES(#{loginid}, #{password}, #{phone}, #{sex})")
	int addUser(@Param("loginid") String loginid, @Param("password") String password,
				@Param("phone") String phone,@Param("sex") Integer sex);
	
	//根据用户名密码查询用户
	@Select("SELECT * FROM SYS_USERINFO WHERE loginid = #{loginid} and password= #{password}")
	SysUserInfo findUserByLoginidAndPassword(@Param("loginid") String loginid,@Param("password") String password);
	
	//删除用户
	@Delete("DELETE SYS_USERINFO WHERE id = #{id}")
	int deleteUserById(@Param("id") String id);
	
	//修改用户密码
	@Update("Update SYS_USERINFO set password= #{password} WHERE id = #{id}")
	int updateUserById(@Param("id") String id,@Param("password") String password);
}

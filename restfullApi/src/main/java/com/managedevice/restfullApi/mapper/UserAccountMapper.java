package com.managedevice.restfullApi.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.managedevice.restfullApi.model.UserAccount;

@Mapper
public interface UserAccountMapper {
	
	
	// get All User
	final String GET_ALL_USER = "SELECT * FROM user_account";

	@Select(GET_ALL_USER)
	@Results(value = { @Result(property = "id", column = "id"), @Result(property = "nameUser", column = "name_user"),
			@Result(property = "passWord", column = "pass_word"), @Result(property = "mail", column = "mail"),
			@Result(property = "phoneNumber", column = "phone_number"),
			@Result(property = "address", column = "address"), @Result(property = "delFlg", column = "del_flg"),
			@Result(property = "roleFlg", column = "role_flg"), @Result(property = "creatDatetime", column = "creat_date"),
			@Result(property = "updateDatetime", column = "update_date") })
	public List<UserAccount> getAll();

	// get user by id
	final String GET_USER_BY_ID = "SELECT * FROM user_account WHERE ID = #{id}";

	@Select(GET_USER_BY_ID)
	@Results(value = { @Result(property = "id", column = "id"), @Result(property = "nameUser", column = "name_user"),
			@Result(property = "passWord", column = "pass_word"), @Result(property = "mail", column = "mail"),
			@Result(property = "phoneNumber", column = "phone_number"),
			@Result(property = "address", column = "address"), @Result(property = "delFlg", column = "del_flg"),
			@Result(property = "roleFlg", column = "role_flg"), @Result(property = "creatDatetime", column = "creat_date"),
			@Result(property = "updateDatetime", column = "update_date") })
	public UserAccount getById(int id);

	// inert user
	final String INSERT_USER = "INSERT INTO user_account (name_user, pass_word, mail, phone_number, address, del_flg, role_flg, creat_date, update_date)"
			+ "VALUES (#{nameUser}, #{passWord}, #{mail}, #{phoneNumber}, #{address}, #{delFlg}, #{roleFlg}, #{creatDatetime}, #{updateDatetime})";

	@Insert(INSERT_USER)
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public void insert(UserAccount userAccount);
	
	// update user
    final String UPDATE_USER = "UPDATE user_account SET pass_word = #{passWord}, mail = #{mail}, "
            + "phone_number = #{phoneNumber}, address = #{address}, del_flg = #{delFlg}, role_flg = #{roleFlg} WHERE ID = #{id}";
 
    @Update(UPDATE_USER)
    public void update(UserAccount userAccount);
}

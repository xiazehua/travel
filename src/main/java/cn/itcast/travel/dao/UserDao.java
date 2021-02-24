package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

/**
 * Software：IntelliJ IDEA 2020.1 x64
 * CassName:      UserDao
 * Author:         夏泽华
 * Date:           2021/2/24 18:28
 * 接口描述：
 */
public interface UserDao {
    //根据用户名查询用户信息
    public User findByName(String name);
    //保存用户信息
    public void addUser(User username);
}

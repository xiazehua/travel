package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;

/**
 * Software：IntelliJ IDEA 2020.1 x64
 * CassName:      UserServiceImpl
 * Author:         夏泽华
 * Date:           2021/2/24 18:14
 * 描述：
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao =new UserDaoImpl();
    public Boolean regist(User user) {
        //1.根据用户查询用户列表
        User user1 = userDao.findByName(user.getName());
        if (user1!=null){
            //2.保存用户信息
          return false;
        }
        userDao.addUser(user);
        return true;
    }
}

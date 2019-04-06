package com.chiyou.spring.ioc;

/**
 * @author wangxiansheng
 * @create 2019-03-31 13:00
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }
}

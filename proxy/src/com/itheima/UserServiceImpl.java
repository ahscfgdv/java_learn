package com.itheima;

public class UserServiceImpl implements UserService{

    @Override
    public void login(String username, String password) throws Exception {
//        long startTime = System.currentTimeMillis();

        if ("admin".equals(username) && "123456".equals(password)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
        Thread.sleep(1000);
//        long endTime = System.currentTimeMillis();
//        System.out.println("login方法耗时" + (endTime - startTime) + "ms");
    }

    @Override
    public void deleteUser() throws Exception {
//        long startTime = System.currentTimeMillis();
        System.out.println("删除了1000个用户");
        Thread.sleep(1500);
//        long endTime = System.currentTimeMillis();
//        System.out.println("login方法耗时" + (endTime - startTime) + "ms");
    }

    @Override
    public String[] selectUser() throws Exception {
//        long startTime = System.currentTimeMillis();

        System.out.println("查询了3个用户");
        String[] users = {"asdasd","qweqwe"};
        Thread.sleep(500);
//        long endTime = System.currentTimeMillis();
//        System.out.println("login方法耗时" + (endTime - startTime) + "ms");
        return users;
    }
}

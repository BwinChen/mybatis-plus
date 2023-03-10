package com.bwin.mybatis;

import com.bwin.mybatis.entity.Menu;
import com.bwin.mybatis.entity.User;
import com.bwin.mybatis.mapper.MenuMapper;
import com.bwin.mybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest
class MybatisPlusApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private MenuMapper menuMapper;

    @Test
    void testSelectList() {
        List<User> list = userMapper.selectList(null);
        assertEquals(5, list.size());
        list.forEach(System.out::println);
    }
    @Test
    void testSelectMenus() {
        List<Menu> menus = menuMapper.selectMenus();
        menus.forEach(System.out::println);
    }
    @Test
    void testSelectUserMenus() {
        List<Menu> menus = menuMapper.selectUserMenus("1,3");
        menus.forEach(System.out::println);
    }
}

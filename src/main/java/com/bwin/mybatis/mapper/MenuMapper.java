package com.bwin.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bwin.mybatis.entity.Menu;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @author McAfee
 */
public interface MenuMapper extends BaseMapper<Menu> {
    /**
     * 查询用户菜单
     * @param ids 用,分隔的菜单id
     * @return 菜单列表
     */
    List<Menu> selectUserMenus(@Param("ids") String ids);

    /**
     * 查询全部菜单
     * @return 菜单列表
     */
    List<Menu> selectMenus();
}

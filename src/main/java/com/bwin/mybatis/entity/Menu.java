package com.bwin.mybatis.entity;

import lombok.Data;
import java.util.List;

/**
 * @author McAfee
 */
@Data
public class Menu {
    private Long id;

    private String name;

    private Long parentId;

    private List<Menu> children;
}

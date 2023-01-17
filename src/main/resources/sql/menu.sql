create table menu
(
    id        bigint       not null
        primary key,
    name      varchar(255) null,
    parent_id bigint       null
);

insert into menu (id, name, parent_id)
values  (1, '一级菜单1', 0),
        (2, '一级菜单2', 0),
        (3, '二级菜单3', 1),
        (4, '二级菜单4', 1),
        (5, '二级菜单5', 2),
        (6, '二级菜单6', 2);

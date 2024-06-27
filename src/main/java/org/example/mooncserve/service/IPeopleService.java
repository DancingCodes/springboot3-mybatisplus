package org.example.mooncserve.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.mooncserve.entity.People;

import java.util.List;

//IService 接口定义了一些常用的方法，例如：
//boolean save(T entity)：保存实体对象到数据库。
//boolean saveBatch(Collection<T> entityList)：批量保存实体对象到数据库。
//boolean removeById(Serializable id)：根据主键删除数据库中的记录。
//boolean updateById(T entity)：根据主键更新数据库中的记录。
//T getById(Serializable id)：根据主键获取数据库中的记录。
//List<T> list()：获取数据库中的所有记录。
public interface IPeopleService extends IService<People> {
}

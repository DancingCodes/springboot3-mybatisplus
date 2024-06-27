package org.example.mooncserve.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mooncserve.entity.People;
import org.example.mooncserve.mapper.PeopleMapper;
import org.springframework.stereotype.Service;

//ServiceImpl 是 MyBatis-Plus 框架提供的一个抽象类，用于实现通用的数据库操作方法。它是 IService 接口的默认实现类，提供了对实体对象的常见 CRUD（Create, Read, Update, Delete）操作。
//ServiceImpl 类包含了一组与数据库操作相关的方法，例如：
//boolean save(T entity)：保存实体对象到数据库。
//boolean saveBatch(Collection<T> entityList)：批量保存实体对象到数据库。
//boolean removeById(Serializable id)：根据主键删除数据库中的记录。
//boolean updateById(T entity)：根据主键更新数据库中的记录。
//T getById(Serializable id)：根据主键获取数据库中的记录。
//List<T> list()：获取数据库中的所有记录。
@Service
public class PeopleServiceImpl extends ServiceImpl<PeopleMapper, People> implements IPeopleService {
}

package com.vip.items.mapper;

import com.vip.items.domain.entity.Collection1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author song
 * 收藏项目
 */
public interface Collection1Mapper {

//    List<Collection1> findCollectProjects();

    int add(@Param("proid")int proid,@Param("uid")int uid,@Param("isDelete")int isDelete);
    int update(@Param("cid")int cid,@Param("isDelete")int isDelete);
    Collection1 findById(@Param("proid")int proid);
    int updateByProid(@Param("proid")int proid, @Param("isDelete")int isDelete);
    Collection1 findByUidProid(@Param("uid") Integer uid,@Param("proid") Integer proid);

    int addCollection1(@Param("uid") int uid,@Param("proid") int proid);

    int updateCollection1(@Param("uid") int uid,@Param("proid") int proid);
}

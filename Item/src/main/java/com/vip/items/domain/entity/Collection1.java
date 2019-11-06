package com.vip.items.domain.entity;

import java.text.Format;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author song
 */
@Data
public class Collection1 {
    /**
    * 收藏id
    */
    private Integer cid;

    /**
    * 用户id
    */
    private Integer uid;

    /**
    * 项目id
    */
    private Integer proid;

    /**
    * 收藏时间
    */
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
    * 状态,0 存在,1 删除
    */
    private Integer isDelete;
}
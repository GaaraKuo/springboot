package com.gaara.ybbweb;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyMetaObjectHandler extends MetaObjectHandler{
  protected final static Logger logger = LoggerFactory.getLogger(YbbwebApplication.class);

  @Override
  public void insertFill(MetaObject metaObject) {
    logger.info("新增的时候干点不可描述的事情");
  }


  @Override
  public void updateFill(MetaObject metaObject) {
    logger.info("更新的时候干点不可描述的事情");
  }
}
package com.qf.service;

import com.qf.entity.po.Info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @version 1.0
 * @author: qc
 * @date 2023/8/7 19:14
 */
@Mapper
public interface InfoService {

    List<Info> selectList(@Param("eventReasons") String eventReasons, @Param("offset") int offset, @Param("pageSize") int pageSize);

}

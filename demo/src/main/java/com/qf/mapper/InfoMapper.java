package com.qf.mapper;

import com.qf.entity.po.Info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface InfoMapper {

    List<Info> selectList(@Param("eventReasons") String eventReasons, @Param("offset") int offset, @Param("pageSize") int pageSize);

}
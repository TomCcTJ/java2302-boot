package com.qf.service.impl;

import com.qf.entity.po.Info;
import com.qf.mapper.InfoMapper;
import com.qf.service.InfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: qc
 * @date 2023/8/7 19:26
 */
@Service
@Slf4j
public class InfoServiceImpl implements InfoService {
    @Autowired
    private InfoMapper infoMapper;

    @Override
    public List<Info> selectList(String eventReasons, int page, int pageSize) {
        int offset = (page - 1) * pageSize;
        return infoMapper.selectList(eventReasons,offset,pageSize);
    }
}

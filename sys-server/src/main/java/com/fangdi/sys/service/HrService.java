package com.fangdi.sys.service;

import com.fangdi.sys.bean.Hr;
import com.fangdi.sys.mapper.HrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: TODO
 * @Author: fangdi
 * @Date: 2019-10-08 09:47
 */
@Service
@Transactional
public class HrService {
    @Autowired
    private HrMapper hrMapper;

    public List<Hr> getHrList(String name) {
        return hrMapper.getHrList(name);
    }
}

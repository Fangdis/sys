package com.fangdi.sys.controller;

import com.fangdi.sys.bean.Hr;
import com.fangdi.sys.service.HrService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: fangdi
 * @Date: 2019-10-08 09:44
 */
@RestController
@RequestMapping("/hr")
public class HrController {
    private Logger logger = LoggerFactory.getLogger(HrController.class);

    @Autowired
    HrService hrService;

    @RequestMapping("/list")
    public List<Hr> getHrList(@RequestParam(defaultValue = "") String name) {
        List<Hr> hrList = new ArrayList<>();
        try {
            if (StringUtils.isEmpty(name)) {
                name = null;
            }
            hrList = hrService.getHrList(name);
        } catch (Exception e) {
            logger.error("Get hr list has error, msg is " + e);
        }
        return hrList;
    }
}

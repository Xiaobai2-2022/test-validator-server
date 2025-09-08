package com.fangxia.testvalidator.coursemanager.service.impl;

import com.fangxia.testvalidator.coursemanager.mapper.CourseUserMapper;
import com.fangxia.testvalidator.coursemanager.model.eo.CourseUserEO;
import com.fangxia.testvalidator.coursemanager.service.CourseUserIService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CourseUserServiceImpl
    extends ServiceImpl<CourseUserMapper, CourseUserEO>
    implements CourseUserIService {
}

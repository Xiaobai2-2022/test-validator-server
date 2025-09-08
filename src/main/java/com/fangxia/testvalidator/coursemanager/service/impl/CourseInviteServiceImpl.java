package com.fangxia.testvalidator.coursemanager.service.impl;

import com.fangxia.testvalidator.coursemanager.mapper.CourseInviteMapper;
import com.fangxia.testvalidator.coursemanager.model.eo.CourseInviteEO;
import com.fangxia.testvalidator.coursemanager.service.CourseInviteIService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CourseInviteServiceImpl
    extends ServiceImpl<CourseInviteMapper, CourseInviteEO>
    implements CourseInviteIService {
}

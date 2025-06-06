package com.fangxia.testvalidator.usermanager.service;

import com.fangxia.testvalidator.usermanager.model.eo.EmailVerificationEO;

import com.baomidou.mybatisplus.extension.service.IService;

public interface EmailVerificationIService extends IService<EmailVerificationEO> {

    boolean isTooFrequent(String email);

    boolean insertOrUpdateCode(String email, String code);

    boolean matchVerificationCode(String email, String code);

    String generateVerificationCode(String email);

    void deleteExpiredCodes();

}

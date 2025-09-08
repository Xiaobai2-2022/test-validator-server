package com.fangxia.testvalidator.coursemanager.model.eo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@TableName("fx_course_invitations")
public class CourseInviteEO {

    @Schema(description = "User id")
    @TableField("user_id")
    @EqualsAndHashCode.Include
    private String userId;

    @Schema(description = "Course id")
    @TableField("course_id")
    @EqualsAndHashCode.Include
    private String courseId;

    @Schema(description = "Record creation timestamp")
    @TableField(value = "created_time", fill = FieldFill.INSERT)
    private LocalDateTime createdTime;

    @Schema(description = "Record last update timestamp")
    @TableField(value = "updated_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedTime;

}

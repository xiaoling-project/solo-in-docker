package com.liumapp.solo.transporter.db.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.ant.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 存档-文章关联表
 * </p>
 *
 * @author jobob
 * @since 2019-03-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class B3SoloArchivedateArticle extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("oId")
    private String oId;

    /**
     * 存档日期 id
     */
    @TableField("archiveDate_oId")
    private String archivedateOid;

    /**
     * 文章 id
     */
    @TableField("article_oId")
    private String articleOid;


}

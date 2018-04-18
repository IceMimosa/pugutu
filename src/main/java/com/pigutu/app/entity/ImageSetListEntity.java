package com.pigutu.app.entity;


import com.pigutu.app.mapper.mybatis.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by me on 2016/6/24.
 * 所有图集信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ImageSetListEntity extends BaseModel {
    private static final long serialVersionUID = -5015945832815071384L;

    private String title;
    private String coverUrl;
    private int likeCount;
    private int imgCount;
    private int commentCount;
    private String category;
    private String label;
    private String createTime;
    private int viewCount;
    private int recommendCount;
    private int hide;
}

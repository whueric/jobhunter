package com.whueric.jobhunter.dao;

import org.apache.ibatis.annotations.Insert;
import com.whueric.jobhunter.model.LieTouJobInfo;

/**
 * @author
 */
public interface JobInfoDAO {

    @Insert("insert into JobInfo (`title`,`salary`,`company`,`description`,`source`,`url`,`urlMd5`) values (#{title},#{salary},#{company},#{description},#{source},#{url},#{urlMd5})")
    public int add(LieTouJobInfo jobInfo);
}

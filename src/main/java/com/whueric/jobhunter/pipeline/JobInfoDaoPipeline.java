package com.whueric.jobhunter.pipeline;

import org.springframework.stereotype.Component;
import com.whueric.jobhunter.dao.JobInfoDAO;
import com.whueric.jobhunter.model.LieTouJobInfo;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

import javax.annotation.Resource;

/**

 */
@Component("JobInfoDaoPipeline")
public class JobInfoDaoPipeline implements PageModelPipeline<LieTouJobInfo> {

    @Resource
    private JobInfoDAO jobInfoDAO;

    //@Override
    public void process(LieTouJobInfo lieTouJobInfo, Task task) {
        //jobInfoDAO.add(lieTouJobInfo);
        System.out.println(lieTouJobInfo.toString());
    }
}

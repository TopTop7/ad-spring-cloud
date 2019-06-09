package com.poppy.ad.service;

import com.poppy.ad.entity.AdPlan;
import com.poppy.ad.exception.AdException;
import com.poppy.ad.vo.AdPlanGetRequest;
import com.poppy.ad.vo.AdPlanRequest;
import com.poppy.ad.vo.AdPlanResponse;

import java.util.List;

/**
 * @author poppy
 */
public interface IAdPlanService {

    /**
     * <h2>创建推广计划</h2>
     * */
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>获取推广计划</h2>
     * */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     * <h2>更新推广计划</h2>
     * */
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>删除推广计划</h2>
     * */
    void deleteAdPlan(AdPlanRequest request) throws AdException;
}

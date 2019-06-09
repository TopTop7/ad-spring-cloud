package com.poppy.ad.service;

import com.poppy.ad.vo.CreativeRequest;
import com.poppy.ad.vo.CreativeResponse;

/**
 * @author poppy
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}

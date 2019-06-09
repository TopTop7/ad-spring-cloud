package com.poppy.ad.dao.unit_condition;

import com.poppy.ad.entity.unit_condition.AdUnitKeyword;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author poppy
 */
public interface AdUnitKeywordRepository extends
        JpaRepository<AdUnitKeyword, Long> {
}

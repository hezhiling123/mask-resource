package cn.mask.mask.mongo.dao;

import cn.mask.mask.constant.CollectionConstants;
import org.springframework.stereotype.Repository;

/**
 * @author Ray
 * @date 2018/2/11.
 */
@Repository
public class HotCategoryDao extends BaseMgDao {
    @Override
    String getCollectionName() {
        return CollectionConstants.HOT_CATEGORY;
    }
}

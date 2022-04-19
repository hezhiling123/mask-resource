package cn.mask.mask.mongo.dao;

import cn.mask.mask.constant.CollectionConstants;
import org.springframework.stereotype.Repository;

/**
 * @author Ray
 * @date 2018/2/5.
 */
@Repository
public class GoodsCategoryDao extends BaseMgDao {

    @Override
    String getCollectionName() {
        return CollectionConstants.HOME_CATETORY;
    }


}

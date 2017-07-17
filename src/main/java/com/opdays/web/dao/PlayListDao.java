package com.opdays.web.dao;
import com.opdays.web.models.PlayList;

import java.util.List;

/**
 * Created by yangyang on 2017/7/18.
 */
public interface PlayListDao {
    public PlayList getPk(int id);
    public List<PlayList> queryAll();
}

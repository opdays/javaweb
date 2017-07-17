package com.opdays.web.impl;

import com.opdays.web.dao.PlayListDao;
import com.opdays.web.models.Factory;
import com.opdays.web.models.PlayList;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by yangyang on 2017/7/18.
 */
public class PlayListImpl implements PlayListDao{
    public PlayList getPk(int id) {
        Factory factory = new Factory();
        SqlSession sqlSession= factory.getSqlSession();
        PlayList playList = sqlSession.selectOne("com.opdays.web.mapper.PlayListMapper.getPlayList",id);
        return playList;
    }

    public List<PlayList> queryAll() {
        Factory factory = new Factory();
        SqlSession sqlSession= factory.getSqlSession();
        List<PlayList> playLists = sqlSession.selectList("com.opdays.web.mapper.PlayListMapper.getAllPlayList");
        return playLists;
    }
}

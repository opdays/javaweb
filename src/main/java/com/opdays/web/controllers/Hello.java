package com.opdays.web.controllers;

import com.opdays.web.dao.PlayListDao;
import com.opdays.web.impl.PlayListImpl;
import com.opdays.web.models.Factory;
import com.opdays.web.models.PlayList;
import com.opdays.web.models.User;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by yangyang on 2017/7/17.
 */
@WebServlet(name = "Hello")
public class Hello extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PlayListDao dao = new PlayListImpl();
        PlayList playList = dao.getPk(1);
        System.out.println(playList);
        List<PlayList> playLists = dao.queryAll();
        System.out.println(playLists);
    }
}

package com.hjy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;

public class SearchServlet extends HttpServlet {
  // what's this ?used for detect forced push.like using rebase.
  static List<String> datas = new ArrayList<String>();

  static {
    datas.add("ajax");
    datas.add("ajax.post");
    datas.add("ajax.get");
    datas.add("becky");
    datas.add("java");
    datas.add("date");
  }

  // fix login bug
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
    resp.setCharacterEncoding("UTF-8");
    // ��ȡ�ͻ��˷��͹����Ĺؼ���
    String keyword = req.getParameter("keyword");
    // �����ؼ��֣��õ���������
    List<String> listData = getData(keyword);
    System.out.println(listData);
    // ����Json��ʽ
    //		System.out.println(JSONArray.fromObject(listData));
    resp.getWriter().write(JSONArray.fromObject(listData).toString());
  }

  /**
   * ��ȡ��������
   *
   * @param keyword
   * @return
   */
  private List<String> getData(String keyword) {
    List<String> list = new ArrayList<String>();
    for (String data : datas) {
      if (data.contains(keyword)) {
        list.add(data);
      }
    }
    return list;
  }
}


// 添加一行新代码
// 添加另一行新代码
System.out.println("More changes for demonstration.");

System.out.println("Initial change for demonstration.");
  /**
   * ��ȡ��������
   *
   * @param keyword
   * @return
   */
  //test for abbreviation and jargon words.
  //just test
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

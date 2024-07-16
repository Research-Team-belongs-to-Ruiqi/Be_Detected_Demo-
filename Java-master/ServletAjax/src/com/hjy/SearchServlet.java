
// 添加一行新代码
// 添加另一行新代码
System.out.println("More changes for demonstration.");
//this is test for distinguish the commas and periods.
System.out.println("Initial change for demonstration.");
  /**
   * ��ȡ��������
   *
   * @param keyword
   * @return
   */
  //test for abbreviation and jargon words.
  //just test
  //test for incorrect format

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

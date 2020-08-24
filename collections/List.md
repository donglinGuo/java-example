
#### bug
* Arrays.asList()数组转List
    ```java
    // 将数组通过Arrays转换为List
    List<String> goods_list = Arrays.asList(goodsStr.trim().split(","));
    ```
    * 报错信息:`java.lang.UnsupportedOperationException: null`
    * 分析
        * Arrays.asList转成的ArrayList实际上跟往常我们创建的new ArrayList是不同的。
# 说明文档
本例用于学习elasticsearch在spring-boot 中的使用。它使用Java Persistence API（JPA）模块的配置和代码示例

- 创建索引

```
POST http://localhost:9200/customer

{
   "mappings": {
      "_doc": {
         "properties": {
            "counter": {
               "type": "integer",
               "store": false
            },
            "tags": {
               "type": "keyword",
               "store": true
            }
         }
      }
   }
}
```

- 创建测试数据

```
POST http://localhost:9200/customer/customer/2

{
    "userName": "dabangg",
	"address": "address",
    "post_date" : "2009-11-15T14:12:12",
	"age": 18,
    "message" : "trying out Elasticsearch"
}
```

### 参考文档
- [github](https://github.com/Nasruddin/elasticsearch-spring-boot-spring-data)
- [docs.spring.io](https://docs.spring.io/spring-data/elasticsearch/docs/current/reference/html/#repositories.definition)
- [博客](https://www.cnblogs.com/shaozm/p/9990914.html)
- [elasticsearch-head 插件跨域](https://my.oschina.net/yimingkeji/blog/2978993)

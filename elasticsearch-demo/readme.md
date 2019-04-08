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

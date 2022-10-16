# 目录
- 物流模块
  - 物流查询接口
    - [根据快递单号查询物流轨迹](#根据快递单号查询物流轨迹)
- 库存模块
  - 库存接口
    - [查询商品库存情况](#查询商品库存情况)
    - [扣减库存](#扣减库存)
- test.genset
  - TestService
    - [测试方法01](#测试方法01)

 [返回目录](#目录)
# 根据快递单号查询物流轨迹
## 方法信息
```
cn.gudqs.example.docer.rpc.logistics.service.LogisticsService#queryLogistics
```
## 入参说明
### 示例
```json
[
  {
    "expressType": 1,
    "expressNo": "784283884390280"
  }
]
```


### 第一层
#### QueryLogisticsRequest
> 快递类型+快递单号

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| expressType | **Integer** | 否 |  快递类型<br/>1:顺丰<br/>2:EMS<br/>3:申通<br/>4:圆通<br/>5:极兔<br/>6:京东<br/>7:丹鸟<br/>8:韵达 | 示例值为 1 |
| expressNo | **String** | 否 |  快递单号 | 示例值为 784283884390280 |


## 出参说明
### 示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": {
    "logisticsStatus": 1,
    "logisticsDetailList": [
      {
        "detailTime": "2012-05-28T13:14:00.520+0000",
        "statusText": "物流流转状态信息",
        "shippingSituation": "物流流转描述"
      },
      {
        "detailTime": "2012-05-28T13:14:00.520+0000",
        "statusText": "物流流转状态信息",
        "shippingSituation": "物流流转描述"
      }
    ]
  }
}
```


### 第一层
#### BaseResponse\<LogisticsResponse\>
> 物流轨迹

| **字段** | **类型** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success | **Boolean** |  请求是否成功 | 示例值为 true |
| code | **Integer** |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200 |
| message | **String** |  错误信息 |  |
| data | **[LogisticsResponse](#LogisticsResponse)** |  返回数据 |  |


### 第二层
#### LogisticsResponse
> 返回数据

| **字段** | **类型** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| logisticsStatus | **Integer** |  物流状态<br/>1:已揽收<br/>2:运输中<br/>3:配送中<br/>4:已签收<br/>5:已拒收 |  |
| logisticsDetailList | **[List\<LogisticsDetail\>](#LogisticsDetail)** |  物流轨迹信息列表 |  |


### 第三层
#### LogisticsDetail
> 物流轨迹信息列表

| **字段** | **类型** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| detailTime | **Date** |  物流流转时间 |  |
| statusText | **String** |  物流流转状态信息 |  |
| shippingSituation | **String** |  物流流转描述 |  |





 [返回目录](#目录)
# 查询商品库存情况
## 方法信息
```
cn.gudqs.example.docer.rpc.stock.service.StockService#queryStock
```
## 入参说明
### 示例
```json
[
  {
    "shopId": 10,
    "addressId": 10
  }
]
```


### 第一层
#### QueryStockRequest
> 商品等信息

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| shopId | **Long** | 否 |  商品ID |  |
| addressId | **Long** | 否 |  地址信息ID |  |


## 出参说明
### 示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": {
    "hasStock": false,
    "stockNum": 10
  }
}
```


### 第一层
#### BaseResponse\<StockResponse\>
> 库存情况

| **字段** | **类型** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success | **Boolean** |  请求是否成功 | 示例值为 true |
| code | **Integer** |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200 |
| message | **String** |  错误信息 |  |
| data | **[StockResponse](#StockResponse)** |  返回数据 |  |


### 第二层
#### StockResponse
> 返回数据

| **字段** | **类型** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| hasStock | **Boolean** |  是否有库存 |  |
| stockNum | **Long** |  库存数量 |  |




 [返回目录](#目录)
# 扣减库存
## 方法信息
```
cn.gudqs.example.docer.rpc.stock.service.StockService#decrementStock
```
## 入参说明
### 示例
```json
[
  {
    "shopId": 10,
    "addressId": 10,
    "stockNum": 10
  }
]
```


### 第一层
#### DecrementStockRequest
> 商品等信息

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| shopId | **Long** | 否 |  商品ID |  |
| addressId | **Long** | 否 |  地址信息ID |  |
| stockNum | **Long** | 否 |  扣减的库存数量 |  |


## 出参说明
### 示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": false
}
```


### 第一层
#### BaseResponse\<Boolean\>
> 是否操作成功

| **字段** | **类型** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success | **Boolean** |  请求是否成功 | 示例值为 true |
| code | **Integer** |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200 |
| message | **String** |  错误信息 |  |
| data | **Boolean** |  返回数据 |  |





 [返回目录](#目录)
# 测试方法01
## 方法信息
```
cn.gudqs.test.genset.TestService#testMethod01
```
## 入参说明
> 此接口无任何入参


## 出参说明
> 此接口无任何出参






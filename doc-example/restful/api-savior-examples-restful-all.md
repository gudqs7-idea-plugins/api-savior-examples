# 目录
- 订单模块
  - 订单接口
    - [查询订单信息列表(分页)](#查询订单信息列表分页)
    - [根据订单ID查询订单明细信息列表](#根据订单id查询订单明细信息列表)
    - [根据地址ID查询地址信息](#根据地址id查询地址信息)
  - 下单接口
    - [购买VIP](#购买vip)
    - [购买商品](#购买商品)
- 用户模块
  - user interface
    - [Query user list with pagination](#query-user-list-with-pagination)
    - [add a user](#add-a-user)
    - [update a user](#update-a-user)
    - [delete a user](#delete-a-user)
  - 用户接口
    - [查询用户列表(分页)](#查询用户列表分页)
    - [新增一个用户](#新增一个用户)
    - [更新一个用户](#更新一个用户)
    - [删除一个用户](#删除一个用户)
  - 用户VIP接口
    - [查询VIP用户信息列表(分页)](#查询vip用户信息列表分页)
    - [为用户开通VIP](#为用户开通vip)
    - [为用户续费VIP](#为用户续费vip)
- 测试模块
  - 测试接口(测参数)
    - [测试无参数](#测试无参数)
    - [测试单个参数(基本类型)](#测试单个参数基本类型)
    - [测试单个参数(集合类型)](#测试单个参数集合类型)
    - [测试单个参数(基本类型组成的Pojo)](#测试单个参数基本类型组成的pojo)
    - [测试单个参数(sql类型组成的Pojo)](#测试单个参数sql类型组成的pojo)
    - [测试单个参数(普通Pojo)](#测试单个参数普通pojo)
    - [测试单个参数(带泛型的Pojo)](#测试单个参数带泛型的pojo)
    - [测试单个参数(文件类型)](#测试单个参数文件类型)
    - [测试多参数(基本类型)](#测试多参数基本类型)
    - [测试多参数(集合类型)](#测试多参数集合类型)
    - [测试多参数(Pojo)](#测试多参数pojo)
    - [测试多个参数(文件类型)](#测试多个参数文件类型)
  - 测试接口(测响应)
    - [测试无响应](#测试无响应)
    - [测试单个响应(基本类型)](#测试单个响应基本类型)
    - [测试单个响应(集合类型)](#测试单个响应集合类型)
    - [测试单个响应(基本类型组成的Pojo)](#测试单个响应基本类型组成的pojo)
    - [测试单个响应(普通Pojo)](#测试单个响应普通pojo)
    - [测试单个响应(带泛型的Pojo)](#测试单个响应带泛型的pojo)
    - [测试单个响应(集合类型+泛型)](#测试单个响应集合类型泛型)

 [返回目录](#目录)
# 查询订单信息列表(分页)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/order/queryOrders
```

### 请求方法
```
POST
```

### 请求体类型
```
application/json
```

## 入参
### 入参示例 (RequestBody)
```json
{
  "pageNumber": 1,
  "pageSize": 20,
  "orderNo": "2022050925939",
  "userId": 1,
  "orderType": 2,
  "orderStatus": 0,
  "orderTimeStart": "2020-05-09",
  "orderTimeEnd": "2020-05-09"
}
```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| pageNumber     | **Integer**     | **是**  |  分页-当前页码 | 示例值为 1  |
| pageSize     | **Integer**     | **是**  |  分页-分页大小 | 示例值为 20  |
| orderNo     | **String**     | 否  |  订单编号 | 示例值为 2022050925939  |
| userId     | **Long**     | 否  |  用户ID | 示例值为 1  |
| orderType     | **Integer**     | 否  |  订单类型<br/>1:购买会员订单<br/>2:购买商品订单 | 示例值为 2  |
| orderStatus     | **Integer**     | 否  |  订单状态<br/>0:待处理<br/>1:已支付<br/>2:已取消<br/>3:已退款 | 示例值为 0  |
| orderTimeStart     | **String**     | 否  |  下单时间范围-开始<br/>格式: 2022-05-09 | 示例值为 2020-05-09  |
| orderTimeEnd     | **String**     | 否  |  下单时间范围-结束<br/>格式: 2022-05-09 | 示例值为 2020-05-09  |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": [
    {
      "orderId": 1,
      "orderNo": "20220509323432",
      "userId": 1,
      "userNickName": "用户昵称",
      "orderType": 2,
      "orderStatus": 0,
      "orderTime": "2012-05-28T13:14:00.520+0000",
      "addressId": 1,
      "orderExtInfo": "{\"vipType\": 1,\"vipTiming\": 12}"
    },
    {
      "orderId": 1,
      "orderNo": "20220509323432",
      "userId": 1,
      "userNickName": "用户昵称",
      "orderType": 2,
      "orderStatus": 0,
      "orderTime": "2012-05-28T13:14:00.520+0000",
      "addressId": 1,
      "orderExtInfo": "{\"vipType\": 1,\"vipTiming\": 12}"
    }
  ],
  "totalCount": 10
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 | 示例值为 true  |
| code     | **Integer**    |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200  |
| message     | **String**    |  错误信息 |   |
| data     | **List\<OrderResponse\>**    |  返回数据 |   |
|└─ orderId     | **Long**    |  订单ID | 示例值为 1  |
|└─ orderNo     | **String**    |  订单编号 | 示例值为 20220509323432  |
|└─ userId     | **Long**    |  用户ID | 示例值为 1  |
|└─ userNickName     | **String**    |  用户昵称 |   |
|└─ orderType     | **Integer**    |  订单类型<br/>1:购买会员订单<br/>2:购买商品订单 | 示例值为 2  |
|└─ orderStatus     | **Integer**    |  订单状态<br/>0:待处理<br/>1:已支付<br/>2:已取消<br/>3:已退款 | 示例值为 0  |
|└─ orderTime     | **Date**    |  下单时间 |   |
|└─ addressId     | **Long**    |  关联地址ID | 示例值为 1  |
|└─ orderExtInfo     | **String**    |  订单额外信息<br/>Json格式 | 示例值为 \{"vipType": 1,"vipTiming": 12\}  |
| totalCount     | **Long**    |  分页-总条数 |   |



 [返回目录](#目录)
# 根据订单ID查询订单明细信息列表

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/order/queryOrderDetails?orderId=1
```

### 请求方法
```
GET
```


## 入参
### 入参示例 (Postman Bulk Edit)
```json
orderId:1

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| orderId     | **Long**     | **是**  |  订单ID | 示例值为 1  |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": [
    {
      "shopId": 10,
      "buyNum": 1,
      "shopName": "商品名称",
      "shopPrice": "商品价格",
      "shopImgUrl": "https://img.xxx.com/xxxxxxxxxxx"
    },
    {
      "shopId": 10,
      "buyNum": 1,
      "shopName": "商品名称",
      "shopPrice": "商品价格",
      "shopImgUrl": "https://img.xxx.com/xxxxxxxxxxx"
    }
  ]
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 | 示例值为 true  |
| code     | **Integer**    |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200  |
| message     | **String**    |  错误信息 |   |
| data     | **List\<OrderDetailResponse\>**    |  返回数据 |   |
|└─ shopId     | **Long**    |  商品ID |   |
|└─ buyNum     | **Integer**    |  购买数量 |   |
|└─ shopName     | **String**    |  商品名称 |   |
|└─ shopPrice     | **String**    |  商品价格 |   |
|└─ shopImgUrl     | **String**    |  商品图片URL | 示例值为 https://img.xxx.com/xxxxxxxxxxx  |



 [返回目录](#目录)
# 根据地址ID查询地址信息

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/order/queryAddressInfo?addressId=1
```

### 请求方法
```
GET
```


## 入参
### 入参示例 (Postman Bulk Edit)
```json
addressId:1

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| addressId     | **Long**     | **是**  |  地址ID | 示例值为 1  |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": {
    "country": "中国",
    "province": "浙江",
    "city": "杭州",
    "area": "西湖区",
    "street": "留下街道",
    "detailAddress": "翠苑小区22栋33楼333"
  }
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 | 示例值为 true  |
| code     | **Integer**    |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200  |
| message     | **String**    |  错误信息 |   |
| data     | **AddressResponse**    |  返回数据 |   |
|└─ country     | **String**    |  国家 | 示例值为 中国  |
|└─ province     | **String**    |  省份 | 示例值为 浙江  |
|└─ city     | **String**    |  城市 | 示例值为 杭州  |
|└─ area     | **String**    |  区域 | 示例值为 西湖区  |
|└─ street     | **String**    |  街道 | 示例值为 留下街道  |
|└─ detailAddress     | **String**    |  详细信息 | 示例值为 翠苑小区22栋33楼333  |




 [返回目录](#目录)
# 购买VIP

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/pay/buyVip
```

### 请求方法
```
POST
```

### 请求体类型
```
application/json
```

## 入参
### 入参示例 (RequestBody)
```json
{
  "userId": 1,
  "vipType": 3,
  "openingTime": 1
}
```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| userId     | **Long**     | **是**  |  用户ID | 示例值为 1  |
| vipType     | **Integer**     | **是**  |  VIP类型<br/>1:青铜<br/>2:白银<br/>3:黄金 | 示例值为 3  |
| openingTime     | **Integer**     | **是**  |  VIP 开通时长(单位:月) | 示例值为 1  |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": 10
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 | 示例值为 true  |
| code     | **Integer**    |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200  |
| message     | **String**    |  错误信息 |   |
| data     | **Long**    |  返回数据 |   |



 [返回目录](#目录)
# 购买商品

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/pay/buyShop
```

### 请求方法
```
POST
```

### 请求体类型
```
application/json
```

## 入参
### 入参示例 (RequestBody)
```json
{
  "userId": 1,
  "addressId": 1,
  "shopItemList": [
    {
      "shopId": 10,
      "buyCount": 1
    },
    {
      "shopId": 10,
      "buyCount": 1
    }
  ]
}
```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| userId     | **Long**     | **是**  |  用户ID | 示例值为 1  |
| addressId     | **Long**     | 否  |  关联地址ID | 示例值为 1  |
| shopItemList     | **List\<ShopItem\>**     | 否  |  购买商品列表 |   |
|└─ shopId     | **Long**     | 否  |  购买商品ID |   |
|└─ buyCount     | **Integer**     | 否  |  购买数量 |   |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": 10
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 | 示例值为 true  |
| code     | **Integer**    |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200  |
| message     | **String**    |  错误信息 |   |
| data     | **Long**    |  返回数据 |   |




 [返回目录](#目录)
# Query user list with pagination

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/user/queryUsers
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
pageNumber:1
pageSize:20
//searchKeyword:模糊搜索词
//gender:2
//ageStart:1
//ageEnd:1
//registerTimeStart:2022-05-09
//registerTimeEnd:2022-05-09

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| pageNumber     | **Integer**     | **是**  |  分页-当前页码 | 示例值为 1  |
| pageSize     | **Integer**     | **是**  |  分页-分页大小 | 示例值为 20  |
| searchKeyword     | **String**     | 否  |  模糊搜索词<br/>支持用户昵称, 用户姓名, 用户手机号 |   |
| gender     | **Integer**     | 否  |  用户性别<br/>0: 保密<br/>1: 男<br/>2: 女 | 示例值为 2  |
| ageStart     | **Integer**     | 否  |  过滤年龄范围-起始 |   |
| ageEnd     | **Integer**     | 否  |  过滤年龄范围-结束 |   |
| registerTimeStart     | **String**     | 否  |  注册时间范围-开始<br/>格式: 2022-05-09 | 示例值为 2022-05-09  |
| registerTimeEnd     | **Date**     | 否  |  注册时间范围-结束<br/>格式: 2022-05-09 | 示例值为 2022-05-09  |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": [
    {
      "userId": 10,
      "userNickName": "用户昵称",
      "userRealName": "用户姓名",
      "userGender": 2,
      "userAge": 18,
      "userPhone": "13123339966",
      "userEmail": "2333@163.com",
      "userAvatar": "https://img.xxx.com/xxxxxxx"
    },
    {
      "userId": 10,
      "userNickName": "用户昵称",
      "userRealName": "用户姓名",
      "userGender": 2,
      "userAge": 18,
      "userPhone": "13123339966",
      "userEmail": "2333@163.com",
      "userAvatar": "https://img.xxx.com/xxxxxxx"
    }
  ],
  "totalCount": 10
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 | 示例值为 true  |
| code     | **Integer**    |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200  |
| message     | **String**    |  错误信息 |   |
| data     | **List\<UserResponse\>**    |  返回数据 |   |
|└─ userId     | **Long**    |  用户ID-主键 |   |
|└─ userNickName     | **String**    |  用户昵称 |   |
|└─ userRealName     | **String**    |  用户姓名 |   |
|└─ userGender     | **Integer**    |  用户性别<br/>0:保密<br/>1:男<br/>2:女 | 示例值为 2  |
|└─ userAge     | **Integer**    |  用户年龄 | 示例值为 18  |
|└─ userPhone     | **String**    |  联系方式-手机号 | 示例值为 13123339966  |
|└─ userEmail     | **String**    |  联系方式-电子邮箱 | 示例值为 2333@163.com  |
|└─ userAvatar     | **String**    |  用户头像 url 地址 | 示例值为 https://img.xxx.com/xxxxxxx  |
| totalCount     | **Long**    |  分页-总条数 |   |



 [返回目录](#目录)
# add a user

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/user/createUser
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
userNickName:用户昵称
userRealName:用户姓名
userGender:2
//userAge:18
//userPhone:联系方式-手机号
//userEmail:联系方式-电子邮箱
//userAvatar:用户头像 url 地址

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| userNickName     | **String**     | **是**  |  用户昵称 | 用户昵称需唯一  |
| userRealName     | **String**     | **是**  |  用户姓名 |   |
| userGender     | **Integer**     | **是**  |  用户性别<br/>0:保密<br/>1:男<br/>2:女 | 示例值为 2  |
| userAge     | **Integer**     | 否  |  用户年龄 | 示例值为 18  |
| userPhone     | **String**     | 否  |  联系方式-手机号 |   |
| userEmail     | **String**     | 否  |  联系方式-电子邮箱 |   |
| userAvatar     | **String**     | 否  |  用户头像 url 地址 |   |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": false
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 | 示例值为 true  |
| code     | **Integer**    |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200  |
| message     | **String**    |  错误信息 |   |
| data     | **Boolean**    |  返回数据 |   |

## 更多信息
### Code 更多含义

| Code | 含义 |
| -------- | -------- |
| **10001** | User nickname already exists |
| **10002** | User age range is invalid, User age must be a number between 0 and 200 |


 [返回目录](#目录)
# update a user

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/user/updateUser
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
userId:10
userRealName:用户姓名
userGender:2
//userAge:18
//userPhone:联系方式-手机号
//userEmail:联系方式-电子邮箱
//userAvatar:用户头像 url 地址

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| userId     | **Long**     | **是**  |  用户ID 主键 |   |
| userRealName     | **String**     | **是**  |  用户姓名 |   |
| userGender     | **Integer**     | **是**  |  用户性别<br/>0:保密<br/>1:男<br/>2:女 | 示例值为 2  |
| userAge     | **Integer**     | 否  |  用户年龄 | 示例值为 18  |
| userPhone     | **String**     | 否  |  联系方式-手机号 |   |
| userEmail     | **String**     | 否  |  联系方式-电子邮箱 |   |
| userAvatar     | **String**     | 否  |  用户头像 url 地址 |   |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": false
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 | 示例值为 true  |
| code     | **Integer**    |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200  |
| message     | **String**    |  错误信息 |   |
| data     | **Boolean**    |  返回数据 |   |

## 更多信息
### Code 更多含义

| Code | 含义 |
| -------- | -------- |
| **10002** | User age range is invalid, User age must be a number between 0 and 200 |


 [返回目录](#目录)
# delete a user

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/user/deleteUser
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
userId:1

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| userId     | **Long**     | **是**  |  User ID | 示例值为 1  |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": false
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 | 示例值为 true  |
| code     | **Integer**    |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200  |
| message     | **String**    |  错误信息 |   |
| data     | **Boolean**    |  返回数据 |   |

## 更多信息
### Code 更多含义

| Code | 含义 |
| -------- | -------- |
| **10003** | User information does not exist |



 [返回目录](#目录)
# 查询用户列表(分页)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/user/queryUsers
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
pageNumber:1
pageSize:20
//searchKeyword:模糊搜索词
//gender:2
//ageStart:1
//ageEnd:1
//registerTimeStart:2022-05-09
//registerTimeEnd:2022-05-09

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| pageNumber     | **Integer**     | **是**  |  分页-当前页码 | 示例值为 1  |
| pageSize     | **Integer**     | **是**  |  分页-分页大小 | 示例值为 20  |
| searchKeyword     | **String**     | 否  |  模糊搜索词<br/>支持用户昵称, 用户姓名, 用户手机号 |   |
| gender     | **Integer**     | 否  |  用户性别<br/>0: 保密<br/>1: 男<br/>2: 女 | 示例值为 2  |
| ageStart     | **Integer**     | 否  |  过滤年龄范围-起始 |   |
| ageEnd     | **Integer**     | 否  |  过滤年龄范围-结束 |   |
| registerTimeStart     | **String**     | 否  |  注册时间范围-开始<br/>格式: 2022-05-09 | 示例值为 2022-05-09  |
| registerTimeEnd     | **Date**     | 否  |  注册时间范围-结束<br/>格式: 2022-05-09 | 示例值为 2022-05-09  |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": [
    {
      "userId": 10,
      "userNickName": "用户昵称",
      "userRealName": "用户姓名",
      "userGender": 2,
      "userAge": 18,
      "userPhone": "13123339966",
      "userEmail": "2333@163.com",
      "userAvatar": "https://img.xxx.com/xxxxxxx"
    },
    {
      "userId": 10,
      "userNickName": "用户昵称",
      "userRealName": "用户姓名",
      "userGender": 2,
      "userAge": 18,
      "userPhone": "13123339966",
      "userEmail": "2333@163.com",
      "userAvatar": "https://img.xxx.com/xxxxxxx"
    }
  ],
  "totalCount": 10
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 | 示例值为 true  |
| code     | **Integer**    |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200  |
| message     | **String**    |  错误信息 |   |
| data     | **List\<UserResponse\>**    |  返回数据 |   |
|└─ userId     | **Long**    |  用户ID-主键 |   |
|└─ userNickName     | **String**    |  用户昵称 |   |
|└─ userRealName     | **String**    |  用户姓名 |   |
|└─ userGender     | **Integer**    |  用户性别<br/>0:保密<br/>1:男<br/>2:女 | 示例值为 2  |
|└─ userAge     | **Integer**    |  用户年龄 | 示例值为 18  |
|└─ userPhone     | **String**    |  联系方式-手机号 | 示例值为 13123339966  |
|└─ userEmail     | **String**    |  联系方式-电子邮箱 | 示例值为 2333@163.com  |
|└─ userAvatar     | **String**    |  用户头像 url 地址 | 示例值为 https://img.xxx.com/xxxxxxx  |
| totalCount     | **Long**    |  分页-总条数 |   |



 [返回目录](#目录)
# 新增一个用户

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/user/createUser
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
userNickName:用户昵称
userRealName:用户姓名
userGender:2
//userAge:18
//userPhone:联系方式-手机号
//userEmail:联系方式-电子邮箱
//userAvatar:用户头像 url 地址

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| userNickName     | **String**     | **是**  |  用户昵称 | 用户昵称需唯一  |
| userRealName     | **String**     | **是**  |  用户姓名 |   |
| userGender     | **Integer**     | **是**  |  用户性别<br/>0:保密<br/>1:男<br/>2:女 | 示例值为 2  |
| userAge     | **Integer**     | 否  |  用户年龄 | 示例值为 18  |
| userPhone     | **String**     | 否  |  联系方式-手机号 |   |
| userEmail     | **String**     | 否  |  联系方式-电子邮箱 |   |
| userAvatar     | **String**     | 否  |  用户头像 url 地址 |   |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": false
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 | 示例值为 true  |
| code     | **Integer**    |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200  |
| message     | **String**    |  错误信息 |   |
| data     | **Boolean**    |  返回数据 |   |

## 更多信息
### Code 更多含义

| Code | 含义 |
| -------- | -------- |
| **10001** | 用户昵称已存在 |
| **10002** | 用户年龄范围无效 用户年龄需在0~200之间的数字 |


 [返回目录](#目录)
# 更新一个用户

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/user/updateUser
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
userId:10
userRealName:用户姓名
userGender:2
//userAge:18
//userPhone:联系方式-手机号
//userEmail:联系方式-电子邮箱
//userAvatar:用户头像 url 地址

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| userId     | **Long**     | **是**  |  用户ID 主键 |   |
| userRealName     | **String**     | **是**  |  用户姓名 |   |
| userGender     | **Integer**     | **是**  |  用户性别<br/>0:保密<br/>1:男<br/>2:女 | 示例值为 2  |
| userAge     | **Integer**     | 否  |  用户年龄 | 示例值为 18  |
| userPhone     | **String**     | 否  |  联系方式-手机号 |   |
| userEmail     | **String**     | 否  |  联系方式-电子邮箱 |   |
| userAvatar     | **String**     | 否  |  用户头像 url 地址 |   |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": false
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 | 示例值为 true  |
| code     | **Integer**    |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200  |
| message     | **String**    |  错误信息 |   |
| data     | **Boolean**    |  返回数据 |   |

## 更多信息
### Code 更多含义

| Code | 含义 |
| -------- | -------- |
| **10002** | 用户年龄范围无效 用户年龄需在0~200之间的数字 |


 [返回目录](#目录)
# 删除一个用户

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/user/deleteUser
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
userId:1

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| userId     | **Long**     | **是**  |  用户ID | 示例值为 1  |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": false
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 | 示例值为 true  |
| code     | **Integer**    |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200  |
| message     | **String**    |  错误信息 |   |
| data     | **Boolean**    |  返回数据 |   |

## 更多信息
### Code 更多含义

| Code | 含义 |
| -------- | -------- |
| **10003** | 用户信息不存在 |



 [返回目录](#目录)
# 查询VIP用户信息列表(分页)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/vip/queryVipUsers
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
pageNumber:1
pageSize:20
//searchKeyword:模糊搜索词
//gender:2
//vipType:3
//firstOpenTimeStart:2022-05-09
//firstOpenTimeEnd:2022-05-09
//vipExpireTimeStart:2022-05-09
//vipExpireTimeEnd:2012-05-28

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| pageNumber     | **Integer**     | **是**  |  分页-当前页码 | 示例值为 1  |
| pageSize     | **Integer**     | **是**  |  分页-分页大小 | 示例值为 20  |
| searchKeyword     | **String**     | 否  |  模糊搜索词<br/>支持用户昵称, 用户姓名, 用户手机号 |   |
| gender     | **Integer**     | 否  |  用户性别<br/>0: 保密<br/>1: 男<br/>2: 女 | 示例值为 2  |
| vipType     | **Integer**     | 否  |  VIP 类型<br/>1:青铜<br/>2:白银<br/>3:黄金 | 示例值为 3  |
| firstOpenTimeStart     | **String**     | 否  |  VIP开通时间范围-开始<br/>格式: 2022-05-09 | 示例值为 2022-05-09  |
| firstOpenTimeEnd     | **String**     | 否  |  VIP开通时间范围-结束<br/>格式: 2022-05-09 | 示例值为 2022-05-09  |
| vipExpireTimeStart     | **Date**     | 否  |  VIP过期时间范围-开始<br/>格式: 2022-05-09 | 示例值为 2022-05-09  |
| vipExpireTimeEnd     | **Date**     | 否  |  VIP过期时间范围-结束<br/>格式: 2022-05-09 |   |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": [
    {
      "userId": 10,
      "vipType": 3,
      "vipExpireTime": "2012-05-28T13:14:00.520+0000",
      "vipFirstOpenTime": "2012-05-28T13:14:00.520+0000",
      "userNickName": "用户昵称",
      "userRealName": "用户姓名",
      "userGender": 2,
      "userAge": 18,
      "userPhone": "13123339966",
      "userEmail": "2333@163.com",
      "userAvatar": "https://img.xxx.com/xxxxxxx"
    },
    {
      "userId": 10,
      "vipType": 3,
      "vipExpireTime": "2012-05-28T13:14:00.520+0000",
      "vipFirstOpenTime": "2012-05-28T13:14:00.520+0000",
      "userNickName": "用户昵称",
      "userRealName": "用户姓名",
      "userGender": 2,
      "userAge": 18,
      "userPhone": "13123339966",
      "userEmail": "2333@163.com",
      "userAvatar": "https://img.xxx.com/xxxxxxx"
    }
  ],
  "totalCount": 10
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 | 示例值为 true  |
| code     | **Integer**    |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200  |
| message     | **String**    |  错误信息 |   |
| data     | **List\<VipUserResponse\>**    |  返回数据 |   |
|└─ userId     | **Long**    |  用户ID-主键 |   |
|└─ vipType     | **Integer**    |  VIP 类型<br/>1:青铜<br/>2:白银<br/>3:黄金 | 示例值为 3  |
|└─ vipExpireTime     | **Date**    |  VIP 过期时间 |   |
|└─ vipFirstOpenTime     | **Date**    |  VIP 首次开通时间 |   |
|└─ userNickName     | **String**    |  用户昵称 |   |
|└─ userRealName     | **String**    |  用户姓名 |   |
|└─ userGender     | **Integer**    |  用户性别<br/>0:保密<br/>1:男<br/>2:女 | 示例值为 2  |
|└─ userAge     | **Integer**    |  用户年龄 | 示例值为 18  |
|└─ userPhone     | **String**    |  联系方式-手机号 | 示例值为 13123339966  |
|└─ userEmail     | **String**    |  联系方式-电子邮箱 | 示例值为 2333@163.com  |
|└─ userAvatar     | **String**    |  用户头像 url 地址 | 示例值为 https://img.xxx.com/xxxxxxx  |
| totalCount     | **Long**    |  分页-总条数 |   |



 [返回目录](#目录)
# 为用户开通VIP

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/vip/openVip
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
userId:1
vipType:3
openingTime:1

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| userId     | **Long**     | **是**  |  用户ID | 示例值为 1  |
| vipType     | **Integer**     | **是**  |  VIP类型<br/>1:青铜<br/>2:白银<br/>3:黄金 | 示例值为 3  |
| openingTime     | **Integer**     | **是**  |  VIP 开通时长(单位:月) | 示例值为 1  |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": false
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 | 示例值为 true  |
| code     | **Integer**    |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200  |
| message     | **String**    |  错误信息 |   |
| data     | **Boolean**    |  返回数据 |   |

## 更多信息
### Code 更多含义

| Code | 含义 |
| -------- | -------- |
| **10021** | 用户余额不足 |
| **10022** | VIP类型不存在 |
| **10023** | 开通时长不能为负数 |


 [返回目录](#目录)
# 为用户续费VIP

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/vip/renewVip
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
userId:1
openingTime:1

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| userId     | **Long**     | **是**  |  用户ID | 示例值为 1  |
| openingTime     | **Integer**     | **是**  |  VIP 续费时长(单位:月) | 示例值为 1  |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息",
  "data": false
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 | 示例值为 true  |
| code     | **Integer**    |  状态码<br/>200: 代表成功<br/>其它代表异常 | 示例值为 200  |
| message     | **String**    |  错误信息 |   |
| data     | **Boolean**    |  返回数据 |   |

## 更多信息
### Code 更多含义

| Code | 含义 |
| -------- | -------- |
| **10021** | 用户余额不足 |
| **10023** | 开通时长不能为负数 |



 [返回目录](#目录)
# 测试无参数

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testNoParam
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
> 此接口无任何入参



## 出参
> 此接口无任何出参





 [返回目录](#目录)
# 测试单个参数(基本类型)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testSingleBaseParam
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
userId:30

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| userId     | **int**     | **是**  |  用户id | 示例值为 30  |

## 出参
> 此接口无任何出参





 [返回目录](#目录)
# 测试单个参数(集合类型)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testSingleCollectionParam?userIdList[0]=用户ID列表&userIdList[1]=用户ID列表
```

### 请求方法
```
GET/POST/PUT/DELETE
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
//userIdList[0]:用户ID列表
//userIdList[1]:用户ID列表

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| userIdList     | **List\<String\>**     | 否  |  用户ID列表 |   |

## 出参
> 此接口无任何出参





 [返回目录](#目录)
# 测试单个参数(基本类型组成的Pojo)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testSingleBasePojoParam
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
//testInt:1
//testLong:10
//testFloat:10.0
//testBoolean:false
//testString:test string
//testDate:2012-05-28T13:14:00.520+0000
//testLocalDt:2012-05-28T13:14:00.520+0000
//testDecimal:50.0
//testNumber:0
//testSelfCycle.testInt:1
//testSelfCycle.testLong:10
//testSelfCycle.testFloat:10.0
//testSelfCycle.testBoolean:false
//testSelfCycle.testString:test string
//testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//testSelfCycle.testDecimal:50.0
//testSelfCycle.testNumber:0
//testCycle.testCustomClass.testInt:1
//testCycle.testCustomClass.testLong:10
//testCycle.testCustomClass.testFloat:10.0
//testCycle.testCustomClass.testBoolean:false
//testCycle.testCustomClass.testString:test string
//testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//testCycle.testCustomClass.testDecimal:50.0
//testCycle.testCustomClass.testNumber:0
//testCycle.list:{}
//testCycle.stringList[0]:测试字符串list
//testCycle.stringList[1]:测试字符串list
//testCycle.set:{}
//testCycle.stringSet[0]:测试字符串set
//testCycle.stringSet[1]:测试字符串set
//testCycle.map:{}
//testCycle.objMap.key1:{}
//testCycle.objMap.key2:{}

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| testInt     | **int**     | 否  |  test int |   |
| testLong     | **long**     | 否  |  test long |   |
| testFloat     | **float**     | 否  |  test float |   |
| testBoolean     | **boolean**     | 否  |  test boolean |   |
| testString     | **String**     | 否  |  test string |   |
| testDate     | **Date**     | 否  |  test date |   |
| testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
| testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
| testNumber     | **Number**     | 否  |  test number |   |
| testSelfCycle     | **TestBasePojo**     | 否  |  测试自我循环 |   |
|└─ testInt     | **int**     | 否  |  test int |   |
|└─ testLong     | **long**     | 否  |  test long |   |
|└─ testFloat     | **float**     | 否  |  test float |   |
|└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|└─ testString     | **String**     | 否  |  test string |   |
|└─ testDate     | **Date**     | 否  |  test date |   |
|└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|└─ testNumber     | **Number**     | 否  |  test number |   |
| testCycle     | **TestPojo**     | 否  |  测试循环 |   |
|└─ testCustomClass     | **TestBasePojo**     | 否  |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|└─ list     | **List**     | 否  |  测试普通list |   |
|└─ stringList     | **List\<String\>**     | 否  |  测试字符串list |   |
|└─ set     | **Set**     | 否  |  测试普通set |   |
|└─ stringSet     | **Set\<String\>**     | 否  |  测试字符串set |   |
|└─ map     | **Map**     | 否  |  测试普通Map |   |
|└─ objMap     | **Map\<String, Object\>**     | 否  |  测试对象Map |   |

## 出参
> 此接口无任何出参





 [返回目录](#目录)
# 测试单个参数(sql类型组成的Pojo)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testSingleSqlTypePojoParam
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
//testTime:2012-05-28T13:14:00.520+0000
//testTimestamp:2012-05-28T13:14:00.520+0000
//testSqlDate:2012-05-28T13:14:00.520+0000
//blob:HelloWorld
//clob:HelloWorld
//file:@"/HelloWorld"

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| testTime     | **Time**     | 否  |   |   |
| testTimestamp     | **Timestamp**     | 否  |   |   |
| testSqlDate     | **Date**     | 否  |   |   |
| blob     | **Blob**     | 否  |   |   |
| clob     | **Clob**     | 否  |   |   |
| file     | **MultipartFile**     | 否  |   |   |

## 出参
> 此接口无任何出参





 [返回目录](#目录)
# 测试单个参数(普通Pojo)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testSinglePojoParam
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
//testCustomClass.testInt:1
//testCustomClass.testLong:10
//testCustomClass.testFloat:10.0
//testCustomClass.testBoolean:false
//testCustomClass.testString:test string
//testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//testCustomClass.testDecimal:50.0
//testCustomClass.testNumber:0
//testCustomClass.testSelfCycle.testInt:1
//testCustomClass.testSelfCycle.testLong:10
//testCustomClass.testSelfCycle.testFloat:10.0
//testCustomClass.testSelfCycle.testBoolean:false
//testCustomClass.testSelfCycle.testString:test string
//testCustomClass.testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//testCustomClass.testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//testCustomClass.testSelfCycle.testDecimal:50.0
//testCustomClass.testSelfCycle.testNumber:0
//testCustomClass.testCycle.list:{}
//testCustomClass.testCycle.stringList[0]:测试字符串list
//testCustomClass.testCycle.stringList[1]:测试字符串list
//testCustomClass.testCycle.set:{}
//testCustomClass.testCycle.stringSet[0]:测试字符串set
//testCustomClass.testCycle.stringSet[1]:测试字符串set
//testCustomClass.testCycle.map:{}
//testCustomClass.testCycle.objMap.key1:{}
//testCustomClass.testCycle.objMap.key2:{}
//list:{}
//stringList[0]:测试字符串list
//stringList[1]:测试字符串list
//set:{}
//stringSet[0]:测试字符串set
//stringSet[1]:测试字符串set
//map:{}
//objMap.key1:{}
//objMap.key2:{}

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| testCustomClass     | **TestBasePojo**     | 否  |  测试普通Pojo |   |
|└─ testInt     | **int**     | 否  |  test int |   |
|└─ testLong     | **long**     | 否  |  test long |   |
|└─ testFloat     | **float**     | 否  |  test float |   |
|└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|└─ testString     | **String**     | 否  |  test string |   |
|└─ testDate     | **Date**     | 否  |  test date |   |
|└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|└─ testNumber     | **Number**     | 否  |  test number |   |
|└─ testSelfCycle     | **TestBasePojo**     | 否  |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|└─ testCycle     | **TestPojo**     | 否  |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ list     | **List**     | 否  |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**     | 否  |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**     | 否  |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**     | 否  |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**     | 否  |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**     | 否  |  测试对象Map |   |
| list     | **List**     | 否  |  测试普通list |   |
| stringList     | **List\<String\>**     | 否  |  测试字符串list |   |
| set     | **Set**     | 否  |  测试普通set |   |
| stringSet     | **Set\<String\>**     | 否  |  测试字符串set |   |
| map     | **Map**     | 否  |  测试普通Map |   |
| objMap     | **Map\<String, Object\>**     | 否  |  测试对象Map |   |

## 出参
> 此接口无任何出参





 [返回目录](#目录)
# 测试单个参数(带泛型的Pojo)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testSingleGenericPojoParam
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
//data.testInt:1
//data.testLong:10
//data.testFloat:10.0
//data.testBoolean:false
//data.testString:test string
//data.testDate:2012-05-28T13:14:00.520+0000
//data.testLocalDt:2012-05-28T13:14:00.520+0000
//data.testDecimal:50.0
//data.testNumber:0
//data.testSelfCycle.testInt:1
//data.testSelfCycle.testLong:10
//data.testSelfCycle.testFloat:10.0
//data.testSelfCycle.testBoolean:false
//data.testSelfCycle.testString:test string
//data.testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//data.testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//data.testSelfCycle.testDecimal:50.0
//data.testSelfCycle.testNumber:0
//data.testCycle.testCustomClass.testInt:1
//data.testCycle.testCustomClass.testLong:10
//data.testCycle.testCustomClass.testFloat:10.0
//data.testCycle.testCustomClass.testBoolean:false
//data.testCycle.testCustomClass.testString:test string
//data.testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//data.testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//data.testCycle.testCustomClass.testDecimal:50.0
//data.testCycle.testCustomClass.testNumber:0
//data.testCycle.list:{}
//data.testCycle.stringList[0]:测试字符串list
//data.testCycle.stringList[1]:测试字符串list
//data.testCycle.set:{}
//data.testCycle.stringSet[0]:测试字符串set
//data.testCycle.stringSet[1]:测试字符串set
//data.testCycle.map:{}
//data.testCycle.objMap.key1:{}
//data.testCycle.objMap.key2:{}
//dataList[0].testInt:1
//dataList[0].testLong:10
//dataList[0].testFloat:10.0
//dataList[0].testBoolean:false
//dataList[0].testString:test string
//dataList[0].testDate:2012-05-28T13:14:00.520+0000
//dataList[0].testLocalDt:2012-05-28T13:14:00.520+0000
//dataList[0].testDecimal:50.0
//dataList[0].testNumber:0
//dataList[0].testSelfCycle.testInt:1
//dataList[0].testSelfCycle.testLong:10
//dataList[0].testSelfCycle.testFloat:10.0
//dataList[0].testSelfCycle.testBoolean:false
//dataList[0].testSelfCycle.testString:test string
//dataList[0].testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//dataList[0].testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//dataList[0].testSelfCycle.testDecimal:50.0
//dataList[0].testSelfCycle.testNumber:0
//dataList[0].testCycle.testCustomClass.testInt:1
//dataList[0].testCycle.testCustomClass.testLong:10
//dataList[0].testCycle.testCustomClass.testFloat:10.0
//dataList[0].testCycle.testCustomClass.testBoolean:false
//dataList[0].testCycle.testCustomClass.testString:test string
//dataList[0].testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//dataList[0].testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//dataList[0].testCycle.testCustomClass.testDecimal:50.0
//dataList[0].testCycle.testCustomClass.testNumber:0
//dataList[0].testCycle.list:{}
//dataList[0].testCycle.stringList[0]:测试字符串list
//dataList[0].testCycle.stringList[1]:测试字符串list
//dataList[0].testCycle.set:{}
//dataList[0].testCycle.stringSet[0]:测试字符串set
//dataList[0].testCycle.stringSet[1]:测试字符串set
//dataList[0].testCycle.map:{}
//dataList[0].testCycle.objMap.key1:{}
//dataList[0].testCycle.objMap.key2:{}
//dataList[1].testInt:1
//dataList[1].testLong:10
//dataList[1].testFloat:10.0
//dataList[1].testBoolean:false
//dataList[1].testString:test string
//dataList[1].testDate:2012-05-28T13:14:00.520+0000
//dataList[1].testLocalDt:2012-05-28T13:14:00.520+0000
//dataList[1].testDecimal:50.0
//dataList[1].testNumber:0
//dataList[1].testSelfCycle.testInt:1
//dataList[1].testSelfCycle.testLong:10
//dataList[1].testSelfCycle.testFloat:10.0
//dataList[1].testSelfCycle.testBoolean:false
//dataList[1].testSelfCycle.testString:test string
//dataList[1].testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//dataList[1].testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//dataList[1].testSelfCycle.testDecimal:50.0
//dataList[1].testSelfCycle.testNumber:0
//dataList[1].testCycle.testCustomClass.testInt:1
//dataList[1].testCycle.testCustomClass.testLong:10
//dataList[1].testCycle.testCustomClass.testFloat:10.0
//dataList[1].testCycle.testCustomClass.testBoolean:false
//dataList[1].testCycle.testCustomClass.testString:test string
//dataList[1].testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//dataList[1].testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//dataList[1].testCycle.testCustomClass.testDecimal:50.0
//dataList[1].testCycle.testCustomClass.testNumber:0
//dataList[1].testCycle.list:{}
//dataList[1].testCycle.stringList[0]:测试字符串list
//dataList[1].testCycle.stringList[1]:测试字符串list
//dataList[1].testCycle.set:{}
//dataList[1].testCycle.stringSet[0]:测试字符串set
//dataList[1].testCycle.stringSet[1]:测试字符串set
//dataList[1].testCycle.map:{}
//dataList[1].testCycle.objMap.key1:{}
//dataList[1].testCycle.objMap.key2:{}
//dataSet[0].testInt:1
//dataSet[0].testLong:10
//dataSet[0].testFloat:10.0
//dataSet[0].testBoolean:false
//dataSet[0].testString:test string
//dataSet[0].testDate:2012-05-28T13:14:00.520+0000
//dataSet[0].testLocalDt:2012-05-28T13:14:00.520+0000
//dataSet[0].testDecimal:50.0
//dataSet[0].testNumber:0
//dataSet[0].testSelfCycle.testInt:1
//dataSet[0].testSelfCycle.testLong:10
//dataSet[0].testSelfCycle.testFloat:10.0
//dataSet[0].testSelfCycle.testBoolean:false
//dataSet[0].testSelfCycle.testString:test string
//dataSet[0].testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//dataSet[0].testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//dataSet[0].testSelfCycle.testDecimal:50.0
//dataSet[0].testSelfCycle.testNumber:0
//dataSet[0].testCycle.testCustomClass.testInt:1
//dataSet[0].testCycle.testCustomClass.testLong:10
//dataSet[0].testCycle.testCustomClass.testFloat:10.0
//dataSet[0].testCycle.testCustomClass.testBoolean:false
//dataSet[0].testCycle.testCustomClass.testString:test string
//dataSet[0].testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//dataSet[0].testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//dataSet[0].testCycle.testCustomClass.testDecimal:50.0
//dataSet[0].testCycle.testCustomClass.testNumber:0
//dataSet[0].testCycle.list:{}
//dataSet[0].testCycle.stringList[0]:测试字符串list
//dataSet[0].testCycle.stringList[1]:测试字符串list
//dataSet[0].testCycle.set:{}
//dataSet[0].testCycle.stringSet[0]:测试字符串set
//dataSet[0].testCycle.stringSet[1]:测试字符串set
//dataSet[0].testCycle.map:{}
//dataSet[0].testCycle.objMap.key1:{}
//dataSet[0].testCycle.objMap.key2:{}
//dataSet[1].testInt:1
//dataSet[1].testLong:10
//dataSet[1].testFloat:10.0
//dataSet[1].testBoolean:false
//dataSet[1].testString:test string
//dataSet[1].testDate:2012-05-28T13:14:00.520+0000
//dataSet[1].testLocalDt:2012-05-28T13:14:00.520+0000
//dataSet[1].testDecimal:50.0
//dataSet[1].testNumber:0
//dataSet[1].testSelfCycle.testInt:1
//dataSet[1].testSelfCycle.testLong:10
//dataSet[1].testSelfCycle.testFloat:10.0
//dataSet[1].testSelfCycle.testBoolean:false
//dataSet[1].testSelfCycle.testString:test string
//dataSet[1].testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//dataSet[1].testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//dataSet[1].testSelfCycle.testDecimal:50.0
//dataSet[1].testSelfCycle.testNumber:0
//dataSet[1].testCycle.testCustomClass.testInt:1
//dataSet[1].testCycle.testCustomClass.testLong:10
//dataSet[1].testCycle.testCustomClass.testFloat:10.0
//dataSet[1].testCycle.testCustomClass.testBoolean:false
//dataSet[1].testCycle.testCustomClass.testString:test string
//dataSet[1].testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//dataSet[1].testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//dataSet[1].testCycle.testCustomClass.testDecimal:50.0
//dataSet[1].testCycle.testCustomClass.testNumber:0
//dataSet[1].testCycle.list:{}
//dataSet[1].testCycle.stringList[0]:测试字符串list
//dataSet[1].testCycle.stringList[1]:测试字符串list
//dataSet[1].testCycle.set:{}
//dataSet[1].testCycle.stringSet[0]:测试字符串set
//dataSet[1].testCycle.stringSet[1]:测试字符串set
//dataSet[1].testCycle.map:{}
//dataSet[1].testCycle.objMap.key1:{}
//dataSet[1].testCycle.objMap.key2:{}
//dataCollection[0].testInt:1
//dataCollection[0].testLong:10
//dataCollection[0].testFloat:10.0
//dataCollection[0].testBoolean:false
//dataCollection[0].testString:test string
//dataCollection[0].testDate:2012-05-28T13:14:00.520+0000
//dataCollection[0].testLocalDt:2012-05-28T13:14:00.520+0000
//dataCollection[0].testDecimal:50.0
//dataCollection[0].testNumber:0
//dataCollection[0].testSelfCycle.testInt:1
//dataCollection[0].testSelfCycle.testLong:10
//dataCollection[0].testSelfCycle.testFloat:10.0
//dataCollection[0].testSelfCycle.testBoolean:false
//dataCollection[0].testSelfCycle.testString:test string
//dataCollection[0].testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//dataCollection[0].testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//dataCollection[0].testSelfCycle.testDecimal:50.0
//dataCollection[0].testSelfCycle.testNumber:0
//dataCollection[0].testCycle.testCustomClass.testInt:1
//dataCollection[0].testCycle.testCustomClass.testLong:10
//dataCollection[0].testCycle.testCustomClass.testFloat:10.0
//dataCollection[0].testCycle.testCustomClass.testBoolean:false
//dataCollection[0].testCycle.testCustomClass.testString:test string
//dataCollection[0].testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//dataCollection[0].testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//dataCollection[0].testCycle.testCustomClass.testDecimal:50.0
//dataCollection[0].testCycle.testCustomClass.testNumber:0
//dataCollection[0].testCycle.list:{}
//dataCollection[0].testCycle.stringList[0]:测试字符串list
//dataCollection[0].testCycle.stringList[1]:测试字符串list
//dataCollection[0].testCycle.set:{}
//dataCollection[0].testCycle.stringSet[0]:测试字符串set
//dataCollection[0].testCycle.stringSet[1]:测试字符串set
//dataCollection[0].testCycle.map:{}
//dataCollection[0].testCycle.objMap.key1:{}
//dataCollection[0].testCycle.objMap.key2:{}
//dataCollection[1].testInt:1
//dataCollection[1].testLong:10
//dataCollection[1].testFloat:10.0
//dataCollection[1].testBoolean:false
//dataCollection[1].testString:test string
//dataCollection[1].testDate:2012-05-28T13:14:00.520+0000
//dataCollection[1].testLocalDt:2012-05-28T13:14:00.520+0000
//dataCollection[1].testDecimal:50.0
//dataCollection[1].testNumber:0
//dataCollection[1].testSelfCycle.testInt:1
//dataCollection[1].testSelfCycle.testLong:10
//dataCollection[1].testSelfCycle.testFloat:10.0
//dataCollection[1].testSelfCycle.testBoolean:false
//dataCollection[1].testSelfCycle.testString:test string
//dataCollection[1].testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//dataCollection[1].testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//dataCollection[1].testSelfCycle.testDecimal:50.0
//dataCollection[1].testSelfCycle.testNumber:0
//dataCollection[1].testCycle.testCustomClass.testInt:1
//dataCollection[1].testCycle.testCustomClass.testLong:10
//dataCollection[1].testCycle.testCustomClass.testFloat:10.0
//dataCollection[1].testCycle.testCustomClass.testBoolean:false
//dataCollection[1].testCycle.testCustomClass.testString:test string
//dataCollection[1].testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//dataCollection[1].testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//dataCollection[1].testCycle.testCustomClass.testDecimal:50.0
//dataCollection[1].testCycle.testCustomClass.testNumber:0
//dataCollection[1].testCycle.list:{}
//dataCollection[1].testCycle.stringList[0]:测试字符串list
//dataCollection[1].testCycle.stringList[1]:测试字符串list
//dataCollection[1].testCycle.set:{}
//dataCollection[1].testCycle.stringSet[0]:测试字符串set
//dataCollection[1].testCycle.stringSet[1]:测试字符串set
//dataCollection[1].testCycle.map:{}
//dataCollection[1].testCycle.objMap.key1:{}
//dataCollection[1].testCycle.objMap.key2:{}
//genericMap.key1.testInt:1
//genericMap.key1.testLong:10
//genericMap.key1.testFloat:10.0
//genericMap.key1.testBoolean:false
//genericMap.key1.testString:test string
//genericMap.key1.testDate:2012-05-28T13:14:00.520+0000
//genericMap.key1.testLocalDt:2012-05-28T13:14:00.520+0000
//genericMap.key1.testDecimal:50.0
//genericMap.key1.testNumber:0
//genericMap.key1.testSelfCycle.testInt:1
//genericMap.key1.testSelfCycle.testLong:10
//genericMap.key1.testSelfCycle.testFloat:10.0
//genericMap.key1.testSelfCycle.testBoolean:false
//genericMap.key1.testSelfCycle.testString:test string
//genericMap.key1.testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//genericMap.key1.testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//genericMap.key1.testSelfCycle.testDecimal:50.0
//genericMap.key1.testSelfCycle.testNumber:0
//genericMap.key1.testCycle.testCustomClass.testInt:1
//genericMap.key1.testCycle.testCustomClass.testLong:10
//genericMap.key1.testCycle.testCustomClass.testFloat:10.0
//genericMap.key1.testCycle.testCustomClass.testBoolean:false
//genericMap.key1.testCycle.testCustomClass.testString:test string
//genericMap.key1.testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//genericMap.key1.testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//genericMap.key1.testCycle.testCustomClass.testDecimal:50.0
//genericMap.key1.testCycle.testCustomClass.testNumber:0
//genericMap.key1.testCycle.list:{}
//genericMap.key1.testCycle.stringList[0]:测试字符串list
//genericMap.key1.testCycle.stringList[1]:测试字符串list
//genericMap.key1.testCycle.set:{}
//genericMap.key1.testCycle.stringSet[0]:测试字符串set
//genericMap.key1.testCycle.stringSet[1]:测试字符串set
//genericMap.key1.testCycle.map:{}
//genericMap.key1.testCycle.objMap.key1:{}
//genericMap.key1.testCycle.objMap.key2:{}
//genericMap.key2.testInt:1
//genericMap.key2.testLong:10
//genericMap.key2.testFloat:10.0
//genericMap.key2.testBoolean:false
//genericMap.key2.testString:test string
//genericMap.key2.testDate:2012-05-28T13:14:00.520+0000
//genericMap.key2.testLocalDt:2012-05-28T13:14:00.520+0000
//genericMap.key2.testDecimal:50.0
//genericMap.key2.testNumber:0
//genericMap.key2.testSelfCycle.testInt:1
//genericMap.key2.testSelfCycle.testLong:10
//genericMap.key2.testSelfCycle.testFloat:10.0
//genericMap.key2.testSelfCycle.testBoolean:false
//genericMap.key2.testSelfCycle.testString:test string
//genericMap.key2.testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//genericMap.key2.testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//genericMap.key2.testSelfCycle.testDecimal:50.0
//genericMap.key2.testSelfCycle.testNumber:0
//genericMap.key2.testCycle.testCustomClass.testInt:1
//genericMap.key2.testCycle.testCustomClass.testLong:10
//genericMap.key2.testCycle.testCustomClass.testFloat:10.0
//genericMap.key2.testCycle.testCustomClass.testBoolean:false
//genericMap.key2.testCycle.testCustomClass.testString:test string
//genericMap.key2.testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//genericMap.key2.testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//genericMap.key2.testCycle.testCustomClass.testDecimal:50.0
//genericMap.key2.testCycle.testCustomClass.testNumber:0
//genericMap.key2.testCycle.list:{}
//genericMap.key2.testCycle.stringList[0]:测试字符串list
//genericMap.key2.testCycle.stringList[1]:测试字符串list
//genericMap.key2.testCycle.set:{}
//genericMap.key2.testCycle.stringSet[0]:测试字符串set
//genericMap.key2.testCycle.stringSet[1]:测试字符串set
//genericMap.key2.testCycle.map:{}
//genericMap.key2.testCycle.objMap.key1:{}
//genericMap.key2.testCycle.objMap.key2:{}

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| data     | **TestBasePojo**     | 否  |  测试泛型 |   |
|└─ testInt     | **int**     | 否  |  test int |   |
|└─ testLong     | **long**     | 否  |  test long |   |
|└─ testFloat     | **float**     | 否  |  test float |   |
|└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|└─ testString     | **String**     | 否  |  test string |   |
|└─ testDate     | **Date**     | 否  |  test date |   |
|└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|└─ testNumber     | **Number**     | 否  |  test number |   |
|└─ testSelfCycle     | **TestBasePojo**     | 否  |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|└─ testCycle     | **TestPojo**     | 否  |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**     | 否  |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ list     | **List**     | 否  |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**     | 否  |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**     | 否  |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**     | 否  |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**     | 否  |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**     | 否  |  测试对象Map |   |
| dataList     | **List\<TestBasePojo\>**     | 否  |  测试泛型集合List |   |
|└─ testInt     | **int**     | 否  |  test int |   |
|└─ testLong     | **long**     | 否  |  test long |   |
|└─ testFloat     | **float**     | 否  |  test float |   |
|└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|└─ testString     | **String**     | 否  |  test string |   |
|└─ testDate     | **Date**     | 否  |  test date |   |
|└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|└─ testNumber     | **Number**     | 否  |  test number |   |
|└─ testSelfCycle     | **TestBasePojo**     | 否  |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|└─ testCycle     | **TestPojo**     | 否  |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**     | 否  |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ list     | **List**     | 否  |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**     | 否  |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**     | 否  |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**     | 否  |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**     | 否  |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**     | 否  |  测试对象Map |   |
| dataSet     | **Set\<TestBasePojo\>**     | 否  |  测试泛型集合Set |   |
|└─ testInt     | **int**     | 否  |  test int |   |
|└─ testLong     | **long**     | 否  |  test long |   |
|└─ testFloat     | **float**     | 否  |  test float |   |
|└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|└─ testString     | **String**     | 否  |  test string |   |
|└─ testDate     | **Date**     | 否  |  test date |   |
|└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|└─ testNumber     | **Number**     | 否  |  test number |   |
|└─ testSelfCycle     | **TestBasePojo**     | 否  |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|└─ testCycle     | **TestPojo**     | 否  |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**     | 否  |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ list     | **List**     | 否  |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**     | 否  |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**     | 否  |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**     | 否  |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**     | 否  |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**     | 否  |  测试对象Map |   |
| dataCollection     | **Collection\<TestBasePojo\>**     | 否  |  测试泛型集合Collection |   |
|└─ testInt     | **int**     | 否  |  test int |   |
|└─ testLong     | **long**     | 否  |  test long |   |
|└─ testFloat     | **float**     | 否  |  test float |   |
|└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|└─ testString     | **String**     | 否  |  test string |   |
|└─ testDate     | **Date**     | 否  |  test date |   |
|└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|└─ testNumber     | **Number**     | 否  |  test number |   |
|└─ testSelfCycle     | **TestBasePojo**     | 否  |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|└─ testCycle     | **TestPojo**     | 否  |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**     | 否  |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ list     | **List**     | 否  |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**     | 否  |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**     | 否  |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**     | 否  |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**     | 否  |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**     | 否  |  测试对象Map |   |
| genericMap     | **Map\<String, TestBasePojo\>**     | 否  |  测试带泛型Map |   |
|└─ testInt     | **int**     | 否  |  test int |   |
|└─ testLong     | **long**     | 否  |  test long |   |
|└─ testFloat     | **float**     | 否  |  test float |   |
|└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|└─ testString     | **String**     | 否  |  test string |   |
|└─ testDate     | **Date**     | 否  |  test date |   |
|└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|└─ testNumber     | **Number**     | 否  |  test number |   |
|└─ testSelfCycle     | **TestBasePojo**     | 否  |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|└─ testCycle     | **TestPojo**     | 否  |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**     | 否  |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ list     | **List**     | 否  |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**     | 否  |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**     | 否  |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**     | 否  |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**     | 否  |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**     | 否  |  测试对象Map |   |

## 出参
> 此接口无任何出参





 [返回目录](#目录)
# 测试单个参数(文件类型)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testSingleFileParam
```

### 请求方法
```
POST
```

### 请求体类型
```
form-data
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
//file:@"//Users/wq/Desktop/test.zip"

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| file     | **MultipartFile**     | 否  |  文件 | 示例值为 \$\{desktop\}/test.zip  |

## 出参
> 此接口无任何出参





 [返回目录](#目录)
# 测试多参数(基本类型)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testMultiBaseParam
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
userId:10
//userAge:1
//amount:10.0
//userName:gudqs7

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| userId     | **long**     | **是**  |  用户ID |   |
| userAge     | **int**     | 否  |  用户年龄 | 不能为负数  |
| amount     | **float**     | 否  |  用户金额 |   |
| userName     | **String**     | 否  |  用户姓名 | 示例值为 gudqs7  |

## 出参
> 此接口无任何出参





 [返回目录](#目录)
# 测试多参数(集合类型)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testMultiCollectionParam
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
//userIdList[0]:10
//userIdList[1]:10
//userAgeList[0]:1
//userAgeList[1]:1
//userNameList[0]:用户姓名列表
//userNameList[1]:用户姓名列表

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| userIdList     | **List\<Long\>**     | 否  |  用户ID列表 |   |
| userAgeList     | **List\<Integer\>**     | 否  |  用户年龄列表 |   |
| userNameList     | **List\<String\>**     | 否  |  用户姓名列表 |   |

## 出参
> 此接口无任何出参





 [返回目录](#目录)
# 测试多参数(Pojo)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testMultiPojoParam
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
//testInt:1
//testLong:10
//testFloat:10.0
//testBoolean:false
//testString:test string
//testDate:2012-05-28T13:14:00.520+0000
//testLocalDt:2012-05-28T13:14:00.520+0000
//testDecimal:50.0
//testNumber:0
//testSelfCycle.testInt:1
//testSelfCycle.testLong:10
//testSelfCycle.testFloat:10.0
//testSelfCycle.testBoolean:false
//testSelfCycle.testString:test string
//testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//testSelfCycle.testDecimal:50.0
//testSelfCycle.testNumber:0
//testCycle.testCustomClass.testInt:1
//testCycle.testCustomClass.testLong:10
//testCycle.testCustomClass.testFloat:10.0
//testCycle.testCustomClass.testBoolean:false
//testCycle.testCustomClass.testString:test string
//testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//testCycle.testCustomClass.testDecimal:50.0
//testCycle.testCustomClass.testNumber:0
//testCycle.list:{}
//testCycle.stringList[0]:测试字符串list
//testCycle.stringList[1]:测试字符串list
//testCycle.set:{}
//testCycle.stringSet[0]:测试字符串set
//testCycle.stringSet[1]:测试字符串set
//testCycle.map:{}
//testCycle.objMap.key1:{}
//testCycle.objMap.key2:{}
//testCustomClass.testInt:1
//testCustomClass.testLong:10
//testCustomClass.testFloat:10.0
//testCustomClass.testBoolean:false
//testCustomClass.testString:test string
//testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//testCustomClass.testDecimal:50.0
//testCustomClass.testNumber:0
//testCustomClass.testSelfCycle.testInt:1
//testCustomClass.testSelfCycle.testLong:10
//testCustomClass.testSelfCycle.testFloat:10.0
//testCustomClass.testSelfCycle.testBoolean:false
//testCustomClass.testSelfCycle.testString:test string
//testCustomClass.testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//testCustomClass.testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//testCustomClass.testSelfCycle.testDecimal:50.0
//testCustomClass.testSelfCycle.testNumber:0
//testCustomClass.testCycle.list:{}
//testCustomClass.testCycle.stringList[0]:测试字符串list
//testCustomClass.testCycle.stringList[1]:测试字符串list
//testCustomClass.testCycle.set:{}
//testCustomClass.testCycle.stringSet[0]:测试字符串set
//testCustomClass.testCycle.stringSet[1]:测试字符串set
//testCustomClass.testCycle.map:{}
//testCustomClass.testCycle.objMap.key1:{}
//testCustomClass.testCycle.objMap.key2:{}
//list:{}
//stringList[0]:测试字符串list
//stringList[1]:测试字符串list
//set:{}
//stringSet[0]:测试字符串set
//stringSet[1]:测试字符串set
//map:{}
//objMap.key1:{}
//objMap.key2:{}
//data.testInt:1
//data.testLong:10
//data.testFloat:10.0
//data.testBoolean:false
//data.testString:test string
//data.testDate:2012-05-28T13:14:00.520+0000
//data.testLocalDt:2012-05-28T13:14:00.520+0000
//data.testDecimal:50.0
//data.testNumber:0
//data.testSelfCycle.testInt:1
//data.testSelfCycle.testLong:10
//data.testSelfCycle.testFloat:10.0
//data.testSelfCycle.testBoolean:false
//data.testSelfCycle.testString:test string
//data.testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//data.testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//data.testSelfCycle.testDecimal:50.0
//data.testSelfCycle.testNumber:0
//data.testCycle.testCustomClass.testInt:1
//data.testCycle.testCustomClass.testLong:10
//data.testCycle.testCustomClass.testFloat:10.0
//data.testCycle.testCustomClass.testBoolean:false
//data.testCycle.testCustomClass.testString:test string
//data.testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//data.testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//data.testCycle.testCustomClass.testDecimal:50.0
//data.testCycle.testCustomClass.testNumber:0
//data.testCycle.list:{}
//data.testCycle.stringList[0]:测试字符串list
//data.testCycle.stringList[1]:测试字符串list
//data.testCycle.set:{}
//data.testCycle.stringSet[0]:测试字符串set
//data.testCycle.stringSet[1]:测试字符串set
//data.testCycle.map:{}
//data.testCycle.objMap.key1:{}
//data.testCycle.objMap.key2:{}
//dataList[0].testInt:1
//dataList[0].testLong:10
//dataList[0].testFloat:10.0
//dataList[0].testBoolean:false
//dataList[0].testString:test string
//dataList[0].testDate:2012-05-28T13:14:00.520+0000
//dataList[0].testLocalDt:2012-05-28T13:14:00.520+0000
//dataList[0].testDecimal:50.0
//dataList[0].testNumber:0
//dataList[0].testSelfCycle.testInt:1
//dataList[0].testSelfCycle.testLong:10
//dataList[0].testSelfCycle.testFloat:10.0
//dataList[0].testSelfCycle.testBoolean:false
//dataList[0].testSelfCycle.testString:test string
//dataList[0].testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//dataList[0].testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//dataList[0].testSelfCycle.testDecimal:50.0
//dataList[0].testSelfCycle.testNumber:0
//dataList[0].testCycle.testCustomClass.testInt:1
//dataList[0].testCycle.testCustomClass.testLong:10
//dataList[0].testCycle.testCustomClass.testFloat:10.0
//dataList[0].testCycle.testCustomClass.testBoolean:false
//dataList[0].testCycle.testCustomClass.testString:test string
//dataList[0].testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//dataList[0].testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//dataList[0].testCycle.testCustomClass.testDecimal:50.0
//dataList[0].testCycle.testCustomClass.testNumber:0
//dataList[0].testCycle.list:{}
//dataList[0].testCycle.stringList[0]:测试字符串list
//dataList[0].testCycle.stringList[1]:测试字符串list
//dataList[0].testCycle.set:{}
//dataList[0].testCycle.stringSet[0]:测试字符串set
//dataList[0].testCycle.stringSet[1]:测试字符串set
//dataList[0].testCycle.map:{}
//dataList[0].testCycle.objMap.key1:{}
//dataList[0].testCycle.objMap.key2:{}
//dataList[1].testInt:1
//dataList[1].testLong:10
//dataList[1].testFloat:10.0
//dataList[1].testBoolean:false
//dataList[1].testString:test string
//dataList[1].testDate:2012-05-28T13:14:00.520+0000
//dataList[1].testLocalDt:2012-05-28T13:14:00.520+0000
//dataList[1].testDecimal:50.0
//dataList[1].testNumber:0
//dataList[1].testSelfCycle.testInt:1
//dataList[1].testSelfCycle.testLong:10
//dataList[1].testSelfCycle.testFloat:10.0
//dataList[1].testSelfCycle.testBoolean:false
//dataList[1].testSelfCycle.testString:test string
//dataList[1].testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//dataList[1].testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//dataList[1].testSelfCycle.testDecimal:50.0
//dataList[1].testSelfCycle.testNumber:0
//dataList[1].testCycle.testCustomClass.testInt:1
//dataList[1].testCycle.testCustomClass.testLong:10
//dataList[1].testCycle.testCustomClass.testFloat:10.0
//dataList[1].testCycle.testCustomClass.testBoolean:false
//dataList[1].testCycle.testCustomClass.testString:test string
//dataList[1].testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//dataList[1].testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//dataList[1].testCycle.testCustomClass.testDecimal:50.0
//dataList[1].testCycle.testCustomClass.testNumber:0
//dataList[1].testCycle.list:{}
//dataList[1].testCycle.stringList[0]:测试字符串list
//dataList[1].testCycle.stringList[1]:测试字符串list
//dataList[1].testCycle.set:{}
//dataList[1].testCycle.stringSet[0]:测试字符串set
//dataList[1].testCycle.stringSet[1]:测试字符串set
//dataList[1].testCycle.map:{}
//dataList[1].testCycle.objMap.key1:{}
//dataList[1].testCycle.objMap.key2:{}
//dataSet[0].testInt:1
//dataSet[0].testLong:10
//dataSet[0].testFloat:10.0
//dataSet[0].testBoolean:false
//dataSet[0].testString:test string
//dataSet[0].testDate:2012-05-28T13:14:00.520+0000
//dataSet[0].testLocalDt:2012-05-28T13:14:00.520+0000
//dataSet[0].testDecimal:50.0
//dataSet[0].testNumber:0
//dataSet[0].testSelfCycle.testInt:1
//dataSet[0].testSelfCycle.testLong:10
//dataSet[0].testSelfCycle.testFloat:10.0
//dataSet[0].testSelfCycle.testBoolean:false
//dataSet[0].testSelfCycle.testString:test string
//dataSet[0].testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//dataSet[0].testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//dataSet[0].testSelfCycle.testDecimal:50.0
//dataSet[0].testSelfCycle.testNumber:0
//dataSet[0].testCycle.testCustomClass.testInt:1
//dataSet[0].testCycle.testCustomClass.testLong:10
//dataSet[0].testCycle.testCustomClass.testFloat:10.0
//dataSet[0].testCycle.testCustomClass.testBoolean:false
//dataSet[0].testCycle.testCustomClass.testString:test string
//dataSet[0].testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//dataSet[0].testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//dataSet[0].testCycle.testCustomClass.testDecimal:50.0
//dataSet[0].testCycle.testCustomClass.testNumber:0
//dataSet[0].testCycle.list:{}
//dataSet[0].testCycle.stringList[0]:测试字符串list
//dataSet[0].testCycle.stringList[1]:测试字符串list
//dataSet[0].testCycle.set:{}
//dataSet[0].testCycle.stringSet[0]:测试字符串set
//dataSet[0].testCycle.stringSet[1]:测试字符串set
//dataSet[0].testCycle.map:{}
//dataSet[0].testCycle.objMap.key1:{}
//dataSet[0].testCycle.objMap.key2:{}
//dataSet[1].testInt:1
//dataSet[1].testLong:10
//dataSet[1].testFloat:10.0
//dataSet[1].testBoolean:false
//dataSet[1].testString:test string
//dataSet[1].testDate:2012-05-28T13:14:00.520+0000
//dataSet[1].testLocalDt:2012-05-28T13:14:00.520+0000
//dataSet[1].testDecimal:50.0
//dataSet[1].testNumber:0
//dataSet[1].testSelfCycle.testInt:1
//dataSet[1].testSelfCycle.testLong:10
//dataSet[1].testSelfCycle.testFloat:10.0
//dataSet[1].testSelfCycle.testBoolean:false
//dataSet[1].testSelfCycle.testString:test string
//dataSet[1].testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//dataSet[1].testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//dataSet[1].testSelfCycle.testDecimal:50.0
//dataSet[1].testSelfCycle.testNumber:0
//dataSet[1].testCycle.testCustomClass.testInt:1
//dataSet[1].testCycle.testCustomClass.testLong:10
//dataSet[1].testCycle.testCustomClass.testFloat:10.0
//dataSet[1].testCycle.testCustomClass.testBoolean:false
//dataSet[1].testCycle.testCustomClass.testString:test string
//dataSet[1].testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//dataSet[1].testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//dataSet[1].testCycle.testCustomClass.testDecimal:50.0
//dataSet[1].testCycle.testCustomClass.testNumber:0
//dataSet[1].testCycle.list:{}
//dataSet[1].testCycle.stringList[0]:测试字符串list
//dataSet[1].testCycle.stringList[1]:测试字符串list
//dataSet[1].testCycle.set:{}
//dataSet[1].testCycle.stringSet[0]:测试字符串set
//dataSet[1].testCycle.stringSet[1]:测试字符串set
//dataSet[1].testCycle.map:{}
//dataSet[1].testCycle.objMap.key1:{}
//dataSet[1].testCycle.objMap.key2:{}
//dataCollection[0].testInt:1
//dataCollection[0].testLong:10
//dataCollection[0].testFloat:10.0
//dataCollection[0].testBoolean:false
//dataCollection[0].testString:test string
//dataCollection[0].testDate:2012-05-28T13:14:00.520+0000
//dataCollection[0].testLocalDt:2012-05-28T13:14:00.520+0000
//dataCollection[0].testDecimal:50.0
//dataCollection[0].testNumber:0
//dataCollection[0].testSelfCycle.testInt:1
//dataCollection[0].testSelfCycle.testLong:10
//dataCollection[0].testSelfCycle.testFloat:10.0
//dataCollection[0].testSelfCycle.testBoolean:false
//dataCollection[0].testSelfCycle.testString:test string
//dataCollection[0].testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//dataCollection[0].testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//dataCollection[0].testSelfCycle.testDecimal:50.0
//dataCollection[0].testSelfCycle.testNumber:0
//dataCollection[0].testCycle.testCustomClass.testInt:1
//dataCollection[0].testCycle.testCustomClass.testLong:10
//dataCollection[0].testCycle.testCustomClass.testFloat:10.0
//dataCollection[0].testCycle.testCustomClass.testBoolean:false
//dataCollection[0].testCycle.testCustomClass.testString:test string
//dataCollection[0].testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//dataCollection[0].testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//dataCollection[0].testCycle.testCustomClass.testDecimal:50.0
//dataCollection[0].testCycle.testCustomClass.testNumber:0
//dataCollection[0].testCycle.list:{}
//dataCollection[0].testCycle.stringList[0]:测试字符串list
//dataCollection[0].testCycle.stringList[1]:测试字符串list
//dataCollection[0].testCycle.set:{}
//dataCollection[0].testCycle.stringSet[0]:测试字符串set
//dataCollection[0].testCycle.stringSet[1]:测试字符串set
//dataCollection[0].testCycle.map:{}
//dataCollection[0].testCycle.objMap.key1:{}
//dataCollection[0].testCycle.objMap.key2:{}
//dataCollection[1].testInt:1
//dataCollection[1].testLong:10
//dataCollection[1].testFloat:10.0
//dataCollection[1].testBoolean:false
//dataCollection[1].testString:test string
//dataCollection[1].testDate:2012-05-28T13:14:00.520+0000
//dataCollection[1].testLocalDt:2012-05-28T13:14:00.520+0000
//dataCollection[1].testDecimal:50.0
//dataCollection[1].testNumber:0
//dataCollection[1].testSelfCycle.testInt:1
//dataCollection[1].testSelfCycle.testLong:10
//dataCollection[1].testSelfCycle.testFloat:10.0
//dataCollection[1].testSelfCycle.testBoolean:false
//dataCollection[1].testSelfCycle.testString:test string
//dataCollection[1].testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//dataCollection[1].testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//dataCollection[1].testSelfCycle.testDecimal:50.0
//dataCollection[1].testSelfCycle.testNumber:0
//dataCollection[1].testCycle.testCustomClass.testInt:1
//dataCollection[1].testCycle.testCustomClass.testLong:10
//dataCollection[1].testCycle.testCustomClass.testFloat:10.0
//dataCollection[1].testCycle.testCustomClass.testBoolean:false
//dataCollection[1].testCycle.testCustomClass.testString:test string
//dataCollection[1].testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//dataCollection[1].testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//dataCollection[1].testCycle.testCustomClass.testDecimal:50.0
//dataCollection[1].testCycle.testCustomClass.testNumber:0
//dataCollection[1].testCycle.list:{}
//dataCollection[1].testCycle.stringList[0]:测试字符串list
//dataCollection[1].testCycle.stringList[1]:测试字符串list
//dataCollection[1].testCycle.set:{}
//dataCollection[1].testCycle.stringSet[0]:测试字符串set
//dataCollection[1].testCycle.stringSet[1]:测试字符串set
//dataCollection[1].testCycle.map:{}
//dataCollection[1].testCycle.objMap.key1:{}
//dataCollection[1].testCycle.objMap.key2:{}
//genericMap.key1.testInt:1
//genericMap.key1.testLong:10
//genericMap.key1.testFloat:10.0
//genericMap.key1.testBoolean:false
//genericMap.key1.testString:test string
//genericMap.key1.testDate:2012-05-28T13:14:00.520+0000
//genericMap.key1.testLocalDt:2012-05-28T13:14:00.520+0000
//genericMap.key1.testDecimal:50.0
//genericMap.key1.testNumber:0
//genericMap.key1.testSelfCycle.testInt:1
//genericMap.key1.testSelfCycle.testLong:10
//genericMap.key1.testSelfCycle.testFloat:10.0
//genericMap.key1.testSelfCycle.testBoolean:false
//genericMap.key1.testSelfCycle.testString:test string
//genericMap.key1.testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//genericMap.key1.testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//genericMap.key1.testSelfCycle.testDecimal:50.0
//genericMap.key1.testSelfCycle.testNumber:0
//genericMap.key1.testCycle.testCustomClass.testInt:1
//genericMap.key1.testCycle.testCustomClass.testLong:10
//genericMap.key1.testCycle.testCustomClass.testFloat:10.0
//genericMap.key1.testCycle.testCustomClass.testBoolean:false
//genericMap.key1.testCycle.testCustomClass.testString:test string
//genericMap.key1.testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//genericMap.key1.testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//genericMap.key1.testCycle.testCustomClass.testDecimal:50.0
//genericMap.key1.testCycle.testCustomClass.testNumber:0
//genericMap.key1.testCycle.list:{}
//genericMap.key1.testCycle.stringList[0]:测试字符串list
//genericMap.key1.testCycle.stringList[1]:测试字符串list
//genericMap.key1.testCycle.set:{}
//genericMap.key1.testCycle.stringSet[0]:测试字符串set
//genericMap.key1.testCycle.stringSet[1]:测试字符串set
//genericMap.key1.testCycle.map:{}
//genericMap.key1.testCycle.objMap.key1:{}
//genericMap.key1.testCycle.objMap.key2:{}
//genericMap.key2.testInt:1
//genericMap.key2.testLong:10
//genericMap.key2.testFloat:10.0
//genericMap.key2.testBoolean:false
//genericMap.key2.testString:test string
//genericMap.key2.testDate:2012-05-28T13:14:00.520+0000
//genericMap.key2.testLocalDt:2012-05-28T13:14:00.520+0000
//genericMap.key2.testDecimal:50.0
//genericMap.key2.testNumber:0
//genericMap.key2.testSelfCycle.testInt:1
//genericMap.key2.testSelfCycle.testLong:10
//genericMap.key2.testSelfCycle.testFloat:10.0
//genericMap.key2.testSelfCycle.testBoolean:false
//genericMap.key2.testSelfCycle.testString:test string
//genericMap.key2.testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//genericMap.key2.testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//genericMap.key2.testSelfCycle.testDecimal:50.0
//genericMap.key2.testSelfCycle.testNumber:0
//genericMap.key2.testCycle.testCustomClass.testInt:1
//genericMap.key2.testCycle.testCustomClass.testLong:10
//genericMap.key2.testCycle.testCustomClass.testFloat:10.0
//genericMap.key2.testCycle.testCustomClass.testBoolean:false
//genericMap.key2.testCycle.testCustomClass.testString:test string
//genericMap.key2.testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//genericMap.key2.testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//genericMap.key2.testCycle.testCustomClass.testDecimal:50.0
//genericMap.key2.testCycle.testCustomClass.testNumber:0
//genericMap.key2.testCycle.list:{}
//genericMap.key2.testCycle.stringList[0]:测试字符串list
//genericMap.key2.testCycle.stringList[1]:测试字符串list
//genericMap.key2.testCycle.set:{}
//genericMap.key2.testCycle.stringSet[0]:测试字符串set
//genericMap.key2.testCycle.stringSet[1]:测试字符串set
//genericMap.key2.testCycle.map:{}
//genericMap.key2.testCycle.objMap.key1:{}
//genericMap.key2.testCycle.objMap.key2:{}

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| testBasePojo     | **TestBasePojo**     | 否  |  base pojo |   |
|└─ testInt     | **int**     | 否  |  test int |   |
|└─ testLong     | **long**     | 否  |  test long |   |
|└─ testFloat     | **float**     | 否  |  test float |   |
|└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|└─ testString     | **String**     | 否  |  test string |   |
|└─ testDate     | **Date**     | 否  |  test date |   |
|└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|└─ testNumber     | **Number**     | 否  |  test number |   |
|└─ testSelfCycle     | **TestBasePojo**     | 否  |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|└─ testCycle     | **TestPojo**     | 否  |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**     | 否  |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ list     | **List**     | 否  |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**     | 否  |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**     | 否  |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**     | 否  |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**     | 否  |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**     | 否  |  测试对象Map |   |
| testPojo     | **TestPojo**     | 否  |  pojo |   |
|└─ testCustomClass     | **TestBasePojo**     | 否  |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testSelfCycle     | **TestBasePojo**     | 否  |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCycle     | **TestPojo**     | 否  |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ list     | **List**     | 否  |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**     | 否  |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**     | 否  |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**     | 否  |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**     | 否  |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**     | 否  |  测试对象Map |   |
|└─ list     | **List**     | 否  |  测试普通list |   |
|└─ stringList     | **List\<String\>**     | 否  |  测试字符串list |   |
|└─ set     | **Set**     | 否  |  测试普通set |   |
|└─ stringSet     | **Set\<String\>**     | 否  |  测试字符串set |   |
|└─ map     | **Map**     | 否  |  测试普通Map |   |
|└─ objMap     | **Map\<String, Object\>**     | 否  |  测试对象Map |   |
| testGenericPojo     | **TestGenericPojo\<TestBasePojo\>**     | 否  |  泛型pojo |   |
|└─ data     | **TestBasePojo**     | 否  |  测试泛型 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testSelfCycle     | **TestBasePojo**     | 否  |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCycle     | **TestPojo**     | 否  |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**     | 否  |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ list     | **List**     | 否  |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**     | 否  |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**     | 否  |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**     | 否  |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**     | 否  |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**     | 否  |  测试对象Map |   |
|└─ dataList     | **List\<TestBasePojo\>**     | 否  |  测试泛型集合List |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testSelfCycle     | **TestBasePojo**     | 否  |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCycle     | **TestPojo**     | 否  |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**     | 否  |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ list     | **List**     | 否  |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**     | 否  |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**     | 否  |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**     | 否  |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**     | 否  |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**     | 否  |  测试对象Map |   |
|└─ dataSet     | **Set\<TestBasePojo\>**     | 否  |  测试泛型集合Set |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testSelfCycle     | **TestBasePojo**     | 否  |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCycle     | **TestPojo**     | 否  |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**     | 否  |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ list     | **List**     | 否  |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**     | 否  |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**     | 否  |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**     | 否  |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**     | 否  |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**     | 否  |  测试对象Map |   |
|└─ dataCollection     | **Collection\<TestBasePojo\>**     | 否  |  测试泛型集合Collection |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testSelfCycle     | **TestBasePojo**     | 否  |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCycle     | **TestPojo**     | 否  |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**     | 否  |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ list     | **List**     | 否  |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**     | 否  |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**     | 否  |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**     | 否  |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**     | 否  |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**     | 否  |  测试对象Map |   |
|└─ genericMap     | **Map\<String, TestBasePojo\>**     | 否  |  测试带泛型Map |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testSelfCycle     | **TestBasePojo**     | 否  |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCycle     | **TestPojo**     | 否  |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**     | 否  |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ list     | **List**     | 否  |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**     | 否  |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**     | 否  |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**     | 否  |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**     | 否  |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**     | 否  |  测试对象Map |   |

## 出参
> 此接口无任何出参





 [返回目录](#目录)
# 测试多个参数(文件类型)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testMultiFileParam
```

### 请求方法
```
POST
```

### 请求体类型
```
form-data
```

## 入参
### 入参示例 (Postman Bulk Edit)
```json
file:@"//Users/wq/code/api-savior-plugin-usage-examples/a.txt"
//file2:@"//Users/wq/Downloads/a.txt"
//testInt:1
//testLong:10
//testFloat:10.0
//testBoolean:false
//testString:test string
//testDate:2012-05-28T13:14:00.520+0000
//testLocalDt:2012-05-28T13:14:00.520+0000
//testDecimal:50.0
//testNumber:0
//testSelfCycle.testInt:1
//testSelfCycle.testLong:10
//testSelfCycle.testFloat:10.0
//testSelfCycle.testBoolean:false
//testSelfCycle.testString:test string
//testSelfCycle.testDate:2012-05-28T13:14:00.520+0000
//testSelfCycle.testLocalDt:2012-05-28T13:14:00.520+0000
//testSelfCycle.testDecimal:50.0
//testSelfCycle.testNumber:0
//testCycle.testCustomClass.testInt:1
//testCycle.testCustomClass.testLong:10
//testCycle.testCustomClass.testFloat:10.0
//testCycle.testCustomClass.testBoolean:false
//testCycle.testCustomClass.testString:test string
//testCycle.testCustomClass.testDate:2012-05-28T13:14:00.520+0000
//testCycle.testCustomClass.testLocalDt:2012-05-28T13:14:00.520+0000
//testCycle.testCustomClass.testDecimal:50.0
//testCycle.testCustomClass.testNumber:0
//testCycle.list:{}
//testCycle.stringList[0]:测试字符串list
//testCycle.stringList[1]:测试字符串list
//testCycle.set:{}
//testCycle.stringSet[0]:测试字符串set
//testCycle.stringSet[1]:测试字符串set
//testCycle.map:{}
//testCycle.objMap.key1:{}
//testCycle.objMap.key2:{}

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| file     | **MultipartFile**     | **是**  |  文件1 | 示例值为 \$\{project\}/a.txt  |
| file2     | **MultipartFile**     | 否  |  文件2 | 示例值为 \$\{download\}/a.txt  |
| testBasePojo     | **TestBasePojo**     | 否  |  pojo |   |
|└─ testInt     | **int**     | 否  |  test int |   |
|└─ testLong     | **long**     | 否  |  test long |   |
|└─ testFloat     | **float**     | 否  |  test float |   |
|└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|└─ testString     | **String**     | 否  |  test string |   |
|└─ testDate     | **Date**     | 否  |  test date |   |
|└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|└─ testNumber     | **Number**     | 否  |  test number |   |
|└─ testSelfCycle     | **TestBasePojo**     | 否  |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|└─ testCycle     | **TestPojo**     | 否  |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**     | 否  |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**     | 否  |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**     | 否  |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**     | 否  |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**     | 否  |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**     | 否  |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**     | 否  |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**     | 否  |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**     | 否  |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**     | 否  |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ list     | **List**     | 否  |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**     | 否  |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**     | 否  |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**     | 否  |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**     | 否  |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**     | 否  |  测试对象Map |   |

## 出参
> 此接口无任何出参






 [返回目录](#目录)
# 测试无响应

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testNoReturn
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
> 此接口无任何入参



## 出参
> 此接口无任何出参





 [返回目录](#目录)
# 测试单个响应(基本类型)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testSingleBaseReturn
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
> 此接口无任何入参



## 出参
### 出参示例
```json
1
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| root     | **int**    |  用户ID |   |



 [返回目录](#目录)
# 测试单个响应(集合类型)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testSingleCollectionReturn
```

### 请求方法
```
GET/POST/PUT/DELETE
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
> 此接口无任何入参



## 出参
### 出参示例
```json
[
  "用户ID列表",
  "用户ID列表"
]
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| root     | **List\<String\>**    |  用户ID列表 |   |



 [返回目录](#目录)
# 测试单个响应(基本类型组成的Pojo)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testSingleBasePojoReturn
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
> 此接口无任何入参



## 出参
### 出参示例
```json
{
  "testInt": 1,
  "testLong": 10,
  "testFloat": 10.0,
  "testBoolean": false,
  "testString": "test string",
  "testDate": "2012-05-28T13:14:00.520+0000",
  "testLocalDt": "2012-05-28T13:14:00.520+0000",
  "testDecimal": 50.0,
  "testNumber": 0,
  "testSelfCycle": {
    "testInt": 1,
    "testLong": 10,
    "testFloat": 10.0,
    "testBoolean": false,
    "testString": "test string",
    "testDate": "2012-05-28T13:14:00.520+0000",
    "testLocalDt": "2012-05-28T13:14:00.520+0000",
    "testDecimal": 50.0,
    "testNumber": 0
  },
  "testCycle": {
    "testCustomClass": {
      "testInt": 1,
      "testLong": 10,
      "testFloat": 10.0,
      "testBoolean": false,
      "testString": "test string",
      "testDate": "2012-05-28T13:14:00.520+0000",
      "testLocalDt": "2012-05-28T13:14:00.520+0000",
      "testDecimal": 50.0,
      "testNumber": 0
    },
    "list": {},
    "stringList": [
      "测试字符串list",
      "测试字符串list"
    ],
    "set": {},
    "stringSet": [
      "测试字符串set",
      "测试字符串set"
    ],
    "map": {},
    "objMap": {
      "key1": {},
      "key2": {}
    }
  }
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| testInt     | **int**    |  test int |   |
| testLong     | **long**    |  test long |   |
| testFloat     | **float**    |  test float |   |
| testBoolean     | **boolean**    |  test boolean |   |
| testString     | **String**    |  test string |   |
| testDate     | **Date**    |  test date |   |
| testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
| testDecimal     | **BigDecimal**    |  test decimal |   |
| testNumber     | **Number**    |  test number |   |
| testSelfCycle     | **TestBasePojo**    |  测试自我循环 |   |
|└─ testInt     | **int**    |  test int |   |
|└─ testLong     | **long**    |  test long |   |
|└─ testFloat     | **float**    |  test float |   |
|└─ testBoolean     | **boolean**    |  test boolean |   |
|└─ testString     | **String**    |  test string |   |
|└─ testDate     | **Date**    |  test date |   |
|└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|└─ testNumber     | **Number**    |  test number |   |
| testCycle     | **TestPojo**    |  测试循环 |   |
|└─ testCustomClass     | **TestBasePojo**    |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|└─ list     | **List**    |  测试普通list |   |
|└─ stringList     | **List\<String\>**    |  测试字符串list |   |
|└─ set     | **Set**    |  测试普通set |   |
|└─ stringSet     | **Set\<String\>**    |  测试字符串set |   |
|└─ map     | **Map**    |  测试普通Map |   |
|└─ objMap     | **Map\<String, Object\>**    |  测试对象Map |   |



 [返回目录](#目录)
# 测试单个响应(普通Pojo)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testSinglePojoReturn
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
> 此接口无任何入参



## 出参
### 出参示例
```json
{
  "testCustomClass": {
    "testInt": 1,
    "testLong": 10,
    "testFloat": 10.0,
    "testBoolean": false,
    "testString": "test string",
    "testDate": "2012-05-28T13:14:00.520+0000",
    "testLocalDt": "2012-05-28T13:14:00.520+0000",
    "testDecimal": 50.0,
    "testNumber": 0,
    "testSelfCycle": {
      "testInt": 1,
      "testLong": 10,
      "testFloat": 10.0,
      "testBoolean": false,
      "testString": "test string",
      "testDate": "2012-05-28T13:14:00.520+0000",
      "testLocalDt": "2012-05-28T13:14:00.520+0000",
      "testDecimal": 50.0,
      "testNumber": 0
    },
    "testCycle": {
      "list": {},
      "stringList": [
        "测试字符串list",
        "测试字符串list"
      ],
      "set": {},
      "stringSet": [
        "测试字符串set",
        "测试字符串set"
      ],
      "map": {},
      "objMap": {
        "key1": {},
        "key2": {}
      }
    }
  },
  "list": {},
  "stringList": [
    "测试字符串list",
    "测试字符串list"
  ],
  "set": {},
  "stringSet": [
    "测试字符串set",
    "测试字符串set"
  ],
  "map": {},
  "objMap": {
    "key1": {},
    "key2": {}
  }
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| testCustomClass     | **TestBasePojo**    |  测试普通Pojo |   |
|└─ testInt     | **int**    |  test int |   |
|└─ testLong     | **long**    |  test long |   |
|└─ testFloat     | **float**    |  test float |   |
|└─ testBoolean     | **boolean**    |  test boolean |   |
|└─ testString     | **String**    |  test string |   |
|└─ testDate     | **Date**    |  test date |   |
|└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|└─ testNumber     | **Number**    |  test number |   |
|└─ testSelfCycle     | **TestBasePojo**    |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|└─ testCycle     | **TestPojo**    |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ list     | **List**    |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**    |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**    |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**    |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**    |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**    |  测试对象Map |   |
| list     | **List**    |  测试普通list |   |
| stringList     | **List\<String\>**    |  测试字符串list |   |
| set     | **Set**    |  测试普通set |   |
| stringSet     | **Set\<String\>**    |  测试字符串set |   |
| map     | **Map**    |  测试普通Map |   |
| objMap     | **Map\<String, Object\>**    |  测试对象Map |   |



 [返回目录](#目录)
# 测试单个响应(带泛型的Pojo)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testSingleGenericPojoReturn
```

### 请求方法
```
POST
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
> 此接口无任何入参



## 出参
### 出参示例
```json
{
  "data": {
    "testInt": 1,
    "testLong": 10,
    "testFloat": 10.0,
    "testBoolean": false,
    "testString": "test string",
    "testDate": "2012-05-28T13:14:00.520+0000",
    "testLocalDt": "2012-05-28T13:14:00.520+0000",
    "testDecimal": 50.0,
    "testNumber": 0,
    "testSelfCycle": {
      "testInt": 1,
      "testLong": 10,
      "testFloat": 10.0,
      "testBoolean": false,
      "testString": "test string",
      "testDate": "2012-05-28T13:14:00.520+0000",
      "testLocalDt": "2012-05-28T13:14:00.520+0000",
      "testDecimal": 50.0,
      "testNumber": 0
    },
    "testCycle": {
      "testCustomClass": {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0
      },
      "list": {},
      "stringList": [
        "测试字符串list",
        "测试字符串list"
      ],
      "set": {},
      "stringSet": [
        "测试字符串set",
        "测试字符串set"
      ],
      "map": {},
      "objMap": {
        "key1": {},
        "key2": {}
      }
    }
  },
  "dataList": [
    {
      "testInt": 1,
      "testLong": 10,
      "testFloat": 10.0,
      "testBoolean": false,
      "testString": "test string",
      "testDate": "2012-05-28T13:14:00.520+0000",
      "testLocalDt": "2012-05-28T13:14:00.520+0000",
      "testDecimal": 50.0,
      "testNumber": 0,
      "testSelfCycle": {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0
      },
      "testCycle": {
        "testCustomClass": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "list": {},
        "stringList": [
          "测试字符串list",
          "测试字符串list"
        ],
        "set": {},
        "stringSet": [
          "测试字符串set",
          "测试字符串set"
        ],
        "map": {},
        "objMap": {
          "key1": {},
          "key2": {}
        }
      }
    },
    {
      "testInt": 1,
      "testLong": 10,
      "testFloat": 10.0,
      "testBoolean": false,
      "testString": "test string",
      "testDate": "2012-05-28T13:14:00.520+0000",
      "testLocalDt": "2012-05-28T13:14:00.520+0000",
      "testDecimal": 50.0,
      "testNumber": 0,
      "testSelfCycle": {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0
      },
      "testCycle": {
        "testCustomClass": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "list": {},
        "stringList": [
          "测试字符串list",
          "测试字符串list"
        ],
        "set": {},
        "stringSet": [
          "测试字符串set",
          "测试字符串set"
        ],
        "map": {},
        "objMap": {
          "key1": {},
          "key2": {}
        }
      }
    }
  ],
  "dataSet": [
    {
      "testInt": 1,
      "testLong": 10,
      "testFloat": 10.0,
      "testBoolean": false,
      "testString": "test string",
      "testDate": "2012-05-28T13:14:00.520+0000",
      "testLocalDt": "2012-05-28T13:14:00.520+0000",
      "testDecimal": 50.0,
      "testNumber": 0,
      "testSelfCycle": {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0
      },
      "testCycle": {
        "testCustomClass": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "list": {},
        "stringList": [
          "测试字符串list",
          "测试字符串list"
        ],
        "set": {},
        "stringSet": [
          "测试字符串set",
          "测试字符串set"
        ],
        "map": {},
        "objMap": {
          "key1": {},
          "key2": {}
        }
      }
    },
    {
      "testInt": 1,
      "testLong": 10,
      "testFloat": 10.0,
      "testBoolean": false,
      "testString": "test string",
      "testDate": "2012-05-28T13:14:00.520+0000",
      "testLocalDt": "2012-05-28T13:14:00.520+0000",
      "testDecimal": 50.0,
      "testNumber": 0,
      "testSelfCycle": {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0
      },
      "testCycle": {
        "testCustomClass": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "list": {},
        "stringList": [
          "测试字符串list",
          "测试字符串list"
        ],
        "set": {},
        "stringSet": [
          "测试字符串set",
          "测试字符串set"
        ],
        "map": {},
        "objMap": {
          "key1": {},
          "key2": {}
        }
      }
    }
  ],
  "dataCollection": [
    {
      "testInt": 1,
      "testLong": 10,
      "testFloat": 10.0,
      "testBoolean": false,
      "testString": "test string",
      "testDate": "2012-05-28T13:14:00.520+0000",
      "testLocalDt": "2012-05-28T13:14:00.520+0000",
      "testDecimal": 50.0,
      "testNumber": 0,
      "testSelfCycle": {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0
      },
      "testCycle": {
        "testCustomClass": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "list": {},
        "stringList": [
          "测试字符串list",
          "测试字符串list"
        ],
        "set": {},
        "stringSet": [
          "测试字符串set",
          "测试字符串set"
        ],
        "map": {},
        "objMap": {
          "key1": {},
          "key2": {}
        }
      }
    },
    {
      "testInt": 1,
      "testLong": 10,
      "testFloat": 10.0,
      "testBoolean": false,
      "testString": "test string",
      "testDate": "2012-05-28T13:14:00.520+0000",
      "testLocalDt": "2012-05-28T13:14:00.520+0000",
      "testDecimal": 50.0,
      "testNumber": 0,
      "testSelfCycle": {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0
      },
      "testCycle": {
        "testCustomClass": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "list": {},
        "stringList": [
          "测试字符串list",
          "测试字符串list"
        ],
        "set": {},
        "stringSet": [
          "测试字符串set",
          "测试字符串set"
        ],
        "map": {},
        "objMap": {
          "key1": {},
          "key2": {}
        }
      }
    }
  ],
  "genericMap": {
    "key1": {
      "testInt": 1,
      "testLong": 10,
      "testFloat": 10.0,
      "testBoolean": false,
      "testString": "test string",
      "testDate": "2012-05-28T13:14:00.520+0000",
      "testLocalDt": "2012-05-28T13:14:00.520+0000",
      "testDecimal": 50.0,
      "testNumber": 0,
      "testSelfCycle": {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0
      },
      "testCycle": {
        "testCustomClass": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "list": {},
        "stringList": [
          "测试字符串list",
          "测试字符串list"
        ],
        "set": {},
        "stringSet": [
          "测试字符串set",
          "测试字符串set"
        ],
        "map": {},
        "objMap": {
          "key1": {},
          "key2": {}
        }
      }
    },
    "key2": {
      "testInt": 1,
      "testLong": 10,
      "testFloat": 10.0,
      "testBoolean": false,
      "testString": "test string",
      "testDate": "2012-05-28T13:14:00.520+0000",
      "testLocalDt": "2012-05-28T13:14:00.520+0000",
      "testDecimal": 50.0,
      "testNumber": 0,
      "testSelfCycle": {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0
      },
      "testCycle": {
        "testCustomClass": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "list": {},
        "stringList": [
          "测试字符串list",
          "测试字符串list"
        ],
        "set": {},
        "stringSet": [
          "测试字符串set",
          "测试字符串set"
        ],
        "map": {},
        "objMap": {
          "key1": {},
          "key2": {}
        }
      }
    }
  }
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| data     | **TestBasePojo**    |  测试泛型 |   |
|└─ testInt     | **int**    |  test int |   |
|└─ testLong     | **long**    |  test long |   |
|└─ testFloat     | **float**    |  test float |   |
|└─ testBoolean     | **boolean**    |  test boolean |   |
|└─ testString     | **String**    |  test string |   |
|└─ testDate     | **Date**    |  test date |   |
|└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|└─ testNumber     | **Number**    |  test number |   |
|└─ testSelfCycle     | **TestBasePojo**    |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|└─ testCycle     | **TestPojo**    |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**    |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ list     | **List**    |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**    |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**    |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**    |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**    |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**    |  测试对象Map |   |
| dataList     | **List\<TestBasePojo\>**    |  测试泛型集合List |   |
|└─ testInt     | **int**    |  test int |   |
|└─ testLong     | **long**    |  test long |   |
|└─ testFloat     | **float**    |  test float |   |
|└─ testBoolean     | **boolean**    |  test boolean |   |
|└─ testString     | **String**    |  test string |   |
|└─ testDate     | **Date**    |  test date |   |
|└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|└─ testNumber     | **Number**    |  test number |   |
|└─ testSelfCycle     | **TestBasePojo**    |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|└─ testCycle     | **TestPojo**    |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**    |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ list     | **List**    |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**    |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**    |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**    |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**    |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**    |  测试对象Map |   |
| dataSet     | **Set\<TestBasePojo\>**    |  测试泛型集合Set |   |
|└─ testInt     | **int**    |  test int |   |
|└─ testLong     | **long**    |  test long |   |
|└─ testFloat     | **float**    |  test float |   |
|└─ testBoolean     | **boolean**    |  test boolean |   |
|└─ testString     | **String**    |  test string |   |
|└─ testDate     | **Date**    |  test date |   |
|└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|└─ testNumber     | **Number**    |  test number |   |
|└─ testSelfCycle     | **TestBasePojo**    |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|└─ testCycle     | **TestPojo**    |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**    |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ list     | **List**    |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**    |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**    |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**    |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**    |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**    |  测试对象Map |   |
| dataCollection     | **Collection\<TestBasePojo\>**    |  测试泛型集合Collection |   |
|└─ testInt     | **int**    |  test int |   |
|└─ testLong     | **long**    |  test long |   |
|└─ testFloat     | **float**    |  test float |   |
|└─ testBoolean     | **boolean**    |  test boolean |   |
|└─ testString     | **String**    |  test string |   |
|└─ testDate     | **Date**    |  test date |   |
|└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|└─ testNumber     | **Number**    |  test number |   |
|└─ testSelfCycle     | **TestBasePojo**    |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|└─ testCycle     | **TestPojo**    |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**    |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ list     | **List**    |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**    |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**    |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**    |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**    |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**    |  测试对象Map |   |
| genericMap     | **Map\<String, TestBasePojo\>**    |  测试带泛型Map |   |
|└─ testInt     | **int**    |  test int |   |
|└─ testLong     | **long**    |  test long |   |
|└─ testFloat     | **float**    |  test float |   |
|└─ testBoolean     | **boolean**    |  test boolean |   |
|└─ testString     | **String**    |  test string |   |
|└─ testDate     | **Date**    |  test date |   |
|└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|└─ testNumber     | **Number**    |  test number |   |
|└─ testSelfCycle     | **TestBasePojo**    |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|└─ testCycle     | **TestPojo**    |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**    |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ list     | **List**    |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**    |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**    |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**    |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**    |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**    |  测试对象Map |   |



 [返回目录](#目录)
# 测试单个响应(集合类型+泛型)

## 请求信息

### 请求地址
```
http://127.0.0.1:7086/api/v1/test/param/testSingleCollectionAndGenericPojoReturn
```

### 请求方法
```
GET/POST/PUT/DELETE
```

### 请求体类型
```
application/x-www-form-urlencoded
```

## 入参
> 此接口无任何入参



## 出参
### 出参示例
```json
[
  {
    "data": {
      "testInt": 1,
      "testLong": 10,
      "testFloat": 10.0,
      "testBoolean": false,
      "testString": "test string",
      "testDate": "2012-05-28T13:14:00.520+0000",
      "testLocalDt": "2012-05-28T13:14:00.520+0000",
      "testDecimal": 50.0,
      "testNumber": 0,
      "testSelfCycle": {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0
      },
      "testCycle": {
        "testCustomClass": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "list": {},
        "stringList": [
          "测试字符串list",
          "测试字符串list"
        ],
        "set": {},
        "stringSet": [
          "测试字符串set",
          "测试字符串set"
        ],
        "map": {},
        "objMap": {
          "key1": {},
          "key2": {}
        }
      }
    },
    "dataList": [
      {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0,
        "testSelfCycle": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "testCycle": {
          "testCustomClass": {
            "testInt": 1,
            "testLong": 10,
            "testFloat": 10.0,
            "testBoolean": false,
            "testString": "test string",
            "testDate": "2012-05-28T13:14:00.520+0000",
            "testLocalDt": "2012-05-28T13:14:00.520+0000",
            "testDecimal": 50.0,
            "testNumber": 0
          },
          "list": {},
          "stringList": [
            "测试字符串list",
            "测试字符串list"
          ],
          "set": {},
          "stringSet": [
            "测试字符串set",
            "测试字符串set"
          ],
          "map": {},
          "objMap": {
            "key1": {},
            "key2": {}
          }
        }
      },
      {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0,
        "testSelfCycle": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "testCycle": {
          "testCustomClass": {
            "testInt": 1,
            "testLong": 10,
            "testFloat": 10.0,
            "testBoolean": false,
            "testString": "test string",
            "testDate": "2012-05-28T13:14:00.520+0000",
            "testLocalDt": "2012-05-28T13:14:00.520+0000",
            "testDecimal": 50.0,
            "testNumber": 0
          },
          "list": {},
          "stringList": [
            "测试字符串list",
            "测试字符串list"
          ],
          "set": {},
          "stringSet": [
            "测试字符串set",
            "测试字符串set"
          ],
          "map": {},
          "objMap": {
            "key1": {},
            "key2": {}
          }
        }
      }
    ],
    "dataSet": [
      {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0,
        "testSelfCycle": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "testCycle": {
          "testCustomClass": {
            "testInt": 1,
            "testLong": 10,
            "testFloat": 10.0,
            "testBoolean": false,
            "testString": "test string",
            "testDate": "2012-05-28T13:14:00.520+0000",
            "testLocalDt": "2012-05-28T13:14:00.520+0000",
            "testDecimal": 50.0,
            "testNumber": 0
          },
          "list": {},
          "stringList": [
            "测试字符串list",
            "测试字符串list"
          ],
          "set": {},
          "stringSet": [
            "测试字符串set",
            "测试字符串set"
          ],
          "map": {},
          "objMap": {
            "key1": {},
            "key2": {}
          }
        }
      },
      {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0,
        "testSelfCycle": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "testCycle": {
          "testCustomClass": {
            "testInt": 1,
            "testLong": 10,
            "testFloat": 10.0,
            "testBoolean": false,
            "testString": "test string",
            "testDate": "2012-05-28T13:14:00.520+0000",
            "testLocalDt": "2012-05-28T13:14:00.520+0000",
            "testDecimal": 50.0,
            "testNumber": 0
          },
          "list": {},
          "stringList": [
            "测试字符串list",
            "测试字符串list"
          ],
          "set": {},
          "stringSet": [
            "测试字符串set",
            "测试字符串set"
          ],
          "map": {},
          "objMap": {
            "key1": {},
            "key2": {}
          }
        }
      }
    ],
    "dataCollection": [
      {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0,
        "testSelfCycle": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "testCycle": {
          "testCustomClass": {
            "testInt": 1,
            "testLong": 10,
            "testFloat": 10.0,
            "testBoolean": false,
            "testString": "test string",
            "testDate": "2012-05-28T13:14:00.520+0000",
            "testLocalDt": "2012-05-28T13:14:00.520+0000",
            "testDecimal": 50.0,
            "testNumber": 0
          },
          "list": {},
          "stringList": [
            "测试字符串list",
            "测试字符串list"
          ],
          "set": {},
          "stringSet": [
            "测试字符串set",
            "测试字符串set"
          ],
          "map": {},
          "objMap": {
            "key1": {},
            "key2": {}
          }
        }
      },
      {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0,
        "testSelfCycle": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "testCycle": {
          "testCustomClass": {
            "testInt": 1,
            "testLong": 10,
            "testFloat": 10.0,
            "testBoolean": false,
            "testString": "test string",
            "testDate": "2012-05-28T13:14:00.520+0000",
            "testLocalDt": "2012-05-28T13:14:00.520+0000",
            "testDecimal": 50.0,
            "testNumber": 0
          },
          "list": {},
          "stringList": [
            "测试字符串list",
            "测试字符串list"
          ],
          "set": {},
          "stringSet": [
            "测试字符串set",
            "测试字符串set"
          ],
          "map": {},
          "objMap": {
            "key1": {},
            "key2": {}
          }
        }
      }
    ],
    "genericMap": {
      "key1": {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0,
        "testSelfCycle": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "testCycle": {
          "testCustomClass": {
            "testInt": 1,
            "testLong": 10,
            "testFloat": 10.0,
            "testBoolean": false,
            "testString": "test string",
            "testDate": "2012-05-28T13:14:00.520+0000",
            "testLocalDt": "2012-05-28T13:14:00.520+0000",
            "testDecimal": 50.0,
            "testNumber": 0
          },
          "list": {},
          "stringList": [
            "测试字符串list",
            "测试字符串list"
          ],
          "set": {},
          "stringSet": [
            "测试字符串set",
            "测试字符串set"
          ],
          "map": {},
          "objMap": {
            "key1": {},
            "key2": {}
          }
        }
      },
      "key2": {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0,
        "testSelfCycle": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "testCycle": {
          "testCustomClass": {
            "testInt": 1,
            "testLong": 10,
            "testFloat": 10.0,
            "testBoolean": false,
            "testString": "test string",
            "testDate": "2012-05-28T13:14:00.520+0000",
            "testLocalDt": "2012-05-28T13:14:00.520+0000",
            "testDecimal": 50.0,
            "testNumber": 0
          },
          "list": {},
          "stringList": [
            "测试字符串list",
            "测试字符串list"
          ],
          "set": {},
          "stringSet": [
            "测试字符串set",
            "测试字符串set"
          ],
          "map": {},
          "objMap": {
            "key1": {},
            "key2": {}
          }
        }
      }
    }
  },
  {
    "data": {
      "testInt": 1,
      "testLong": 10,
      "testFloat": 10.0,
      "testBoolean": false,
      "testString": "test string",
      "testDate": "2012-05-28T13:14:00.520+0000",
      "testLocalDt": "2012-05-28T13:14:00.520+0000",
      "testDecimal": 50.0,
      "testNumber": 0,
      "testSelfCycle": {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0
      },
      "testCycle": {
        "testCustomClass": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "list": {},
        "stringList": [
          "测试字符串list",
          "测试字符串list"
        ],
        "set": {},
        "stringSet": [
          "测试字符串set",
          "测试字符串set"
        ],
        "map": {},
        "objMap": {
          "key1": {},
          "key2": {}
        }
      }
    },
    "dataList": [
      {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0,
        "testSelfCycle": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "testCycle": {
          "testCustomClass": {
            "testInt": 1,
            "testLong": 10,
            "testFloat": 10.0,
            "testBoolean": false,
            "testString": "test string",
            "testDate": "2012-05-28T13:14:00.520+0000",
            "testLocalDt": "2012-05-28T13:14:00.520+0000",
            "testDecimal": 50.0,
            "testNumber": 0
          },
          "list": {},
          "stringList": [
            "测试字符串list",
            "测试字符串list"
          ],
          "set": {},
          "stringSet": [
            "测试字符串set",
            "测试字符串set"
          ],
          "map": {},
          "objMap": {
            "key1": {},
            "key2": {}
          }
        }
      },
      {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0,
        "testSelfCycle": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "testCycle": {
          "testCustomClass": {
            "testInt": 1,
            "testLong": 10,
            "testFloat": 10.0,
            "testBoolean": false,
            "testString": "test string",
            "testDate": "2012-05-28T13:14:00.520+0000",
            "testLocalDt": "2012-05-28T13:14:00.520+0000",
            "testDecimal": 50.0,
            "testNumber": 0
          },
          "list": {},
          "stringList": [
            "测试字符串list",
            "测试字符串list"
          ],
          "set": {},
          "stringSet": [
            "测试字符串set",
            "测试字符串set"
          ],
          "map": {},
          "objMap": {
            "key1": {},
            "key2": {}
          }
        }
      }
    ],
    "dataSet": [
      {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0,
        "testSelfCycle": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "testCycle": {
          "testCustomClass": {
            "testInt": 1,
            "testLong": 10,
            "testFloat": 10.0,
            "testBoolean": false,
            "testString": "test string",
            "testDate": "2012-05-28T13:14:00.520+0000",
            "testLocalDt": "2012-05-28T13:14:00.520+0000",
            "testDecimal": 50.0,
            "testNumber": 0
          },
          "list": {},
          "stringList": [
            "测试字符串list",
            "测试字符串list"
          ],
          "set": {},
          "stringSet": [
            "测试字符串set",
            "测试字符串set"
          ],
          "map": {},
          "objMap": {
            "key1": {},
            "key2": {}
          }
        }
      },
      {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0,
        "testSelfCycle": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "testCycle": {
          "testCustomClass": {
            "testInt": 1,
            "testLong": 10,
            "testFloat": 10.0,
            "testBoolean": false,
            "testString": "test string",
            "testDate": "2012-05-28T13:14:00.520+0000",
            "testLocalDt": "2012-05-28T13:14:00.520+0000",
            "testDecimal": 50.0,
            "testNumber": 0
          },
          "list": {},
          "stringList": [
            "测试字符串list",
            "测试字符串list"
          ],
          "set": {},
          "stringSet": [
            "测试字符串set",
            "测试字符串set"
          ],
          "map": {},
          "objMap": {
            "key1": {},
            "key2": {}
          }
        }
      }
    ],
    "dataCollection": [
      {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0,
        "testSelfCycle": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "testCycle": {
          "testCustomClass": {
            "testInt": 1,
            "testLong": 10,
            "testFloat": 10.0,
            "testBoolean": false,
            "testString": "test string",
            "testDate": "2012-05-28T13:14:00.520+0000",
            "testLocalDt": "2012-05-28T13:14:00.520+0000",
            "testDecimal": 50.0,
            "testNumber": 0
          },
          "list": {},
          "stringList": [
            "测试字符串list",
            "测试字符串list"
          ],
          "set": {},
          "stringSet": [
            "测试字符串set",
            "测试字符串set"
          ],
          "map": {},
          "objMap": {
            "key1": {},
            "key2": {}
          }
        }
      },
      {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0,
        "testSelfCycle": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "testCycle": {
          "testCustomClass": {
            "testInt": 1,
            "testLong": 10,
            "testFloat": 10.0,
            "testBoolean": false,
            "testString": "test string",
            "testDate": "2012-05-28T13:14:00.520+0000",
            "testLocalDt": "2012-05-28T13:14:00.520+0000",
            "testDecimal": 50.0,
            "testNumber": 0
          },
          "list": {},
          "stringList": [
            "测试字符串list",
            "测试字符串list"
          ],
          "set": {},
          "stringSet": [
            "测试字符串set",
            "测试字符串set"
          ],
          "map": {},
          "objMap": {
            "key1": {},
            "key2": {}
          }
        }
      }
    ],
    "genericMap": {
      "key1": {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0,
        "testSelfCycle": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "testCycle": {
          "testCustomClass": {
            "testInt": 1,
            "testLong": 10,
            "testFloat": 10.0,
            "testBoolean": false,
            "testString": "test string",
            "testDate": "2012-05-28T13:14:00.520+0000",
            "testLocalDt": "2012-05-28T13:14:00.520+0000",
            "testDecimal": 50.0,
            "testNumber": 0
          },
          "list": {},
          "stringList": [
            "测试字符串list",
            "测试字符串list"
          ],
          "set": {},
          "stringSet": [
            "测试字符串set",
            "测试字符串set"
          ],
          "map": {},
          "objMap": {
            "key1": {},
            "key2": {}
          }
        }
      },
      "key2": {
        "testInt": 1,
        "testLong": 10,
        "testFloat": 10.0,
        "testBoolean": false,
        "testString": "test string",
        "testDate": "2012-05-28T13:14:00.520+0000",
        "testLocalDt": "2012-05-28T13:14:00.520+0000",
        "testDecimal": 50.0,
        "testNumber": 0,
        "testSelfCycle": {
          "testInt": 1,
          "testLong": 10,
          "testFloat": 10.0,
          "testBoolean": false,
          "testString": "test string",
          "testDate": "2012-05-28T13:14:00.520+0000",
          "testLocalDt": "2012-05-28T13:14:00.520+0000",
          "testDecimal": 50.0,
          "testNumber": 0
        },
        "testCycle": {
          "testCustomClass": {
            "testInt": 1,
            "testLong": 10,
            "testFloat": 10.0,
            "testBoolean": false,
            "testString": "test string",
            "testDate": "2012-05-28T13:14:00.520+0000",
            "testLocalDt": "2012-05-28T13:14:00.520+0000",
            "testDecimal": 50.0,
            "testNumber": 0
          },
          "list": {},
          "stringList": [
            "测试字符串list",
            "测试字符串list"
          ],
          "set": {},
          "stringSet": [
            "测试字符串set",
            "测试字符串set"
          ],
          "map": {},
          "objMap": {
            "key1": {},
            "key2": {}
          }
        }
      }
    }
  }
]
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
|└─ data     | **TestBasePojo**    |  测试泛型 |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testSelfCycle     | **TestBasePojo**    |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCycle     | **TestPojo**    |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**    |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ list     | **List**    |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**    |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**    |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**    |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**    |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**    |  测试对象Map |   |
|└─ dataList     | **List\<TestBasePojo\>**    |  测试泛型集合List |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testSelfCycle     | **TestBasePojo**    |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCycle     | **TestPojo**    |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**    |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ list     | **List**    |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**    |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**    |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**    |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**    |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**    |  测试对象Map |   |
|└─ dataSet     | **Set\<TestBasePojo\>**    |  测试泛型集合Set |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testSelfCycle     | **TestBasePojo**    |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCycle     | **TestPojo**    |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**    |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ list     | **List**    |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**    |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**    |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**    |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**    |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**    |  测试对象Map |   |
|└─ dataCollection     | **Collection\<TestBasePojo\>**    |  测试泛型集合Collection |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testSelfCycle     | **TestBasePojo**    |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCycle     | **TestPojo**    |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**    |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ list     | **List**    |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**    |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**    |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**    |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**    |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**    |  测试对象Map |   |
|└─ genericMap     | **Map\<String, TestBasePojo\>**    |  测试带泛型Map |   |
|&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testSelfCycle     | **TestBasePojo**    |  测试自我循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;└─ testCycle     | **TestPojo**    |  测试循环 |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testCustomClass     | **TestBasePojo**    |  测试普通Pojo |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testInt     | **int**    |  test int |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLong     | **long**    |  test long |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testFloat     | **float**    |  test float |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testBoolean     | **boolean**    |  test boolean |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testString     | **String**    |  test string |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDate     | **Date**    |  test date |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testLocalDt     | **LocalDateTime**    |  test localDateTime |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testDecimal     | **BigDecimal**    |  test decimal |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ testNumber     | **Number**    |  test number |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ list     | **List**    |  测试普通list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringList     | **List\<String\>**    |  测试字符串list |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ set     | **Set**    |  测试普通set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ stringSet     | **Set\<String\>**    |  测试字符串set |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ map     | **Map**    |  测试普通Map |   |
|&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;└─ objMap     | **Map\<String, Object\>**    |  测试对象Map |   |





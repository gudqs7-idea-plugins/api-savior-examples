# 目录
- 订单模块
  - 订单接口
    - [查询订单信息列表(分页)](#查询订单信息列表(分页) \[返回目录]\(#目录\))
    - [查询订单信息列表(分页)2](#查询订单信息列表(分页)2 \[返回目录]\(#目录\))
    - [查询订单信息列表(分页)3](#查询订单信息列表(分页)3 \[返回目录]\(#目录\))
  - 下单接口
    - [购买VIP](#购买VIP \[返回目录]\(#目录\))
    - [购买商品](#购买商品 \[返回目录]\(#目录\))
- 用户模块
  - user interface
    - [Query user list with pagination](#Query user list with pagination \[返回目录]\(#目录\))
    - [add a user](#add a user \[返回目录]\(#目录\))
    - [update a user](#update a user \[返回目录]\(#目录\))
    - [delete a user](#delete a user \[返回目录]\(#目录\))
  - 用户接口
    - [查询用户列表(分页)](#查询用户列表(分页) \[返回目录]\(#目录\))
    - [新增一个用户](#新增一个用户 \[返回目录]\(#目录\))
    - [更新一个用户](#更新一个用户 \[返回目录]\(#目录\))
    - [删除一个用户](#删除一个用户 \[返回目录]\(#目录\))
  - 用户VIP接口
    - [查询VIP用户信息列表(分页)](#查询VIP用户信息列表(分页) \[返回目录]\(#目录\))
    - [为用户开通VIP](#为用户开通VIP \[返回目录]\(#目录\))
    - [为用户续费VIP](#为用户续费VIP \[返回目录]\(#目录\))

# 查询订单信息列表(分页) [返回目录](#目录)

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



# 查询订单信息列表(分页)2 [返回目录](#目录)

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



# 查询订单信息列表(分页)3 [返回目录](#目录)

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




# 购买VIP [返回目录](#目录)

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



# 购买商品 [返回目录](#目录)

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




# Query user list with pagination [返回目录](#目录)

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



# add a user [返回目录](#目录)

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


# update a user [返回目录](#目录)

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


# delete a user [返回目录](#目录)

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



# 查询用户列表(分页) [返回目录](#目录)

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



# 新增一个用户 [返回目录](#目录)

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


# 更新一个用户 [返回目录](#目录)

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


# 删除一个用户 [返回目录](#目录)

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



# 查询VIP用户信息列表(分页) [返回目录](#目录)

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



# 为用户开通VIP [返回目录](#目录)

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


# 为用户续费VIP [返回目录](#目录)

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




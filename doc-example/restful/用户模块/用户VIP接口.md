# 查询VIP用户信息列表(分页)

## 请求信息

### 请求地址
```
http://172.24.144.1:7086/api/v1/vip/queryVipUsers
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
//searchKeyword:模糊搜索词125
//gender:2
//vipType:3
//firstOpenTimeStart:2022-05-09
//firstOpenTimeEnd:2022-05-09
//vipExpireTimeStart:2022-05-09
//vipExpireTimeEnd:2022-05-09

```


### 入参字段说明

| **字段** | **类型** | **必填** | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- | -------- |
| pageNumber     | **Integer**     | **是**  |  分页-当前页码 |   |
| pageSize     | **Integer**     | **是**  |  分页-分页大小 |   |
| searchKeyword     | **String**     | 否  |  模糊搜索词<br>支持用户昵称, 用户姓名, 用户手机号 |   |
| gender     | **Integer**     | 否  |  用户性别<br>0: 保密<br>1: 男<br>2: 女 |   |
| vipType     | **Integer**     | 否  |  VIP 类型<br>1:青铜<br>2:白银<br>3:黄金 |   |
| firstOpenTimeStart     | **String**     | 否  |  VIP开通时间范围-开始<br>格式: 2022-05-09 |   |
| firstOpenTimeEnd     | **Date**     | 否  |  VIP开通时间范围-结束<br>格式: 2022-05-09 |   |
| vipExpireTimeStart     | **String**     | 否  |  VIP过期时间范围-开始<br>格式: 2022-05-09 |   |
| vipExpireTimeEnd     | **Date**     | 否  |  VIP过期时间范围-结束<br>格式: 2022-05-09 |   |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息44",
  "data": [
    {
      "userId": 376,
      "vipType": 3,
      "vipExpireTime": "2022-05-13T05:10:47.696+0000",
      "vipFirstOpenTime": "2022-05-12T20:32:35.720+0000",
      "userNickName": "用户昵称67",
      "userRealName": "用户姓名86",
      "userGender": 2,
      "userAge": 18,
      "userPhone": "13123339966",
      "userEmail": "2333@163.com",
      "userAvatar": "https://img.xxx.com/xxxxxxx"
    },
    {
      "userId": 376,
      "vipType": 3,
      "vipExpireTime": "2022-05-13T05:10:47.696+0000",
      "vipFirstOpenTime": "2022-05-12T20:32:35.720+0000",
      "userNickName": "用户昵称67",
      "userRealName": "用户姓名86",
      "userGender": 2,
      "userAge": 18,
      "userPhone": "13123339966",
      "userEmail": "2333@163.com",
      "userAvatar": "https://img.xxx.com/xxxxxxx"
    }
  ],
  "totalCount": 761
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 |   |
| code     | **Integer**    |  状态码<br>200: 代表成功<br>其它代表异常 |   |
| message     | **String**    |  错误信息 |   |
| data     | **List\<VipUserResponse\>**    |  返回数据 |   |
|└─ userId     | **Long**    |  用户ID-主键 |   |
|└─ vipType     | **Integer**    |  VIP 类型<br>1:青铜<br>2:白银<br>3:黄金 |   |
|└─ vipExpireTime     | **Date**    |  VIP 过期时间 |   |
|└─ vipFirstOpenTime     | **Date**    |  VIP 首次开通时间 |   |
|└─ userNickName     | **String**    |  用户昵称 |   |
|└─ userRealName     | **String**    |  用户姓名 |   |
|└─ userGender     | **Integer**    |  用户性别<br>0:保密<br>1:男<br>2:女 |   |
|└─ userAge     | **Integer**    |  用户年龄 |   |
|└─ userPhone     | **String**    |  联系方式-手机号 |   |
|└─ userEmail     | **String**    |  联系方式-电子邮箱 |   |
|└─ userAvatar     | **String**    |  用户头像 url 地址 |   |
| totalCount     | **Long**    |  分页-总条数 |   |




# 为用户开通VIP

## 请求信息

### 请求地址
```
http://172.24.144.1:7086/api/v1/vip/openVip
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
| userId     | **Long**     | **是**  |  用户ID |   |
| vipType     | **Integer**     | **是**  |  VIP类型<br>1:青铜<br>2:白银<br>3:黄金 |   |
| openingTime     | **Integer**     | **是**  |  VIP 开通时长(单位:月) |   |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息5",
  "data": true
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 |   |
| code     | **Integer**    |  状态码<br>200: 代表成功<br>其它代表异常 |   |
| message     | **String**    |  错误信息 |   |
| data     | **Boolean**    |  返回数据 |   |



## 更多信息
### code 更多含义

| Code | 含义 | 出现原因 |
| -------- | -------- | -------- |
| **10021** | 用户余额不足 |  |
| **10022** | VIP类型不存在 |  |
| **10023** | 开通时长不能为负数 |  |


# 为用户续费VIP

## 请求信息

### 请求地址
```
http://172.24.144.1:7086/api/v1/vip/renewVip
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
| userId     | **Long**     | **是**  |  用户ID |   |
| openingTime     | **Integer**     | **是**  |  VIP 续费时长(单位:月) |   |

## 出参
### 出参示例
```json
{
  "success": true,
  "code": 200,
  "message": "错误信息58",
  "data": false
}
```


### 出参字段说明

| **字段** | **类型**  | **含义** | **其他参考信息** |
| -------- | -------- | -------- | -------- |
| success     | **Boolean**    |  请求是否成功 |   |
| code     | **Integer**    |  状态码<br>200: 代表成功<br>其它代表异常 |   |
| message     | **String**    |  错误信息 |   |
| data     | **Boolean**    |  返回数据 |   |



## 更多信息
### code 更多含义

| Code | 含义 | 出现原因 |
| -------- | -------- | -------- |
| **10021** | 用户余额不足 |  |
| **10023** | 开通时长不能为负数 |  |



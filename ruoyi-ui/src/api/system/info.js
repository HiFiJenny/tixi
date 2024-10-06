import request from '@/utils/request'

// 查询班组安全生产责任书列表
export function listInfo(query) {
  return request({
    url: '/system/info/list',
    method: 'get',
    params: query
  })
}

// 查询班组安全生产责任书详细
export function getInfo(fileId) {
  return request({
    url: '/system/info/' + fileId,
    method: 'get'
  })
}

// 新增班组安全生产责任书
export function addInfo(data) {
  return request({
    url: '/system/info',
    method: 'post',
    data: data
  })
}

// 修改班组安全生产责任书
export function updateInfo(data) {
  return request({
    url: '/system/info',
    method: 'put',
    data: data
  })
}

// 删除班组安全生产责任书
export function delInfo(fileId) {
  return request({
    url: '/system/info/' + fileId,
    method: 'delete'
  })
}

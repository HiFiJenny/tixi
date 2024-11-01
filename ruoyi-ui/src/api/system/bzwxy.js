import request from '@/utils/request'

// 查询班组危险源信息列表
export function listBzwxy(query) {
  return request({
    url: '/system/bzwxy/list',
    method: 'get',
    params: query
  })
}

// 查询班组危险源信息详细
export function getBzwxy(bzwxyId) {
  return request({
    url: '/system/bzwxy/' + bzwxyId,
    method: 'get'
  })
}

// 新增班组危险源信息
export function addBzwxy(data) {
  return request({
    url: '/system/bzwxy',
    method: 'post',
    data: data
  })
}

// 修改班组危险源信息
export function updateBzwxy(data) {
  return request({
    url: '/system/bzwxy',
    method: 'put',
    data: data
  })
}

// 删除班组危险源信息
export function delBzwxy(bzwxyId) {
  return request({
    url: '/system/bzwxy/' + bzwxyId,
    method: 'delete'
  })
}

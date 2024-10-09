import request from '@/utils/request'

// 查询MSDS信息列表
export function listMsds(query) {
  return request({
    url: '/system/msds/list',
    method: 'get',
    params: query
  })
}

// 查询MSDS信息详细
export function getMsds(msdsId) {
  return request({
    url: '/system/msds/' + msdsId,
    method: 'get'
  })
}

// 新增MSDS信息
export function addMsds(data) {
  return request({
    url: '/system/msds',
    method: 'post',
    data: data
  })
}

// 修改MSDS信息
export function updateMsds(data) {
  return request({
    url: '/system/msds',
    method: 'put',
    data: data
  })
}

// 删除MSDS信息
export function delMsds(msdsId) {
  return request({
    url: '/system/msds/' + msdsId,
    method: 'delete'
  })
}

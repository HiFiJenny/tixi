import request from '@/utils/request'

// 查询劳防用品申领记录列表
export function listLfyp(query) {
  return request({
    url: '/system/lfyp/list',
    method: 'get',
    params: query
  })
}

// 查询劳防用品申领记录详细
export function getLfyp(lfypId) {
  return request({
    url: '/system/lfyp/' + lfypId,
    method: 'get'
  })
}

// 新增劳防用品申领记录
export function addLfyp(data) {
  return request({
    url: '/system/lfyp',
    method: 'post',
    data: data
  })
}

// 修改劳防用品申领记录
export function updateLfyp(data) {
  return request({
    url: '/system/lfyp',
    method: 'put',
    data: data
  })
}

// 删除劳防用品申领记录
export function delLfyp(lfypId) {
  return request({
    url: '/system/lfyp/' + lfypId,
    method: 'delete'
  })
}

import request from '@/utils/request'

// 查询MSDS列表
export function listDoc(query) {
  return request({
    url: '/system/doc/list',
    method: 'get',
    params: query
  })
}

// 查询MSDS详细
export function getDoc(id) {
  return request({
    url: '/system/doc/' + id,
    method: 'get'
  })
}

// 新增MSDS
export function addDoc(data) {
  return request({
    url: '/system/doc',
    method: 'post',
    data: data
  })
}

// 修改MSDS
export function updateDoc(data) {
  return request({
    url: '/system/doc',
    method: 'put',
    data: data
  })
}

// 删除MSDS
export function delDoc(id) {
  return request({
    url: '/system/doc/' + id,
    method: 'delete'
  })
}

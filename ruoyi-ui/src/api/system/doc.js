import request from '@/utils/request'

// 查询班组安全生产责任书列表
export function listDoc(query) {
  return request({
    url: '/system/doc/list',
    method: 'get',
    params: query
  })
}

// 查询班组安全生产责任书详细
export function getDoc(id) {
  return request({
    url: '/system/doc/' + id,
    method: 'get'
  })
}

// 新增班组安全生产责任书
export function addDoc(data) {
  return request({
    url: '/system/doc',
    method: 'post',
    data: data
  })
}

// 修改班组安全生产责任书
export function updateDoc(data) {
  return request({
    url: '/system/doc',
    method: 'put',
    data: data
  })
}

// 删除班组安全生产责任书
export function delDoc(id) {
  return request({
    url: '/system/doc/' + id,
    method: 'delete'
  })
}

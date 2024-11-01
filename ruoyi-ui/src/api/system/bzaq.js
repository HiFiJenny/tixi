import request from '@/utils/request'

// 查询班组安全生产责任书列表
export function listBzaq(query) {
  return request({
    url: '/system/bzaq/list',
    method: 'get',
    params: query
  })
}

// 查询班组安全生产责任书详细
export function getBzaq(bzaqId) {
  return request({
    url: '/system/bzaq/' + bzaqId,
    method: 'get'
  })
}

// 新增班组安全生产责任书
export function addBzaq(data) {
  return request({
    url: '/system/bzaq',
    method: 'post',
    data: data
  })
}

// 修改班组安全生产责任书
export function updateBzaq(data) {
  return request({
    url: '/system/bzaq',
    method: 'put',
    data: data
  })
}

// 删除班组安全生产责任书
export function delBzaq(bzaqId) {
  return request({
    url: '/system/bzaq/' + bzaqId,
    method: 'delete'
  })
}

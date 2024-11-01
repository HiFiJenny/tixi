import request from '@/utils/request'

// 查询应急救援预案信息列表
export function listYjjy(query) {
  return request({
    url: '/system/yjjy/list',
    method: 'get',
    params: query
  })
}

// 查询应急救援预案信息详细
export function getYjjy(yjjyId) {
  return request({
    url: '/system/yjjy/' + yjjyId,
    method: 'get'
  })
}

// 新增应急救援预案信息
export function addYjjy(data) {
  return request({
    url: '/system/yjjy',
    method: 'post',
    data: data
  })
}

// 修改应急救援预案信息
export function updateYjjy(data) {
  return request({
    url: '/system/yjjy',
    method: 'put',
    data: data
  })
}

// 删除应急救援预案信息
export function delYjjy(yjjyId) {
  return request({
    url: '/system/yjjy/' + yjjyId,
    method: 'delete'
  })
}

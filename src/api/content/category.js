import request from '@/utils/request'

export function listCategory(query) {
  return request({
    url: '/system/category/list',
    method: 'get',
    params: query
  })
}
// 查询分类详细
export function getCategory(id) {
  return request({
    url: '/system/category/' + id,
    method: 'get'
  })
}

// 新增分类
export function addCategory(data) {
  return request({
    url: '/system/category',
    method: 'post',
    data: data
  })
}

// 修改分类
export function updateCategory(data) {
  return request({
    url: '/system/category',
    method: 'put',
    data: data
  })
}

// 删除分类
export function delCategory(categoryIds) {
  const data = typeof(categoryIds)==='string'?[categoryIds]:[...categoryIds];
  return request({
    url: '/system/category',
    method: 'delete',
    data
  })  
}



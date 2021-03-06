import  { requestGet, requestPost, requestDelete } from '@/utils/request.js';
import SERVER from './drf.js';

export const albumApi = {

  createAlbum: (data, headers) => {
    return requestPost(SERVER.URL + SERVER.ROUTES.album, data, headers);
  },
  
  getAlbumthumbnail: (data, headers) => {
    return requestGet(SERVER.URL + SERVER.ROUTES.album + `?classCode=${data.classCode}`+`&pageNum=${data.pageNum}`, headers);
  },

  
  getAlbumDetail: (data, headers) => {
    return requestGet(SERVER.URL + SERVER.ROUTES.album + `/${data.albumId}`, headers);
  },
  
  deleteAlbum: ( data,headers ) => {
    return requestDelete(SERVER.URL + SERVER.ROUTES.album + `?albumId=${data.albumId}`, headers);
  },
};

export default albumApi;
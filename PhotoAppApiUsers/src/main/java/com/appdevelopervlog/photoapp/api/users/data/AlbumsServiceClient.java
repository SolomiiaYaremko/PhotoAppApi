package com.appdevelopervlog.photoapp.api.users.data;

import com.appdevelopervlog.photoapp.api.users.ui.model.AlbumResponseModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "albums-ws")
public interface AlbumsServiceClient {

    @GetMapping("/users/{id}/albumsss")
    public List<AlbumResponseModel> getAlbums(@PathVariable String id);
}

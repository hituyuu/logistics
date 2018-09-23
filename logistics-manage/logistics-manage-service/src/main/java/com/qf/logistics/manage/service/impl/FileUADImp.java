package com.qf.logistics.manage.service.impl;

import com.qf.logistics.commons.core.JsonUtils;
import com.qf.logistics.commons.core.PropKit;
import com.qf.logistics.commons.fdfs.FastDFSFile;
import com.qf.logistics.commons.fdfs.FastDFSUtils;
import com.qf.logistics.manage.service.FileUAD;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 123 on 2018/9/10.
 */
@Service
public class FileUADImp implements FileUAD {
    @Override
    public String upLoadImg(MultipartFile file) {
        String json = null;
        Map<String, Object> map = new HashMap<>();
        String path = PropKit.use("fast-clien.conf").get("fdfs_server");
        try {
            String originalFilename = file.getOriginalFilename();
            FastDFSFile fastDFSFile = new FastDFSFile(file.getBytes(), originalFilename, file.getSize());
            String s = FastDFSUtils.uploadFile(fastDFSFile);
            System.out.println(s);
            map.put("code", 0);
            map.put("msg", "上传成功");
            Map<String, Object> dataMap = new HashMap<>();
            dataMap.put("src", path + '/'+s);
            map.put("data", dataMap);
            json= JsonUtils.objectToJson(map);
        } catch (IOException e) {
            map.put("code", 1);
            map.put("msg", "上传失败");
            json= JsonUtils.objectToJson(map);
            e.printStackTrace();

        }
        System.out.println(json);
        return json;
    }
}

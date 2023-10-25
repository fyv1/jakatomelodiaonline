package pl.fyv.jakatomelodiaonline.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class YtService {

    public String getYtIdFromUrl(String url) {
        if(url!=null && url.length()>0) {
            if(url.contains("?v="))
                return url.substring(url.indexOf("?v=")+3);

        }
        throw new IllegalArgumentException("Wrong URL");
    }
}

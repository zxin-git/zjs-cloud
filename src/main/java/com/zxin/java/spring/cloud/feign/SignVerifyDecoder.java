package com.zxin.java.spring.cloud.feign;

import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * @author zxin
 */
@AllArgsConstructor
public class SignVerifyDecoder implements Decoder {

    private Decoder decoder;

    @Override
    public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {
        //
        return decoder.decode(response, type);
    }

}

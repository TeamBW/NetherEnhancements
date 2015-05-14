package com.teambw.ne.client.proxy;

import com.jadarstudios.developercapes.DevCapes;
import com.teambw.ne.common.lib.LibMisc;
import com.teambw.ne.common.proxy.CommonProxy;

public class ClientProxy extends CommonProxy {

    @Override
    public void initCapes() {
        DevCapes.getInstance().registerConfig(LibMisc.CAPES_JSON);
    }
}

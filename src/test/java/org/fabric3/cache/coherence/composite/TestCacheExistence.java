package org.fabric3.cache.coherence.composite;

import junit.framework.TestCase;

import org.fabric3.api.annotation.Cache;
import org.fabric3.api.annotation.scope.Scopes;
import org.oasisopen.sca.annotation.EagerInit;
import org.oasisopen.sca.annotation.Scope;

import com.tangosol.net.NamedCache;

@EagerInit
@Scope(Scopes.COMPOSITE)
public class TestCacheExistence extends TestCase {

    @Cache(name = "dataIndexCache")
    protected NamedCache cache;

    @Cache(name = "dataIndexCache2")
    protected NamedCache cache2;

    public void testCacheConfiguration() throws Exception {
        assertNotNull(cache);
        assertNotNull(cache2);
    }
}
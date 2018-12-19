import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2018-12-19.
 */
public class ProductIntBooleanTest {
    
    @Test
    public void projections() {
        var product = new Product<>(1, true);
        
        assertThat(product.fst, is(1));
        assertThat(product.snd, is(true));
    }

}
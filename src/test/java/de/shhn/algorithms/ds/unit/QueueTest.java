package de.shhn.algorithms.ds.unit;


//import junit.framework.

import de.shhn.algorithms.ds.Queue;
import org.junit.Assert;
import org.junit.Test;

public class QueueTest {

    @Test
    public void testIsEpmty(){
        Queue myQueue = new Queue();

        int val_1 = 10;
        myQueue.push(val_1);

        Assert.assertEquals(myQueue.isEmpty(),false);
    }
}

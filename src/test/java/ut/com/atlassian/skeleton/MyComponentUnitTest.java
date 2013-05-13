package ut.com.atlassian.skeleton;

import org.junit.Test;
import com.atlassian.skeleton.MyPluginComponent;
import com.atlassian.skeleton.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}
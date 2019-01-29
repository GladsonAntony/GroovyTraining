package Examples

import org.testng.annotations.Test

class Test1_DataType
{

    @Test
    public void testByte() throws Exception
    {
        Byte b = 100;
        println(b.class.getName())
    }

    @Test
    public void testShort() throws Exception
    {
        Short s = 1024
        println(s.class.getName())
    }

    @Test
    public void testInteger() throws Exception
    {
        Integer i = 124123123
        println(i.class.getName())
    }

    @Test
    public void testLong() throws Exception
    {
        Long l = 1241231241.00
        println(l.class.getName())
    }

    @Test
    public void testFloat() throws Exception
    {
        Float f = 0.34f
        println(f.class.getName())
    }

    @Test
    public void testDouble() throws Exception
    {
        Double d = 1.6038473985198741d
        println(d.class.getName())
    }

    @Test
    public void testChar() throws Exception
    {
        Character c = 'a'
        println(c.class.getName())
    }
}

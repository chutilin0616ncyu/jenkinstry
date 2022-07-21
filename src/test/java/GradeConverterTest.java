import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class GradeConverterTest {

  GradeConverter g;
  @Before
  public void setUp() throws Exception {
    g=new GradeConverter();
  }

  @After
  public void tearDown() throws Exception {
    g=null;
  }

  @Test
  public void convert() {
    String expected="B";

    assertEquals(g.convert(88),expected);
  }

  @Test
  public void convert2() {
    String expected="C";

    assertEquals(g.convert(78),expected);
  }
}
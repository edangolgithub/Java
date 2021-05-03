import static org.junit.Assert.*;



import org.junit.Test;  
  
public class App {  
  
    @Test  
    public void testFindMax(){  
       assertSame(4, new Fun().name(2, 2)); 
    }  
    @Test  
    public void typo(){  
       assertEquals(3, 3); 
    }  
}  
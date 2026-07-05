import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        
        service.fetchData();
        
        verify(mockApi).getData();
    }
}

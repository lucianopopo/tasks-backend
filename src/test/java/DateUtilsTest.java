import br.ce.wcaquino.taskbackend.utils.DateUtils;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class DateUtilsTest {
    @Test
    public void deveRetornarTrueParaDatasFuturas(){
        LocalDate date = LocalDate.of(2030, 01,01);
        Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void deveRetornarFalseParaDatasPassadas(){
        LocalDate date = LocalDate.of(2010, 01,01);
        Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void deveRetornarTrueParaDatasAtual(){
        Assert.assertTrue(DateUtils.isEqualOrFutureDate(LocalDate.now()));
    }
}

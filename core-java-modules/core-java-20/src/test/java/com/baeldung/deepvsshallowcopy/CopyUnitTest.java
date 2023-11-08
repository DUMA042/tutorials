import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void givenaNewInstanceofBox_whenTheCopiedBoxisCreatedFromTheOriginalBox_thenItIsShallowCopy() {
        Box originalBox = new Box(new Oranges(10));
        Box copiedBox = new Box(originalBox);
        copiedBox.setOrangesShallow(new Oranges(20));
        int originalOranges = originalBox.getOranges().getOrangeNumbers()
        assertEquals(20, originalOranges);
    }

    @Test
    public void givenaNewInstanceofBox_whenTheCopiedBoxisCreatedUsingMemberVariablesInTheOriginal_thenItIsDeepCopy() {
        Box originalBox = new Box(new Oranges(10));
        Box copiedBox = new Boxy(originalBox);
        copiedBox.setOrangesDeep(new Oranges(15))
        int originalOranges = originalBox.getOranges().getOrangeNumbers()
        assertEquals(10, originalOranges);
    }
}

import com.google.common.collect.Lists;
import com.ibm.icu.lang.UCharacter;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.Bidi;
import com.ibm.icu.text.BidiRun;
import java.util.List;

public class gro {
   public static aya a(xe $$0, boolean $$1) {
      xx $$2 = xx.a($$0, UCharacter::getMirror, gro::a);
      Bidi $$3 = new Bidi($$2.a(), $$1 ? 127 : 126);
      $$3.setReorderingMode(0);
      List<aya> $$4 = Lists.newArrayList();
      int $$5 = $$3.countRuns();

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         BidiRun $$7 = $$3.getVisualRun($$6);
         $$4.addAll($$2.a($$7.getStart(), $$7.getLength(), $$7.isOddRun()));
      }

      return aya.composite($$4);
   }

   private static String a(String $$0) {
      try {
         return new ArabicShaping(8).shape($$0);
      } catch (Exception var2) {
         return $$0;
      }
   }
}

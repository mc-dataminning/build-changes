import com.google.common.collect.Lists;
import com.ibm.icu.lang.UCharacter;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.Bidi;
import com.ibm.icu.text.BidiRun;
import java.util.List;

public class gaf {
   public static arn a(tq $$0, boolean $$1) {
      uj $$2 = uj.a($$0, UCharacter::getMirror, gaf::a);
      Bidi $$3 = new Bidi($$2.a(), $$1 ? 127 : 126);
      $$3.setReorderingMode(0);
      List<arn> $$4 = Lists.newArrayList();
      int $$5 = $$3.countRuns();

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         BidiRun $$7 = $$3.getVisualRun($$6);
         $$4.addAll($$2.a($$7.getStart(), $$7.getLength(), $$7.isOddRun()));
      }

      return arn.composite($$4);
   }

   private static String a(String $$0) {
      try {
         return new ArabicShaping(8).shape($$0);
      } catch (Exception var2) {
         return $$0;
      }
   }
}

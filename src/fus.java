import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fus {
   private static final azc a = azc.codepoint(32, xz.a);

   private static String a(String $$0) {
      return frf.Q().n.N().c() ? $$0 : o.a($$0);
   }

   public static List<azc> a(xh $$0, int $$1, ftx $$2) {
      fqt $$3 = new fqt();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(xh.a(a($$2x), $$1x));
         return Optional.empty();
      }, xz.a);
      List<azc> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, xz.a, ($$1x, $$2x) -> {
         azc $$3x = tv.a().a($$1x);
         $$4.add($$2x ? azc.composite(a, $$3x) : $$3x);
      });
      return (List<azc>)($$4.isEmpty() ? Lists.newArrayList(new azc[]{azc.a}) : $$4);
   }
}

import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class fyu {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final aew d = new aew("missingno");
   private static final anv e = new anv.a().a(gap.a, new gap(ImmutableList.of(new gao(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static fyr f;

   private static ekq a(int $$0, int $$1) {
      ekq $$2 = new ekq($$0, $$1, false);
      int $$3 = -16777216;
      int $$4 = -524040;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         for (int $$6 = 0; $$6 < $$0; $$6++) {
            if ($$5 < $$1 / 2 ^ $$6 < $$0 / 2) {
               $$2.a($$6, $$5, -524040);
            } else {
               $$2.a($$6, $$5, -16777216);
            }
         }
      }

      return $$2;
   }

   public static fyy a() {
      ekq $$0 = a(16, 16);
      return new fyy(d, new gar(16, 16), $$0, e);
   }

   public static aew b() {
      return d;
   }

   public static fyr c() {
      if (f == null) {
         ekq $$0 = a(16, 16);
         $$0.i();
         f = new fyr($$0);
         eqv.O().Y().a(d, f);
      }

      return f;
   }
}

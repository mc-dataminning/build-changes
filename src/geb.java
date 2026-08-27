import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class geb {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final ahg d = new ahg("missingno");
   private static final aqj e = new aqj.a().a(gfv.a, new gfv(ImmutableList.of(new gfu(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gdy f;

   private static epa a(int $$0, int $$1) {
      epa $$2 = new epa($$0, $$1, false);
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

   public static gef a() {
      epa $$0 = a(16, 16);
      return new gef(d, new gfx(16, 16), $$0, e);
   }

   public static ahg b() {
      return d;
   }

   public static gdy c() {
      if (f == null) {
         epa $$0 = a(16, 16);
         $$0.i();
         f = new gdy($$0);
         evg.O().Y().a(d, f);
      }

      return f;
   }
}

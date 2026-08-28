import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class hba {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final alz d = alz.b("missingno");
   private static final avx e = new avx.a().a(hcw.a, new hcw(ImmutableList.of(new hcv(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static hax f;

   private static ffr a(int $$0, int $$1) {
      ffr $$2 = new ffr($$0, $$1, false);
      int $$3 = -524040;

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         for (int $$5 = 0; $$5 < $$0; $$5++) {
            if ($$4 < $$1 / 2 ^ $$5 < $$0 / 2) {
               $$2.a($$5, $$4, -524040);
            } else {
               $$2.a($$5, $$4, -16777216);
            }
         }
      }

      return $$2;
   }

   public static hbe a() {
      ffr $$0 = a(16, 16);
      return new hbe(d, new hcy(16, 16), $$0, e);
   }

   public static alz b() {
      return d;
   }

   public static hax c() {
      if (f == null) {
         ffr $$0 = a(16, 16);
         $$0.i();
         f = new hax($$0);
         fmf.Q().aa().a(d, f);
      }

      return f;
   }
}

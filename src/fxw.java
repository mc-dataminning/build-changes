import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class fxw {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final aep d = new aep("missingno");
   private static final anm e = new anm.a().a(fzr.a, new fzr(ImmutableList.of(new fzq(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static fxt f;

   private static eki a(int $$0, int $$1) {
      eki $$2 = new eki($$0, $$1, false);
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

   public static fya a() {
      eki $$0 = a(16, 16);
      return new fya(d, new fzt(16, 16), $$0, e);
   }

   public static aep b() {
      return d;
   }

   public static fxt c() {
      if (f == null) {
         eki $$0 = a(16, 16);
         $$0.i();
         f = new fxt($$0);
         eqn.N().X().a(d, f);
      }

      return f;
   }
}

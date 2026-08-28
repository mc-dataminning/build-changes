import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gwr {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final alc d = alc.b("missingno");
   private static final auv e = new auv.a().a(gyn.a, new gyn(ImmutableList.of(new gym(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gwo f;

   private static fce a(int $$0, int $$1) {
      fce $$2 = new fce($$0, $$1, false);
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

   public static gwv a() {
      fce $$0 = a(16, 16);
      return new gwv(d, new gyp(16, 16), $$0, e);
   }

   public static alc b() {
      return d;
   }

   public static gwo c() {
      if (f == null) {
         fce $$0 = a(16, 16);
         $$0.i();
         f = new gwo($$0);
         fil.Q().aa().a(d, f);
      }

      return f;
   }
}

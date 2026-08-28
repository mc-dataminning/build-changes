import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gww {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final ale d = ale.b("missingno");
   private static final auy e = new auy.a().a(gys.a, new gys(ImmutableList.of(new gyr(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gwt f;

   private static fci a(int $$0, int $$1) {
      fci $$2 = new fci($$0, $$1, false);
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

   public static gxa a() {
      fci $$0 = a(16, 16);
      return new gxa(d, new gyu(16, 16), $$0, e);
   }

   public static ale b() {
      return d;
   }

   public static gwt c() {
      if (f == null) {
         fci $$0 = a(16, 16);
         $$0.i();
         f = new gwt($$0);
         fip.Q().aa().a(d, f);
      }

      return f;
   }
}

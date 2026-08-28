import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gxt {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final ali d = ali.b("missingno");
   private static final avd e = new avd.a().a(gzp.a, new gzp(ImmutableList.of(new gzo(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gxq f;

   private static fdb a(int $$0, int $$1) {
      fdb $$2 = new fdb($$0, $$1, false);
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

   public static gxx a() {
      fdb $$0 = a(16, 16);
      return new gxx(d, new gzr(16, 16), $$0, e);
   }

   public static ali b() {
      return d;
   }

   public static gxq c() {
      if (f == null) {
         fdb $$0 = a(16, 16);
         $$0.i();
         f = new gxq($$0);
         fji.Q().aa().a(d, f);
      }

      return f;
   }
}

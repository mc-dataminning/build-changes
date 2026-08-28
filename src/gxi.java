import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gxi {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final alh d = alh.b("missingno");
   private static final avc e = new avc.a().a(gze.a, new gze(ImmutableList.of(new gzd(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gxf f;

   private static fct a(int $$0, int $$1) {
      fct $$2 = new fct($$0, $$1, false);
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

   public static gxm a() {
      fct $$0 = a(16, 16);
      return new gxm(d, new gzg(16, 16), $$0, e);
   }

   public static alh b() {
      return d;
   }

   public static gxf c() {
      if (f == null) {
         fct $$0 = a(16, 16);
         $$0.i();
         f = new gxf($$0);
         fja.Q().aa().a(d, f);
      }

      return f;
   }
}

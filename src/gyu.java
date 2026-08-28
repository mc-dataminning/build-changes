import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gyu {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final alj d = alj.b("missingno");
   private static final avf e = new avf.a().a(haq.a, new haq(ImmutableList.of(new hap(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gyr f;

   private static fdr a(int $$0, int $$1) {
      fdr $$2 = new fdr($$0, $$1, false);
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

   public static gyy a() {
      fdr $$0 = a(16, 16);
      return new gyy(d, new has(16, 16), $$0, e);
   }

   public static alj b() {
      return d;
   }

   public static gyr c() {
      if (f == null) {
         fdr $$0 = a(16, 16);
         $$0.i();
         f = new gyr($$0);
         fke.Q().aa().a(d, f);
      }

      return f;
   }
}

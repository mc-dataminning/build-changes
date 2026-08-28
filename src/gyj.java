import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gyj {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final all d = all.b("missingno");
   private static final avg e = new avg.a().a(haf.a, new haf(ImmutableList.of(new hae(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gyg f;

   private static fdk a(int $$0, int $$1) {
      fdk $$2 = new fdk($$0, $$1, false);
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

   public static gyn a() {
      fdk $$0 = a(16, 16);
      return new gyn(d, new hah(16, 16), $$0, e);
   }

   public static all b() {
      return d;
   }

   public static gyg c() {
      if (f == null) {
         fdk $$0 = a(16, 16);
         $$0.i();
         f = new gyg($$0);
         fjx.Q().aa().a(d, f);
      }

      return f;
   }
}

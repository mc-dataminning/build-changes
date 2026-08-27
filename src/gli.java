import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gli {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final ajv d = new ajv("missingno");
   private static final atg e = new atg.a().a(gnc.a, new gnc(ImmutableList.of(new gnb(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static glf f;

   private static evs a(int $$0, int $$1) {
      evs $$2 = new evs($$0, $$1, false);
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

   public static glm a() {
      evs $$0 = a(16, 16);
      return new glm(d, new gne(16, 16), $$0, e);
   }

   public static ajv b() {
      return d;
   }

   public static glf c() {
      if (f == null) {
         evs $$0 = a(16, 16);
         $$0.i();
         f = new glf($$0);
         fby.Q().aa().a(d, f);
      }

      return f;
   }
}

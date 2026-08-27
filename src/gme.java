import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gme {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final akf d = new akf("missingno");
   private static final atq e = new atq.a().a(gny.a, new gny(ImmutableList.of(new gnx(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gmb f;

   private static ewo a(int $$0, int $$1) {
      ewo $$2 = new ewo($$0, $$1, false);
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

   public static gmi a() {
      ewo $$0 = a(16, 16);
      return new gmi(d, new goa(16, 16), $$0, e);
   }

   public static akf b() {
      return d;
   }

   public static gmb c() {
      if (f == null) {
         ewo $$0 = a(16, 16);
         $$0.i();
         f = new gmb($$0);
         fcu.Q().aa().a(d, f);
      }

      return f;
   }
}

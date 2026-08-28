import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gpz {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final akr d = akr.b("missingno");
   private static final aug e = new aug.a().a(gru.a, new gru(ImmutableList.of(new grt(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gpw f;

   private static fah a(int $$0, int $$1) {
      fah $$2 = new fah($$0, $$1, false);
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

   public static gqd a() {
      fah $$0 = a(16, 16);
      return new gqd(d, new grw(16, 16), $$0, e);
   }

   public static akr b() {
      return d;
   }

   public static gpw c() {
      if (f == null) {
         fah $$0 = a(16, 16);
         $$0.i();
         f = new gpw($$0);
         fgm.Q().aa().a(d, f);
      }

      return f;
   }
}

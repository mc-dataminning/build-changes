import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gnl {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final akn d = new akn("missingno");
   private static final atz e = new atz.a().a(gpg.a, new gpg(ImmutableList.of(new gpf(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gni f;

   private static exv a(int $$0, int $$1) {
      exv $$2 = new exv($$0, $$1, false);
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

   public static gnp a() {
      exv $$0 = a(16, 16);
      return new gnp(d, new gpi(16, 16), $$0, e);
   }

   public static akn b() {
      return d;
   }

   public static gni c() {
      if (f == null) {
         exv $$0 = a(16, 16);
         $$0.i();
         f = new gni($$0);
         feb.Q().aa().a(d, f);
      }

      return f;
   }
}

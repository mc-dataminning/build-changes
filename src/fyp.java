import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class fyp {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final aeu d = new aeu("missingno");
   private static final anr e = new anr.a().a(gak.a, new gak(ImmutableList.of(new gaj(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static fym f;

   private static ekl a(int $$0, int $$1) {
      ekl $$2 = new ekl($$0, $$1, false);
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

   public static fyt a() {
      ekl $$0 = a(16, 16);
      return new fyt(d, new gam(16, 16), $$0, e);
   }

   public static aeu b() {
      return d;
   }

   public static fym c() {
      if (f == null) {
         ekl $$0 = a(16, 16);
         $$0.i();
         f = new fym($$0);
         eqq.O().Y().a(d, f);
      }

      return f;
   }
}

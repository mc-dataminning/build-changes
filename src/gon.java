import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gon {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final ale d = new ale("missingno");
   private static final auq e = new auq.a().a(gqi.a, new gqi(ImmutableList.of(new gqh(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gok f;

   private static eyx a(int $$0, int $$1) {
      eyx $$2 = new eyx($$0, $$1, false);
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

   public static gor a() {
      eyx $$0 = a(16, 16);
      return new gor(d, new gqk(16, 16), $$0, e);
   }

   public static ale b() {
      return d;
   }

   public static gok c() {
      if (f == null) {
         eyx $$0 = a(16, 16);
         $$0.i();
         f = new gok($$0);
         ffd.Q().aa().a(d, f);
      }

      return f;
   }
}

import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gkz {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final ajt d = new ajt("missingno");
   private static final ate e = new ate.a().a(gmt.a, new gmt(ImmutableList.of(new gms(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gkw f;

   private static evj a(int $$0, int $$1) {
      evj $$2 = new evj($$0, $$1, false);
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

   public static gld a() {
      evj $$0 = a(16, 16);
      return new gld(d, new gmv(16, 16), $$0, e);
   }

   public static ajt b() {
      return d;
   }

   public static gkw c() {
      if (f == null) {
         evj $$0 = a(16, 16);
         $$0.i();
         f = new gkw($$0);
         fbp.Q().aa().a(d, f);
      }

      return f;
   }
}

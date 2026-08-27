import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gbp {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final agm d = new agm("missingno");
   private static final apn e = new apn.a().a(gdk.a, new gdk(ImmutableList.of(new gdj(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gbm f;

   private static enc a(int $$0, int $$1) {
      enc $$2 = new enc($$0, $$1, false);
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

   public static gbt a() {
      enc $$0 = a(16, 16);
      return new gbt(d, new gdm(16, 16), $$0, e);
   }

   public static agm b() {
      return d;
   }

   public static gbm c() {
      if (f == null) {
         enc $$0 = a(16, 16);
         $$0.i();
         f = new gbm($$0);
         eti.N().X().a(d, f);
      }

      return f;
   }
}

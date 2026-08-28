import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gpg {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final akk d = new akk("missingno");
   private static final aty e = new aty.a().a(grb.a, new grb(ImmutableList.of(new gra(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gpd f;

   private static ezp a(int $$0, int $$1) {
      ezp $$2 = new ezp($$0, $$1, false);
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

   public static gpk a() {
      ezp $$0 = a(16, 16);
      return new gpk(d, new grd(16, 16), $$0, e);
   }

   public static akk b() {
      return d;
   }

   public static gpd c() {
      if (f == null) {
         ezp $$0 = a(16, 16);
         $$0.i();
         f = new gpd($$0);
         ffw.Q().aa().a(d, f);
      }

      return f;
   }
}

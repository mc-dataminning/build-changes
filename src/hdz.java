import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class hdz {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final aku d = aku.b("missingno");
   private static final aur e = new aur.a().a(hfv.a, new hfv(ImmutableList.of(new hfu(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static hdw f;

   private static feu a(int $$0, int $$1) {
      feu $$2 = new feu($$0, $$1, false);
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

   public static hed a() {
      feu $$0 = a(16, 16);
      return new hed(d, new hfx(16, 16), $$0, e);
   }

   public static aku b() {
      return d;
   }

   public static hdw c() {
      if (f == null) {
         feu $$0 = a(16, 16);
         $$0.i();
         f = new hdw($$0);
         flj.Q().aa().a(d, f);
      }

      return f;
   }
}

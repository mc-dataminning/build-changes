import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class fyw {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final aey d = new aey("missingno");
   private static final anx e = new anx.a().a(gar.a, new gar(ImmutableList.of(new gaq(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static fyt f;

   private static eks a(int $$0, int $$1) {
      eks $$2 = new eks($$0, $$1, false);
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

   public static fza a() {
      eks $$0 = a(16, 16);
      return new fza(d, new gat(16, 16), $$0, e);
   }

   public static aey b() {
      return d;
   }

   public static fyt c() {
      if (f == null) {
         eks $$0 = a(16, 16);
         $$0.i();
         f = new fyt($$0);
         eqx.O().Y().a(d, f);
      }

      return f;
   }
}

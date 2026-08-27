import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class ger {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final ahh d = new ahh("missingno");
   private static final aql e = new aql.a().a(ggl.a, new ggl(ImmutableList.of(new ggk(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static geo f;

   private static epl a(int $$0, int $$1) {
      epl $$2 = new epl($$0, $$1, false);
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

   public static gev a() {
      epl $$0 = a(16, 16);
      return new gev(d, new ggn(16, 16), $$0, e);
   }

   public static ahh b() {
      return d;
   }

   public static geo c() {
      if (f == null) {
         epl $$0 = a(16, 16);
         $$0.i();
         f = new geo($$0);
         evr.O().Y().a(d, f);
      }

      return f;
   }
}

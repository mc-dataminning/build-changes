import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class ged {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final ahg d = new ahg("missingno");
   private static final aqk e = new aqk.a().a(gfx.a, new gfx(ImmutableList.of(new gfw(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gea f;

   private static epc a(int $$0, int $$1) {
      epc $$2 = new epc($$0, $$1, false);
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

   public static geh a() {
      epc $$0 = a(16, 16);
      return new geh(d, new gfz(16, 16), $$0, e);
   }

   public static ahg b() {
      return d;
   }

   public static gea c() {
      if (f == null) {
         epc $$0 = a(16, 16);
         $$0.i();
         f = new gea($$0);
         evi.O().Y().a(d, f);
      }

      return f;
   }
}

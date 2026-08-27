import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gec {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final ahg d = new ahg("missingno");
   private static final aqj e = new aqj.a().a(gfw.a, new gfw(ImmutableList.of(new gfv(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gdz f;

   private static epb a(int $$0, int $$1) {
      epb $$2 = new epb($$0, $$1, false);
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

   public static geg a() {
      epb $$0 = a(16, 16);
      return new geg(d, new gfy(16, 16), $$0, e);
   }

   public static ahg b() {
      return d;
   }

   public static gdz c() {
      if (f == null) {
         epb $$0 = a(16, 16);
         $$0.i();
         f = new gdz($$0);
         evh.O().Y().a(d, f);
      }

      return f;
   }
}

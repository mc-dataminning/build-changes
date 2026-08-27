import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gdv {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final ahd d = new ahd("missingno");
   private static final aqe e = new aqe.a().a(gfq.a, new gfq(ImmutableList.of(new gfp(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gds f;

   private static eou a(int $$0, int $$1) {
      eou $$2 = new eou($$0, $$1, false);
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

   public static gdz a() {
      eou $$0 = a(16, 16);
      return new gdz(d, new gfs(16, 16), $$0, e);
   }

   public static ahd b() {
      return d;
   }

   public static gds c() {
      if (f == null) {
         eou $$0 = a(16, 16);
         $$0.i();
         f = new gds($$0);
         eva.N().X().a(d, f);
      }

      return f;
   }
}

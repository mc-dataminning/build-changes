import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class ghp {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final ajc d = new ajc("missingno");
   private static final ash e = new ash.a().a(gjj.a, new gjj(ImmutableList.of(new gji(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static ghm f;

   private static ese a(int $$0, int $$1) {
      ese $$2 = new ese($$0, $$1, false);
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

   public static ght a() {
      ese $$0 = a(16, 16);
      return new ght(d, new gjl(16, 16), $$0, e);
   }

   public static ajc b() {
      return d;
   }

   public static ghm c() {
      if (f == null) {
         ese $$0 = a(16, 16);
         $$0.i();
         f = new ghm($$0);
         eyk.P().Z().a(d, f);
      }

      return f;
   }
}

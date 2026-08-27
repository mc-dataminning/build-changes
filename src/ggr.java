import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class ggr {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final aiy d = new aiy("missingno");
   private static final asd e = new asd.a().a(gil.a, new gil(ImmutableList.of(new gik(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static ggo f;

   private static eri a(int $$0, int $$1) {
      eri $$2 = new eri($$0, $$1, false);
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

   public static ggv a() {
      eri $$0 = a(16, 16);
      return new ggv(d, new gin(16, 16), $$0, e);
   }

   public static aiy b() {
      return d;
   }

   public static ggo c() {
      if (f == null) {
         eri $$0 = a(16, 16);
         $$0.i();
         f = new ggo($$0);
         exo.P().Z().a(d, f);
      }

      return f;
   }
}

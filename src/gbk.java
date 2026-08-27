import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gbk {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final agi d = new agi("missingno");
   private static final apj e = new apj.a().a(gdf.a, new gdf(ImmutableList.of(new gde(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gbh f;

   private static emx a(int $$0, int $$1) {
      emx $$2 = new emx($$0, $$1, false);
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

   public static gbo a() {
      emx $$0 = a(16, 16);
      return new gbo(d, new gdh(16, 16), $$0, e);
   }

   public static agi b() {
      return d;
   }

   public static gbh c() {
      if (f == null) {
         emx $$0 = a(16, 16);
         $$0.i();
         f = new gbh($$0);
         etd.N().X().a(d, f);
      }

      return f;
   }
}

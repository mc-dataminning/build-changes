import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gmo {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final akh d = new akh("missingno");
   private static final att e = new att.a().a(goj.a, new goj(ImmutableList.of(new goi(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gml f;

   private static ewy a(int $$0, int $$1) {
      ewy $$2 = new ewy($$0, $$1, false);
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

   public static gms a() {
      ewy $$0 = a(16, 16);
      return new gms(d, new gol(16, 16), $$0, e);
   }

   public static akh b() {
      return d;
   }

   public static gml c() {
      if (f == null) {
         ewy $$0 = a(16, 16);
         $$0.i();
         f = new gml($$0);
         fde.Q().aa().a(d, f);
      }

      return f;
   }
}

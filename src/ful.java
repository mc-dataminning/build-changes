import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class ful {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final acq d = new acq("missingno");
   private static final fwe e = new fwe(ImmutableList.of(new fwd(0, -1)), 16, 16, 1, false);
   @Nullable
   private static fui f;

   private static ehk a(int $$0, int $$1) {
      ehk $$2 = new ehk($$0, $$1, false);
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

   public static fup a() {
      ehk $$0 = a(16, 16);
      return new fup(d, new fwg(16, 16), $$0, e);
   }

   public static acq b() {
      return d;
   }

   public static fui c() {
      if (f == null) {
         ehk $$0 = a(16, 16);
         $$0.i();
         f = new fui($$0);
         enn.N().X().a(d, f);
      }

      return f;
   }
}

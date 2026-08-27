import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gde {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final agt d = new agt("missingno");
   private static final apu e = new apu.a().a(gez.a, new gez(ImmutableList.of(new gey(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gdb f;

   private static eoe a(int $$0, int $$1) {
      eoe $$2 = new eoe($$0, $$1, false);
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

   public static gdi a() {
      eoe $$0 = a(16, 16);
      return new gdi(d, new gfb(16, 16), $$0, e);
   }

   public static agt b() {
      return d;
   }

   public static gdb c() {
      if (f == null) {
         eoe $$0 = a(16, 16);
         $$0.i();
         f = new gdb($$0);
         euk.N().X().a(d, f);
      }

      return f;
   }
}

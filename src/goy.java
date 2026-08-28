import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class goy {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final akk d = new akk("missingno");
   private static final atw e = new atw.a().a(gqt.a, new gqt(ImmutableList.of(new gqs(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gov f;

   private static ezh a(int $$0, int $$1) {
      ezh $$2 = new ezh($$0, $$1, false);
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

   public static gpc a() {
      ezh $$0 = a(16, 16);
      return new gpc(d, new gqv(16, 16), $$0, e);
   }

   public static akk b() {
      return d;
   }

   public static gov c() {
      if (f == null) {
         ezh $$0 = a(16, 16);
         $$0.i();
         f = new gov($$0);
         ffn.Q().aa().a(d, f);
      }

      return f;
   }
}

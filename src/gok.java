import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gok {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final alb d = new alb("missingno");
   private static final aun e = new aun.a().a(gqf.a, new gqf(ImmutableList.of(new gqe(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static goh f;

   private static eyu a(int $$0, int $$1) {
      eyu $$2 = new eyu($$0, $$1, false);
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

   public static goo a() {
      eyu $$0 = a(16, 16);
      return new goo(d, new gqh(16, 16), $$0, e);
   }

   public static alb b() {
      return d;
   }

   public static goh c() {
      if (f == null) {
         eyu $$0 = a(16, 16);
         $$0.i();
         f = new goh($$0);
         ffa.Q().aa().a(d, f);
      }

      return f;
   }
}

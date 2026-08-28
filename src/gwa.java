import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gwa {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final alb d = alb.b("missingno");
   private static final auu e = new auu.a().a(gxw.a, new gxw(ImmutableList.of(new gxv(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gvx f;

   private static fbp a(int $$0, int $$1) {
      fbp $$2 = new fbp($$0, $$1, false);
      int $$3 = -524040;

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         for (int $$5 = 0; $$5 < $$0; $$5++) {
            if ($$4 < $$1 / 2 ^ $$5 < $$0 / 2) {
               $$2.a($$5, $$4, -524040);
            } else {
               $$2.a($$5, $$4, -16777216);
            }
         }
      }

      return $$2;
   }

   public static gwe a() {
      fbp $$0 = a(16, 16);
      return new gwe(d, new gxy(16, 16), $$0, e);
   }

   public static alb b() {
      return d;
   }

   public static gvx c() {
      if (f == null) {
         fbp $$0 = a(16, 16);
         $$0.i();
         f = new gvx($$0);
         fib.Q().aa().a(d, f);
      }

      return f;
   }
}

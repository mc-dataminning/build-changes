import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gpv {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final akq d = akq.b("missingno");
   private static final auf e = new auf.a().a(grq.a, new grq(ImmutableList.of(new grp(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gps f;

   private static fad a(int $$0, int $$1) {
      fad $$2 = new fad($$0, $$1, false);
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

   public static gpz a() {
      fad $$0 = a(16, 16);
      return new gpz(d, new grs(16, 16), $$0, e);
   }

   public static akq b() {
      return d;
   }

   public static gps c() {
      if (f == null) {
         fad $$0 = a(16, 16);
         $$0.i();
         f = new gps($$0);
         fgi.Q().aa().a(d, f);
      }

      return f;
   }
}

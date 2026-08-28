import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class haw {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final alp d = alp.b("missingno");
   private static final avn e = new avn.a().a(hcs.a, new hcs(ImmutableList.of(new hcr(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static hat f;

   private static ffl a(int $$0, int $$1) {
      ffl $$2 = new ffl($$0, $$1, false);
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

   public static hba a() {
      ffl $$0 = a(16, 16);
      return new hba(d, new hcu(16, 16), $$0, e);
   }

   public static alp b() {
      return d;
   }

   public static hat c() {
      if (f == null) {
         ffl $$0 = a(16, 16);
         $$0.i();
         f = new hat($$0);
         flz.Q().aa().a(d, f);
      }

      return f;
   }
}

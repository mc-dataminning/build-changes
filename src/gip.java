import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gip {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final ajh d = new ajh("missingno");
   private static final asq e = new asq.a().a(gkj.a, new gkj(ImmutableList.of(new gki(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static gim f;

   private static eta a(int $$0, int $$1) {
      eta $$2 = new eta($$0, $$1, false);
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

   public static git a() {
      eta $$0 = a(16, 16);
      return new git(d, new gkl(16, 16), $$0, e);
   }

   public static ajh b() {
      return d;
   }

   public static gim c() {
      if (f == null) {
         eta $$0 = a(16, 16);
         $$0.i();
         f = new gim($$0);
         ezg.Q().aa().a(d, f);
      }

      return f;
   }
}

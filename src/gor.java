import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class gor {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final alf d = new alf("missingno");
   private static final aur e = new aur.a().a(gqm.a, new gqm(ImmutableList.of(new gql(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static goo f;

   private static ezb a(int $$0, int $$1) {
      ezb $$2 = new ezb($$0, $$1, false);
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

   public static gov a() {
      ezb $$0 = a(16, 16);
      return new gov(d, new gqo(16, 16), $$0, e);
   }

   public static alf b() {
      return d;
   }

   public static goo c() {
      if (f == null) {
         ezb $$0 = a(16, 16);
         $$0.i();
         f = new goo($$0);
         ffh.Q().aa().a(d, f);
      }

      return f;
   }
}

import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class ggk {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final aiy d = new aiy("missingno");
   private static final asc e = new asc.a().a(gie.a, new gie(ImmutableList.of(new gid(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static ggh f;

   private static erb a(int $$0, int $$1) {
      erb $$2 = new erb($$0, $$1, false);
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

   public static ggo a() {
      erb $$0 = a(16, 16);
      return new ggo(d, new gig(16, 16), $$0, e);
   }

   public static aiy b() {
      return d;
   }

   public static ggh c() {
      if (f == null) {
         erb $$0 = a(16, 16);
         $$0.i();
         f = new ggh($$0);
         exh.O().Y().a(d, f);
      }

      return f;
   }
}

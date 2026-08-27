import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class ggj {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final aiy d = new aiy("missingno");
   private static final asc e = new asc.a().a(gid.a, new gid(ImmutableList.of(new gic(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static ggg f;

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

   public static ggn a() {
      erb $$0 = a(16, 16);
      return new ggn(d, new gif(16, 16), $$0, e);
   }

   public static aiy b() {
      return d;
   }

   public static ggg c() {
      if (f == null) {
         erb $$0 = a(16, 16);
         $$0.i();
         f = new ggg($$0);
         exh.O().Y().a(d, f);
      }

      return f;
   }
}

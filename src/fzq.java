import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;

public final class fzq {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final afw d = new afw("missingno");
   private static final aov e = new aov.a().a(gbl.a, new gbl(ImmutableList.of(new gbk(0, -1)), 16, 16, 1, false)).a();
   @Nullable
   private static fzn f;

   private static eli a(int $$0, int $$1) {
      eli $$2 = new eli($$0, $$1, false);
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

   public static fzu a() {
      eli $$0 = a(16, 16);
      return new fzu(d, new gbn(16, 16), $$0, e);
   }

   public static afw b() {
      return d;
   }

   public static fzn c() {
      if (f == null) {
         eli $$0 = a(16, 16);
         $$0.i();
         f = new fzn($$0);
         ero.O().Y().a(d, f);
      }

      return f;
   }
}

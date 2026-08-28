import java.util.List;
import javax.annotation.Nullable;

public class fvj implements fxw {
   private static final int a = 170;
   private final xg b;
   @Nullable
   private List<azk> c;
   @Nullable
   private tv d;
   @Nullable
   private final xg e;

   private fvj(xg $$0, @Nullable xg $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fvj a(xg $$0, @Nullable xg $$1) {
      return new fvj($$0, $$1);
   }

   public static fvj a(xg $$0) {
      return new fvj($$0, $$0);
   }

   @Override
   public void b(fxv $$0) {
      if (this.e != null) {
         $$0.a(fxu.c, this.e);
      }
   }

   public List<azk> a(fqq $$0) {
      tv $$1 = tv.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<azk> a(fqq $$0, xg $$1) {
      return $$0.h.c($$1, 170);
   }
}

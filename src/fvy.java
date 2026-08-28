import java.util.List;
import javax.annotation.Nullable;

public class fvy implements fyl {
   private static final int a = 170;
   private final xc b;
   @Nullable
   private List<azc> c;
   @Nullable
   private tv d;
   @Nullable
   private final xc e;

   private fvy(xc $$0, @Nullable xc $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fvy a(xc $$0, @Nullable xc $$1) {
      return new fvy($$0, $$1);
   }

   public static fvy a(xc $$0) {
      return new fvy($$0, $$0);
   }

   @Override
   public void b(fyk $$0) {
      if (this.e != null) {
         $$0.a(fyj.c, this.e);
      }
   }

   public List<azc> a(frf $$0) {
      tv $$1 = tv.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<azc> a(frf $$0, xc $$1) {
      return $$0.h.c($$1, 170);
   }
}

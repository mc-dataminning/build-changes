import java.util.List;
import javax.annotation.Nullable;

public class fvw implements fyj {
   private static final int a = 170;
   private final xa b;
   @Nullable
   private List<aza> c;
   @Nullable
   private tu d;
   @Nullable
   private final xa e;

   private fvw(xa $$0, @Nullable xa $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fvw a(xa $$0, @Nullable xa $$1) {
      return new fvw($$0, $$1);
   }

   public static fvw a(xa $$0) {
      return new fvw($$0, $$0);
   }

   @Override
   public void b(fyi $$0) {
      if (this.e != null) {
         $$0.a(fyh.c, this.e);
      }
   }

   public List<aza> a(frd $$0) {
      tu $$1 = tu.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<aza> a(frd $$0, xa $$1) {
      return $$0.h.c($$1, 170);
   }
}

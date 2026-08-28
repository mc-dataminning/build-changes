import javax.annotation.Nullable;

public class hhj implements hhm {
   private static final int a = 600;
   private static final xk b = xk.c("tutorial.open_inventory.title");
   private static final xk c = xk.a("tutorial.open_inventory.description", hhl.a("inventory"));
   private final hhl d;
   @Nullable
   private fql e;
   private int f;

   public hhj(hhl $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hhn.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            flz $$0 = this.d.e();
            this.e = new fql($$0.h, fql.a.d, b, c, false);
            $$0.aA().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.d();
         this.e = null;
      }
   }

   @Override
   public void c() {
      this.d.a(hhn.e);
   }
}

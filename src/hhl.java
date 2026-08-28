import javax.annotation.Nullable;

public class hhl implements hho {
   private static final int a = 600;
   private static final xv b = xv.c("tutorial.open_inventory.title");
   private static final xv c = xv.a("tutorial.open_inventory.description", hhn.a("inventory"));
   private final hhn d;
   @Nullable
   private fqq e;
   private int f;

   public hhl(hhn $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hhp.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fqq(fqq.a.d, b, c, false);
            this.d.e().aA().a(this.e);
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
      this.d.a(hhp.e);
   }
}

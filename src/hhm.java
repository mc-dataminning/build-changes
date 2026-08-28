import javax.annotation.Nullable;

public class hhm implements hhp {
   private static final int a = 600;
   private static final xv b = xv.c("tutorial.open_inventory.title");
   private static final xv c = xv.a("tutorial.open_inventory.description", hho.a("inventory"));
   private final hho d;
   @Nullable
   private fqr e;
   private int f;

   public hhm(hho $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hhq.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fqr(fqr.a.d, b, c, false);
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
      this.d.a(hhq.e);
   }
}

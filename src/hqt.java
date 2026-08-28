import javax.annotation.Nullable;

public class hqt implements hqw {
   private static final int a = 600;
   private static final xg b = xg.c("tutorial.open_inventory.title");
   private static final xg c = xg.a("tutorial.open_inventory.description", hqv.a("inventory"));
   private final hqv d;
   @Nullable
   private fwk e;
   private int f;

   public hqt(hqv $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hqx.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            fqq $$0 = this.d.e();
            this.e = new fwk($$0.h, fwk.a.d, b, c, false);
            $$0.aA().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.e();
         this.e = null;
      }
   }

   @Override
   public void c() {
      this.d.a(hqx.e);
   }
}

import javax.annotation.Nullable;

public class hpn implements hpq {
   private static final int a = 600;
   private static final wy b = wy.c("tutorial.open_inventory.title");
   private static final wy c = wy.a("tutorial.open_inventory.description", hpp.a("inventory"));
   private final hpp d;
   @Nullable
   private fvh e;
   private int f;

   public hpn(hpp $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hpr.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            fpo $$0 = this.d.e();
            this.e = new fvh($$0.h, fvh.a.d, b, c, false);
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
      this.d.a(hpr.e);
   }
}

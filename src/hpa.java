import javax.annotation.Nullable;

public class hpa implements hpd {
   private static final int a = 600;
   private static final wy b = wy.c("tutorial.open_inventory.title");
   private static final wy c = wy.a("tutorial.open_inventory.description", hpc.a("inventory"));
   private final hpc d;
   @Nullable
   private fuv e;
   private int f;

   public hpa(hpc $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hpe.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            foz $$0 = this.d.e();
            this.e = new fuv($$0.h, fuv.a.d, b, c, false);
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
      this.d.a(hpe.e);
   }
}

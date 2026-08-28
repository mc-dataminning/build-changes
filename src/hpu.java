import javax.annotation.Nullable;

public class hpu implements hpx {
   private static final int a = 600;
   private static final wy b = wy.c("tutorial.open_inventory.title");
   private static final wy c = wy.a("tutorial.open_inventory.description", hpw.a("inventory"));
   private final hpw d;
   @Nullable
   private fvm e;
   private int f;

   public hpu(hpw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hpy.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            fpt $$0 = this.d.e();
            this.e = new fvm($$0.h, fvm.a.d, b, c, false);
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
      this.d.a(hpy.e);
   }
}

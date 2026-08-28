import javax.annotation.Nullable;

public class hkp implements hks {
   private static final int a = 600;
   private static final wo b = wo.c("tutorial.open_inventory.title");
   private static final wo c = wo.a("tutorial.open_inventory.description", hkr.a("inventory"));
   private final hkr d;
   @Nullable
   private frc e;
   private int f;

   public hkp(hkr $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hkt.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            flh $$0 = this.d.e();
            this.e = new frc($$0.h, frc.a.d, b, c, false);
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
      this.d.a(hkt.e);
   }
}

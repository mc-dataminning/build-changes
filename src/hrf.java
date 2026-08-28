import javax.annotation.Nullable;

public class hrf implements hri {
   private static final int a = 600;
   private static final xc b = xc.c("tutorial.open_inventory.title");
   private static final xc c = xc.a("tutorial.open_inventory.description", hrh.a("inventory"));
   private final hrh d;
   @Nullable
   private fwz e;
   private int f;

   public hrf(hrh $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hrj.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            frf $$0 = this.d.e();
            this.e = new fwz($$0.h, fwz.a.d, b, c, false);
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
      this.d.a(hrj.e);
   }
}

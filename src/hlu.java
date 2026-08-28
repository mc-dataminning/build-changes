import javax.annotation.Nullable;

public class hlu implements hlx {
   private static final int a = 600;
   private static final wp b = wp.c("tutorial.open_inventory.title");
   private static final wp c = wp.a("tutorial.open_inventory.description", hlw.a("inventory"));
   private final hlw d;
   @Nullable
   private fsc e;
   private int f;

   public hlu(hlw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hly.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            fmg $$0 = this.d.e();
            this.e = new fsc($$0.h, fsc.a.d, b, c, false);
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
      this.d.a(hly.e);
   }
}

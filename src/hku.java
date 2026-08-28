import javax.annotation.Nullable;

public class hku implements hkx {
   private static final int a = 600;
   private static final wp b = wp.c("tutorial.open_inventory.title");
   private static final wp c = wp.a("tutorial.open_inventory.description", hkw.a("inventory"));
   private final hkw d;
   @Nullable
   private fre e;
   private int f;

   public hku(hkw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hky.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            fli $$0 = this.d.e();
            this.e = new fre($$0.h, fre.a.d, b, c, false);
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
      this.d.a(hky.e);
   }
}

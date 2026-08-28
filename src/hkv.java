import javax.annotation.Nullable;

public class hkv implements hky {
   private static final int a = 600;
   private static final wp b = wp.c("tutorial.open_inventory.title");
   private static final wp c = wp.a("tutorial.open_inventory.description", hkx.a("inventory"));
   private final hkx d;
   @Nullable
   private frf e;
   private int f;

   public hkv(hkx $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hkz.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            flj $$0 = this.d.e();
            this.e = new frf($$0.h, frf.a.d, b, c, false);
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
      this.d.a(hkz.e);
   }
}

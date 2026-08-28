import javax.annotation.Nullable;

public class hkw implements hkz {
   private static final int a = 600;
   private static final wp b = wp.c("tutorial.open_inventory.title");
   private static final wp c = wp.a("tutorial.open_inventory.description", hky.a("inventory"));
   private final hky d;
   @Nullable
   private frg e;
   private int f;

   public hkw(hky $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hla.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            flk $$0 = this.d.e();
            this.e = new frg($$0.h, frg.a.d, b, c, false);
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
      this.d.a(hla.e);
   }
}

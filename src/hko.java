import javax.annotation.Nullable;

public class hko implements hkr {
   private static final int a = 600;
   private static final wo b = wo.c("tutorial.open_inventory.title");
   private static final wo c = wo.a("tutorial.open_inventory.description", hkq.a("inventory"));
   private final hkq d;
   @Nullable
   private fre e;
   private int f;

   public hko(hkq $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hks.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            flj $$0 = this.d.e();
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
      this.d.a(hks.e);
   }
}

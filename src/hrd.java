import javax.annotation.Nullable;

public class hrd implements hrg {
   private static final int a = 600;
   private static final xa b = xa.c("tutorial.open_inventory.title");
   private static final xa c = xa.a("tutorial.open_inventory.description", hrf.a("inventory"));
   private final hrf d;
   @Nullable
   private fwx e;
   private int f;

   public hrd(hrf $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hrh.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            frd $$0 = this.d.e();
            this.e = new fwx($$0.h, fwx.a.d, b, c, false);
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
      this.d.a(hrh.e);
   }
}

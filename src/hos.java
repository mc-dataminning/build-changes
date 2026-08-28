import javax.annotation.Nullable;

public class hos implements hov {
   private static final int a = 600;
   private static final wy b = wy.c("tutorial.open_inventory.title");
   private static final wy c = wy.a("tutorial.open_inventory.description", hou.a("inventory"));
   private final hou d;
   @Nullable
   private fuo e;
   private int f;

   public hos(hou $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(how.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            fos $$0 = this.d.e();
            this.e = new fuo($$0.h, fuo.a.d, b, c, false);
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
      this.d.a(how.e);
   }
}

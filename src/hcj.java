import javax.annotation.Nullable;

public class hcj implements hcm {
   private static final int a = 600;
   private static final xd b = xd.c("tutorial.open_inventory.title");
   private static final xd c = xd.a("tutorial.open_inventory.description", hcl.a("inventory"));
   private final hcl d;
   @Nullable
   private fmm e;
   private int f;

   public hcj(hcl $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hcn.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fmm(fmm.a.d, b, c, false);
            this.d.e().az().a(this.e);
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
      this.d.a(hcn.e);
   }
}

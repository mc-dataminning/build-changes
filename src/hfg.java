import javax.annotation.Nullable;

public class hfg implements hfj {
   private static final int a = 600;
   private static final xj b = xj.c("tutorial.open_inventory.title");
   private static final xj c = xj.a("tutorial.open_inventory.description", hfi.a("inventory"));
   private final hfi d;
   @Nullable
   private fop e;
   private int f;

   public hfg(hfi $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hfk.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fop(fop.a.d, b, c, false);
            this.d.e().aA().a(this.e);
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
      this.d.a(hfk.e);
   }
}

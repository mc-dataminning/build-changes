public class gvz implements gwc {
   private static final int a = 600;
   private static final wy b = wy.c("tutorial.open_inventory.title");
   private static final wy c = wy.a("tutorial.open_inventory.description", gwb.a("inventory"));
   private final gwb d;
   private fkr e;
   private int f;

   public gvz(gwb $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gwd.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fkr(fkr.a.d, b, c, false);
            this.d.e().aw().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.c();
         this.e = null;
      }
   }

   @Override
   public void c() {
      this.d.a(gwd.e);
   }
}

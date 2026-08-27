public class grb implements gre {
   private static final int a = 600;
   private static final wg b = wg.c("tutorial.open_inventory.title");
   private static final wg c = wg.a("tutorial.open_inventory.description", grd.a("inventory"));
   private final grd d;
   private fga e;
   private int f;

   public grb(grd $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(grf.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fga(fga.a.d, b, c, false);
            this.d.e().aA().a(this.e);
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
      this.d.a(grf.e);
   }
}

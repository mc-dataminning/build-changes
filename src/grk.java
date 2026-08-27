public class grk implements grn {
   private static final int a = 600;
   private static final wi b = wi.c("tutorial.open_inventory.title");
   private static final wi c = wi.a("tutorial.open_inventory.description", grm.a("inventory"));
   private final grm d;
   private fgj e;
   private int f;

   public grk(grm $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gro.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fgj(fgj.a.d, b, c, false);
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
      this.d.a(gro.e);
   }
}

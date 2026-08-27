public class gwr implements gwu {
   private static final int a = 600;
   private static final xe b = xe.c("tutorial.open_inventory.title");
   private static final xe c = xe.a("tutorial.open_inventory.description", gwt.a("inventory"));
   private final gwt d;
   private fky e;
   private int f;

   public gwr(gwt $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gwv.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fky(fky.a.d, b, c, false);
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
      this.d.a(gwv.e);
   }
}

public class guu implements gux {
   private static final int a = 600;
   private static final xo b = xo.c("tutorial.open_inventory.title");
   private static final xo c = xo.a("tutorial.open_inventory.description", guw.a("inventory"));
   private final guw d;
   private fjn e;
   private int f;

   public guu(guw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(guy.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fjn(fjn.a.d, b, c, false);
            this.d.e().ax().a(this.e);
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
      this.d.a(guy.e);
   }
}

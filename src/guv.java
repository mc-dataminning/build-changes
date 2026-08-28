public class guv implements guy {
   private static final int a = 600;
   private static final xo b = xo.c("tutorial.open_inventory.title");
   private static final xo c = xo.a("tutorial.open_inventory.description", gux.a("inventory"));
   private final gux d;
   private fjo e;
   private int f;

   public guv(gux $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(guz.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fjo(fjo.a.d, b, c, false);
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
      this.d.a(guz.e);
   }
}

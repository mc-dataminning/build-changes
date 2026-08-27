public class gsg implements gsj {
   private static final int a = 600;
   private static final ws b = ws.c("tutorial.open_inventory.title");
   private static final ws c = ws.a("tutorial.open_inventory.description", gsi.a("inventory"));
   private final gsi d;
   private fhf e;
   private int f;

   public gsg(gsi $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gsk.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fhf(fhf.a.d, b, c, false);
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
      this.d.a(gsk.e);
   }
}

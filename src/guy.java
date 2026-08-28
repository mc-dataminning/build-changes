public class guy implements gvb {
   private static final int a = 600;
   private static final xp b = xp.c("tutorial.open_inventory.title");
   private static final xp c = xp.a("tutorial.open_inventory.description", gva.a("inventory"));
   private final gva d;
   private fjr e;
   private int f;

   public guy(gva $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gvc.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new fjr(fjr.a.d, b, c, false);
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
      this.d.a(gvc.e);
   }
}

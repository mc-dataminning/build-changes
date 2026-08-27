public class get implements gew {
   private static final int a = 600;
   private static final tn b = tn.c("tutorial.open_inventory.title");
   private static final tn c = tn.a("tutorial.open_inventory.description", gev.a("inventory"));
   private final gev d;
   private evb e;
   private int f;

   public get(gev $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gex.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            this.e = new evb(evb.a.d, b, c, false);
            this.d.e().ay().a(this.e);
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
      this.d.a(gex.e);
   }
}
